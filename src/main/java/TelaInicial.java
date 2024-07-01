
import gerenciamento.*;
import cliente.*;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public Gerenciamento gerenciamento;
    public AreaCliente areaCliente;

    private TelaEntrar entrar;
    private TelaSair sair;
    private TelaCadastro cadastro;
    private TelaLogin login;

    public TelaInicial() {
        initComponents();
        this.gerenciamento = new Gerenciamento();
        this.areaCliente = new AreaCliente(gerenciamento.getEstacionamento());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("ESTACIONAMENTO UFMA");

        btnEnter.setText("ENTRAR");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnQuit.setText("SAIR");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnHistorico.setText("HISTORICO");
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        btnCadastro.setText("CADASTRAR");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnReport.setText("GERAR RELÁTORIO");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnLogin.setText("LOGIN CLIENTE");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {
        if (!gerenciamento.vagasASeremLiberadas()) {
            JOptionPane.showMessageDialog(this, "Não há vagas a seerem liberadas!");

        } else {
            sair = new TelaSair(this);
            sair.setVisible(true);
            this.setVisible(false);
        }
    }

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {
        entrar = new TelaEntrar(this);
        entrar.setTelaInicial(this);
        entrar.setVisible(true);
        this.setVisible(false);
    }

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {
        if (gerenciamento.getHistorico()) {
            JOptionPane.showMessageDialog(this, "Historico gerado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gerar historico!");
        }
    }

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciamento.getRelatorio();
        JOptionPane.showMessageDialog(this, "Relatorio gerado com sucesso!");
    }

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {
        cadastro = new TelaCadastro(this);
        this.setVisible(false);
        cadastro.setVisible(true);
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        login = new TelaLogin(this);
        this.setVisible(false);
        login.setVisible(true);
    }

    public void setTela(TelaEntrar tela) {
        this.entrar = tela;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnReport;
    private javax.swing.JLabel jLabel1;
}
