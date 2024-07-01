package veiculos;

public class Caminhao extends Veiculo {
    private int cargaMaxima;
    private int comprimento;

    public Caminhao(String placa, String marca, int cargaMaxima, int comprimento) {
        super(placa, marca);
        this.cargaMaxima = cargaMaxima;
        this.comprimento = comprimento;
    }


    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String getSimpleName() {
        return "Caminhao";
    }
}