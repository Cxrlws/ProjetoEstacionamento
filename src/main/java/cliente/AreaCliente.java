package cliente;

import java.util.Timer;
import java.util.TimerTask;

import estacionamento.*;
import veiculos.*;

public class AreaCliente {

    private Estacionamento estacionamento;
    private Cliente cliente;
    private Veiculo veiculo;

    private int tempoLimite;

    private Timer timer;

    public AreaCliente(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
        this.timer = new Timer();
    }

    public boolean cadastraCliente(Cliente cliente) {
        return estacionamento.cadastraCliente(cliente);
    }

    public void reservaVaga(int numero, int andar, String placa, String marca, int tempo) {
        int tempoAtual = estacionamento.getHorario();
        tempoLimite = tempoAtual + tempo;
        veiculo = estacionamento.getVeiculo(placa, marca);

        if (veiculo != null && estacionamento.ocuparVaga(numero, andar, veiculo)) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    int tempoAtualizado = estacionamento.getHorario();
                    if (tempoAtualizado >= tempoLimite) {
                        estacionamento.liberarVaga(numero, andar);
                        timer.cancel();
                    }
                }
            }, 0, 1000); // Verifica a cada segundo
        } else {
            System.out.println("!!!!!!");
        }
    }

    public void cancelarReserva() {
        if (timer != null) {
            timer.cancel();
            timer = null; // Recria o timer para futuras reservas
        }
    }

    public boolean alterarNome(String nome, String email, String novoNome) {
        cliente = estacionamento.getCliente(nome, email);
        if (cliente != null) {
            cliente.setNome(novoNome);
            return true;
        }
        return false;
    }

    public boolean alterarEmail(String nome, String email, String novoEmail) {
        cliente = estacionamento.getCliente(nome, email);
        if (cliente != null) {
            cliente.setEmail(novoEmail);
            return true;
        }
        return false;
    }

    public boolean alterarTelefone(String nome, String email, String novoTelefone) {
        cliente = estacionamento.getCliente(nome, email);
        if (cliente != null) {
            cliente.setTelefone(novoTelefone);
            return true;
        }
        return false;
    }

    public boolean adicionarVeiculo(String nome, String email, Veiculo veiculo) {
        cliente = estacionamento.getCliente(nome, email);
        return cliente.adicionarVeiculo(veiculo);
    }

    public boolean removerVeiculo(String nome, String email, Veiculo veiculo) {
        cliente = estacionamento.getCliente(nome, email);
        return cliente.removerVeiculo(veiculo);
    }

}
