
public class TelaCliente extends javax.swing.JFrame {

    private TelaInicial telaInicial;
    private TelaEntrar telaEntrar;
    private TelaReserva telaReserva;
    private TelaDados telaDados;

    private String nome;
    private String email;
    private String telefone;

    private boolean logado;

    TelaCliente(TelaInicial telaInicial) {
        initComponents();
        this.logado = true;
        this.telaInicial = telaInicial;
        this.telaEntrar = new TelaEntrar(telaInicial);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAdicionarVeiculo = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        jLabel1.setText("BEM-VINDO");

        btnAdicionarVeiculo.setText("ADICIONAR VEICULO");
        btnAdicionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarVeiculoActionPerformed(evt);
            }
        });

        btnReservar.setText("RESERVAR VAGA");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR DADOS");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnVoltar.setText("SAIR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(btnAdicionarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {
        telaReserva = new TelaReserva(telaInicial, this);
        telaReserva.setVisible(true);
        this.dispose();
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        telaDados = new TelaDados(telaInicial, this);
        telaDados.setVisible(true);
        this.dispose();
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        setLogado(false);
        telaInicial.setVisible(true);
        this.dispose();
    }

    private void btnAdicionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {
        telaEntrar.setTelaCliente(this);
        telaEntrar.setVisible(true);
        this.dispose();
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
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


    private javax.swing.JButton btnAdicionarVeiculo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
}
