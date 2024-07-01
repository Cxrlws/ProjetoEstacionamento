package pagamento;

import java.time.*;
import java.time.format.DateTimeFormatter;

import recibos.Recibo;

public class Pagamento {

    private Recibo recibo;

    private float precoMinutos;
    private float totalCaixa;

    private String valorFinal;
    private String formaPagamento;

    public Pagamento() {
        this.recibo = new Recibo();
        this.valorFinal = "";
        this.precoMinutos = 1.2F;
        this.totalCaixa = 0;
        this.formaPagamento = "";
    }

    public String getHorarioData() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String data = agora.format(formatter);
        return data;
    }

    public void getPagamento(String formaPagamento, int tempoTotal) {
        setFormaPagamento(formaPagamento);
        setTotalCaixa(getTotalCaixa() + Float.valueOf(getValorFinal(tempoTotal)));
        recibo.gerarRecibo(formaPagamento, getValorFinal(tempoTotal), getHorarioData());
    }

    public String getValorFinal(int tempoTotal) {
        setValorFinal(tempoTotal * precoMinutos);
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = String.valueOf(valorFinal);
    }

    public float getPrecoMinutos() {
        return precoMinutos;
    }

    public void setPrecoMinutos(float precoMinutos) {
        this.precoMinutos = precoMinutos;
    }

    public float getTotalCaixa() {
        return totalCaixa;
    }

    public void setTotalCaixa(float totalCaixa) {
        this.totalCaixa = totalCaixa;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

}
