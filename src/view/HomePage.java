package view;
//Importações do programa
import DAO.DAOPaciente;
import conexoes.ConexaoMySql;
import controler.CtrlPaciente;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Paciente;

public class HomePage extends javax.swing.JFrame {
    //Cria uma tabela default
    private DefaultTableModel tabela;
    public String tipo;
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Inicialização do programa
    public HomePage() {
        initComponents();
        //Quando o programa inicia, esse comando faz com que o CardLayout "Inicio" apareça primeiro:
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "inicio");
        //Cria uma conexão com o BD
        ConexaoMySql con = new ConexaoMySql();
        con.conectar();
        //Se conectou corretamente é mostrado na tela
        if(con.isStatus() == true){
            txtStatus.setText("Conectado ao Banco de Dados!");
            txtStatus.setForeground(Color.GREEN);
            txtStatus1.setText("Conectado ao Banco de Dados!");
            txtStatus1.setForeground(Color.GREEN);
            txtStatus2.setText("Conectado ao Banco de Dados!");
            txtStatus2.setForeground(Color.GREEN);
            txtStatus3.setText("Conectado ao Banco de Dados!");
            txtStatus3.setForeground(Color.GREEN);
            txtStatus4.setText("Conectado ao Banco de Dados!");
            txtStatus4.setForeground(Color.GREEN);
        }else{
            txtStatus.setText("Não conectado ao Banco de Dados!");
            txtStatus.setForeground(Color.red);
            txtStatus1.setText("Não conectado ao Banco de Dados!");
            txtStatus1.setForeground(Color.red);
            txtStatus2.setText("Não conectado ao Banco de Dados!");
            txtStatus2.setForeground(Color.red);
            txtStatus3.setText("Não conectado ao Banco de Dados!");
            txtStatus3.setForeground(Color.red);
            txtStatus4.setText("Não conectado ao Banco de Dados!");
            txtStatus4.setForeground(Color.red);
        } 
        //Fecha conexão com o BD
        con.fecharConexao();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panNave = new javax.swing.JPanel();
        btnInicio = new javax.swing.JLabel();
        btnAnotacoes = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnExames = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSituacao = new javax.swing.JLabel();
        panTelas = new javax.swing.JPanel();
        panInicio = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtStatus1 = new javax.swing.JLabel();
        panCadastro = new javax.swing.JPanel();
        txtDatanasc = new javax.swing.JTextField();
        jbtCadastrar = new javax.swing.JButton();
        jbtExibir = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSus = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tResult = new javax.swing.JTable();
        txtStatus = new javax.swing.JLabel();
        panAnotacoes = new javax.swing.JPanel();
        verSus = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotacoes = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextPane();
        btnEnviar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtStatus2 = new javax.swing.JLabel();
        panExames = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        jPanel = new javax.swing.JScrollPane();
        jLabel14 = new javax.swing.JLabel();
        txtStatus3 = new javax.swing.JLabel();
        panSituacao = new javax.swing.JPanel();
        verSus1 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        btnVer1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCoracao = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtRins = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtPulmao = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtInternacao = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtPlantas = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtOutras = new javax.swing.JTextField();
        caixaGestante = new javax.swing.JComboBox<>();
        caixaFumante = new javax.swing.JComboBox<>();
        caixaAlcool = new javax.swing.JComboBox<>();
        caixaPeso = new javax.swing.JComboBox<>();
        caixaDrogas = new javax.swing.JComboBox<>();
        caixaPressao = new javax.swing.JComboBox<>();
        caixaDiabete = new javax.swing.JComboBox<>();
        caixaAvc = new javax.swing.JComboBox<>();
        caixaInfarto = new javax.swing.JComboBox<>();
        caixaHanseniase = new javax.swing.JComboBox<>();
        caixaCancer = new javax.swing.JComboBox<>();
        caixaTuberculose = new javax.swing.JComboBox<>();
        caixaAcamado = new javax.swing.JComboBox<>();
        caixaDomiciliado = new javax.swing.JComboBox<>();
        caixaPraticas = new javax.swing.JComboBox<>();
        caixaCoracao = new javax.swing.JComboBox<>();
        caixaRins = new javax.swing.JComboBox<>();
        caixaPulmao = new javax.swing.JComboBox<>();
        caixaInternacao = new javax.swing.JComboBox<>();
        caixaPlantas = new javax.swing.JComboBox<>();
        caixaOutras = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtMaternidade = new javax.swing.JTextField();
        btnEnviar2 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtQuest = new javax.swing.JTextArea();
        btnPassar = new javax.swing.JButton();
        txtStatus4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínico Geral-PSF-II");

