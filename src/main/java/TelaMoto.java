
import javax.swing.JOptionPane;
import veiculos.*;

public class TelaMoto extends javax.swing.JFrame {

    private TelaInicial telaInicial;
    private TelaVaga telaVaga;
    private TelaCliente telaCliente;

    private Moto moto;
    private int cilindrada;

    public TelaMoto(TelaInicial telaInicial, TelaCliente telaCliente) {
        initComponents();
        this.telaInicial = telaInicial;
        this.telaVaga = new TelaVaga(telaInicial);
        this.telaCliente = telaCliente;

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        fieldMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldCilindrada = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("MARCA");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("PREENCHA SUAS INFORMAÇÕES");

        jLabel2.setText("PLACA");

        jLabel6.setText("CILINDRADA");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCilindrada, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(fieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(btnOK))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
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
                .addComponent(fieldCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnOK)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            setCilindrada(Integer.parseInt(fieldCilindrada.getText()));
            moto = new Moto(fieldPlaca.getText(), fieldMarca.getText(), cilindrada);
            if (telaInicial.gerenciamento.cadastraVeiculo(moto)) {
                if (telaCliente != null && telaCliente.isLogado()) {
                    telaInicial.areaCliente.adicionarVeiculo(telaCliente.getNome(), telaCliente.getEmail(), moto);
                    JOptionPane.showMessageDialog(this, "Veiculo adicionado com sucesso!");
                    telaCliente.setVisible(true);
                    this.dispose();
                } else {
                    this.dispose();
                    telaVaga.setVeiculo(moto);
                    telaVaga.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Veiculo ja existente!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Informações Inconsistentes. Tente novamente!");
        }
    }

    private void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    private javax.swing.JButton btnOK;
    private javax.swing.JTextField fieldCilindrada;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
}
