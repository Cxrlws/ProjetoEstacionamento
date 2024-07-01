package recibos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Relatorio {

    private FileWriter historico;
    private BufferedWriter bufferHistorico;

    public Relatorio() {
        try {
            this.historico = new FileWriter("HistoricoEstacionamento.txt");
            this.bufferHistorico = new BufferedWriter(historico);
        } catch (IOException e) {
            System.out.println("!");
        }

    }

    public boolean getRelatorioFinanceiro(String totalDiario) {
        String infoRelatorio = "Total diario: R$ " + totalDiario;
        try {
            FileWriter fileWriter = new FileWriter("RelatorioFinanceiro.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(infoRelatorio);

            bufferedWriter.close();
            fileWriter.close();
            return true;

        } catch (IOException e) {
            return false;
        }
    }

    public boolean adicionarHistorico(String entrada, String saida, String placa) {
        String infoHistorico = "Veiculo: " + placa + " Entrada: " + entrada + " Saida: " + saida;
        try {
            bufferHistorico.write(infoHistorico);
            bufferHistorico.newLine();
            bufferHistorico.flush();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean getHistorico() {
        String infoHistorico = "-- HISTORICO GERADO --";
        try {
            bufferHistorico.write(infoHistorico);
            bufferHistorico.close();
            historico.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
