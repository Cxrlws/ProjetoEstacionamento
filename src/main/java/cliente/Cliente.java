package cliente;

import veiculos.*;
import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private ArrayList<Veiculo> veiculos;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.veiculos = new ArrayList<>();
    }

    public boolean adicionarVeiculo(Veiculo veiculo) {
        return veiculos.add(veiculo);
    }

    public boolean removerVeiculo(Veiculo veiculo) {
        return veiculos.remove(veiculo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

}
