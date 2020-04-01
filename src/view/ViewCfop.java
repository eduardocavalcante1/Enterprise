
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import model.bean.Cfop;
import model.dao.CfopDAO;
import model.dao.ColaboradorDAO;
import util.Util;




public class ViewCfop extends javax.swing.JInternalFrame {
 
    public String codigocfop;
    public ViewCfop() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaCfop.getModel();
        TabelaCfop.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCfop = new javax.swing.JTable();
        PainelDados = new javax.swing.JPanel();
        lblid_cfop = new javax.swing.JLabel();
        txtid_cfop = new javax.swing.JFormattedTextField();
        lblcodigo = new javax.swing.JLabel();
        txtcodigocfop = new javax.swing.JFormattedTextField();
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
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("ENTERPRISE - CADASTRO DE CFOP - CÓDIGO FISCAL DE OPERAÇÕES E PRESTAÇÕES");

        TabelaCfop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TabelaCfop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CFOP", "CÓDIGO CFOP", "DESCRIÇÃO", "CADASTRADO POR", "DT CADASTRO", "ALTERADO POR", "DT ALTERAÇÃO", "CANCELADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCfop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaCfop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaCfopMouseClicked(evt);
            }
        });
        TabelaCfop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaCfopKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCfop);

        PainelDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblid_cfop.setText("ID CFOP");

        txtid_cfop.setEditable(false);
        try {
            txtid_cfop.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtid_cfop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtid_cfopKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtid_cfopKeyTyped(evt);
            }
        });

        lblcodigo.setText("CÓDIGO ");

        txtcodigocfop.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        txtcodigocfop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcodigocfopFocusGained(evt);
            }
        });
        txtcodigocfop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigocfopKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigocfopKeyTyped(evt);
            }
        });

        lbldescricao.setText("DESCRIÇÃO DA CFOP");

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
                .addContainerGap()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdescricao)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
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
                            .addGroup(PainelDadosLayout.createSequentialGroup()
                                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid_cfop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblid_cfop))
                                .addGap(18, 18, 18)
                                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcodigocfop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcodigo))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid_cfop)
                    .addComponent(lblcodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid_cfop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigocfop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(13, Short.MAX_VALUE))
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

        jLabel1.setText("APENAS NÚMEROS PESQUISA POR CÓDIGO E APENAS LETRAS POR DESCRIÇÃO");

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
                                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbuscar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        PainelAcaoLayout.setVerticalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaCfopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaCfopMouseClicked
        passagemderegistros();
    }//GEN-LAST:event_TabelaCfopMouseClicked

    private void TabelaCfopKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaCfopKeyReleased
        passagemderegistros();
    }//GEN-LAST:event_TabelaCfopKeyReleased

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

    private void txtcodigocfopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigocfopKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          if(txtcodigocfop.getText().replaceAll("\\D", "").length()!= 4){
             JOptionPane.showMessageDialog(null, "CAMPO CÓDIGO É OBRIGATÓRIO O PREENCHIMENTO DE 4 (QUATRO) DIGITOS !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
             txtcodigocfop.requestFocus();
          } else {
              txtdescricao.requestFocus();
          }    
        }
    }//GEN-LAST:event_txtcodigocfopKeyPressed

    private void txtdescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescricaoKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          if(txtdescricao.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(null, "CAMPO DESCRIÇÃO É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
             txtdescricao.requestFocus();
          } else {
               btnincluir.requestFocus();
          }    
        }
    }//GEN-LAST:event_txtdescricaoKeyPressed

    private void txtcodigocfopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigocfopKeyTyped
        String caracteres="0123456789";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtcodigocfopKeyTyped

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

    private void txtid_cfopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_cfopKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(txtid_cfop.getText().trim().length()!= 4){
                JOptionPane.showMessageDialog(null, "CAMPO CÓDIGO É OBRIGATÓRIO O PREENCHIMENTO DE 4 (QUATRO) DIGITOS !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtid_cfop.requestFocus();
            } else {
                txtdescricao.requestFocus();
            }
        }
    }//GEN-LAST:event_txtid_cfopKeyPressed

    private void txtid_cfopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_cfopKeyTyped
        String caracteres="0123456789";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_txtid_cfopKeyTyped

    private void txtcodigocfopFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodigocfopFocusGained
        codigocfop = txtcodigocfop.getText();
    }//GEN-LAST:event_txtcodigocfopFocusGained
     
    
    //****************************** Código Limpo ***********************************************
    
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    txtcodigocfop.requestFocus();
    }   
    
    public void limparCampos() {
        txtcodigocfop.requestFocus();
        txtid_cfop.setText("");
        txtcodigocfop.setText("");
        txtdescricao.setText("");
        txtusuariocadastro.setText("");
        txtdtcadastro.setText("");
        txtusuarioalteracao.setText("");
        txtdtalteracao.setText("");
        chkcancelado.setSelected(false);
        txtbuscar.setText("");
    }

    public void readTable() {
        DefaultTableModel modelo = (DefaultTableModel) TabelaCfop.getModel();
        modelo.setNumRows(0);
        CfopDAO cfopdao = new CfopDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for (Cfop cfop : cfopdao.read()) {
            modelo.addRow(new Object[]{
                cfop.getId_cfop(),
                cfop.getCodigocfop(),
                cfop.getDescricao(),
                cfop.getUsuariocadastro(),
                df.format(cfop.getDtcadastro()),
                cfop.getUsuarioalteracao(),
                df.format(cfop.getDtalteracao()),
                cfop.getCancelado()
            });
        }
        limparCampos();
    }

    public void readTableForDesc(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) TabelaCfop.getModel();
        modelo.setNumRows(0);
        CfopDAO cfopdao = new CfopDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for (Cfop cfop : cfopdao.readForDesc(desc)) {
            modelo.addRow(new Object[]{
                cfop.getId_cfop(),
                cfop.getCodigocfop(),
                cfop.getDescricao(),
                cfop.getUsuariocadastro(),
                df.format(cfop.getDtcadastro()),
                cfop.getUsuarioalteracao(),
                df.format(cfop.getDtalteracao()),
                cfop.getCancelado()
            });
        }
        limparCampos();
    }

    public void readTableForCod(String codigo) {
        DefaultTableModel modelo = (DefaultTableModel) TabelaCfop.getModel();
        modelo.setNumRows(0);
        CfopDAO cfopdao = new CfopDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for (Cfop cfop : cfopdao.readForCod(codigo)) {
            modelo.addRow(new Object[]{
                cfop.getId_cfop(),
                cfop.getCodigocfop(),
                cfop.getDescricao(),
                cfop.getUsuariocadastro(),
                df.format(cfop.getDtcadastro()),
                cfop.getUsuarioalteracao(),
                df.format(cfop.getDtalteracao()),
                cfop.getCancelado()
            });
        }
        limparCampos();
    }
    
    public void incluir() {
        Cfop cfop = new Cfop();
        CfopDAO cfopdao = new CfopDAO();
        Date dataSistema = new Date();
        if (txtdescricao.getText().trim().isEmpty() || txtcodigocfop.getText().trim().isEmpty() || (txtcodigocfop.getText().replaceAll("\\D", "").length() != 4)) {
            JOptionPane.showMessageDialog(null, "CAMPO CÓDIGO OU DESCRICÃO SEM PREENCHIMENTO OU ESTÃO PREENCHIDOS INCORRETAMENTE !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtcodigocfop.requestFocus();
        } else {
            if (cfopdao.pesquisaCodCfop(txtcodigocfop.getText().replaceAll("\\D", "")) != null) {
                JOptionPane.showMessageDialog(null, "CÓDIGO DE CFOP JÁ EXISTE, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtcodigocfop.requestFocus();
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "CONFIRMA A INCLUSÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    cfop.setCodigocfop(txtcodigocfop.getText().replaceAll("\\D", ""));
                    cfop.setDescricao(txtdescricao.getText().toUpperCase());
                    cfop.setUsuariocadastro(Integer.parseInt(ViewLogin.Id_Colaborador));
                    cfop.setDtcadastro(Util.formatarDataPostgres(dataSistema));
                    cfop.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    cfop.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    cfop.setCancelado("N");
                    //cfopdao.create(cfop);
                    CfopDAO.getInstance().salvar(cfop);
                    
                    readTable();
                }
            }
        }
    }

    public void atualizar() {
        if (txtdescricao.getText().trim().isEmpty() || txtcodigocfop.getText().trim().isEmpty() || (txtcodigocfop.getText().replaceAll("\\D", "").length() != 4)) {
            JOptionPane.showMessageDialog(null, "CAMPO CÓDIGO OU DESCRICÃO SEM PREENCHIMENTO OU ESTÃO PREENCHIDOS INCORRETAMENTE !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtcodigocfop.requestFocus();
        } else {
            if (TabelaCfop.getSelectedRow() != -1) {
                Cfop cfop = new Cfop();
                CfopDAO cfopdao = new CfopDAO();
                Date dataSistema = new Date();
                if (cfopdao.pesquisaCodCfop(txtcodigocfop.getText().replaceAll("\\D", "")) != null)  { 
                    cfop.setId_cfop((int) TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 0));
                    cfop.setCodigocfop(codigocfop); // PRESERVANDO O CÓDIGO ORIGINAL, CASO O USUARIO TENHA ALTERADO
                    cfop.setDescricao(txtdescricao.getText().toUpperCase());
                    cfop.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    cfop.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    //JOptionPane.showMessageDialog(null, "CÓDIGO DE CFOP JÁ EXISTE, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                    //txtcodigocfop.requestFocus();
                } else {
                    cfop.setId_cfop((int) TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 0));
                    cfop.setCodigocfop(txtcodigocfop.getText().replaceAll("\\D", ""));
                    cfop.setDescricao(txtdescricao.getText().toUpperCase());
                    cfop.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    cfop.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    //cfopdao.update(cfop);
                }
                    CfopDAO.getInstance().salvar(cfop);
            } else {
                JOptionPane.showMessageDialog(null, "SELECIONE UMA OPÇÃO PARA ALTERAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtcodigocfop.requestFocus();
            }
        }
       readTable();
    }
//    public void excluir(){
//        if (TabelaCfop.getSelectedRow() != -1 ) {
//            Cfop    cfop = new Cfop();
//            CfopDAO cfopdao = new CfopDAO();
//            cfop.setCodigocfop((String) TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(),0));
//            int resposta = JOptionPane.showConfirmDialog(null,"CONFIRMA A EXCLUSÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
//            if (resposta == JOptionPane.YES_OPTION) {
//                cfopdao.delete(cfop);
//                readTable();
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "SELECIONE UMA OPÇÃO PARA EXCLUIR", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    
    
    public void cancelar() {   // ESTE MÉTODO CANCELA O REGISTRO DO CFOP
        if (TabelaCfop.getSelectedRow() != -1) {
            Date dataSistema = new Date();
            Cfop cfop = new Cfop();
            CfopDAO cfopdao = new CfopDAO();
            if (chkcancelado.isSelected()) {
                int resposta = JOptionPane.showConfirmDialog(null, "ESTE REGISTRO ESTÁ CANCELADO DESEJA RETIRAR O CANCELAMENTO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    cfop.setCancelado("N");
                    cfop.setId_cfop((int) TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 0));
                    cfop.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    cfop.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    chkcancelado.setSelected(false);
                    //cfopdao.cancelar(cfop);
                    CfopDAO.getInstance().cancelar(cfop);
                }
           } else {
                int resposta = JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR ESTE REGISTRO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                   cfop.setCancelado("S");
                   cfop.setId_cfop((int) TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 0));
                   cfop.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                   cfop.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                   chkcancelado.setSelected(true);
                   //cfopdao.cancelar(cfop);
                   CfopDAO.getInstance().cancelar(cfop);
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
           JOptionPane.showMessageDialog(null, "INFORME APENAS LETRAS PARA PESQUISA POR DESCRIÇÃO OU APENAS NÚMEROS PARA PESQUISA POR CÓDIGO DO CFOP", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
           txtbuscar.requestFocus();
           readTable();
        }else{
           if(txtbuscar.getText().matches("[0-9]*")){
               readTableForCod(txtbuscar.getText());
           } else{
               readTableForDesc(txtbuscar.getText().toUpperCase());
           }
        }
    }
    
    public void imprimir(){
        CfopDAO cfopdao = new CfopDAO();
        cfopdao.imprimir();
        limparCampos();
    }
    
    public void passagemderegistros() {
        if (TabelaCfop.getSelectedRow() != -1) {
            ColaboradorDAO colaboradordao = new ColaboradorDAO();
            txtid_cfop.setText(TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 0).toString());
            codigocfop = TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 1).toString();
            txtcodigocfop.setText(TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 1).toString());
            txtdescricao.setText(TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 2).toString());

            if (TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 3).toString().equals("0")) {
                txtusuariocadastro.setText("ADMINISTRADOR");
            } else {
                txtusuariocadastro.setText(colaboradordao.pesquisaId_Colaborador(TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 3).toString()));
            }
            txtdtcadastro.setText(TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 4).toString());
            if (TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 5).toString().equals("0")) {
                txtusuarioalteracao.setText("ADMINISTRADOR");
            } else {
                txtusuarioalteracao.setText(colaboradordao.pesquisaId_Colaborador(TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 5).toString()));
            }
            txtdtalteracao.setText(TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 6).toString());
            if (TabelaCfop.getValueAt(TabelaCfop.getSelectedRow(), 7).toString().equals("S")) {
                chkcancelado.setSelected(true);
            } else {
                chkcancelado.setSelected(false);
            }

        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcao;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JTable TabelaCfop;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnincluir;
    private javax.swing.JButton btnlimparcampos;
    private javax.swing.JCheckBox chkcancelado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lbldescricao;
    private javax.swing.JLabel lbldtalteracao;
    private javax.swing.JLabel lbldtcadastro;
    private javax.swing.JLabel lblid_cfop;
    private javax.swing.JLabel lblusuarioalteracao;
    private javax.swing.JLabel lblusuariocadastro;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JFormattedTextField txtcodigocfop;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JFormattedTextField txtdtalteracao;
    private javax.swing.JFormattedTextField txtdtcadastro;
    private javax.swing.JFormattedTextField txtid_cfop;
    private javax.swing.JFormattedTextField txtusuarioalteracao;
    private javax.swing.JFormattedTextField txtusuariocadastro;
    // End of variables declaration//GEN-END:variables
}
