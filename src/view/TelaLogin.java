package view;

import DAO.DAOLogin;
import conexoes.ConexaoMySql;
import java.awt.CardLayout;
import java.awt.Color;

public class TelaLogin extends javax.swing.JFrame {


    public TelaLogin() {
        initComponents();
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        
        ConexaoMySql con = new ConexaoMySql();
        
        con.conectar();
        if(con.isStatus() == true){
            txtStatus1.setText("Conectado ao Banco de Dados!");
            txtStatus1.setForeground(Color.GREEN);
            txtStatus2.setText("Conectado ao Banco de Dados!");
            txtStatus2.setForeground(Color.GREEN);
            txtStatus3.setText("Conectado ao Banco de Dados!");
            txtStatus3.setForeground(Color.GREEN);
        }else{
            txtStatus1.setText("Não conectado ao Banco de Dados!");
            txtStatus1.setForeground(Color.red);
            txtStatus2.setText("Não conectado ao Banco de Dados!");
            txtStatus2.setForeground(Color.red);
            txtStatus3.setText("Não conectado ao Banco de Dados!");
            txtStatus3.setForeground(Color.red);
        } 
        con.fecharConexao();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panNave = new javax.swing.JPanel();
        btnCG = new javax.swing.JLabel();
        btnEnfer = new javax.swing.JLabel();
        btnOdonto = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panTelas = new javax.swing.JPanel();
        panCG = new javax.swing.JPanel();
        txtUsuCG = new javax.swing.JTextField();
        btnEnviarCG = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSenCG = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtStatus1 = new javax.swing.JLabel();
        panEnfer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnEnviarEnfer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSenEnfer = new javax.swing.JPasswordField();
        txtUsuEnfer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtStatus2 = new javax.swing.JLabel();
        panOdonto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuOdonto = new javax.swing.JTextField();
        btnEnviarOdonto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSenOdonto = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtStatus3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PSF-II");

        panNave.setBackground(new java.awt.Color(0, 102, 0));
        panNave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));

        btnCG.setBackground(new java.awt.Color(255, 255, 255));
        btnCG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCG.setText("Clínico Geral ");
        btnCG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnCG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCG.setOpaque(true);
        btnCG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCGMouseClicked(evt);
            }
        });

        btnEnfer.setBackground(new java.awt.Color(255, 255, 255));
        btnEnfer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnfer.setText("Enfermeiro");
        btnEnfer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnEnfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnfer.setOpaque(true);
        btnEnfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnferMouseClicked(evt);
            }
        });

        btnOdonto.setBackground(new java.awt.Color(255, 255, 255));
        btnOdonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOdonto.setText("Odontólogo");
        btnOdonto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnOdonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOdonto.setOpaque(true);
        btnOdonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOdontoMouseClicked(evt);
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PSF II");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/psf-image.png"))); // NOI18N

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Desenvolvido por Thiago Lira");

        javax.swing.GroupLayout panNaveLayout = new javax.swing.GroupLayout(panNave);
        panNave.setLayout(panNaveLayout);
        panNaveLayout.setHorizontalGroup(
            panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNaveLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnfer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOdonto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panNaveLayout.setVerticalGroup(
            panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNaveLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCG, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOdonto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnfer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(20, 20, 20))
        );

        panTelas.setBackground(new java.awt.Color(255, 255, 255));
        panTelas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        panTelas.setLayout(new java.awt.CardLayout());

        panCG.setBackground(new java.awt.Color(255, 255, 255));
        panCG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuCG.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        panCG.add(txtUsuCG, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 230, 570, -1));

        btnEnviarCG.setText("Entrar");
        btnEnviarCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCGActionPerformed(evt);
            }
        });
        panCG.add(btnEnviarCG, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 300, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Nome:");
        panCG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Senha:");
        panCG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Senha Incorreta");
        panCG.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 120, 50));

        txtSenCG.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        panCG.add(txtSenCG, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 570, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clínico Geral-PSF II");
        panCG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 70, 1190, -1));

        txtStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panCG.add(txtStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 340, 30));

        panTelas.add(panCG, "CG");

        panEnfer.setBackground(new java.awt.Color(255, 255, 255));
        panEnfer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Nome:");
        panEnfer.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        btnEnviarEnfer.setText("Entrar");
        btnEnviarEnfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarEnferActionPerformed(evt);
            }
        });
        panEnfer.add(btnEnviarEnfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 300, 110));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("Senha:");
        panEnfer.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        txtSenEnfer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        panEnfer.add(txtSenEnfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 570, -1));

        txtUsuEnfer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtUsuEnfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuEnferActionPerformed(evt);
            }
        });
        panEnfer.add(txtUsuEnfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 570, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enfermagem-PSF II");
        panEnfer.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 70, 1190, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("Senha Incorreta");
        panEnfer.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 120, 50));

        txtStatus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panEnfer.add(txtStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 340, 30));

        panTelas.add(panEnfer, "Enfer");

        panOdonto.setBackground(new java.awt.Color(255, 255, 255));
        panOdonto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nome:");
        panOdonto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, -1));

        txtUsuOdonto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        panOdonto.add(txtUsuOdonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 570, -1));

        btnEnviarOdonto.setText("Entrar");
        btnEnviarOdonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarOdontoActionPerformed(evt);
            }
        });
        panOdonto.add(btnEnviarOdonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 300, 110));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Senha:");
        panOdonto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        txtSenOdonto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        panOdonto.add(txtSenOdonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 570, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Odontologia-PSF II");
        panOdonto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 70, 1190, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("Senha Incorreta");
        panOdonto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 120, 50));

        txtStatus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panOdonto.add(txtStatus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 340, 30));

        panTelas.add(panOdonto, "Odonto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1220, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(panTelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panNave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panTelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botão Clininco Geral
    private void btnCGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCGMouseClicked
        //Chama o Layou Clinico Geral
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "CG");
        //Quando clicado, o botão muda a cor para cinza
        btnCG.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnEnfer.setBackground(Color.WHITE);
        btnOdonto.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnCGMouseClicked
    //Botão Enfermeiro
    private void btnEnferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnferMouseClicked
        //Chama o Layou Enfermeiro
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "Enfer");
        //Quando clicado, o botão muda a cor para cinza
        btnEnfer.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnCG.setBackground(Color.WHITE);
        btnOdonto.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);

    }//GEN-LAST:event_btnEnferMouseClicked
    //Botão Odontologo
    private void btnOdontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdontoMouseClicked
        //Chama o Layou Odontologo
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "Odonto");
        //Quando clicado, o botão muda a cor para cinza
        btnOdonto.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnEnfer.setBackground(Color.WHITE);
        btnCG.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnOdontoMouseClicked
    //Botão Sair
    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        //Fecha a tela
        this.dispose();
        
    }//GEN-LAST:event_btnSairMouseClicked
    //Botão de Login do Clinico Geral
    private void btnEnviarCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCGActionPerformed
        //Chama a classe de login "DAOLogin" 
       DAOLogin dao = new DAOLogin();
       //Se retornar verdadeiro
       if(dao.checkLogin(txtUsuCG.getText(), txtSenCG.getText())){
           //Abre a HOmePageCG e fecha a tela de login
           HomePage hp = new HomePage();
           hp.setVisible(true);
           hp.setTipo("cg");
           this.dispose();
       //Senão mostra "Erro de Login"
       }else{
           txtSenCG.setBackground(Color.red);
           jLabel13.setVisible(true);
       }

    }//GEN-LAST:event_btnEnviarCGActionPerformed
    //Botão Login Odontologo
    private void btnEnviarOdontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarOdontoActionPerformed
        //Chama a clase de Login "DAOLogin"
       DAOLogin dao = new DAOLogin(); 
       //Se retornar verdadeiro 
       if(dao.checkLogin(txtUsuOdonto.getText(), txtSenOdonto.getText())){
           //Abre a HomePageodonto e fecha a tela de login
           HomePage hp = new HomePage();
           hp.setVisible(true);
           hp.setTipo("od");
           this.dispose();
       //Senão mostra "Erro de login"
       }else{
           txtSenOdonto.setBackground(Color.red);
           jLabel15.setVisible(true);
       }

    }//GEN-LAST:event_btnEnviarOdontoActionPerformed
    //Botão de Login Enfermeiro
    private void btnEnviarEnferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarEnferActionPerformed
        //Chama a clase de Login "DAOLogin"
        DAOLogin dao = new DAOLogin();
        //Se retornar verdadeiro
        if(dao.checkLogin(txtUsuEnfer.getText(), txtSenEnfer.getText())){
            //Abre a HomePageEnfer e fecha a tela de login
            HomePage hp = new HomePage();
            hp.setVisible(true);
            hp.setTipo("ef");
            this.dispose();
        //Senão mostra "Erro de login"    
        }else{
           txtSenEnfer.setBackground(Color.red);
           jLabel14.setVisible(true);
        }
    }//GEN-LAST:event_btnEnviarEnferActionPerformed

    private void txtUsuEnferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuEnferActionPerformed
    }//GEN-LAST:event_txtUsuEnferActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCG;
    private javax.swing.JLabel btnEnfer;
    private javax.swing.JButton btnEnviarCG;
    private javax.swing.JButton btnEnviarEnfer;
    private javax.swing.JButton btnEnviarOdonto;
    private javax.swing.JLabel btnOdonto;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panCG;
    private javax.swing.JPanel panEnfer;
    private javax.swing.JPanel panNave;
    private javax.swing.JPanel panOdonto;
    private javax.swing.JPanel panTelas;
    private javax.swing.JPasswordField txtSenCG;
    private javax.swing.JPasswordField txtSenEnfer;
    private javax.swing.JPasswordField txtSenOdonto;
    private javax.swing.JLabel txtStatus1;
    private javax.swing.JLabel txtStatus2;
    private javax.swing.JLabel txtStatus3;
    private javax.swing.JTextField txtUsuCG;
    private javax.swing.JTextField txtUsuEnfer;
    private javax.swing.JTextField txtUsuOdonto;
    // End of variables declaration//GEN-END:variables
}