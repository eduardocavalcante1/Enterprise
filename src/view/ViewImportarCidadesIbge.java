
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.ImportarCidadesIbge;
import model.dao.ColaboradorDAO;
import model.dao.ImportarCidadesIbgeDAO;
import util.Util;



public class ViewImportarCidadesIbge extends javax.swing.JInternalFrame {
 
   
    public ViewImportarCidadesIbge() {
        initComponents();
        readDados();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDados = new javax.swing.JPanel();
        lbldescricao = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblusuarioalteracao = new javax.swing.JLabel();
        txtusuarioalteracao = new javax.swing.JFormattedTextField();
        lbldtalteracao = new javax.swing.JLabel();
        txtdtalteracao = new javax.swing.JFormattedTextField();
        lblaguarde = new javax.swing.JLabel();
        lbllinkplanilhaibge = new javax.swing.JLabel();
        lblinformacao = new javax.swing.JLabel();
        lblplanilha = new javax.swing.JLabel();
        PainelAcao = new javax.swing.JPanel();
        btnimportar = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        btnlimparcampos = new javax.swing.JButton();

        setClosable(true);
        setTitle("ENTERPRISE - IMPORTAÇÃO DOS CÓDIGOS DAS CIDADES BRASILEIRAS - I B G E");

        PainelDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelDados.setLayout(null);

        lbldescricao.setText("INFORME O CAMINHO E O NOME DO ARQUIVO - (Exemplo: C:\\DOCUMENTOS\\IBGE.XLSX) -  PLANILHAS NESTE FORMATO XLSX");
        PainelDados.add(lbldescricao);
        lbldescricao.setBounds(20, 20, 750, 14);

        txtdescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdescricaoFocusLost(evt);
            }
        });
        txtdescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescricaoKeyPressed(evt);
            }
        });
        PainelDados.add(txtdescricao);
        txtdescricao.setBounds(20, 40, 750, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "ÚLTIMA IMPORTAÇÃO"));

        lblusuarioalteracao.setText("Realizado por:");

        txtusuarioalteracao.setEditable(false);
        try {
            txtusuarioalteracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbldtalteracao.setText("Data da Alteração:");

        txtdtalteracao.setEditable(false);
        try {
            txtdtalteracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtalteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtalteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbldtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldtalteracao)
                    .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        PainelDados.add(jPanel1);
        jPanel1.setBounds(20, 70, 750, 70);

        lblaguarde.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PainelDados.add(lblaguarde);
        lblaguarde.setBounds(230, 150, 340, 14);

        lbllinkplanilhaibge.setText("LINK PARA DOWNLOAD:    ftp://geoftp.ibge.gov.br/organizacao_do_territorio/estrutura_territorial/divisao_territorial/");
        PainelDados.add(lbllinkplanilhaibge);
        lbllinkplanilhaibge.setBounds(10, 220, 780, 14);

        lblinformacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblinformacao.setForeground(java.awt.Color.red);
        lblinformacao.setText("ANTES DE IMPORTAR VERIFIQUE SE A PLANILHA ESTÁ NESTE LAYOUT");
        PainelDados.add(lblinformacao);
        lblinformacao.setBounds(10, 240, 780, 14);

        lblplanilha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Layout Planilha IBGE Cidades.png"))); // NOI18N
        PainelDados.add(lblplanilha);
        lblplanilha.setBounds(0, 260, 810, 80);

        PainelAcao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnimportar.setBackground(new java.awt.Color(255, 153, 153));
        btnimportar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnimportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-plus-16.png"))); // NOI18N
        btnimportar.setText("IMPORTAR");
        btnimportar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnimportar.setMaximumSize(new java.awt.Dimension(91, 23));
        btnimportar.setMinimumSize(new java.awt.Dimension(91, 23));
        btnimportar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnimportar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnimportarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnimportarFocusLost(evt);
            }
        });
        btnimportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimportarActionPerformed(evt);
            }
        });
        btnimportar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnimportarKeyPressed(evt);
            }
        });

        btnvoltar.setBackground(new java.awt.Color(255, 153, 153));
        btnvoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancel-16.png"))); // NOI18N
        btnvoltar.setText("VOLTAR");
        btnvoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltar.setMaximumSize(new java.awt.Dimension(91, 23));
        btnvoltar.setMinimumSize(new java.awt.Dimension(91, 23));
        btnvoltar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnvoltar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnvoltarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnvoltarFocusLost(evt);
            }
        });
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        btnvoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnvoltarKeyPressed(evt);
            }
        });

        btnlimparcampos.setBackground(new java.awt.Color(255, 153, 153));
        btnlimparcampos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnlimparcampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-limpar-formatação-16.png"))); // NOI18N
        btnlimparcampos.setText("LIMPAR CAMPOS");
        btnlimparcampos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimparcampos.setPreferredSize(new java.awt.Dimension(120, 25));
        btnlimparcampos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnlimparcamposFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnlimparcamposFocusLost(evt);
            }
        });
        btnlimparcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparcamposActionPerformed(evt);
            }
        });
        btnlimparcampos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnlimparcamposKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PainelAcaoLayout = new javax.swing.GroupLayout(PainelAcao);
        PainelAcao.setLayout(PainelAcaoLayout);
        PainelAcaoLayout.setHorizontalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcaoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimportar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(625, Short.MAX_VALUE))
        );
        PainelAcaoLayout.setVerticalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcaoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnimportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(PainelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PainelDados, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescricaoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescricaoFocusLost

    private void txtdescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescricaoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            if (txtdescricao.getText().trim().isEmpty()){
                txtdescricao.requestFocus();
                JOptionPane.showMessageDialog(null, "O CAMINHO E O NOME DO ARQUIVO É OBRIGATÓRIO, VERIFIQUE E TENTE NOVAMENTE!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                btnvoltar.requestFocus();
            }else{
                btnimportar.requestFocus();
            }
        }

    }//GEN-LAST:event_txtdescricaoKeyPressed

    private void btnimportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimportarActionPerformed
        try {
            importar();
        } catch (IOException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO IMPORTAR ! (VIEW) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnimportarActionPerformed

    private void btnimportarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnimportarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                importar();
            } catch (IOException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO AO IMPORTAR ! (VIEW) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnvoltar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnlimparcampos.requestFocus();
        }
    }//GEN-LAST:event_btnimportarKeyPressed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnimportarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnimportarFocusGained
         btnimportar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnimportarFocusGained

    private void btnimportarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnimportarFocusLost
       btnimportar.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnimportarFocusLost

    private void btnvoltarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnvoltarFocusGained
          btnvoltar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnvoltarFocusGained

    private void btnvoltarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnvoltarFocusLost
         btnvoltar.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnvoltarFocusLost

    private void btnvoltarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnvoltarKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_DOWN){
          btnlimparcampos.requestFocus();
       }
       if(evt.getKeyCode() == KeyEvent.VK_UP){
          btnimportar.requestFocus();
       }
       if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          dispose();
       }  
    }//GEN-LAST:event_btnvoltarKeyPressed

    private void txtdtalteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtalteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtalteracaoActionPerformed

    private void btnlimparcamposFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnlimparcamposFocusGained
        btnlimparcampos.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnlimparcamposFocusGained

    private void btnlimparcamposFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnlimparcamposFocusLost
        btnlimparcampos.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnlimparcamposFocusLost

    private void btnlimparcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparcamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnlimparcamposActionPerformed

    private void btnlimparcamposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlimparcamposKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            btnvoltar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnimportar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limparCampos();
        }
    }//GEN-LAST:event_btnlimparcamposKeyPressed
     
    
    //************************** Código Limpo ***********************************************
    
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    txtdescricao.requestFocus();
    }   
    
    public void limparCampos() {
        txtdescricao.requestFocus();
        txtdescricao.setText("");
       
    }
    
    public void readDados() {
        ColaboradorDAO  colaboradordao = new ColaboradorDAO();
        ImportarCidadesIbgeDAO ibgedao = new ImportarCidadesIbgeDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(ImportarCidadesIbge ibge: ibgedao.read()){
            if (ibge.getUsuarioalteracao() == 0) {
                txtusuarioalteracao.setText("ADMINISTRADOR");
            } else {
                txtusuarioalteracao.setText(colaboradordao.pesquisaId_Colaborador(String.valueOf(ibge.getUsuarioalteracao())));
            }
            txtdtalteracao.setText(df.format(ibge.getDtalteracao()));
        }
    }
    
    
    public void importar() throws IOException, SQLException {
         if (txtdescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CAMINHO E O NOME DO ARQUIVO SÃO OBRIGATÓRIOS, VERIFIQUE E TENTE NOVAMENTE!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            btnvoltar.requestFocus();
        } else {
            File file    = new File(txtdescricao.getText().trim());
            if(file.exists()){
                lblaguarde.setText("AGUARDE O TÉRMINO DA IMPORTAÇÃO...");
                lblaguarde.setVisible(true);
                Date dataSistema = new Date();
                ImportarCidadesIbge ibge = new ImportarCidadesIbge();
                ImportarCidadesIbgeDAO importarcidadesibgedao = new ImportarCidadesIbgeDAO();
                ibge.setArquivo(file.toString());
                ibge.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                ibge.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                importarcidadesibgedao.importar(ibge);
                lblaguarde.setText("");
                lblaguarde.setVisible(false);
                JOptionPane.showMessageDialog(null, "IMPORTAÇÃO REALIZADA COM SUCESSO !", "ENTERPRISE - ATENÇÃO ", JOptionPane.INFORMATION_MESSAGE); 
                dispose();
            }else{
              JOptionPane.showMessageDialog(null, "CAMINHO OU NOME DO ARQUIVO INEXISTENTE,  VERIFIQUE E TENTE NOVAMENTE!", "ENTERPRISE - ERRO ", JOptionPane.ERROR_MESSAGE); 
              limparCampos();
            }  
         }
        
    }
    
  
    
      
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcao;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JButton btnimportar;
    private javax.swing.JButton btnlimparcampos;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblaguarde;
    private javax.swing.JLabel lbldescricao;
    private javax.swing.JLabel lbldtalteracao;
    private javax.swing.JLabel lblinformacao;
    private javax.swing.JLabel lbllinkplanilhaibge;
    private javax.swing.JLabel lblplanilha;
    private javax.swing.JLabel lblusuarioalteracao;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JFormattedTextField txtdtalteracao;
    private javax.swing.JFormattedTextField txtusuarioalteracao;
    // End of variables declaration//GEN-END:variables
}
