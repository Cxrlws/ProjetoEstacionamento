package veiculos;

public abstract class Veiculo {
    private String placa;
    private String marca;

    protected Veiculo(String placa, String marca){
        this.placa = placa;
        this.marca = marca;
    }

    public abstract String getSimpleName();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String cor) {
        this.marca = cor;
    }
}
