package recibos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Recibo {

    private String valor;
    private String formaPagamento;

    public Recibo() {
        this.valor = "";
        this.formaPagamento = "";
    }

    public boolean gerarRecibo(String formaPagamento, String valor, String data) {
        String infoRecibo = "data: " + data + "\nValor: R$ " + valor + "\nForma de pagamento: " + formaPagamento;
        try {
            FileWriter fileWriter = new FileWriter("Recibo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(infoRecibo);

            bufferedWriter.close();
            fileWriter.close();
            return true;

        } catch (IOException e) {
            return false;
        }

    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
