package veiculos;

public class Carro extends Veiculo{
    private String cor;
    private String modelo;
    
    public Carro(String placa, String cor, String modelo, String marca){
        super(placa,marca);
        setPlaca(placa);
        setMarca(marca);
        this.cor = cor;
        this.modelo = modelo;
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public String getSimpleName() {
        return "Carro";
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public void setMarca(String cor) {
        super.setMarca(cor);
    }

    public String getCor() {return cor;}

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
