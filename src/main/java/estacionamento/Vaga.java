package estacionamento;

import veiculos.*;

public class Vaga {

    private int numero;
    private int andar;
    private int entrada;

    private String dataEntrada;

    private Veiculo veiculo;

    public Vaga(int numero, int andar, int entrada, Veiculo veiculo) {
        this.numero = numero;
        this.andar = andar;
        this.entrada = entrada;
        this.veiculo = veiculo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
