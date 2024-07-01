
import javax.swing.JOptionPane;

public class TelaDados extends javax.swing.JFrame {

    private TelaInicial telaInicial;
    private TelaCliente telaCliente;

    private String nome;
    private String email;
    private String telefone;

    public TelaDados(TelaInicial telaInicial, TelaCliente telaCliente) {
        initComponents();
        this.telaInicial = telaInicial;
        this.telaCliente = telaCliente;

        nomeLabel.setText(telaCliente.getNome());
        emailLabel.setText(telaCliente.getEmail());
        telefoneLabel.setText(telaCliente.getTelefone());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        fieldTelefone = new javax.swing.JTextField();
        nomeAlt = new javax.swing.JButton();
        telefoneAlt = new javax.swing.JButton();
        emailAlt = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        jLabel1.setText("ALTERAR DADOS");

        jLabel2.setText("NOME:");

        nomeLabel.setText("jLabel3");

        jLabel4.setText("EMAIL:");

        emailLabel.setText("jLabel3");


        jLabel6.setText("TELEFONE:");

        telefoneLabel.setText("jLabel3");

        nomeAlt.setText("ALTERAR");
        nomeAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAltActionPerformed(evt);
            }
        });

        telefoneAlt.setText("ALTERAR");
        telefoneAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneAltActionPerformed(evt);
            }
        });

        emailAlt.setText("ALTERAR");
        emailAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAltActionPerformed(evt);
            }
        });

        jButton4.setText("VOLTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addComponent(emailLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(telefoneLabel)
                                    .addGap(45, 45, 45))
                                .addComponent(fieldTelefone, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telefoneAlt)
                            .addComponent(emailAlt)
                            .addComponent(nomeAlt))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nomeLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(telefoneLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeAlt)
                        .addGap(28, 28, 28)
                        .addComponent(emailAlt)
                        .addGap(28, 28, 28)
                        .addComponent(telefoneAlt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        telaCliente.setVisible(true);
        this.dispose();
    }

    private void nomeAltActionPerformed(java.awt.event.ActionEvent evt) {
        String novoNome = fieldNome.getText();
        JOptionPane.showMessageDialog(this, "Nome alterado com sucesso!!");
        telaCliente.setNome(novoNome);
        telaCliente.setVisible(true);
        this.dispose();
    }

    private void emailAltActionPerformed(java.awt.event.ActionEvent evt) {
        String novoEmail = fieldEmail.getText();
        JOptionPane.showMessageDialog(this, "Nome alterado com sucesso!!");
        telaCliente.setEmail(novoEmail);
        telaCliente.setVisible(true);
        this.dispose();
    }

    private void telefoneAltActionPerformed(java.awt.event.ActionEvent evt) {
        String novoTelefone = fieldTelefone.getText();
        JOptionPane.showMessageDialog(this, "Nome alterado com sucesso!!");
        telaCliente.setTelefone(novoTelefone);
        telaCliente.setVisible(true);
        this.dispose();
    }

    private javax.swing.JButton emailAlt;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton nomeAlt;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JButton telefoneAlt;
    private javax.swing.JLabel telefoneLabel;
}
