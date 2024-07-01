package gerenciamento;

import estacionamento.*;
import veiculos.*;
import recibos.*;
import cliente.*;

public class Gerenciamento {

    private Estacionamento estacionamento;
    private Relatorio relatorio;
    private AreaCliente areaCliente;

    private int saidaMinutos;
    private int entradaMinutos;
    private int tempoTotal;

    private float totalCaixa;

    private String entrada;
    private String saida;

    public Gerenciamento() {
        this.estacionamento = new Estacionamento();
        this.relatorio = new Relatorio();
        this.areaCliente = new AreaCliente(estacionamento);
    }

    public boolean cadastraVeiculo(Veiculo veiculo) {
        return estacionamento.cadastraVeiculo(veiculo);
    }

    public boolean vagasASeremLiberadas() {
        if (estacionamento.getVagasDisponiveis() == 20) {
            return false;
        } else {
            return true;
        }
    }

    public boolean verificarVaga(int numero, int andar) {
        return estacionamento.verificaVaga(numero, andar);
    }

    public boolean ocuparVaga(int numero, int andar, Veiculo veiculo) {
        if (andar == 1 || andar == 2) {
            if (numero > 0 && numero <= 10) {
                return estacionamento.ocuparVaga(numero, andar, veiculo);
            }
        }
        return false;
    }

    public boolean liberarVaga(int numero, int andar) {
        try {
            saidaMinutos = estacionamento.getHorario();
            entradaMinutos = estacionamento.getEntradaMin(numero, andar);
            setTempoTotal(entradaMinutos, saidaMinutos);
            entrada = estacionamento.getEntrada(numero, andar);
            saida = estacionamento.getHorarioData();

            String placa = estacionamento.getVaga(numero, andar).getVeiculo().getPlaca();
            adicionarHistorico(entrada, saida, placa);
            return estacionamento.liberarVaga(numero, andar);
        } catch (NullPointerException e) {
            return estacionamento.liberarVaga(numero, andar);
        }
    }

    public void setTempoTotal(int entrada, int saida) {
        this.tempoTotal = saida - entrada;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public boolean adicionarHistorico(String entrada, String saida, String placa) {
        return relatorio.adicionarHistorico(entrada, saida, placa);
    }

    public boolean getHistorico() {
        return relatorio.getHistorico();
    }

    public boolean getRelatorio() {
        return relatorio.getRelatorioFinanceiro(String.valueOf(totalCaixa));
    }

    public void setTotal(float valor) {
        this.totalCaixa += valor;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }
}
