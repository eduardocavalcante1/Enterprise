
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import model.bean.Pdv;
import model.dao.PdvDAO;
import model.dao.FilialDAO;
import model.bean.Filial;
import model.dao.ColaboradorDAO;
import util.Util;



public class ViewPdv extends javax.swing.JInternalFrame {
 
   
    public ViewPdv() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaPdv.getModel();
        TabelaPdv.setRowSorter(new TableRowSorter(modelo));
        readTable();
        carregarComboFilial();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPdv = new javax.swing.JTable();
        PainelDados = new javax.swing.JPanel();
        lblid_pdv = new javax.swing.JLabel();
        txtid_pdv = new javax.swing.JFormattedTextField();
        lbldescricao = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        lblcodigopdv = new javax.swing.JLabel();
        txtcodigopdv = new javax.swing.JTextField();
        lblfilial_id = new javax.swing.JLabel();
        txtfilial_id = new javax.swing.JFormattedTextField();
        lbldescricaofilial = new javax.swing.JLabel();
        combofilial = new javax.swing.JComboBox<>();
        lbldtultcarga = new javax.swing.JLabel();
        txtdtultcarga = new javax.swing.JFormattedTextField();
        PainelStatus = new javax.swing.JPanel();
        rbtnaberto = new javax.swing.JRadioButton();
        rbtnfechado = new javax.swing.JRadioButton();
        lblaberto = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        btnimprimir = new javax.swing.JButton();
        btnlimparcampos = new javax.swing.JButton();

        setClosable(true);
        setTitle("ENTERPRISE - CADASTRO DE PONTOS DE VENDAS - PDVs");

