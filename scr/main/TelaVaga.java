
import javax.swing.JOptionPane;
import veiculos.Veiculo;

public class TelaVaga extends javax.swing.JFrame {

    private TelaInicial telaInicial;
    private Veiculo veiculo;

    private int andar;
    private int numero;

    public TelaVaga(TelaInicial telaInicial) {
        initComponents();
        this.telaInicial = telaInicial;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroVaga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        andarVaga = new javax.swing.JTextField();
        btnOcupe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("SELECIONE A VAGA DESEJADA");

        jLabel2.setText("NUMERO");

        jLabel3.setText("ANDAR");

        btnOcupe.setText("OCUPAR");
        btnOcupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcupeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOcupe, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(andarVaga)
                    .addComponent(numeroVaga))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(andarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnOcupe)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }


    private void btnOcupeActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            setNumero(Integer.parseInt(numeroVaga.getText()));
            setAndar(Integer.parseInt(andarVaga.getText()));
            if (telaInicial.gerenciamento.ocuparVaga(numero, andar, veiculo)) {
                JOptionPane.showMessageDialog(this, "Vaga ocupada com sucesso!");
                telaInicial.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Vaga indisponivel! Tente outra!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Informações Inconsistentes. Tente novamente!");
        }

    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private void setAndar(int andar) {
        this.andar = andar;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    private javax.swing.JTextField andarVaga;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnOK1;
    private javax.swing.JButton btnOK2;
    private javax.swing.JButton btnOcupe;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldMarca1;
    private javax.swing.JTextField fieldMarca2;
    private javax.swing.JTextField fieldMarca3;
    private javax.swing.JTextField fieldMarca4;
    private javax.swing.JTextField fieldMarca5;
    private javax.swing.JTextField fieldMarca6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField numeroVaga;
}
