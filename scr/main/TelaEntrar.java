
import javax.swing.JOptionPane;

public class TelaEntrar extends javax.swing.JFrame {

    private TelaInicial telaInicial;
    private TelaCarro telaCarro;
    private TelaMoto telaMoto;
    private TelaCaminhao telaCaminhao;
    private TelaCliente telaCliente;

    public TelaEntrar(TelaInicial telaInicial) {
        initComponents();
        this.telaInicial = telaInicial;
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCarro = new javax.swing.JButton();
        btnMoto = new javax.swing.JButton();
        btnCaminhao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("SELECIONE SEU VEICULO");

        btnCarro.setText("CARRO");
        btnCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroActionPerformed(evt);
            }
        });

        btnMoto.setText("MOTO");
        btnMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotoActionPerformed(evt);
            }
        });

        btnCaminhao.setText("CAMINHÃO");
        btnCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminhaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCaminhao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(btnCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnCarroActionPerformed(java.awt.event.ActionEvent evt) {
        telaCarro = new TelaCarro(getTelaInicial(), telaCliente);
        telaCarro.setVisible(true);
        this.dispose();
    }

    private void btnMotoActionPerformed(java.awt.event.ActionEvent evt) {
        telaMoto = new TelaMoto(getTelaInicial(), telaCliente);
        telaMoto.setVisible(true);
        this.dispose();
    }

    private void btnCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {
        telaCaminhao = new TelaCaminhao(getTelaInicial(), telaCliente);
        telaCaminhao.setVisible(true);
        this.dispose();
    }

    public void close() {
        this.dispose();
    }

    public TelaInicial getTelaInicial() {
        return telaInicial;
    }

    public void setTelaInicial(TelaInicial telaInicial) {
        this.telaInicial = telaInicial;
    }

    public TelaCarro getTelaCarro() {
        return telaCarro;
    }

    public void setTelaCarro(TelaCarro telaCarro) {
        this.telaCarro = telaCarro;
    }

    public void setTelaCliente(TelaCliente telaCliente) {
        this.telaCliente = telaCliente;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaminhao;
    private javax.swing.JButton btnCarro;
    private javax.swing.JButton btnMoto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
