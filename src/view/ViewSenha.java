package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import model.bean.Colaborador;
import model.bean.Senha;
import model.dao.ColaboradorDAO;
import model.dao.SenhaDAO;
import util.Util;

public class ViewSenha extends javax.swing.JInternalFrame {

    public ViewSenha() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaSenha.getModel();
        TabelaSenha.setRowSorter(new TableRowSorter(modelo));
        readTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaSenha = new javax.swing.JTable();
        PainelDados = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        txtColaborador_Id = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblNomeReduzido = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblAte6Caracteres = new javax.swing.JLabel();
        lblUsuarioCadastro = new javax.swing.JLabel();
        txtUsuarioCadastro = new javax.swing.JFormattedTextField();
        lblUsuarioAlteracao = new javax.swing.JLabel();
        txtUsuarioAlteracao = new javax.swing.JFormattedTextField();
        lblDtCadastro = new javax.swing.JLabel();
        txtDtCadastro = new javax.swing.JFormattedTextField();
        lblDtAlteracao = new javax.swing.JLabel();
        txtDtAlteracao = new javax.swing.JFormattedTextField();
        chkCancelado = new javax.swing.JCheckBox();
        PainelAcao = new javax.swing.JPanel();
        btnincluir = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnlimparcampos = new javax.swing.JButton();

        setClosable(true);
        setTitle("ENTERPRISE - CADASTRO DE SENHAS");

        TabelaSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TabelaSenha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SENHA", "MATRICULA", "SENHA", "CADASTRADO POR", "DT CADASTRO", "ALTERADO POR", "DT ALTERACÃO", "CANCELADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaSenhaMouseClicked(evt);
            }
        });
        TabelaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaSenhaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaSenha);

        PainelDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMatricula.setText("MATRÍCULA");

        txtColaborador_Id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtColaborador_IdFocusLost(evt);
            }
        });
        txtColaborador_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtColaborador_IdKeyPressed(evt);
            }
        });

        lblUsuario.setText("NOME REDUZIDO DO USUÁRIO");

        lblSenha.setText("INFORME A SENHA");

        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        lblAte6Caracteres.setText("(Até 6 Caracteres)");

        lblUsuarioCadastro.setText("Cadastrado por:");

        txtUsuarioCadastro.setEditable(false);
        try {
            txtUsuarioCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtUsuarioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCadastroActionPerformed(evt);
            }
        });

        lblUsuarioAlteracao.setText("Alterado por....:");

        txtUsuarioAlteracao.setEditable(false);
        try {
            txtUsuarioAlteracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDtCadastro.setText("Data do Cadastro:");

        try {
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_');
            txtDtCadastro.setEditable(false);
            try {
                txtDtCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtCadastroActionPerformed(evt);
            }
        });

        lblDtAlteracao.setText("Data da Alteração:");

        txtDtAlteracao.setEditable(false);
        try {
            txtDtAlteracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtAlteracaoActionPerformed(evt);
            }
        });

        chkCancelado.setText("Registro Cancelado");
        chkCancelado.setEnabled(false);
        chkCancelado.setFocusable(false);

        javax.swing.GroupLayout PainelDadosLayout = new javax.swing.GroupLayout(PainelDados);
        PainelDados.setLayout(PainelDadosLayout);
        PainelDadosLayout.setHorizontalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsuarioCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(lblUsuarioAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuarioCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(txtUsuarioAlteracao))
                        .addGap(26, 26, 26)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDtCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDtAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDadosLayout.createSequentialGroup()
                                .addComponent(txtDtAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkCancelado))
                            .addComponent(txtDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtColaborador_Id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblNomeReduzido, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDadosLayout.createSequentialGroup()
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAte6Caracteres))
                            .addComponent(lblSenha))
                        .addGap(386, 386, 386)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(lblSenha)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeReduzido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtColaborador_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAte6Caracteres)))
                .addGap(18, 18, 18)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioCadastro)
                    .addComponent(txtUsuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDtAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDtAlteracao)
                    .addComponent(lblUsuarioAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuarioAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCancelado))
                .addGap(11, 11, 11))
        );

        PainelAcao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnincluir.setBackground(new java.awt.Color(255, 153, 153));
        btnincluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-plus-16.png"))); // NOI18N
        btnincluir.setText("INCLUIR");
        btnincluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnincluir.setMaximumSize(new java.awt.Dimension(91, 23));
        btnincluir.setMinimumSize(new java.awt.Dimension(91, 23));
        btnincluir.setPreferredSize(new java.awt.Dimension(120, 25));
        btnincluir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnincluirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnincluirFocusLost(evt);
            }
        });
        btnincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnincluirActionPerformed(evt);
            }
        });
        btnincluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnincluirKeyPressed(evt);
            }
        });

        btnatualizar.setBackground(new java.awt.Color(255, 153, 153));
        btnatualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-available-updates-16.png"))); // NOI18N
        btnatualizar.setText("ATUALIZAR");
        btnatualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnatualizar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnatualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnatualizarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnatualizarFocusLost(evt);
            }
        });
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });
        btnatualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnatualizarKeyPressed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(255, 153, 153));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancel-16.png"))); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncancelar.setMaximumSize(new java.awt.Dimension(91, 23));
        btncancelar.setMinimumSize(new java.awt.Dimension(91, 23));
        btncancelar.setPreferredSize(new java.awt.Dimension(120, 25));
        btncancelar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btncancelarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btncancelarFocusLost(evt);
            }
        });
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        btncancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btncancelarKeyPressed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(255, 153, 153));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-search-16.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnbuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnbuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnbuscarFocusLost(evt);
            }
        });
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        btnbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnbuscarKeyPressed(evt);
            }
        });

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
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
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelAcaoLayout.setVerticalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(PainelAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaSenhaMouseClicked
        passagemderegistros();
    }//GEN-LAST:event_TabelaSenhaMouseClicked

    private void txtColaborador_IdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColaborador_IdFocusLost
        ColaboradorDAO colaboradordao = new ColaboradorDAO();
        if((colaboradordao.pesquisaId_Colaborador(txtColaborador_Id.getText()) == null)){
           JOptionPane.showMessageDialog(null, "MATRICULA INEXISTENTE, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
           readTable();
        }else{
          lblNomeReduzido.setText(colaboradordao.pesquisaId_Colaborador(txtColaborador_Id.getText()));
          txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtColaborador_IdFocusLost

    private void txtColaborador_IdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColaborador_IdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (txtColaborador_Id.getText().trim().isEmpty()) {
                txtColaborador_Id.requestFocus();
                JOptionPane.showMessageDialog(null, "CAMPO MATRICULA É OBRIGATÓRIO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            } else {
                txtSenha.requestFocus();
            }
        }

    }//GEN-LAST:event_txtColaborador_IdKeyPressed

    private void btnincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnincluirActionPerformed
        incluir();
    }//GEN-LAST:event_btnincluirActionPerformed

    private void btnincluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnincluirKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            incluir();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnatualizar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnbuscar.requestFocus();
        }
    }//GEN-LAST:event_btnincluirKeyPressed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        try {
            cancelar();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ViewSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnincluirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnincluirFocusGained
        btnincluir.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnincluirFocusGained

    private void btnincluirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnincluirFocusLost
        btnincluir.setBackground(new Color(255, 153, 153));
    }//GEN-LAST:event_btnincluirFocusLost

    private void btnatualizarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnatualizarFocusGained
        btnatualizar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnatualizarFocusGained

    private void btnatualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnatualizarFocusLost
        btnatualizar.setBackground(new Color(255, 153, 153));
    }//GEN-LAST:event_btnatualizarFocusLost

    private void btncancelarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btncancelarFocusGained
        btncancelar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btncancelarFocusGained

    private void btncancelarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btncancelarFocusLost
        btncancelar.setBackground(new Color(255, 153, 153));
    }//GEN-LAST:event_btncancelarFocusLost

    private void btnatualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnatualizarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btncancelar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnincluir.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizar();
        }
    }//GEN-LAST:event_btnatualizarKeyPressed

    private void btncancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnbuscar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnatualizar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                cancelar();
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ViewSenha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btncancelarKeyPressed

    private void btnbuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnbuscarFocusGained
        btnbuscar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnbuscarFocusGained

    private void btnbuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnbuscarFocusLost
        btnbuscar.setBackground(new Color(255, 153, 153));
    }//GEN-LAST:event_btnbuscarFocusLost

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnbuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btncancelar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnincluir.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            txtbuscar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscar();
        }
    }//GEN-LAST:event_btnbuscarKeyPressed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnbuscar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscar();
        }
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void txtUsuarioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCadastroActionPerformed

    private void txtDtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtCadastroActionPerformed

    private void txtDtAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtAlteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtAlteracaoActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtSenha.getPassword().length > 6 || txtSenha.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, "SENHA DEVERÁ CONTER DE 1 ATÉ 6 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtSenha.requestFocus();
            } else {
                btnincluir.requestFocus();
            }
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

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
            btnincluir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnbuscar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limparCampos();
        }
    }//GEN-LAST:event_btnlimparcamposKeyPressed

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
       txtSenha.setText("");
    }//GEN-LAST:event_txtSenhaFocusGained

    private void TabelaSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaSenhaKeyReleased
        passagemderegistros();
    }//GEN-LAST:event_TabelaSenhaKeyReleased

    //************************** Código Limpo ***********************************************
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
        txtColaborador_Id.requestFocus();
    }

    public void limparCampos() {
        txtColaborador_Id.requestFocus();
        txtColaborador_Id.setText("");
        lblNomeReduzido.setText("");
        txtSenha.setText("");
        txtUsuarioCadastro.setText("");
        txtDtCadastro.setText("");
        txtUsuarioAlteracao.setText("");
        txtDtAlteracao.setText("");
        chkCancelado.setSelected(false);
        txtbuscar.setText("");
    }

    public void incluir() {
        ColaboradorDAO colaboradordao = new ColaboradorDAO();
        Colaborador colaborador = new Colaborador();
        Senha senha = new Senha();
        SenhaDAO senhadao = new SenhaDAO();
        Date dataSistema = new Date(); 
        String SenhaColaborador;
        if (txtColaborador_Id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "MATRICULA NÃO PREENCHIDA CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        } else {
            if (senhadao.pesquisaColaborador_Id(txtColaborador_Id.getText().trim()) != null) {
                JOptionPane.showMessageDialog(null, "COLABORADOR JÁ TEM SENHA CADASTRADA, NÃO É PERMITIDA INCLUSÃO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "CONFIRMA A INCLUSÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    if (colaboradordao.pesquisaId_Colaborador(txtColaborador_Id.getText()) == null) {
                        JOptionPane.showMessageDialog(null, "COLABORADOR NÃO CADASTRADO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                    } else {
                        colaborador.setId_colaborador(Integer.parseInt(txtColaborador_Id.getText()));
                        senha.setColaborador(colaborador);
                        //senha.setColaborador_id(Integer.parseInt(txtColaborador_Id.getText()));
                        if (txtSenha.getPassword().length > 6 || txtSenha.getPassword().length == 0) {
                            JOptionPane.showMessageDialog(null, "SENHA DEVERÁ CONTER DE 1 ATÉ 6 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                            txtSenha.requestFocus();
                        } else {
                            SenhaColaborador = new String(txtSenha.getPassword());
                            senha.setSenha(SenhaColaborador);
                            //senha.setSenha(txtSenha.getPassword().toString());
                        }
                        senha.setUsuariocadastro(Integer.parseInt(ViewLogin.Id_Colaborador));
                        senha.setDtcadastro(Util.formatarDataPostgres(dataSistema));
                        senha.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                        senha.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                        senha.setCancelado("N");
                        SenhaDAO.getInstance().salvar(senha);
                        //senhadao.create(senha);
                    }
                }
            }
        }
        readTable();
    }

    public void atualizar() {
        if (TabelaSenha.getSelectedRow() != -1) {
            Date  dataSistema = new Date();
            Senha       senha = new Senha();
            SenhaDAO senhadao = new SenhaDAO();
            Colaborador colaborador = new Colaborador();
            String SenhaColaborador;
           
            colaborador.setId_colaborador(Integer.parseInt(txtColaborador_Id.getText()));
            senha.setColaborador(colaborador); 
           
            if (txtSenha.getPassword().length > 12) {
                JOptionPane.showMessageDialog(null, "SENHA SÓ PODERÁ CONTER ATÉ 6 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtSenha.requestFocus();
            } else {
                SenhaColaborador = new String(txtSenha.getPassword());
                senha.setSenha(SenhaColaborador);
                //senha.setSenha(txtSenha.getPassword().toString());
            }
            senha.setId_senha((int) TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 0));
            senha.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
            senha.setDtalteracao(Util.formatarDataPostgres(dataSistema));
            
            //*****************************************************************
            // DEVIDO A ALTERAÇÃO PARA O HIBERNATE ESTAMOS INFORMANDO TODOS OS 
            // CAMPOS MESMO QUE NÃO HAJA NECESSIDADE
            //*******************************************************************
            if(txtUsuarioCadastro.getText() == "ADMINISTRADOR"){
               senha.setUsuariocadastro(0);
            } else {
                senha.setUsuariocadastro(senha.getUsuariocadastro());
             }
             senha.setDtcadastro(Util.formatarDataUS(txtDtCadastro.getText()));
             if (chkCancelado.isSelected()){
                 senha.setCancelado("S");
             } else {
                 senha.setCancelado("N");
             }
            //*******************************************************************
            SenhaDAO.getInstance().salvar(senha);

            //senhadao.salvar(senha);
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UM COLABORADOR PARA ALTERAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtColaborador_Id.requestFocus();
        }
        readTable();
    }

    public void cancelar() throws UnsupportedEncodingException {   // ESTE MÉTODO CANCELA A SENHA E TAMBÉM O COLABORADOR NA TABELA COLABORADOR
        if (TabelaSenha.getSelectedRow() != -1) {
            Date              dataSistema = new Date();
            Senha                       s = new Senha();
            SenhaDAO             senhadao = new SenhaDAO();
            Colaborador                 c = new Colaborador();  // ESTE OBJETO c TERÁ 3 INFORMAÇÕES DO COLABORADOR
            Colaborador       colaborador = new Colaborador();  // ESTE OBJETO colaborador É NECESSÁRIO PARA PEGAR APENAS O id_colaborador
            ColaboradorDAO colaboradordao = new ColaboradorDAO();

            if (chkCancelado.isSelected()) {
                int resposta = JOptionPane.showConfirmDialog(null, "ESTE REGISTRO ESTÁ CANCELADO DESEJA RETIRAR O CANCELAMENTO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    if (colaboradordao.pesquisaId_Colaborador(txtColaborador_Id.getText()) == null) {
                        JOptionPane.showMessageDialog(null, "COLABORADOR NÃO ENCONTRADO NA TABELA COLABORADOR - INFORME O ERRO !", "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                    } else {
                        c.setCancelado("N");
                        c.setId_colaborador(Integer.parseInt(txtColaborador_Id.getText()));
                        c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                        c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                        chkCancelado.setSelected(false);
                        s.setCancelado("N");
                        s.setId_senha((int)TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(),0));
                        s.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                        s.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                        SenhaDAO.getInstance().cancelar(s,c);
                    }
                }
            } else {
                int resposta1 = JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR ESTE REGISTRO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta1 == JOptionPane.YES_OPTION) {
                    int resposta2 = JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR O CADASTRO DO COLABORADOR ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                    if (resposta2 == JOptionPane.YES_OPTION) {
                        if (colaboradordao.pesquisaId_Colaborador(txtColaborador_Id.getText()) == null) {
                            JOptionPane.showMessageDialog(null, "COLABORADOR NÃO ENCONTRADO NA TABELA COLABORADOR - INFORME O ERRO !", "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                        } else {
                            c.setCancelado("S");
                            c.setId_colaborador(Integer.parseInt(txtColaborador_Id.getText()));
                            c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                            c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                        }
                    }
                    chkCancelado.setSelected(true);
                    s.setCancelado("S");
                    s.setId_senha((int) TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 0));
                    s.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    s.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    if (resposta2 == JOptionPane.YES_OPTION) {
                        SenhaDAO.getInstance().cancelar(s, c);
                    } else {
                        SenhaDAO.getInstance().cancelarsenha(s);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UM COLABORADOR PARA CANCELAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtColaborador_Id.requestFocus();
        }
        readTable();
    }

    public void buscar() {
        if (txtbuscar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INFORME APENAS A MATRÍCULA DO COLABORADOR", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtbuscar.requestFocus();
        } else {
            readTableForColaborador_id(txtbuscar.getText());
        }
    }

    public void readTable() {
        DefaultTableModel modelo = (DefaultTableModel) TabelaSenha.getModel();
        modelo.setNumRows(0);
        SenhaDAO       senhadao = new SenhaDAO();
        DateFormat     df = new SimpleDateFormat("dd/MM/yyyy");
        for (Senha s : senhadao.read()) {
            modelo.addRow(new Object[]{
                s.getId_senha(),
                s.getColaborador().getId_colaborador(),
                s.getSenha(),
                s.getUsuariocadastro(),
                df.format(s.getDtcadastro()),
                s.getUsuarioalteracao(),
                df.format(s.getDtalteracao()),
                s.getCancelado()
            });
        }
        limparCampos();
    }

    public void readTableForColaborador_id(String colaborador_id) {
        DefaultTableModel modelo = (DefaultTableModel) TabelaSenha.getModel();
        modelo.setNumRows(0);
        SenhaDAO senhadao = new SenhaDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        if (senhadao.pesquisaColaborador_Id(colaborador_id) == null) {
            JOptionPane.showMessageDialog(null, "COLABORADOR NÃO ENCONTRADO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            readTable();
        } else {
            for (Senha s : senhadao.readForColaborador_id(colaborador_id)) {
                modelo.addRow(new Object[]{
                    s.getId_senha(),
                    s.getColaborador().getId_colaborador(),
                    s.getSenha(),
                    s.getUsuariocadastro(),
                    df.format(s.getDtcadastro()),
                    s.getUsuarioalteracao(),
                    df.format(s.getDtalteracao()),
                    s.getCancelado()
                });
            }
            limparCampos();
        }
    }

    public void passagemderegistros() { //Metodo para a passagem de Registros 
        if (TabelaSenha.getSelectedRow() != -1) {
            ColaboradorDAO colaboradordao = new ColaboradorDAO();
            txtColaborador_Id.setText(TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 1).toString());
            lblNomeReduzido.setText(colaboradordao.pesquisaId_Colaborador(txtColaborador_Id.getText()));
            txtSenha.setText(TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 2).toString());
            if (TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 3).toString().equals("0")) {
                txtUsuarioCadastro.setText("ADMINISTRADOR");
            } else {
                txtUsuarioCadastro.setText(colaboradordao.pesquisaId_Colaborador(TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 3).toString()));
            }
            txtDtCadastro.setText(TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 4).toString());
            if (TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 5).toString().equals("0")) {
                txtUsuarioAlteracao.setText("ADMINISTRADOR");
            } else {
                txtUsuarioAlteracao.setText(colaboradordao.pesquisaId_Colaborador(TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 5).toString()));
            }
            txtDtAlteracao.setText(TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 6).toString());
            if (TabelaSenha.getValueAt(TabelaSenha.getSelectedRow(), 7).toString().equals("S")) {
                chkCancelado.setSelected(true);
            } else {
                chkCancelado.setSelected(false);
            }
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcao;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JTable TabelaSenha;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnincluir;
    private javax.swing.JButton btnlimparcampos;
    private javax.swing.JCheckBox chkCancelado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAte6Caracteres;
    private javax.swing.JLabel lblDtAlteracao;
    private javax.swing.JLabel lblDtCadastro;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNomeReduzido;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioAlteracao;
    private javax.swing.JLabel lblUsuarioCadastro;
    private javax.swing.JTextField txtColaborador_Id;
    private javax.swing.JFormattedTextField txtDtAlteracao;
    private javax.swing.JFormattedTextField txtDtCadastro;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtUsuarioAlteracao;
    private javax.swing.JFormattedTextField txtUsuarioCadastro;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
