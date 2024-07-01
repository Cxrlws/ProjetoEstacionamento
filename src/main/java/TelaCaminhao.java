
import javax.swing.JOptionPane;
import veiculos.*;

public class TelaCaminhao extends javax.swing.JFrame {

    private TelaInicial telaInicial;
    private TelaVaga telaVaga;
    private TelaCliente telaCliente;
    private Veiculo caminhao;

    public TelaCaminhao(TelaInicial telaInicial, TelaCliente telaCliente) {
        initComponents();
        this.telaInicial = telaInicial;
        this.telaCliente = telaCliente;
        telaVaga = new TelaVaga(telaInicial);

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldCarga = new javax.swing.JTextField();
        fieldMarca = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldPlaca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldComprimento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("CARGA MAXIMA (KG)");

        jLabel5.setText("MARCA");

        fieldCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCargaActionPerformed(evt);
            }
        });

        fieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMarcaActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("PREENCHA SUAS INFORMAÇÕES");

        jLabel2.setText("PLACA");

        fieldPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPlacaActionPerformed(evt);
            }
        });

        jLabel7.setText("COMPRIMENTO (M)");

        fieldComprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldComprimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fieldMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fieldComprimento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldCarga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnOK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK)
                .addGap(17, 17, 17))
        );

        pack();
    }

    private void fieldCargaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void fieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            caminhao = new Caminhao(fieldPlaca.getText(), fieldMarca.getText(), Integer.parseInt(fieldCarga.getText()), Integer.parseInt(fieldComprimento.getText()));
            if (telaInicial.gerenciamento.cadastraVeiculo(caminhao)) {
                if (telaCliente != null && telaCliente.isLogado()) {
                    telaInicial.areaCliente.adicionarVeiculo(telaCliente.getNome(), telaCliente.getEmail(), caminhao);
                    JOptionPane.showMessageDialog(this, "Veiculo adicionado com sucesso!");
                    telaCliente.setVisible(true);
                    this.dispose();
                } else {
                    this.dispose();
                    telaVaga.setVeiculo(caminhao);
                    telaVaga.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Veiculo ja existente!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Informações Inconsistentes. Tente novamente!");
        }
    }

    private void fieldPlacaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void fieldComprimentoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JButton btnOK;
    private javax.swing.JTextField fieldCarga;
    private javax.swing.JTextField fieldComprimento;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
}