        panNave.setBackground(new java.awt.Color(0, 102, 0));
        panNave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInicio.setText("Início");
        btnInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setOpaque(true);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        btnAnotacoes.setBackground(new java.awt.Color(255, 255, 255));
        btnAnotacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAnotacoes.setText("Acompanhamento");
        btnAnotacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnAnotacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnotacoes.setOpaque(true);
        btnAnotacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnotacoesMouseClicked(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCadastro.setText("Paciente");
        btnCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.setOpaque(true);
        btnCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroMouseClicked(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setOpaque(true);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setOpaque(true);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/psf-image.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("texto");

        btnExames.setBackground(new java.awt.Color(255, 255, 255));
        btnExames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExames.setText("Exames");
        btnExames.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnExames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExames.setOpaque(true);
        btnExames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExamesMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Desenvolvido por Thiago Lira");

        btnSituacao.setBackground(new java.awt.Color(255, 255, 255));
        btnSituacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSituacao.setText("Situação de saúde");
        btnSituacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnSituacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSituacao.setOpaque(true);
        btnSituacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSituacaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panNaveLayout = new javax.swing.GroupLayout(panNave);
        panNave.setLayout(panNaveLayout);
        panNaveLayout.setHorizontalGroup(
            panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panNaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNaveLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAnotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExames, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSituacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panNaveLayout.setVerticalGroup(
            panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNaveLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnotacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExames, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(55, 55, 55))
        );

        btnAnotacoes.getAccessibleContext().setAccessibleName("acompanhamento");

        panTelas.setBackground(new java.awt.Color(255, 255, 255));
        panTelas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        panTelas.setLayout(new java.awt.CardLayout());

        panInicio.setBackground(new java.awt.Color(255, 255, 255));
        panInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/psf-image2.png"))); // NOI18N
        panInicio.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 115, 933, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Clínico Geral- PSF II");
        panInicio.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 1062, -1));

        txtStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panInicio.add(txtStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 340, 30));

        panTelas.add(panInicio, "inicio");

        panCadastro.setBackground(new java.awt.Color(255, 255, 255));
        panCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDatanasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panCadastro.add(txtDatanasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 530, 40));

        jbtCadastrar.setText("Cadastrar");
        jbtCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCadastrarActionPerformed(evt);
            }
        });
        panCadastro.add(jbtCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 190, 60));

        jbtExibir.setText("Exibir");
        jbtExibir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExibirActionPerformed(evt);
            }
        });
        panCadastro.add(jbtExibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 160, 60));

        jbtExcluir.setText("Excluir");
        jbtExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });
        panCadastro.add(jbtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 170, 60));

        jbtAtualizar.setText("Atualizar");
        jbtAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAtualizarActionPerformed(evt);
            }
        });
        panCadastro.add(jbtAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 180, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Endereço:");
        panCadastro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome:");
        panCadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Sus:");
        panCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 80, -1));

        txtSus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panCadastro.add(txtSus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 530, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fone:");
        panCadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Data de Nascimento:");
        panCadastro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 190, -1));

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panCadastro.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 530, 40));

        txtFone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panCadastro.add(txtFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 530, 40));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panCadastro.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 530, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro do paciente");
        panCadastro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 50, 940, -1));

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        panCadastro.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 340, -1));

        tResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Sus"
            }
        ));
        jScrollPane4.setViewportView(tResult);

        panCadastro.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 380, 340));

        txtStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panCadastro.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 340, 30));

        panTelas.add(panCadastro, "cadastro");

        panAnotacoes.setBackground(new java.awt.Color(255, 255, 255));
        panAnotacoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verSus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        verSus.setModel(new javax.swing.SpinnerNumberModel());
        panAnotacoes.add(verSus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 340, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Sus:");
        panAnotacoes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        txtAnotacoes.setEditable(false);
        txtAnotacoes.setBackground(new java.awt.Color(204, 204, 204));
        txtAnotacoes.setColumns(20);
        txtAnotacoes.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtAnotacoes.setRows(5);
        jScrollPane2.setViewportView(txtAnotacoes);

        panAnotacoes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 940, 260));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtComentario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(txtComentario);

        panAnotacoes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 570, 93));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panAnotacoes.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 230, 70));

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        panAnotacoes.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 230, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tratamento do paciente");
        panAnotacoes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1200, 60));

        txtStatus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panAnotacoes.add(txtStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 340, 30));

        panTelas.add(panAnotacoes, "anotacoes");

        panExames.setBackground(new java.awt.Color(255, 255, 255));
        panExames.setPreferredSize(new java.awt.Dimension(1200, 650));
        panExames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Clínico Geral- PSF II");
        panExames.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 1062, -1));

        txtFile.setEditable(false);
        panExames.add(txtFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 128, 545, 34));

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });
        panExames.add(btnProcurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 127, 199, 35));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel.setViewportView(jLabel14);

        panExames.add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, 1159, 532));

        txtStatus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panExames.add(txtStatus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 340, 30));

        panTelas.add(panExames, "exames");

        panSituacao.setBackground(new java.awt.Color(255, 255, 255));
        panSituacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verSus1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        verSus1.setModel(new javax.swing.SpinnerNumberModel());
        panSituacao.add(verSus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 340, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Sus:");
        panSituacao.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        btnVer1.setText("Ver");
        btnVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer1ActionPerformed(evt);
            }
        });
        panSituacao.add(btnVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 230, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Situação de saúde do paciente");
        panSituacao.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1200, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1072, 2, -1, 450));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Está gestante?");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Se sim, qual é a maternidade de referencia?");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 2, -1, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Sobre o seu peso:");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 28, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Está fumante?");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 61, -1, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Faz uso de álcool?");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 87, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Faz uso de outras drogas?");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 113, -1, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Tem hipertensão arterial?");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 139, -1, -1));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Tem diabetes?");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 165, -1, -1));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Teve AVC/derrame?");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 196, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Teve infarto?");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 222, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Está com hanseníase?");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 61, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("Está com tuberculose?");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 87, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Tem ou teve câncer?");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 113, -1, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("Está acamado?");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 139, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("Está domiciliado?");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 165, -1, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("Usa práticas integrativas e complementares?");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 196, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Tem doença cardíaca/do coração?");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 260, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Se sim, qual(is)?");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));
        jPanel1.add(txtCoracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 260, 564, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tem ou teve problemas nos rins?");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 291, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Se sim, qual(is)?");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 291, -1, -1));
        jPanel1.add(txtRins, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 291, 564, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Tem doença respiratória/do pulmão?");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 322, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Se sim, qual(is)?");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 322, -1, -1));
        jPanel1.add(txtPulmao, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 322, 564, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Teve alguma internação nos ultimos 12 meses?");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 353, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Se sim, por qual(is) motivo(s)?");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 353, -1, -1));
        jPanel1.add(txtInternacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 353, 472, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Usa plantas medicinais?");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 384, -1, -1));
        jPanel1.add(txtPlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 384, 563, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Outras condições de saúde?");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 415, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Se sim, qual(is)?");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 415, -1, -1));
        jPanel1.add(txtOutras, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 415, 563, -1));

        caixaGestante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaGestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 2, 76, -1));

        caixaFumante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaFumante, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 61, -1, -1));

        caixaAlcool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaAlcool, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 87, -1, -1));

        caixaPeso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 28, 189, -1));

        caixaDrogas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaDrogas, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 113, -1, -1));

        caixaPressao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaPressao, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 139, -1, -1));

        caixaDiabete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaDiabete, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 165, -1, -1));

        caixaAvc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaAvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 196, -1, -1));

        caixaInfarto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaInfarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 222, -1, -1));

        caixaHanseniase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaHanseniase, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 61, -1, -1));

        caixaCancer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 113, -1, -1));

        caixaTuberculose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaTuberculose, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 87, -1, -1));

        caixaAcamado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaAcamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 139, -1, -1));

        caixaDomiciliado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaDomiciliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 165, -1, -1));

        caixaPraticas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaPraticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 196, -1, -1));

        caixaCoracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaCoracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 260, -1, -1));

        caixaRins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaRins, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 291, -1, -1));

        caixaPulmao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaPulmao, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 322, -1, -1));

        caixaInternacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaInternacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 353, -1, -1));

        caixaPlantas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaPlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 384, -1, -1));

        caixaOutras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        jPanel1.add(caixaOutras, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 415, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Se sim, qual(is)?");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 384, -1, -1));
        jPanel1.add(txtMaternidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 2, 449, -1));

        panSituacao.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 460));

        btnEnviar2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEnviar2.setText("Enviar");
        btnEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar2ActionPerformed(evt);
            }
        });
        panSituacao.add(btnEnviar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 380, 50));

        txtQuest.setColumns(20);
        txtQuest.setRows(5);
        jScrollPane3.setViewportView(txtQuest);

        panSituacao.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 770, 90));

        btnPassar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPassar.setText("Passar dados");
        btnPassar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassarActionPerformed(evt);
            }
        });
        panSituacao.add(btnPassar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, 340, 50));

        txtStatus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panSituacao.add(txtStatus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 330, 30));

        panTelas.add(panSituacao, "situacao");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panTelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTelas, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panNave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Botão Cadastrar
    private void jbtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCadastrarActionPerformed
        //Cria um novo objeto/classe "PacienteCG"
        Paciente paciente = new Paciente();
        //Altera os valores das variáveis na classe "PacienteCG"
        paciente.setNome(txtNome.getText());
        paciente.setSus((int) txtSus.getValue());
        paciente.setEndereco(txtEndereco.getText());
        paciente.setFone(txtFone.getText());
        paciente.setDatanasc(txtDatanasc.getText());
        if("cg".equals(tipo)){
            paciente.setTipo("cg");
        }else{
            if("od".equals(tipo)){
                paciente.setTipo("od");
            }else{
                paciente.setTipo("ef");
            }
        }
        //Chama o objeto/classe "CtrlPacienteCG"
        CtrlPaciente ctrlPaciente = new CtrlPaciente();
        //Chama o método "salvar" na classe "CtrlPacienteCG"
        ctrlPaciente.salvarCtrl(paciente);
        //Mostra a Mensagem de confirmação
        JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!");
    }//GEN-LAST:event_jbtCadastrarActionPerformed
    //Botão exibir
    private void jbtExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExibirActionPerformed
        //Chama o objeto/classe "CtrlPacienteCG"
        CtrlPaciente ctrlPaciente = new CtrlPaciente();      
        //Estrutura que condiciona se vai fazer a chamada pelo "sus" ou pelo "nome"
        //Se o nome for vazio então chama a busca pelo sus
        if(txtNome.getText().equals("")){
            //Chama o objeto/classe "PacienteCG" e mostra os dados do paciente pelo SUS  
            Paciente paciente = ctrlPaciente.getCtrlSus((int) txtSus.getValue(), tipo);
            //Se retornar um valor vazio é por que o registro não existe no BD
            //Mostra a mensagem dizendo que o paciente não está cadastrado
            if(paciente.getSus() == 0){
                JOptionPane.showMessageDialog(this, "Paciente Não Cadastrado!");
            }else{
                //Mostra os dados do PacienteCG
                JOptionPane.showMessageDialog(this, 
                "<html>__________________________<br>"
                + "Nome: " + paciente.getNome() 
                + "<br>__________________________<br>"
                + "Sus: " + paciente.getSus() 
                + "<br>__________________________<br>"
                + "Endereço: " + paciente.getEndereco()
                + "<br>__________________________<br>"
                + "Fone: " + paciente.getFone() 
                + "<br>__________________________<br>"
                + "Data de Nascimento: " + paciente.getDatanasc() 
                + "<br>__________________________<br>"
                + "</html>");   
            }
        //Se o campo nome foi preenchido a busca será pelo nome    
        }else{
            //Chama o objeto/classe "PacienteCG" e mostra os dados do paciente pelo SUS
            Paciente paciente = ctrlPaciente.getCtrlNome(txtNome.getText(), tipo);
            //Se retornar um valor vazio é por que o registro não existe no BD
            //Mostra a mensagem dizendo que o paciente não está cadastrado
            if(paciente.getNome() == null){
                JOptionPane.showMessageDialog(this, "Paciente Não Cadastrado!");
            }else{
                //Mostra os dados do PacienteCG
                JOptionPane.showMessageDialog(this, 
                "<html>__________________________<br>"
                + "Nome: " + paciente.getNome() 
                + "<br>__________________________<br>"
                + "Sus: " + paciente.getSus() 
                + "<br>__________________________<br>"
                + "Endereço: " + paciente.getEndereco()
                + "<br>__________________________<br>"
                + "Fone: " + paciente.getFone() 
                + "<br>__________________________<br>"
                + "Data de Nascimento: " + paciente.getDatanasc() 
                + "<br>__________________________<br>"
                + "</html>"); 
                }
        }
    }//GEN-LAST:event_jbtExibirActionPerformed
    //Botão Excluir
    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        //Pergunta se o usuário realmente quer apagar
        Object[] options = { "Confirmar", "Cancelar" };
        int opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo excluir esse registro?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        //Se retornar o valor 0 ou seja "Confirmar" então o registro é apagado
        if(opcao == 0){
            //Chama o objeto/classe "CtrlPacienteCG"
            CtrlPaciente ctrlPaciente = new CtrlPaciente();
            //Variável que recebe o retorno da classe CtrlPacienteCG
            boolean exluiu = ctrlPaciente.excluirCtrl((int) txtSus.getValue(), tipo);
            //Se for excluido, mostra essa mensagem
            if(exluiu){
             JOptionPane.showMessageDialog(this, "Excluido");
            }  
        }
        
    }//GEN-LAST:event_jbtExcluirActionPerformed
    //Botão Atualizar
    private void jbtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtualizarActionPerformed
        //Chama o objeto/classe CtrlPacienteCG
        CtrlPaciente ctrlPaciente = new CtrlPaciente();
        //Chama o objeto/classe PacienteCG
        Paciente paciente = new Paciente();
        //Modifica os dados do PacienteCG usando a Primary Key "sus"
        paciente.setNome(txtNome.getText());
        paciente.setSus((int) txtSus.getValue());
        paciente.setTipo(tipo);
        paciente.setEndereco(txtEndereco.getText());
        paciente.setFone(txtFone.getText());
        paciente.setDatanasc(txtDatanasc.getText());

        //Variável de retorno da classe
        boolean atualizou = ctrlPaciente.updateCtrl(paciente);
        //Se atualizou, mostra essa mensagem
        if(atualizou){
            JOptionPane.showMessageDialog(this, "Registro atualizado");
        }
    }//GEN-LAST:event_jbtAtualizarActionPerformed
    //Botão de navegação "Inicio" 
    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        //Chama o Layou Inicio
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "inicio");
        //Quando clicado, o botão muda a cor para cinza
        btnInicio.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnAnotacoes.setBackground(Color.WHITE);
        btnCadastro.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
        btnExames.setBackground(Color.WHITE);
        btnLogin.setBackground(Color.white);
        btnSituacao.setBackground(Color.white);
    }//GEN-LAST:event_btnInicioMouseClicked
    //Botão de navegação "Acompanhamento"
    private void btnAnotacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnotacoesMouseClicked
        //Chama o Layou Anotacoes
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "anotacoes");
        //Quando clicado, o botão muda a cor para cinza
        btnAnotacoes.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnInicio.setBackground(Color.WHITE);
        btnCadastro.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE); 
        btnExames.setBackground(Color.WHITE);
        btnLogin.setBackground(Color.white);
        btnSituacao.setBackground(Color.white);
    }//GEN-LAST:event_btnAnotacoesMouseClicked
    //Botão de navegação "Cadastro"
    private void btnCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseClicked
        //Chama o Layou Cadastro
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "cadastro");
        //Quando clicado, o botão muda a cor para cinza
        btnCadastro.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnAnotacoes.setBackground(Color.WHITE);
        btnInicio.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
        btnExames.setBackground(Color.WHITE);
        btnLogin.setBackground(Color.white);
        btnSituacao.setBackground(Color.white);

    }//GEN-LAST:event_btnCadastroMouseClicked
    //Botão "Ver" Acompanhamento
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        //Chama o objeto/classe "Ctrlpaciente"
        CtrlPaciente ctrlPaciente = new CtrlPaciente();
        //Chama o objeto/classe "paciente" e mostra os dados do paciente pelo SUS
        Paciente paciente = ctrlPaciente.getCtrlAno((int)verSus.getValue(), tipo);
        //Mostra os dados do paciente
        txtAnotacoes.setText(paciente.getAnotacoes());
        txtComentario.setText(txtAnotacoes.getText());
    }//GEN-LAST:event_btnVerActionPerformed
    //Botão "Atualizar" Acompanhamento 
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        //Chama o objeto/classe Ctrlpaciente
        CtrlPaciente ctrlPaciente = new CtrlPaciente();
        //Chama o objeto/classe paciente
        Paciente paciente = new Paciente();
        paciente.setSus((int)verSus.getValue());
        paciente.setTipo(tipo);
        ctrlPaciente.updateCtrlAno(paciente);
        //Modifica os dados do paciente usando a Primary Key sus
        paciente.setAnotacoes(txtComentario.getText());

        //Variável de retorno da classe
        boolean atualizou = ctrlPaciente.updateCtrlAno(paciente);
        //Se atualizou, mostra essa mensagem
        if(atualizou){
            JOptionPane.showMessageDialog(this, "Atualizado");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed
    //Botão de navegação Sair
    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        //Fecha a tela
        this.dispose();
    }//GEN-LAST:event_btnSairMouseClicked
    //Botão de navegação Login
    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        //Quando clicado, o botão muda a cor para cinza
        btnLogin.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnAnotacoes.setBackground(Color.WHITE);
        btnCadastro.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
        btnInicio.setBackground(Color.WHITE);
        btnExames.setBackground(Color.white);
        btnSituacao.setBackground(Color.white);
        //Chama a TelaLogin
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        //Fecha a tela atual
        this.dispose();
    }//GEN-LAST:event_btnLoginMouseClicked
    //Botão de navegação Exames
    private void btnExamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExamesMouseClicked
        //Chama o Layou Inicio
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "exames");
        //Quando clicado, o botão muda a cor para cinza
        btnExames.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnAnotacoes.setBackground(Color.WHITE);
        btnCadastro.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
        btnInicio.setBackground(Color.WHITE);
        btnLogin.setBackground(Color.white);
        btnSituacao.setBackground(Color.white);
    }//GEN-LAST:event_btnExamesMouseClicked
    //Botão de navegação para exames
    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        //Chama a classe de navegação 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Procurar Exame");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //Configurações e filtros de pesquisa
        FileNameExtensionFilter ff = new FileNameExtensionFilter("Arquivo", "jpg", "jpeg", "png");
        //Passa as informações do arquivo selecionado para a variável
        fileChooser.setFileFilter(ff);
        int retorno = fileChooser.showOpenDialog(this);
        //Condicional de retorno
        if (retorno == JFileChooser.APPROVE_OPTION) {
            //passa o arquivo para a variável
            File file = fileChooser.getSelectedFile();
            //Mostra a localização do arquivo na caixa de texto
            txtFile.setText(file.getPath());
            //Mostra o arquivo no Label
            jLabel14.setIcon(new ImageIcon(file.getPath()));
        }
    }//GEN-LAST:event_btnProcurarActionPerformed
    //Botão de navegação Situação
    private void btnSituacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSituacaoMouseClicked
        //Chama o Layou Inicio
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "situacao");
        //Quando clicado, o botão muda a cor para cinza
        btnSituacao.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnAnotacoes.setBackground(Color.WHITE);
        btnCadastro.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
        btnInicio.setBackground(Color.WHITE);
        btnLogin.setBackground(Color.white);
        btnExames.setBackground(Color.white);
    }//GEN-LAST:event_btnSituacaoMouseClicked
    //Botão Ver Situação
    private void btnVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer1ActionPerformed
        //Chama o objeto/classe "Ctrlpaciente"
        CtrlPaciente ctrlPaciente = new CtrlPaciente();
        //Chama o objeto/classe "paciente" e mostra os dados do paciente pelo SUS
        Paciente paciente = ctrlPaciente.getCtrlSit((int)verSus1.getValue(), tipo);
        //Mostra os dados do paciente
        txtQuest.setText(paciente.getSituacao());
    }//GEN-LAST:event_btnVer1ActionPerformed
    //Botão enviar situação
    private void btnEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar2ActionPerformed
        //Chama o objeto/classe Ctrlpaciente
        CtrlPaciente ctrlPaciente = new CtrlPaciente();
        //Chama o objeto/classe paciente
        Paciente paciente = new Paciente();
        paciente.setSus((int)verSus1.getValue());
        paciente.setTipo(tipo);
        ctrlPaciente.updateCtrlSit(paciente);
        //Modifica os dados do paciente usando a Primary Key sus
        paciente.setSituacao(txtQuest.getText());

        //Variável de retorno da classe
        boolean atualizou = ctrlPaciente.updateCtrlSit(paciente);
        //Se atualizou, mostra essa mensagem
        if(atualizou){
            JOptionPane.showMessageDialog(this, "Enviado");
        }
    }//GEN-LAST:event_btnEnviar2ActionPerformed
    //Botão para atualizar os dados da situação
    private void btnPassarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassarActionPerformed
        //limpa a caixa de dados ao clicar
        txtQuest.setText("");
        //Gestante?
        if(caixaGestante.getSelectedItem().toString().equals("Sim")){
            txtQuest.append("Gestante. Maternidade: "+ txtMaternidade.getText());
        }
        //Peso
        if(caixaPeso.getSelectedItem().toString().equals("Abaixo do peso")){
            txtQuest.append(" | Abaixo do peso");
        }else{ if(caixaPeso.getSelectedItem().toString().equals("No peso ideal")){
            txtQuest.append(" | No peso ideal");
        }else{
            txtQuest.append(" | Acima do peso");
        }}
        //Fumante?
        if(caixaFumante.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Fumante");
        }
        //Alcool?
        if(caixaAlcool.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Faz uso de álcool");
        }
        //Drogas
        if(caixaDrogas.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Faz uso de drogas");
        }
        //pressão
        if(caixaPressao.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Hipertenso(a)");
        }
        //Diabetes
        if(caixaDiabete.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Diabético(a)");
        }
        //Derrame
        if(caixaAvc.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Teve AVC/Derrame");
        }
        //infarto
        if(caixaInfarto.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Teve infarto");
        }
        //Hanseníase
        if(caixaHanseniase.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Está com Hanseníase");
        }
        //Tuberculose
        if(caixaTuberculose.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Está com tuberculose");
        }
        //Cancer
        if(caixaCancer.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Tem ou teve câncer");
        }
        //acamado
        if(caixaAcamado.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Está acamado");
        }
        //Domiciliado
        if(caixaDomiciliado.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Está domiciliado");
        }
        //práticas
        if(caixaPraticas.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Usa práticas integrativas e complementares");
        }
        //Coração
        if(caixaCoracao.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Doença cardíaca: "+ txtCoracao.getText());
        }
        //Rins
        if(caixaRins.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Doença nos rins: "+ txtRins.getText());
        }
        //Pulmões
        if(caixaPulmao.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Doença no pulmão: "+ txtPulmao.getText());
        }
        //Internação
        if(caixaInternacao.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Internação nos últimos 12 meses: "+ txtInternacao.getText());
        }
        //Plantas medicinais
        if(caixaPlantas.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Uso de plantas medicinais: "+ txtPlantas.getText());
        }
        //Outras
        if(caixaOutras.getSelectedItem().toString().equals("Sim")){
            txtQuest.append(" | Outros(as): "+ txtOutras.getText());
        }
    }//GEN-LAST:event_btnPassarActionPerformed
    //Botao Pesquisar Paciente
    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        //Se o nome for vazio vai mostrar uma tabela vazia
        if(txtNome.getText().equals("")){           
            tabela = (DefaultTableModel)tResult.getModel();
            tabela.setNumRows(0);
        //Se não, chama o método de pesquisa ReadJTable    
        }else{
           readJTable(); 
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed
    //Método que faz a pesquisa do paciente no BD
    public void readJTable() {
        //Modifica a tabela vazia pela que vai ser prenchida com os dados
        DefaultTableModel modelo = (DefaultTableModel) tResult.getModel();
        modelo.setNumRows(0);
        //Chama a classe DAOPacienteCG
        DAOPaciente pdao = new DAOPaciente();
        //Modifica a variável vazia pelo nome informado
        pdao.setPnome(txtNome.getText());
        pdao.setPtipo(tipo);
        //Cria um laço de repetição com os dados do paciente
        for (Paciente p : pdao.read()) {
            //Mostra o nome e o sus na tabela
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getSus(),
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    //Método main
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomePage().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAnotacoes;
    private javax.swing.JLabel btnCadastro;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JToggleButton btnEnviar2;
    private javax.swing.JLabel btnExames;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JButton btnPassar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel btnSituacao;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVer1;
    private javax.swing.JComboBox<String> caixaAcamado;
    private javax.swing.JComboBox<String> caixaAlcool;
    private javax.swing.JComboBox<String> caixaAvc;
    private javax.swing.JComboBox<String> caixaCancer;
    private javax.swing.JComboBox<String> caixaCoracao;
    private javax.swing.JComboBox<String> caixaDiabete;
    private javax.swing.JComboBox<String> caixaDomiciliado;
    private javax.swing.JComboBox<String> caixaDrogas;
    private javax.swing.JComboBox<String> caixaFumante;
    private javax.swing.JComboBox<String> caixaGestante;
    private javax.swing.JComboBox<String> caixaHanseniase;
    private javax.swing.JComboBox<String> caixaInfarto;
    private javax.swing.JComboBox<String> caixaInternacao;
    private javax.swing.JComboBox<String> caixaOutras;
    private javax.swing.JComboBox<String> caixaPeso;
    private javax.swing.JComboBox<String> caixaPlantas;
    private javax.swing.JComboBox<String> caixaPraticas;
    private javax.swing.JComboBox<String> caixaPressao;
    private javax.swing.JComboBox<String> caixaPulmao;
    private javax.swing.JComboBox<String> caixaRins;
    private javax.swing.JComboBox<String> caixaTuberculose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbtAtualizar;
    private javax.swing.JButton jbtCadastrar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtExibir;
    private javax.swing.JPanel panAnotacoes;
    private javax.swing.JPanel panCadastro;
    private javax.swing.JPanel panExames;
    private javax.swing.JPanel panInicio;
    private javax.swing.JPanel panNave;
    private javax.swing.JPanel panSituacao;
    private javax.swing.JPanel panTelas;
    private javax.swing.JTable tResult;
    private javax.swing.JTextArea txtAnotacoes;
    private javax.swing.JTextPane txtComentario;
    private javax.swing.JTextField txtCoracao;
    private javax.swing.JTextField txtDatanasc;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtInternacao;
    private javax.swing.JTextField txtMaternidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtOutras;
    private javax.swing.JTextField txtPlantas;
    private javax.swing.JTextField txtPulmao;
    private javax.swing.JTextArea txtQuest;
    private javax.swing.JTextField txtRins;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JLabel txtStatus1;
    private javax.swing.JLabel txtStatus2;
    private javax.swing.JLabel txtStatus3;
    private javax.swing.JLabel txtStatus4;
    private javax.swing.JSpinner txtSus;
    private javax.swing.JSpinner verSus;
    private javax.swing.JSpinner verSus1;
    // End of variables declaration//GEN-END:variables
}