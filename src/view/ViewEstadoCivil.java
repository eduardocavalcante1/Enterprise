
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import model.bean.EstadoCivil;
import model.dao.ColaboradorDAO;
import model.dao.EstadoCivilDAO;
import util.Util;


public class ViewEstadoCivil extends javax.swing.JInternalFrame {
 
   
    public ViewEstadoCivil() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaEstadoCivil.getModel();
        TabelaEstadoCivil.setRowSorter(new TableRowSorter(modelo));
        readTable();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaEstadoCivil = new javax.swing.JTable();
        PainelDados = new javax.swing.JPanel();
        lbldescricao = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        lblusuariocadastro = new javax.swing.JLabel();
        txtusuariocadastro = new javax.swing.JFormattedTextField();
        lbldtcadastro = new javax.swing.JLabel();
        txtdtcadastro = new javax.swing.JFormattedTextField();
        lblusuarioalteracao = new javax.swing.JLabel();
        txtusuarioalteracao = new javax.swing.JFormattedTextField();
        lbldtalteracao = new javax.swing.JLabel();
        txtdtalteracao = new javax.swing.JFormattedTextField();
        chkcancelado = new javax.swing.JCheckBox();
        PainelAcao = new javax.swing.JPanel();
        btnincluir = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnlimparcampos = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();

        setClosable(true);
        setTitle("ENTERPRISE - CADASTRO DE ESTADO CIVIL");

