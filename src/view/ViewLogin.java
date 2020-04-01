
package view;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Colaborador;
import model.bean.Senha;
import model.dao.ColaboradorDAO;
import model.dao.SenhaDAO;


public class ViewLogin extends javax.swing.JFrame {
    
    Connection                con = null;
    PreparedStatement         pst = null;
    ResultSet                  rs = null;
    public static String Id_Colaborador;
    public static String NomeColaborador;
    public static String SenhaColaborador;
    
    public ViewLogin() throws ClassNotFoundException {
        
        initComponents();
        this.setLocationRelativeTo(null);  
        txtusuario.requestFocus();
        con = conexao._ConnectionFactory.conexaoDb();
     //  con = conexao.ConnectionFactory.getConnection();
    }

      
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLogin = new javax.swing.JDesktopPane();
        lbltitulo = new javax.swing.JLabel();
        lblsubtitulo = new javax.swing.JLabel();
        lblimgbrasil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        lblsenha = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        btentrar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        lblversao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enterprise -  Gestão Empresarial");
        setBackground(new java.awt.Color(0, 0, 153));
        setResizable(false);

        PainelLogin.setBackground(new java.awt.Color(0, 51, 102));

        lbltitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("Enterprise");

        lblsubtitulo.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblsubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblsubtitulo.setText("Sistema de Gestão Empresarial");

        lblimgbrasil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Bandeira Brasil 48x48.png"))); // NOI18N
        lblimgbrasil.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Login Manager.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setText("Usuário:");

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
        });

        lblsenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblsenha.setForeground(new java.awt.Color(255, 255, 255));
        lblsenha.setText("Senha:");

        txtsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsenhaKeyPressed(evt);
            }
        });

        btentrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-ok-30.png"))); // NOI18N
        btentrar.setText("ENTRAR");
        btentrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btentrar.setPreferredSize(new java.awt.Dimension(120, 39));
        btentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btentrarActionPerformed(evt);
            }
        });
        btentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btentrarKeyPressed(evt);
            }
        });

        btsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancel-30.png"))); // NOI18N
        btsair.setText("SAIR");
        btsair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btsair.setMaximumSize(new java.awt.Dimension(111, 39));
        btsair.setMinimumSize(new java.awt.Dimension(111, 39));
        btsair.setPreferredSize(new java.awt.Dimension(115, 39));
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });
        btsair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btsairKeyPressed(evt);
            }
        });

        lblversao.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        lblversao.setForeground(new java.awt.Color(255, 255, 255));
        lblversao.setText("Versão 1.0");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Enterprise 64x64.png"))); // NOI18N

        PainelLogin.setLayer(lbltitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(lblsubtitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(lblimgbrasil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(lblusuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(txtusuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(lblsenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(txtsenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(btentrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(btsair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(lblversao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelLogin.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelLoginLayout = new javax.swing.GroupLayout(PainelLogin);
        PainelLogin.setLayout(PainelLoginLayout);
        PainelLoginLayout.setHorizontalGroup(
            PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PainelLoginLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtusuario)
                            .addGroup(PainelLoginLayout.createSequentialGroup()
                                .addComponent(btentrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(PainelLoginLayout.createSequentialGroup()
                        .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblusuario)
                            .addComponent(lblsenha)
                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(PainelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelLoginLayout.createSequentialGroup()
                        .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblversao)
                            .addComponent(lblimgbrasil))
                        .addGap(42, 42, 42))
                    .addGroup(PainelLoginLayout.createSequentialGroup()
                        .addComponent(lblsubtitulo)
                        .addGap(104, 104, 104))
                    .addGroup(PainelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbltitulo)
                        .addGap(126, 126, 126))))
        );
        PainelLoginLayout.setVerticalGroup(
            PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLoginLayout.createSequentialGroup()
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLoginLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbltitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubtitulo)
                .addGap(33, 33, 33)
                .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLoginLayout.createSequentialGroup()
                        .addComponent(lblusuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btentrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(PainelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblimgbrasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblversao)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelLogin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelLogin)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        sair();
    }//GEN-LAST:event_btsairActionPerformed

    private void btentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btentrarKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              acesso();  
       }
       if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
              btsair.requestFocus();
       }
    }//GEN-LAST:event_btentrarKeyPressed

    private void btentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btentrarActionPerformed
        acesso();
    }//GEN-LAST:event_btentrarActionPerformed

    private void txtsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsenhaKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            acesso();  
         }
    }//GEN-LAST:event_txtsenhaKeyPressed

    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              txtsenha.requestFocus();
            }
    }//GEN-LAST:event_txtusuarioKeyPressed

    private void btsairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btsairKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              sair();
        }      
        if(evt.getKeyCode() == KeyEvent.VK_LEFT){
              btentrar.requestFocus();
        }
    }//GEN-LAST:event_btsairKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewLogin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    
                    JOptionPane.showMessageDialog(null, "A SESSÃO SERÁ ENCERRADA... " + ex );
                    
                }
            }
        });
    }
    
    //*********************************** CODIGO LIMPO *************************************************
    
    public void limparCampos() {
        txtusuario.setText("");
        txtsenha.setText("");
        txtusuario.requestFocus();
    }

    public void acesso() {
        ColaboradorDAO colaboradordao = new ColaboradorDAO();
        SenhaDAO            senhadao  = new SenhaDAO();
        Senha                  senha  = new Senha();
        NomeColaborador               = txtusuario.getText().toUpperCase().trim();
        SenhaColaborador              = new String(txtsenha.getPassword());
        if ((NomeColaborador).equals("ADMINISTRADOR") && (SenhaColaborador).equals("123456")) {
            Id_Colaborador = "0";
            acessoLiberado();
        } else {
            if (colaboradordao.pesquisaNomeReduzido(NomeColaborador) != null) {  //MÉTODO QUE ENTRA O NOME REDUZIDO E RETORNA O ID_COLABORADOR
                // SE PASSOU ENCONTROU O NOME REDUZIDO DO COLABORADOR
                Id_Colaborador = colaboradordao.pesquisaNomeReduzido(NomeColaborador);
                if (senhadao.pesquisaColaborador_Id(Id_Colaborador) != null && senhadao.pesquisaRegistroCancelado(Id_Colaborador)) {
                    //SE PASSOU ENCONTROU O ID DO COLABORADOR E PEGOU A SENHA, BASTA APENAS VERIFICAR A SENHA 
                    try {
                        if ((senhadao.criptografiaSenha(SenhaColaborador)).equals(senhadao.pesquisaColaborador_Id(Id_Colaborador))) {
                            acessoLiberado();
                        } else {
                            JOptionPane.showMessageDialog(null, "SENHA INVÁLIDA !", "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                        Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    acessoNegado();
                } else {
                    JOptionPane.showMessageDialog(null, "COLABORADOR SEM ACESSO AO SISTEMA !", "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                    acessoNegado();
                }
            } else {
                JOptionPane.showMessageDialog(null, "ACESSO NEGADO !", "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                acessoNegado();
            }
        }
    }
    
    public void acessoLiberado() {
        JOptionPane.showMessageDialog(null, "SEJA BEM VINDO " +NomeColaborador+" !");
        dispose();
        ViewPrincipal principal = new ViewPrincipal();
        principal.setVisible(true);
    }
    
    public void acessoNegado(){
          limparCampos();
    }
    
    public void sair(){
        System.exit(0);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PainelLogin;
    private javax.swing.JButton btentrar;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblimgbrasil;
    private javax.swing.JLabel lblsenha;
    private javax.swing.JLabel lblsubtitulo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JLabel lblversao;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