        TabelaPdv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TabelaPdv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PDV", "DESCRIÇÃO DO PDV", "CÓDIGO DO PDV", "FILIAL", "DATA DA CARGA", "ABERTO", "CADASTRADO POR", "DT CADASTRO", "ALTERADO POR", "DT ALTERAÇÃO", "CANCELADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPdv.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaPdv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaPdv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPdvMouseClicked(evt);
            }
        });
        TabelaPdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaPdvKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaPdv);

        PainelDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblid_pdv.setText("ID PDV");

        txtid_pdv.setEditable(false);
        txtid_pdv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0000"))));

        lbldescricao.setText("DESCRIÇÃO OU NOME DO PDV");

        txtdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescricaoActionPerformed(evt);
            }
        });
        txtdescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescricaoKeyPressed(evt);
            }
        });

        lblcodigopdv.setText("CÓDIGO");

        txtcodigopdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodigopdvKeyPressed(evt);
            }
        });

        lblfilial_id.setText("ID FILIAL");

        txtfilial_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtfilial_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfilial_idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfilial_idKeyTyped(evt);
            }
        });

        lbldescricaofilial.setText("DESCRIÇÃO DA FILIAL");

        combofilial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        combofilial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combofilialFocusLost(evt);
            }
        });
        combofilial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combofilialMouseClicked(evt);
            }
        });
        combofilial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combofilialKeyPressed(evt);
            }
        });

        lbldtultcarga.setText("DATA CARGA");

        txtdtultcarga.setEditable(false);
        try {
            txtdtultcarga.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtultcarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtultcargaActionPerformed(evt);
            }
        });

        PainelStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rbtnaberto.setText("CAIXA ABERTO");
        rbtnaberto.setEnabled(false);
        rbtnaberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnabertoActionPerformed(evt);
            }
        });

        rbtnfechado.setText("CAIXA FECHADO");
        rbtnfechado.setEnabled(false);
        rbtnfechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnfechadoActionPerformed(evt);
            }
        });

        lblaberto.setText("STATUS");

        javax.swing.GroupLayout PainelStatusLayout = new javax.swing.GroupLayout(PainelStatus);
        PainelStatus.setLayout(PainelStatusLayout);
        PainelStatusLayout.setHorizontalGroup(
            PainelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbtnaberto)
            .addComponent(rbtnfechado)
            .addGroup(PainelStatusLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblaberto))
        );
        PainelStatusLayout.setVerticalGroup(
            PainelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelStatusLayout.createSequentialGroup()
                .addComponent(lblaberto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnaberto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnfechado)
                .addContainerGap(10, Short.MAX_VALUE))
        );

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

        lbldtcadastro.setText("Data do Cadastro.:");

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
        chkcancelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkcanceladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelDadosLayout = new javax.swing.GroupLayout(PainelDados);
        PainelDados.setLayout(PainelDadosLayout);
        PainelDadosLayout.setHorizontalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfilial_id, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblusuariocadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDadosLayout.createSequentialGroup()
                                .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkcancelado))))
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDadosLayout.createSequentialGroup()
                                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid_pdv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblid_pdv))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelDadosLayout.createSequentialGroup()
                                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbldescricao)
                                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblcodigopdv, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(txtcodigopdv))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PainelDadosLayout.createSequentialGroup()
                                                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbldtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbldtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtdtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(PainelDadosLayout.createSequentialGroup()
                                                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtdtultcarga, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbldtultcarga))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(PainelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(combofilial, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PainelDadosLayout.createSequentialGroup()
                                .addComponent(lblfilial_id)
                                .addGap(18, 18, 18)
                                .addComponent(lbldescricaofilial)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        PainelDadosLayout.setVerticalGroup(
            PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblcodigopdv)
                                .addComponent(lbldtultcarga)
                                .addComponent(lblid_pdv)))
                        .addGap(6, 6, 6)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid_pdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdtultcarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigopdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfilial_id)
                            .addComponent(lbldescricaofilial))
                        .addGap(6, 6, 6)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfilial_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combofilial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PainelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblusuariocadastro)
                            .addComponent(txtusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbldtalteracao)
                                .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkcancelado))))
                    .addGroup(PainelDadosLayout.createSequentialGroup()
                        .addGroup(PainelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGap(2, 2, 2))
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

        jLabel1.setText("APENAS NÚMEROS PESQUISA PELO ID PDV  E APENAS LETRAS POR DESCRIÇÃO");

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
                        .addGap(18, 18, 18)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        PainelAcaoLayout.setVerticalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimparcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(PainelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaPdvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPdvMouseClicked
        passagemderegistros();
    }//GEN-LAST:event_TabelaPdvMouseClicked

    private void TabelaPdvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaPdvKeyReleased
        passagemderegistros();
    }//GEN-LAST:event_TabelaPdvKeyReleased

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

    private void txtdescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtdescricao.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "CAMPO DESCRIÇÃO É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtdescricao.requestFocus();
            } else {
                txtcodigopdv.requestFocus();
            }
        }
    }//GEN-LAST:event_txtdescricaoKeyPressed

    private void combofilialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combofilialFocusLost
        if(combofilial.getSelectedIndex() > 0) {
            FilialDAO  filialdao = new FilialDAO();
            String desc  = combofilial.getSelectedItem().toString();
            txtfilial_id.setText(filialdao.pesquisaDesc(desc));
            btnincluir.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "É NECESSÁRIO ESCOLHER UMA FILIAL PARA ESTE PONTO DE VENDA", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtfilial_id.requestFocus();
        }

    }//GEN-LAST:event_combofilialFocusLost

    private void combofilialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combofilialMouseClicked

    }//GEN-LAST:event_combofilialMouseClicked

    private void combofilialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combofilialKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnincluir.requestFocus();
        }
    }//GEN-LAST:event_combofilialKeyPressed

    private void txtdtultcargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtultcargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtultcargaActionPerformed

    private void rbtnabertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnabertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnabertoActionPerformed

    private void rbtnfechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnfechadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnfechadoActionPerformed

    private void txtusuariocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuariocadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuariocadastroActionPerformed

    private void txtdtcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtcadastroActionPerformed

    private void txtdtalteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtalteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtalteracaoActionPerformed

    private void txtdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescricaoActionPerformed

    private void txtfilial_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfilial_idKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (txtfilial_id.getText().isEmpty()) {
                combofilial.requestFocus();
            } else {
                FilialDAO filialdao = new FilialDAO();
                if (filialdao.pesquisaIdFilial(txtfilial_id.getText()) != null) {
                    Filial filial = filialdao.pesquisaIdFilial(txtfilial_id.getText()).iterator().next();
                    combofilial.getModel().setSelectedItem(filial.getDescricao());
                    btnincluir.requestFocus();
                }else{
                     JOptionPane.showMessageDialog(null, "FILIAL NÃO ENCONTRADA, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                     txtfilial_id.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_txtfilial_idKeyPressed

    private void txtfilial_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfilial_idKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }   
    }//GEN-LAST:event_txtfilial_idKeyTyped

    private void chkcanceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkcanceladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkcanceladoActionPerformed

    private void txtcodigopdvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigopdvKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (txtcodigopdv.getText().length() > 4) {
                JOptionPane.showMessageDialog(null, "CÓDIGO DO PDV DEVERÁ CONTER APENAS 04 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtcodigopdv.requestFocus();
            } else {
                txtfilial_id.requestFocus();
            }
        }
    }//GEN-LAST:event_txtcodigopdvKeyPressed

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
     
    
    //************************** Código Limpo ***********************************************
    
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    txtdescricao.requestFocus();
    }   
    
    public void limparCampos() {
        txtid_pdv.setText("");
        txtdescricao.setText("");
        txtcodigopdv.setText("");
        txtdtultcarga.setText("");
        rbtnaberto.setSelected(false);
        rbtnfechado.setSelected(false);
        txtfilial_id.setText("");
        combofilial.setSelectedItem("");
        txtusuariocadastro.setText("");
        txtdtcadastro.setText("");
        txtusuarioalteracao.setText("");
        txtdtalteracao.setText("");
        chkcancelado.setSelected(false);
        txtbuscar.setText("");
        txtdescricao.requestFocus();
    }

     public void readTableForDesc(String desc) {        
        DefaultTableModel modelo  = (DefaultTableModel) TabelaPdv.getModel();
        modelo.setNumRows(0);
        PdvDAO pdvdao = new PdvDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Pdv pdv: pdvdao.readForDesc(desc)){
            modelo.addRow(new Object[]{               
                pdv.getId_pdv(),
                pdv.getDescricao(),
                pdv.getCodigopdv(),
                pdv.getFilial().getId_filial(),
                df.format(pdv.getDtultcarga()),
                pdv.getAberto(),
                pdv.getUsuariocadastro(),
                df.format(pdv.getDtcadastro()),
                pdv.getUsuarioalteracao(),
                df.format(pdv.getDtalteracao()),
                pdv.getCancelado()
            });
        }
        limparCampos();
    }
     
     
    public void readTableForId(String id) {        
        DefaultTableModel modelo  = (DefaultTableModel) TabelaPdv.getModel();
        modelo.setNumRows(0);
        PdvDAO pdvdao = new PdvDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Pdv pdv: pdvdao.readForId(id)){
            modelo.addRow(new Object[]{                
                pdv.getId_pdv(),
                pdv.getDescricao(),
                pdv.getCodigopdv(),
                pdv.getFilial().getId_filial(),
                df.format(pdv.getDtultcarga()),
                pdv.getAberto(),
                pdv.getUsuariocadastro(),
                df.format(pdv.getDtcadastro()),
                pdv.getUsuarioalteracao(),
                df.format(pdv.getDtalteracao()),
                pdv.getCancelado()
            });
        }
        limparCampos();
    } 
    
    public void readTable() {
        DefaultTableModel modelo  = (DefaultTableModel) TabelaPdv.getModel();
        modelo.setNumRows(0);
        PdvDAO pdvdao = new PdvDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Pdv pdv: pdvdao.read()){
            modelo.addRow(new Object[]{                
               pdv.getId_pdv(),
                pdv.getDescricao(),
                pdv.getCodigopdv(),
                pdv.getFilial().getId_filial(),
                df.format(pdv.getDtultcarga()),
                pdv.getAberto(),
                pdv.getUsuariocadastro(),
                df.format(pdv.getDtcadastro()),
                pdv.getUsuarioalteracao(),
                df.format(pdv.getDtalteracao()),
                pdv.getCancelado()
            });
        }
        limparCampos();
    }
        
    
    public void incluir() {
        Pdv pdv = new Pdv();
        PdvDAO pdvdao = new PdvDAO();
        Filial    filial    = new Filial();
        FilialDAO filialdao = new FilialDAO();
        Date dataSistema = new Date();
        if (txtdescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CAMPO DESCRIÇÃO SEM PREENCHIMENTO, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtdescricao.requestFocus();
        } else {
            // METODO QUE PESQUISA SE A FILIAL EXISTE
            if (filialdao.pesquisaIdFilial(txtfilial_id.getText()) == null) {
                JOptionPane.showMessageDialog(null, "FILIAL NÃO EXISTE !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtfilial_id.requestFocus();
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "CONFIRMA A INCLUSÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    pdv.setDescricao(txtdescricao.getText().toUpperCase());
                    pdv.setCodigopdv(txtcodigopdv.getText());
                    pdv.setDtultcarga(Util.formatarDataPostgres(dataSistema));
                    pdv.setAberto("N");
                    
                    filial.setId_filial(Integer.parseInt(txtfilial_id.getText()));
                    pdv.setFilial(filial);
                    //pdv.setFilial_id(Integer.parseInt(txtfilial_id.getText()));
                    
                    pdv.setUsuariocadastro(Integer.parseInt(ViewLogin.Id_Colaborador));
                    pdv.setDtcadastro(Util.formatarDataPostgres(dataSistema));
                    pdv.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    pdv.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    pdv.setCancelado("N");
                    PdvDAO.getInstance().salvar(pdv); 
                   // pdvdao.create(pdv);
                    readTable();
                }
            }
        }
    }

    public void atualizar() {
        Pdv pdv = new Pdv();
        PdvDAO pdvdao = new PdvDAO();
        Filial filial = new Filial();
        FilialDAO filialdao = new FilialDAO();
        Date dataSistema = new Date();
        if (txtdescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CAMPO DESCRICÃO SEM PREENCHIMENTO, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtdescricao.requestFocus();
        } else {
            if (filialdao.pesquisaIdFilial(txtfilial_id.getText()) == null) {
                JOptionPane.showMessageDialog(null, "FILIAL NÃO EXISTE !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtfilial_id.requestFocus();
            } else {
                if (TabelaPdv.getSelectedRow() != -1) {
                    int resposta = JOptionPane.showConfirmDialog(null, "CONFIRMA A ALTERAÇÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        pdv.setId_pdv((int) TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(),0));
                        pdv.setDescricao(txtdescricao.getText().toUpperCase());
                        pdv.setCodigopdv(txtcodigopdv.getText());
                        // pdv.setDtultcarga(dataSistema);  CAMPO SERÁ ALIMENTADO PELO PDV POR ISSO NÃO PODE SER ATUALIZADO PELO ENTERPRISE
                        // pdv.setAberto("N"); CAMPO SERÁ ALIMENTADO PELO PDV POR ISSO NÃO PODE SER ATUALIZADO PELO ENTERPRISE
                        
                        // pdv.setFilial_id(Integer.parseInt(txtfilial_id.getText())); CAMPO SOFREU ALTERAÇÃO APÓS A MIGRAÇÃO PARA O HIBERNATE
                        filial.setId_filial(Integer.parseInt(txtfilial_id.getText()));
                        pdv.setFilial(filial);
                        
                        pdv.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                        pdv.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                        //pdvdao.update(pdv);
                        PdvDAO.getInstance().salvar(pdv);
                        readTable();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "SELECIONE UMA OPÇÃO PARA ALTERAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                    txtdescricao.requestFocus();
                }
            }
            readTable();
        }
    }
    
//    public void excluir(){
//        if (TabelaPdv.getSelectedRow() != -1 ) {
//            Pdv    pdv = new Pdv();
//            PdvDAO pdvdao = new PdvDAO();
//            pdv.setId_pdv((int) TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(),0));
//            int resposta = JOptionPane.showConfirmDialog(null,"CONFIRMA A EXCLUSÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
//            if (resposta == JOptionPane.YES_OPTION) {
//                pdvdao.delete(pdv);
//                readTable();
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "SELECIONE UMA OPÇÃO PARA EXCLUIR", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    
//    
     public void cancelar() {   // ESTE MÉTODO CANCELA O REGISTRO DO PDV
        if (TabelaPdv.getSelectedRow() != -1) {
            Date dataSistema = new Date();
            Pdv pdv = new Pdv();
            PdvDAO pdvdao = new PdvDAO();
            if (chkcancelado.isSelected()) {
                int resposta = JOptionPane.showConfirmDialog(null, "ESTE REGISTRO ESTÁ CANCELADO DESEJA RETIRAR O CANCELAMENTO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    pdv.setCancelado("N");
                    pdv.setId_pdv((int) TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(),0));
                    pdv.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    pdv.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    chkcancelado.setSelected(false);
                    //pdvdao.cancelar(pdv);
                    PdvDAO.getInstance().cancelar(pdv);
                }
           } else {
                int resposta = JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR ESTE REGISTRO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                   pdv.setCancelado("S");
                   pdv.setId_pdv((int) TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(),0));
                   pdv.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                   pdv.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                   chkcancelado.setSelected(true);
                   //pdvdao.cancelar(pdv);
                   PdvDAO.getInstance().cancelar(pdv);
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
           JOptionPane.showMessageDialog(null, "INFORME APENAS LETRAS PARA PESQUISA POR DESCRIÇÃO OU APENAS NÚMEROS PARA PESQUISA POR ID DO PDV", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
           txtbuscar.requestFocus();
           readTable();
        }else{
           if(txtbuscar.getText().matches("[0-9]*")){
               readTableForId(txtbuscar.getText());
           } else{
               readTableForDesc(txtbuscar.getText().toUpperCase());
           }
        }
    }
    
    public void carregarComboFilial(){
          FilialDAO filialdao = new FilialDAO();
          combofilial.addItem("");  
          for(Filial f: filialdao.read()){
             combofilial.addItem(f.getDescricao());
          }
    }
    
    public void imprimir(){
        PdvDAO pdvdao = new PdvDAO();
        pdvdao.imprimir();
        limparCampos();
    }
    
    public void passagemderegistros() {
        if (TabelaPdv.getSelectedRow() != -1) {
            ColaboradorDAO colaboradordao = new ColaboradorDAO();
            FilialDAO filialdao = new FilialDAO();
            String busca;
            txtid_pdv.setText(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 0).toString());
            txtdescricao.setText(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 1).toString());
            txtcodigopdv.setText(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 2).toString());
            txtfilial_id.setText(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 3).toString());
            //***************************************************************
            // PESQUISAR O CODIGO E TRAZER A DESCRIÇÃO DA FILIAL
            busca = txtfilial_id.getText();
            Filial filial = filialdao.pesquisaIdFilial(busca).iterator().next();
            combofilial.getModel().setSelectedItem(filial.getDescricao());
            //****************************************************************            
            txtdtultcarga.setText(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 4).toString());
            if (TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 5).toString() == "S") {
                rbtnaberto.setSelected(true);
            } else {
                rbtnfechado.setSelected(true);
            }

            if (TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 6).toString().equals("0")) {
                txtusuariocadastro.setText("ADMINISTRADOR");
            } else {
                txtusuariocadastro.setText(colaboradordao.pesquisaId_Colaborador(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 6).toString()));
            }
            txtdtcadastro.setText(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 7).toString());
            if (TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 8).toString().equals("0")) {
                txtusuarioalteracao.setText("ADMINISTRADOR");
            } else {
                txtusuarioalteracao.setText(colaboradordao.pesquisaId_Colaborador(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 8).toString()));
            }
            txtdtalteracao.setText(TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 9).toString());
            if (TabelaPdv.getValueAt(TabelaPdv.getSelectedRow(), 10).toString().equals("S")) {
                chkcancelado.setSelected(true);
            } else {
                chkcancelado.setSelected(false);
            }
        }
    }
    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcao;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JPanel PainelStatus;
    private javax.swing.JTable TabelaPdv;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnincluir;
    private javax.swing.JButton btnlimparcampos;
    private javax.swing.JCheckBox chkcancelado;
    private javax.swing.JComboBox<String> combofilial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblaberto;
    private javax.swing.JLabel lblcodigopdv;
    private javax.swing.JLabel lbldescricao;
    private javax.swing.JLabel lbldescricaofilial;
    private javax.swing.JLabel lbldtalteracao;
    private javax.swing.JLabel lbldtcadastro;
    private javax.swing.JLabel lbldtultcarga;
    private javax.swing.JLabel lblfilial_id;
    private javax.swing.JLabel lblid_pdv;
    private javax.swing.JLabel lblusuarioalteracao;
    private javax.swing.JLabel lblusuariocadastro;
    private javax.swing.JRadioButton rbtnaberto;
    private javax.swing.JRadioButton rbtnfechado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodigopdv;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JFormattedTextField txtdtalteracao;
    private javax.swing.JFormattedTextField txtdtcadastro;
    private javax.swing.JFormattedTextField txtdtultcarga;
    private javax.swing.JFormattedTextField txtfilial_id;
    private javax.swing.JFormattedTextField txtid_pdv;
    private javax.swing.JFormattedTextField txtusuarioalteracao;
    private javax.swing.JFormattedTextField txtusuariocadastro;
    // End of variables declaration//GEN-END:variables
}