        TabelaEstadoCivil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabelaEstadoCivil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO", "CADASTRADO POR", "DT CADASTRO", "ALTERADO POR", "DT ALTERAÇÃO", "CANCELADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaEstadoCivil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaEstadoCivil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaEstadoCivilMouseClicked(evt);
            }
        });
        TabelaEstadoCivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaEstadoCivilKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaEstadoCivil);

        PainelDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbldescricao.setText("DESCRIÇÃO DO ESTADO CIVIL");

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

        lblusuariocadastro.setText("Cadastrado por:");

        txtusuariocadastro.setEditable(false);
        try {
            txtusuariocadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtusuariocadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuariocadastroActionPerformed(evt);
            }
        });

        lbldtcadastro.setText("Data do Cadastro:");

        try {
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_');
            txtdtcadastro.setEditable(false);
            try {
                txtdtcadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtcadastroActionPerformed(evt);
            }
        });

        lblusuarioalteracao.setText("Alterado por....:");

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

        chkcancelado.setText("Registro Cancelado");
        chkcancelado.setEnabled(false);
        chkcancelado.setFocusable(false);

        javax.swing.GroupLayout PainelDadosLayout = new javax.swing.GroupLayout(PainelDados);
        PainelDados.setLayout(PainelDadosLayout);
        PainelDadosLayout.setHorizontalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbldtcadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbldtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDadosLayout.createSequentialGroup()
                                .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkcancelado))
                            .addComponent(txtdtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbldescricao)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbldescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuariocadastro)
                    .addComponent(txtusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtalteracao)
                    .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkcancelado))
                .addContainerGap(11, Short.MAX_VALUE))
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

        txtbuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbuscarFocusGained(evt);
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

        btnimprimir.setBackground(new java.awt.Color(255, 153, 153));
        btnimprimir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-print-16.png"))); // NOI18N
        btnimprimir.setText("IMPRIMIR");
        btnimprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnimprimir.setPreferredSize(new java.awt.Dimension(120, 25));
        btnimprimir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnimprimirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnimprimirFocusLost(evt);
            }
        });
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });
        btnimprimir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnimprimirKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PainelAcaoLayout = new javax.swing.GroupLayout(PainelAcao);
        PainelAcao.setLayout(PainelAcaoLayout);
        PainelAcaoLayout.setHorizontalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcaoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelAcaoLayout.createSequentialGroup()
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        PainelAcaoLayout.setVerticalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(PainelAcao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaEstadoCivilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaEstadoCivilMouseClicked
        passagemderegistro();
    }//GEN-LAST:event_TabelaEstadoCivilMouseClicked

    private void TabelaEstadoCivilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaEstadoCivilKeyReleased
        passagemderegistro();
    }//GEN-LAST:event_TabelaEstadoCivilKeyReleased

    private void txtdescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescricaoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescricaoFocusLost

    private void txtdescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescricaoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            if (txtdescricao.getText().trim().isEmpty()){
                txtdescricao.requestFocus();
                JOptionPane.showMessageDialog(null, "CAMPO DESCRICÃO É OBRIGATÓRIO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);

            }else{
                btnincluir.requestFocus();
            }
        }

    }//GEN-LAST:event_txtdescricaoKeyPressed

    private void btnincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnincluirActionPerformed
             incluir();        
    }//GEN-LAST:event_btnincluirActionPerformed

    private void btnincluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnincluirKeyPressed
       if(evt.getKeyCode() == evt.VK_ENTER){
            incluir();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnatualizar.requestFocus();
        } 
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            btnbuscar.requestFocus();
        }
    }//GEN-LAST:event_btnincluirKeyPressed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
         atualizar();
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
         cancelar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnincluirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnincluirFocusGained
         btnincluir.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnincluirFocusGained

    private void btnincluirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnincluirFocusLost
        btnincluir.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnincluirFocusLost

    private void btnatualizarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnatualizarFocusGained
        btnatualizar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnatualizarFocusGained

    private void btnatualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnatualizarFocusLost
        btnatualizar.setBackground(new Color(255,153,153)); 
    }//GEN-LAST:event_btnatualizarFocusLost

    private void btncancelarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btncancelarFocusGained
        btncancelar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btncancelarFocusGained

    private void btncancelarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btncancelarFocusLost
        btncancelar.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btncancelarFocusLost

    private void btnatualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnatualizarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
           btncancelar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
           btnincluir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           atualizar();
        }
       
    }//GEN-LAST:event_btnatualizarKeyPressed

    private void btncancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncancelarKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_DOWN){
          btnbuscar.requestFocus();
       }
       if(evt.getKeyCode() == KeyEvent.VK_UP){
          btnatualizar.requestFocus();
       }
       if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          cancelar();
       }  
           
    }//GEN-LAST:event_btncancelarKeyPressed

    private void btnbuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnbuscarFocusGained
        btnbuscar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnbuscarFocusGained

    private void btnbuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnbuscarFocusLost
        btnbuscar.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnbuscarFocusLost

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnbuscarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            btncancelar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnincluir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            btnimprimir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscar();
        }
    }//GEN-LAST:event_btnbuscarKeyPressed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            btnbuscar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscar();
        }
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void txtbuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbuscarFocusGained
        txtbuscar.setText("");
    }//GEN-LAST:event_txtbuscarFocusGained

    private void txtusuariocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuariocadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuariocadastroActionPerformed

    private void txtdtcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtcadastroActionPerformed

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
            btnincluir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnimprimir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limparCampos();
        }
    }//GEN-LAST:event_btnlimparcamposKeyPressed

    private void btnimprimirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnimprimirFocusGained
        btnimprimir.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnimprimirFocusGained

    private void btnimprimirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnimprimirFocusLost
        btnimprimir.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnimprimirFocusLost

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void btnimprimirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnimprimirKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            btnbuscar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            btnlimparcampos.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            imprimir();
        }
    }//GEN-LAST:event_btnimprimirKeyPressed
     
    // ******************************   Código Limpo   ************************************** //
    
    
    public void setPosicao() {
           Dimension d = this.getDesktopPane().getSize();
           this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
           txtdescricao.requestFocus();
    }   
    
    public void limparCampos() {
        txtdescricao.requestFocus();
        txtdescricao.setText("");
        txtbuscar.setText("");
    }
    
    public void readTable() {
        DefaultTableModel modelo  = (DefaultTableModel) TabelaEstadoCivil.getModel();
        modelo.setNumRows(0);
        EstadoCivilDAO estadocivildao = new EstadoCivilDAO();
        for(EstadoCivil ec: estadocivildao.read()){
            modelo.addRow(new Object[]{                
                  ec.getId_estadocivil(),
                  ec.getDescricao(),
                  ec.getUsuariocadastro(),
                  ec.getDtcadastro(),
                  ec.getUsuarioalteracao(),
                  ec.getDtalteracao(),
                  ec.getCancelado()
            });
        }
        limparCampos();
    }
    
    public void readTableForDesc(String desc) {        
        DefaultTableModel modelo  = (DefaultTableModel) TabelaEstadoCivil.getModel();
        modelo.setNumRows(0);
        EstadoCivilDAO estadocivildao = new EstadoCivilDAO();
        for(EstadoCivil ec: estadocivildao.readForDesc(desc)){
            modelo.addRow(new Object[]{                
                ec.getId_estadocivil(),
                ec.getDescricao(),
                ec.getUsuariocadastro(),
                ec.getDtcadastro(),
                ec.getUsuarioalteracao(),
                ec.getDtalteracao(),
                ec.getCancelado()
            });
        }
        limparCampos();
    }
    
    public void incluir() {
        if (txtdescricao.getText().trim().isEmpty()){
            txtdescricao.requestFocus();
            JOptionPane.showMessageDialog(null, "CAMPO DESCRICÃO É OBRIGATÓRIO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }else{
            int resposta = JOptionPane.showConfirmDialog(null,"CONFIRMA A INCLUSÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                EstadoCivil        ec         = new EstadoCivil();
                EstadoCivilDAO estadocivildao = new EstadoCivilDAO();
                Date dataSistema = new Date();
                ec.setDescricao(txtdescricao.getText().toUpperCase());
                ec.setUsuariocadastro(Integer.parseInt(ViewLogin.Id_Colaborador));
                ec.setDtcadastro(Util.formatarDataPostgres(dataSistema));
                ec.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                ec.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                ec.setCancelado("N");
                EstadoCivilDAO.getInstance().create(ec);
                //estadocivildao.create(ec);
                readTable();
            }
        }
    }
    
    public void atualizar(){
        if (txtdescricao.getText().trim().isEmpty()){
            txtdescricao.requestFocus();
            JOptionPane.showMessageDialog(null, "CAMPO DESCRICÃO É OBRIGATÓRIO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }else{
            if (TabelaEstadoCivil.getSelectedRow() != -1 ) {
                EstadoCivil     ec  = new EstadoCivil();
                EstadoCivilDAO  estadocivildao = new EstadoCivilDAO();
                Date dataSistema = new Date();
                ec.setDescricao(txtdescricao.getText().toUpperCase());
                ec.setId_estadocivil((int)TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(),0));
                ec.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                ec.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                EstadoCivilDAO.getInstance().update(ec);
                //estadocivildao.update(ec);
            }else{
                JOptionPane.showMessageDialog(null, "SELECIONE UMA OPÇÃO PARA ALTERAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtdescricao.requestFocus();
            }
            readTable();
        }
    }
    
    
    
//    public void excluir(){
//        if (TabelaEstadoCivil.getSelectedRow() != -1 ) {
//            EstadoCivil                    ec  = new EstadoCivil();
//            EstadoCivilDAO     estadocivildao  = new EstadoCivilDAO();
//            ec.setId_estadocivil((int)TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(),0));
//            int resposta = JOptionPane.showConfirmDialog(null,"CONFIRMA A EXCLUSÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
//            if (resposta == JOptionPane.YES_OPTION) {
//                estadocivildao.delete(ec);
//                readTable();
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "SELECIONE UMA OPÇÃO PARA EXCLUIR", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    
    
    public void cancelar() {   // ESTE MÉTODO CANCELA O REGISTRO DO CFOP
        if (TabelaEstadoCivil.getSelectedRow() != -1) {
            Date dataSistema = new Date();
            EstadoCivil       estadocivil = new EstadoCivil();
            EstadoCivilDAO estadocivildao = new EstadoCivilDAO();
            if (chkcancelado.isSelected()) {
                int resposta = JOptionPane.showConfirmDialog(null, "ESTE REGISTRO ESTÁ CANCELADO DESEJA RETIRAR O CANCELAMENTO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    estadocivil.setCancelado("N");
                    estadocivil.setId_estadocivil((int)TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(),0));
                    estadocivil.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    estadocivil.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    chkcancelado.setSelected(false);
                    //cfopdao.cancelar(cfop);
                    EstadoCivilDAO.getInstance().update(estadocivil);
                }
           } else {
                int resposta = JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR ESTE REGISTRO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                   estadocivil.setCancelado("S");
                   estadocivil.setId_estadocivil((int)TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(),0));
                   estadocivil.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                   estadocivil.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                   chkcancelado.setSelected(true);
                   //cfopdao.cancelar(cfop);
                   EstadoCivilDAO.getInstance().update(estadocivil);
                }
           }
    } else {
           JOptionPane.showMessageDialog(null, "SELECIONE UM REGISTRO PARA CANCELAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
           txtdescricao.requestFocus();
    }
       readTable();
    }
    
    public void buscar(){
        if (txtbuscar.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "INFORME A(S) LETRA(S) DA PALAVRA", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtbuscar.requestFocus();
        }else{
            readTableForDesc(txtbuscar.getText().toUpperCase());
        }
    }
       
    public void imprimir(){
        EstadoCivilDAO  estadocivildao = new EstadoCivilDAO();
        estadocivildao.imprimir();
        limparCampos();
    }
    
    public void passagemderegistro(){
        if (TabelaEstadoCivil.getSelectedRow()!= -1){
             ColaboradorDAO colaboradordao = new ColaboradorDAO();
            Locale localeBR           = new Locale("pt","BR"); 
            NumberFormat decimalBR    = NumberFormat.getNumberInstance(localeBR);
            txtdescricao.setText(TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(), 1).toString());
            if (TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(), 3).toString().equals("0")) {
                txtusuariocadastro.setText("ADMINISTRADOR");
            } else {
                txtusuariocadastro.setText(colaboradordao.pesquisaId_Colaborador(TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(), 3).toString()));
            }
            txtdtcadastro.setText(TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(), 4).toString());
            if (TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(), 5).toString().equals("0")) {
                txtusuarioalteracao.setText("ADMINISTRADOR");
            } else {
                txtusuarioalteracao.setText(colaboradordao.pesquisaId_Colaborador(TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(), 5).toString()));
            }
            txtdtalteracao.setText(TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(), 6).toString());
            if (TabelaEstadoCivil.getValueAt(TabelaEstadoCivil.getSelectedRow(), 7).toString().equals("S")) {
                chkcancelado.setSelected(true);
            } else {
                chkcancelado.setSelected(false);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcao;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JTable TabelaEstadoCivil;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnincluir;
    private javax.swing.JButton btnlimparcampos;
    private javax.swing.JCheckBox chkcancelado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldescricao;
    private javax.swing.JLabel lbldtalteracao;
    private javax.swing.JLabel lbldtcadastro;
    private javax.swing.JLabel lblusuarioalteracao;
    private javax.swing.JLabel lblusuariocadastro;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JFormattedTextField txtdtalteracao;
    private javax.swing.JFormattedTextField txtdtcadastro;
    private javax.swing.JFormattedTextField txtusuarioalteracao;
    private javax.swing.JFormattedTextField txtusuariocadastro;
    // End of variables declaration//GEN-END:variables
}
