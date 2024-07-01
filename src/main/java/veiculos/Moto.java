package veiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, int cilindradas) {
        super(placa, marca);
        setPlaca(placa);
        setMarca(marca);
        this.cilindradas = cilindradas;
    }

    @Override
    public void setMarca(String cor) {
        super.setMarca(cor);
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public String getSimpleName() {
        return "Moto";
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}