package estacionamento;

import cliente.Cliente;
import java.util.ArrayList;
import java.time.*;
import java.time.format.DateTimeFormatter;

import veiculos.*;

public class Estacionamento {

    private ArrayList<Cliente> clientes;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Vaga> vagas;

    private int vagasDisponiveis;

    public Estacionamento() {
        this.clientes = new ArrayList<>();
        this.vagas = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.vagasDisponiveis = 20;
    }

    public String getHorarioData() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String data = agora.format(formatter);
        return data;
    }

    public int getHorario() {
        LocalTime agora = LocalTime.now();
        int minutos = agora.getHour() * 60 + agora.getMinute();
        return minutos;
    }

    public boolean cadastraCliente(Cliente cliente) {
        if (verificaCliente(cliente.getNome(), cliente.getEmail())) {
            return clientes.add(cliente);
        }
        return false;

    }

    public boolean cadastraVeiculo(Veiculo veiculo) {
        if (verificaVeiculo(veiculo.getPlaca())) {
            return veiculos.add(veiculo);
        }
        return false;
    }

    public boolean verificaVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return false;
            }
        }
        return true;
    }

    public boolean verificaCliente(String nome, String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome) && cliente.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public boolean verificaVaga(int numero, int andar) {
        for (Vaga vaga : vagas) {
            if (vaga.getNumero() == numero && vaga.getAndar() == andar) {
                return false;
            }
        }
        return true;
    }

    public String getEntrada(int numero, int andar) {
        for (Vaga vaga : vagas) {
            if (vaga.getNumero() == numero && vaga.getAndar() == andar) {
                return vaga.getDataEntrada();
            }
        }
        return "null";
    }

    public int getEntradaMin(int numero, int andar) {
        for (Vaga vaga : vagas) {
            if (vaga.getNumero() == numero && vaga.getAndar() == andar) {
                return vaga.getEntrada();
            }
        }
        return 0;
    }

    public boolean ocuparVaga(int numero, int andar, Veiculo veiculo) {
        if (verificaVaga(numero, andar) && (getVagasDisponiveis() > 0 && getVagasDisponiveis() <= 20)) {
            Vaga vaga = new Vaga(numero, andar, getHorario(), veiculo);
            vaga.setDataEntrada(getHorarioData());
            vaga.setEntrada(getHorario());
            setVagasDisponiveis(getVagasDisponiveis() - 1);
            return vagas.add(vaga);
        }
        return false;
    }

    public boolean liberarVaga(int numero, int andar) {
        if (!verificaVaga(numero, andar)) {
            for (Vaga vaga : vagas) {
                if (vaga.getNumero() == numero && vaga.getAndar() == andar) {
                    setVagasDisponiveis(getVagasDisponiveis() + 1);
                    return vagas.remove(vaga);
                }
            }
        }
        return false;
    }

    public Vaga getVaga(int numero, int andar) {
        for (Vaga vaga : vagas) {
            if (vaga.getNumero() == numero && vaga.getAndar() == andar) {
                return vaga;
            }
        }
        return null;
    }

    public Cliente getCliente(String nome, String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome) && cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null;
    }

    public Veiculo getVeiculo(String placa, String marca) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa) && veiculo.getMarca().equals(marca)) {
                return veiculo;
            }
        }
        return null;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public ArrayList<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        this.vagas = vagas;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

}
