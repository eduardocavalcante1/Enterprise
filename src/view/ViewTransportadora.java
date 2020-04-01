
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Transportadora;
import model.dao.TransportadoraDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import model.dao.ColaboradorDAO;
import util.Util;



public class ViewTransportadora extends javax.swing.JInternalFrame {

    public Double limiteanterior;
    public ViewTransportadora() {
         initComponents();
         DefaultTableModel modelo = (DefaultTableModel) TabelaTransportadora.getModel();
         TabelaTransportadora.setRowSorter(new TableRowSorter(modelo));
         readTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JTabbedPane();
        AbaDadosPessoais = new javax.swing.JDesktopPane();
        PainelDadosPessoais = new javax.swing.JPanel();
        lblid_transportadora = new javax.swing.JLabel();
        txtid_transportadora = new javax.swing.JTextField();
        lblnomefantasia = new javax.swing.JLabel();
        txtnomefantasia = new javax.swing.JTextField();
        lblrazaosocial = new javax.swing.JLabel();
        txtrazaosocial = new javax.swing.JTextField();
        lblcpf = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        lblcnpj = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JFormattedTextField();
        lblinscricaoestadual = new javax.swing.JLabel();
        txtinscricaoestadual = new javax.swing.JTextField();
        lblinscricaomunicipal = new javax.swing.JLabel();
        txtinscricaomunicipal = new javax.swing.JFormattedTextField();
        PainelEndereco = new javax.swing.JPanel();
        lblendereco = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        lblbairro = new javax.swing.JLabel();
        txtbairro = new javax.swing.JTextField();
        lblcomplemento = new javax.swing.JLabel();
        txtcomplemento = new javax.swing.JTextField();
        lblcidade = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        lbluf = new javax.swing.JLabel();
        combouf = new javax.swing.JComboBox<>();
        lblcep = new javax.swing.JLabel();
        txtcep = new javax.swing.JFormattedTextField();
        lbltelefone1 = new javax.swing.JLabel();
        txttelefone1 = new javax.swing.JFormattedTextField();
        lbltelefone2 = new javax.swing.JLabel();
        txttelefone2 = new javax.swing.JFormattedTextField();
        lbltelefone3 = new javax.swing.JLabel();
        txttelefone3 = new javax.swing.JFormattedTextField();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JFormattedTextField();
        lblcontato = new javax.swing.JLabel();
        txtcontato = new javax.swing.JTextField();
        chkativo = new javax.swing.JCheckBox();
        AbaDadosComplementares = new javax.swing.JDesktopPane();
        PainellDadosComplementares = new javax.swing.JPanel();
        jPConfigSistema1 = new javax.swing.JPanel();
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
        btnsalvar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        PainelTabela = new javax.swing.JScrollPane();
        TabelaTransportadora = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnlimparcampos1 = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("ENTERPRISE - CADASTRO DE TRANSPORTADORA");

        PainelPrincipal.setPreferredSize(new java.awt.Dimension(827, 429));
        PainelPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PainelPrincipalFocusGained(evt);
            }
        });
        PainelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PainelPrincipalMouseClicked(evt);
            }
        });

        AbaDadosPessoais.setBackground(new java.awt.Color(240, 240, 240));

        PainelDadosPessoais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelDadosPessoais.setPreferredSize(new java.awt.Dimension(827, 166));
        PainelDadosPessoais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblid_transportadora.setText("Id...........:");
        PainelDadosPessoais.add(lblid_transportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, -1, -1));

        txtid_transportadora.setEditable(false);
        PainelDadosPessoais.add(txtid_transportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 17, 92, -1));

        lblnomefantasia.setText("Nome:");
        PainelDadosPessoais.add(lblnomefantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 20, -1, -1));

        txtnomefantasia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomefantasiaFocusLost(evt);
            }
        });
        txtnomefantasia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomefantasiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomefantasiaKeyTyped(evt);
            }
        });
        PainelDadosPessoais.add(txtnomefantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 17, 348, -1));

        lblrazaosocial.setText("Razão Social.......:");
        PainelDadosPessoais.add(lblrazaosocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 20, 99, -1));

        txtrazaosocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrazaosocialFocusLost(evt);
            }
        });
        txtrazaosocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrazaosocialKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrazaosocialKeyTyped(evt);
            }
        });
        PainelDadosPessoais.add(txtrazaosocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 17, 348, -1));

        lblcpf.setText("C.P.F...:");
        PainelDadosPessoais.add(lblcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, 46, -1));

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcpfFocusLost(evt);
            }
        });
        txtcpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcpfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcpfKeyTyped(evt);
            }
        });
        PainelDadosPessoais.add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 53, 94, -1));

        lblcnpj.setText("CNPJ:");
        PainelDadosPessoais.add(lblcnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 56, 40, -1));

        try {
            txtcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcnpjFocusLost(evt);
            }
        });
        txtcnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcnpjKeyPressed(evt);
            }
        });
        PainelDadosPessoais.add(txtcnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 53, 121, -1));

        lblinscricaoestadual.setText("Insc. Estadual:");
        PainelDadosPessoais.add(lblinscricaoestadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 56, 90, -1));

        txtinscricaoestadual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtinscricaoestadualFocusLost(evt);
            }
        });
        txtinscricaoestadual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinscricaoestadualKeyPressed(evt);
            }
        });
        PainelDadosPessoais.add(txtinscricaoestadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 53, 114, -1));

        lblinscricaomunicipal.setText("Insc.  Municipal..:");
        PainelDadosPessoais.add(lblinscricaomunicipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 56, 99, -1));

        txtinscricaomunicipal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtinscricaomunicipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtinscricaomunicipalFocusLost(evt);
            }
        });
        txtinscricaomunicipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinscricaomunicipalKeyPressed(evt);
            }
        });
        PainelDadosPessoais.add(txtinscricaomunicipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 53, 138, -1));

        PainelEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblendereco.setText("Endereço:");

        txtendereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtenderecoFocusLost(evt);
            }
        });
        txtendereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtenderecoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtenderecoKeyTyped(evt);
            }
        });

        lblbairro.setText("Bairro:");
        lblbairro.setMaximumSize(new java.awt.Dimension(49, 14));
        lblbairro.setMinimumSize(new java.awt.Dimension(49, 14));
        lblbairro.setPreferredSize(new java.awt.Dimension(49, 14));

        txtbairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbairroFocusLost(evt);
            }
        });
        txtbairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbairroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbairroKeyTyped(evt);
            }
        });

        lblcomplemento.setText("Complemento");

        txtcomplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcomplementoFocusLost(evt);
            }
        });
        txtcomplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcomplementoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcomplementoKeyTyped(evt);
            }
        });

        lblcidade.setText("Cidade:");
        lblcidade.setMaximumSize(new java.awt.Dimension(49, 14));
        lblcidade.setMinimumSize(new java.awt.Dimension(49, 14));
        lblcidade.setPreferredSize(new java.awt.Dimension(49, 14));

        txtcidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcidadeFocusLost(evt);
            }
        });
        txtcidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcidadeKeyTyped(evt);
            }
        });

        lbluf.setText("Estado..........:");

        combouf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espirito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraiba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rodônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        combouf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboufFocusLost(evt);
            }
        });
        combouf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboufKeyPressed(evt);
            }
        });

        lblcep.setText("CEP:");

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcepFocusLost(evt);
            }
        });
        txtcep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcepKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcepKeyTyped(evt);
            }
        });

        lbltelefone1.setText("Telefone1:");

        try {
            txttelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttelefone1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttelefone1FocusLost(evt);
            }
        });
        txttelefone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefone1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefone1KeyTyped(evt);
            }
        });

        lbltelefone2.setText("Telefone2:");

        try {
            txttelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttelefone2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefone2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefone2KeyTyped(evt);
            }
        });

        lbltelefone3.setText("Telefone 3:");

        try {
            txttelefone3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttelefone3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefone3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefone3KeyTyped(evt);
            }
        });

        lblemail.setText("E-mail:");

        try {
            txtemail.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });

        lblcontato.setText("Contato:");

        txtcontato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcontatoFocusLost(evt);
            }
        });
        txtcontato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontatoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontatoKeyTyped(evt);
            }
        });

        chkativo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkativo.setText("ATIVO");
        chkativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkativoActionPerformed(evt);
            }
        });
        chkativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkativoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PainelEnderecoLayout = new javax.swing.GroupLayout(PainelEndereco);
        PainelEndereco.setLayout(PainelEnderecoLayout);
        PainelEnderecoLayout.setHorizontalGroup(
            PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblendereco)
                        .addGap(10, 10, 10)
                        .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(lbltelefone1)
                        .addGap(7, 7, 7)
                        .addComponent(txttelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltelefone3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtemail))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblcontato)
                        .addGap(16, 16, 16)
                        .addComponent(txtcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(chkativo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lbluf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combouf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PainelEnderecoLayout.setVerticalGroup(
            PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblendereco))
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbluf)
                                .addComponent(combouf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblcep)
                                .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txttelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltelefone3)
                            .addComponent(txttelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbltelefone1))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbltelefone2)))
                .addGap(9, 9, 9)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcontato)))
                    .addComponent(chkativo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        AbaDadosPessoais.setLayer(PainelDadosPessoais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AbaDadosPessoais.setLayer(PainelEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AbaDadosPessoaisLayout = new javax.swing.GroupLayout(AbaDadosPessoais);
        AbaDadosPessoais.setLayout(AbaDadosPessoaisLayout);
        AbaDadosPessoaisLayout.setHorizontalGroup(
            AbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        AbaDadosPessoaisLayout.setVerticalGroup(
            AbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbaDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelPrincipal.addTab("Dados Pessoais", AbaDadosPessoais);

        AbaDadosComplementares.setBackground(new java.awt.Color(240, 240, 240));

        PainellDadosComplementares.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PainellDadosComplementaresLayout = new javax.swing.GroupLayout(PainellDadosComplementares);
        PainellDadosComplementares.setLayout(PainellDadosComplementaresLayout);
        PainellDadosComplementaresLayout.setHorizontalGroup(
            PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
        );
        PainellDadosComplementaresLayout.setVerticalGroup(
            PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        AbaDadosComplementares.add(PainellDadosComplementares);
        PainellDadosComplementares.setBounds(10, 11, 990, 120);

        jPConfigSistema1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPConfigSistema1.setPreferredSize(new java.awt.Dimension(827, 234));

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

        javax.swing.GroupLayout jPConfigSistema1Layout = new javax.swing.GroupLayout(jPConfigSistema1);
        jPConfigSistema1.setLayout(jPConfigSistema1Layout);
        jPConfigSistema1Layout.setHorizontalGroup(
            jPConfigSistema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigSistema1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConfigSistema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblusuariocadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPConfigSistema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPConfigSistema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldtcadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldtalteracao, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConfigSistema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConfigSistema1Layout.createSequentialGroup()
                        .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkcancelado))
                    .addComponent(txtdtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPConfigSistema1Layout.setVerticalGroup(
            jPConfigSistema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigSistema1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPConfigSistema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuariocadastro)
                    .addComponent(txtusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPConfigSistema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtalteracao)
                    .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkcancelado))
                .addGap(172, 172, 172))
        );

        AbaDadosComplementares.add(jPConfigSistema1);
        jPConfigSistema1.setBounds(10, 140, 990, 100);

        PainelPrincipal.addTab("Dados Complementares", AbaDadosComplementares);

        PainelAcao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnsalvar.setBackground(new java.awt.Color(255, 153, 153));
        btnsalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-plus-16.png"))); // NOI18N
        btnsalvar.setText("SALVAR");
        btnsalvar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnsalvarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnsalvarFocusLost(evt);
            }
        });
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        btnsalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsalvarKeyPressed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(255, 153, 153));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancel-16.png"))); // NOI18N
        btncancelar.setText("CANCELAR");
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

        TabelaTransportadora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabelaTransportadora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "RAZÃO SOCIAL", "CPF", "CNPJ", "INSCRIÇÃO ESTADUAL", "INSCRIÇÃO MUNICIPAL", "ENDEREÇO", "BAIRRO", "COMPLEMENTO", "CIDADE", "ESTADO", "CEP", "TELEFONE 1", "TELEFONE 2", "TELEFONE 3", "E-MAIL", "CONTATO", "ATIVO", "CADASTRADO POR", "DT CADASTRO", "ALTERADO POR", "DT ALTERAÇÃO", "CANCELADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTransportadora.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaTransportadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaTransportadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaTransportadoraMouseClicked(evt);
            }
        });
        TabelaTransportadora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabelaTransportadoraKeyPressed(evt);
            }
        });
        PainelTabela.setViewportView(TabelaTransportadora);

        jLabel1.setText("APENAS NÚMEROS PESQUISA POR ID  E APENAS LETRAS POR NOME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnlimparcampos1.setBackground(new java.awt.Color(255, 153, 153));
        btnlimparcampos1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnlimparcampos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-limpar-formatação-16.png"))); // NOI18N
        btnlimparcampos1.setText("LIMPAR CAMPOS");
        btnlimparcampos1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlimparcampos1.setPreferredSize(new java.awt.Dimension(120, 25));
        btnlimparcampos1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnlimparcampos1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnlimparcampos1FocusLost(evt);
            }
        });
        btnlimparcampos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparcampos1ActionPerformed(evt);
            }
        });
        btnlimparcampos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnlimparcampos1KeyPressed(evt);
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
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAcaoLayout.createSequentialGroup()
                                .addGap(439, 439, 439)
                                .addComponent(btnlimparcampos1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelAcaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 341, Short.MAX_VALUE))
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelTabela)))
                .addContainerGap())
        );
        PainelAcaoLayout.setVerticalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAcaoLayout.createSequentialGroup()
                .addComponent(PainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimparcampos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addComponent(PainelAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelPrincipal.getAccessibleContext().setAccessibleName("Dados Pessoais");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btnsalvarActionPerformed

    
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        try {
            cancelar();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ViewTransportadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncancelarActionPerformed
 
    private void comboufKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboufKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txtcep.requestFocus();
        }
    }//GEN-LAST:event_comboufKeyPressed

    private void txtcepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txttelefone1.requestFocus();
        }
    }//GEN-LAST:event_txtcepKeyPressed

    private void txttelefone1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txttelefone2.requestFocus();
        }
    }//GEN-LAST:event_txttelefone1KeyPressed

    private void txttelefone2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone2KeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txttelefone3.requestFocus();
        }
    }//GEN-LAST:event_txttelefone2KeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcontato.requestFocus();
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void PainelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PainelPrincipalMouseClicked
         if (PainelPrincipal.getSelectedIndex() == 0 ){
            txtnomefantasia.requestFocus();
         } //else{
          //  txtnomefantasia.requestFocus();
         //} 
    }//GEN-LAST:event_PainelPrincipalMouseClicked
    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        if (util.Util.ValidaEmail(txtemail.getText()) == false) {
            JOptionPane.showMessageDialog(null, "E-MAIL INVÁLIDO, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtemail.requestFocus();
        }
        if (txtemail.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 50 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtemail.requestFocus();
        }
    }//GEN-LAST:event_txtemailFocusLost

    private void txtcepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcepFocusLost
        if (txtcep.getText().trim().length() < 8) {
            JOptionPane.showMessageDialog(null, "CEP INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtcep.requestFocus();
        }
    }//GEN-LAST:event_txtcepFocusLost

    private void comboufFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboufFocusLost
        if (combouf.getSelectedItem().equals("Selecione o estado")){
            JOptionPane.showMessageDialog(null, "ESTADO (UF) INVÁLIDO !" , "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            combouf.requestFocus();
        }
    }//GEN-LAST:event_comboufFocusLost

    private void txttelefone1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefone1FocusLost
        if (txttelefone1.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "TELEFONE INVÁLIDO, ESSE CAMPO E OBRIGATORIO, CORRIJA! !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txttelefone1.requestFocus();
        }
    }//GEN-LAST:event_txttelefone1FocusLost

    private void btnsalvarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnsalvarFocusGained
        //btnincluir.setBackground(new Color(255,153,153));
        btnsalvar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnsalvarFocusGained

    private void btnsalvarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnsalvarFocusLost
       btnsalvar.setBackground(new Color(255,153,153));
       //btnincluir.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnsalvarFocusLost

    private void btncancelarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btncancelarFocusGained
       btncancelar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btncancelarFocusGained

    private void btncancelarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btncancelarFocusLost
        btncancelar.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btncancelarFocusLost

    private void btnsalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsalvarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            salvar();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
               btncancelar.requestFocus();
        } 
        if(evt.getKeyCode() == KeyEvent.VK_UP){
               btnbuscar.requestFocus();
        }
    }//GEN-LAST:event_btnsalvarKeyPressed
    private void btncancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncancelarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnbuscar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP){
            btnsalvar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try { 
                cancelar();
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ViewTransportadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btncancelarKeyPressed

    private void txtdtcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtcadastroActionPerformed

    private void txtdtalteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtalteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtalteracaoActionPerformed

    private void txtusuariocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuariocadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuariocadastroActionPerformed

    private void chkativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkativoActionPerformed

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
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnsalvar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            btncancelar.requestFocus();
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

    private void txtcpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyTyped
        String caracteres="0123456789";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtcpfKeyTyped

    private void txtcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcpfFocusLost
         if (!txtcpf.getText().replaceAll("\\D", "").isEmpty()) {
            if (util.Util.ValidacpfCnpj(txtcpf.getText().replaceAll("\\D", "")) == false) {
                JOptionPane.showMessageDialog(null, "CPF INCORRETO OU INVÁLIDO !", "ENTERPRISE - CORRIJA", JOptionPane.ERROR_MESSAGE);
                txtcpf.requestFocus();
            }
        }
    }//GEN-LAST:event_txtcpfFocusLost

    private void txtcpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtcnpj.requestFocus();
        }
    }//GEN-LAST:event_txtcpfKeyPressed

    private void chkativoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkativoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btnsalvar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnsalvar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            btnsalvar.requestFocus();
        }
    }//GEN-LAST:event_chkativoKeyPressed

    private void txtenderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtenderecoFocusLost
        if (txtendereco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CAMPO ENDEREÇO É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtendereco.requestFocus();
        }
        if (txtendereco.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ PODERÁ CONTER ATÉ 60 CARACETERES, CORRIJA!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtendereco.requestFocus();
        }
    }//GEN-LAST:event_txtenderecoFocusLost

    private void txtenderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenderecoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          txtbairro.requestFocus();
        }
    }//GEN-LAST:event_txtenderecoKeyPressed

    private void txtenderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenderecoKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-/[](),.: ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtenderecoKeyTyped

    private void txtbairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbairroFocusLost
        if (txtbairro.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CAMPO BAIRRO É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtbairro.requestFocus();
        }
        if (txtbairro.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 50 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtbairro.requestFocus();
        }
    }//GEN-LAST:event_txtbairroFocusLost

    private void txtbairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbairroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txtcomplemento.requestFocus();
        }
    }//GEN-LAST:event_txtbairroKeyPressed

    private void txtcomplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomplementoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          txtcidade.requestFocus();
        }
    }//GEN-LAST:event_txtcomplementoKeyPressed

    private void txtcidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcidadeFocusLost
        if(txtcidade.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "CAMPO CIDADE É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
           txtcidade.requestFocus();
        } 
        if (txtcidade.getText().length() > 50) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 60 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtcidade.requestFocus();
        }
    }//GEN-LAST:event_txtcidadeFocusLost

    private void txtcidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcidadeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            combouf.requestFocus();
        }
    }//GEN-LAST:event_txtcidadeKeyPressed

    private void txtcidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcidadeKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-/[](),.: ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtcidadeKeyTyped

    private void txtnomefantasiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomefantasiaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtnomefantasia.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "CAMPO NOME É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtnomefantasia.requestFocus();
            } else {
                txtrazaosocial.requestFocus();
            }
        }
    }//GEN-LAST:event_txtnomefantasiaKeyPressed

    private void txtnomefantasiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomefantasiaKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtnomefantasiaKeyTyped

    private void txtrazaosocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazaosocialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcpf.requestFocus();
        }
    }//GEN-LAST:event_txtrazaosocialKeyPressed

    private void txtrazaosocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazaosocialKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtrazaosocialKeyTyped

    private void PainelPrincipalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PainelPrincipalFocusGained
         txtnomefantasia.requestFocus();
    }//GEN-LAST:event_PainelPrincipalFocusGained

    private void TabelaTransportadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaTransportadoraMouseClicked
         passagemderegistros();
    }//GEN-LAST:event_TabelaTransportadoraMouseClicked

    private void TabelaTransportadoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaTransportadoraKeyPressed
        passagemderegistros();
    }//GEN-LAST:event_TabelaTransportadoraKeyPressed

    private void btnlimparcampos1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnlimparcampos1FocusGained
        btnlimparcampos1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnlimparcampos1FocusGained

    private void btnlimparcampos1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnlimparcampos1FocusLost
        btnlimparcampos1.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnlimparcampos1FocusLost

    private void btnlimparcampos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparcampos1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnlimparcampos1ActionPerformed

    private void btnlimparcampos1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnlimparcampos1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            btnsalvar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnimprimir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limparCampos();
        }
    }//GEN-LAST:event_btnlimparcampos1KeyPressed

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
            btnlimparcampos1.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            imprimir();
        }
    }//GEN-LAST:event_btnimprimirKeyPressed

    private void txtcnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpjFocusLost
        if (!txtcnpj.getText().replaceAll("\\D", "").isEmpty()) {
            if (util.Util.ValidacpfCnpj(txtcnpj.getText().replaceAll("\\D", "")) == false) {
                JOptionPane.showMessageDialog(null, "CNPJ INCORRETO OU INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtcnpj.requestFocus();
            }
        } else {
            if ((txtcpf.getText().replaceAll("\\D", "").isEmpty()) && (txtcnpj.getText().replaceAll("\\D", "").isEmpty())) {
                JOptionPane.showMessageDialog(null, "POR FAVOR INFORME PELO MENOS O CPF OU CNPJ, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtcpf.requestFocus();
            }
        }
    }//GEN-LAST:event_txtcnpjFocusLost

    private void txtcnpjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnpjKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtinscricaoestadual.requestFocus();
        }
    }//GEN-LAST:event_txtcnpjKeyPressed

    private void txtinscricaomunicipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinscricaomunicipalKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtendereco.requestFocus();
        }
    }//GEN-LAST:event_txtinscricaomunicipalKeyPressed

    private void txttelefone3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone3KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtemail.requestFocus();
         }
    }//GEN-LAST:event_txttelefone3KeyPressed

    private void txtbairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbairroKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-/[](),.: ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtbairroKeyTyped

    private void txtcomplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomplementoKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-/[](),.: ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtcomplementoKeyTyped

    private void txtcepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyTyped
       String caracteres="0123456789";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtcepKeyTyped

    private void txtinscricaoestadualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinscricaoestadualKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtinscricaomunicipal.requestFocus();
        }
    }//GEN-LAST:event_txtinscricaoestadualKeyPressed

    private void txtinscricaoestadualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtinscricaoestadualFocusLost
         if (txtinscricaoestadual.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "DEIXANDO ESTE CAMPO EM BRANCO ASSUMIRÁ COMO ISENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtinscricaoestadual.setText("ISENTO");
         }
         if (txtinscricaoestadual.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ PODERÁ CONTER ATÉ 15 CARACETERES, CORRIJA!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtinscricaoestadual.requestFocus();
         }
             
    }//GEN-LAST:event_txtinscricaoestadualFocusLost

    private void txtinscricaomunicipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtinscricaomunicipalFocusLost
         if (txtinscricaomunicipal.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ PODERÁ CONTER ATÉ 15 CARACETERES, CORRIJA!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtinscricaomunicipal.requestFocus();
         }
    }//GEN-LAST:event_txtinscricaomunicipalFocusLost

    private void txtnomefantasiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomefantasiaFocusLost
        if (txtnomefantasia.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 60 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnomefantasia.requestFocus();
        }
    }//GEN-LAST:event_txtnomefantasiaFocusLost

    private void txtcomplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcomplementoFocusLost
        if (txtcomplemento.getText().length() > 45) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 45 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtcomplemento.requestFocus();
        }
    }//GEN-LAST:event_txtcomplementoFocusLost

    private void txtcontatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontatoFocusLost
        if (txtcontato.getText().length() > 45) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 45 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtcontato.requestFocus();
        }
    }//GEN-LAST:event_txtcontatoFocusLost

    private void txtcontatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontatoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            chkativo.requestFocus();
        }
    }//GEN-LAST:event_txtcontatoKeyPressed

    private void txtrazaosocialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrazaosocialFocusLost
       if (txtrazaosocial.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 60 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtrazaosocial.requestFocus();
        }
    }//GEN-LAST:event_txtrazaosocialFocusLost

    private void txtcontatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontatoKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-/[](),.: ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtcontatoKeyTyped

    private void txttelefone1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone1KeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefone1KeyTyped

    private void txttelefone2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone2KeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefone2KeyTyped

    private void txttelefone3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone3KeyTyped
       String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefone3KeyTyped
    
        
    
    //*************************** Código Limpo **************************************************
    
   
     public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }   
    
    public void limparCampos() {
        TabelaTransportadora.clearSelection();
        PainelPrincipal.setSelectedIndex(0);
        txtid_transportadora.setText("");           
        txtnomefantasia.setText("");
        txtrazaosocial.setText("");
        txtcpf.setText("");
        txtcnpj.setText("");
        txtinscricaoestadual.setText("");
        txtinscricaomunicipal.setText("");
        txtendereco.setText("");
        txtbairro.setText("");
        txtcomplemento.setText("");
        txtcidade.setText("");
        combouf.setSelectedIndex(0);
        txtcep.setText("");
        txttelefone1.setText("");
        txttelefone2.setText("");
        txttelefone3.setText("");
        txtemail.setText("");
        txtcontato.setText("");
        chkativo.setSelected(false);
        txtusuariocadastro.setText("");
        txtdtcadastro.setText("");
        txtusuarioalteracao.setText("");
        txtdtalteracao.setText("");
        chkcancelado.setSelected(false);
        txtbuscar.setText("");
        txtnomefantasia.requestFocus();
    }
    
    public void salvar() {
        int resposta = JOptionPane.showConfirmDialog(null, "DESEJA SALVAR AS INFORMAÇÕES  ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            if (!txtnomefantasia.getText().isEmpty()) {
                Date dataSistema = new Date();
                Transportadora c = new Transportadora();
                TransportadoraDAO transportadoradao = new TransportadoraDAO();
                if (TabelaTransportadora.getSelectedRow() != -1) { // SE FOR ATUALIZAÇÃO RECEBERÁ O 
                    c.setId_transportadora((int) TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 0));
                }
                c.setNomefantasia(txtnomefantasia.getText().toUpperCase());
                c.setRazaosocial(txtrazaosocial.getText().toUpperCase());
                if (txtcpf.getText().replaceAll("\\D", "").isEmpty()) {
                    c.setCpf("00000000000");
                } else {
                    c.setCpf(txtcpf.getText().replaceAll("\\D", ""));
                }
                if (txtcnpj.getText().replaceAll("\\D", "").isEmpty()) {
                    c.setCnpj("00000000000000");
                } else {
                    c.setCnpj(txtcnpj.getText().replaceAll("\\D", ""));
                }
                if (txtinscricaoestadual.getText().isEmpty()) {
                    c.setInscricaoestadual("ISENTO");
                } else {
                    c.setInscricaoestadual(txtinscricaoestadual.getText().toUpperCase());
                }
                c.setInscricaomunicipal(txtinscricaomunicipal.getText());
                c.setEndereco(txtendereco.getText().toUpperCase());
                c.setBairro(txtbairro.getText().toUpperCase());
                c.setComplemento(txtcomplemento.getText().toUpperCase());
                c.setCidade(txtcidade.getText().toUpperCase());
                if (combouf.getSelectedItem().equals("Acre (AC)")) {
                    c.setUf("AC");
                }
                if (combouf.getSelectedItem().equals("Alagoas (AL)")) {
                    c.setUf("AL");
                }
                if (combouf.getSelectedItem().equals("Amapá (AP)")) {
                    c.setUf("AP");
                }
                if (combouf.getSelectedItem().equals("Amazonas (AM)")) {
                    c.setUf("AM");
                }
                if (combouf.getSelectedItem().equals("Bahia (BA)")) {
                    c.setUf("BA");
                }
                if (combouf.getSelectedItem().equals("Ceará (CE)")) {
                    c.setUf("CE");
                }
                if (combouf.getSelectedItem().equals("Distrito Federal (DF)")) {
                    c.setUf("DF");
                }
                if (combouf.getSelectedItem().equals("Espirito Santo (ES)")) {
                    c.setUf("ES");
                }
                if (combouf.getSelectedItem().equals("Goiás (GO)")) {
                    c.setUf("GO");
                }
                if (combouf.getSelectedItem().equals("Maranhão (MA)")) {
                    c.setUf("MA");
                }
                if (combouf.getSelectedItem().equals("Mato Grosso (MT)")) {
                    c.setUf("MT");
                }
                if (combouf.getSelectedItem().equals("Mato Grosso do Sul (MS)")) {
                    c.setUf("MS");
                }
                if (combouf.getSelectedItem().equals("Minas Gerais (MG)")) {
                    c.setUf("MG");
                }
                if (combouf.getSelectedItem().equals("Pará (PA)")) {
                    c.setUf("PA");
                }
                if (combouf.getSelectedItem().equals("Paraiba (PB)")) {
                    c.setUf("PB");
                }
                if (combouf.getSelectedItem().equals("Paraná (PR)")) {
                    c.setUf("PR");
                }
                if (combouf.getSelectedItem().equals("Pernambuco (PE)")) {
                    c.setUf("PE");
                }
                if (combouf.getSelectedItem().equals("Piauí (PI)")) {
                    c.setUf("PI");
                }
                if (combouf.getSelectedItem().equals("Rio de Janeiro (RJ)")) {
                    c.setUf("RJ");
                }
                if (combouf.getSelectedItem().equals("Rio Grande do Norte (RN)")) {
                    c.setUf("RN");
                }
                if (combouf.getSelectedItem().equals("Rio Grande do Sul (RS)")) {
                    c.setUf("RS");
                }
                if (combouf.getSelectedItem().equals("Rodônia (RO)")) {
                    c.setUf("RO");
                }
                if (combouf.getSelectedItem().equals("Roraima (RR)")) {
                    c.setUf("RR");
                }
                if (combouf.getSelectedItem().equals("Santa Catarina (SC)")) {
                    c.setUf("SC");
                }
                if (combouf.getSelectedItem().equals("São Paulo (SP)")) {
                    c.setUf("SP");
                }
                if (combouf.getSelectedItem().equals("Sergipe (SE)")) {
                    c.setUf("SE");
                }
                if (combouf.getSelectedItem().equals("Tocantins (TO)")) {
                    c.setUf("TO");
                }
                c.setCep(txtcep.getText().replaceAll("\\D", ""));
                c.setTelefone1(txttelefone1.getText().replaceAll("\\D", ""));
                c.setTelefone2(txttelefone2.getText().replaceAll("\\D", ""));
                c.setTelefone3(txttelefone3.getText().replaceAll("\\D", ""));
                c.setEmail(txtemail.getText().toLowerCase());
                c.setContato(txtcontato.getText().toUpperCase());
                if (chkativo.isSelected()) {
                    c.setAtivo("S");
                } else {
                    c.setAtivo("N");
                }

                // APERFEIÇOAMENTO DO CÓDIGO 26/05/2019
                //********************************************************
                if (TabelaTransportadora.getSelectedRow() == -1) { // SE FOR INSERT INSERIR O USUARIO
                    c.setUsuariocadastro(Integer.parseInt(ViewLogin.Id_Colaborador));
                    c.setDtcadastro(Util.formatarDataPostgres(dataSistema));
                } else { // SE FOR ALTERAÇÃO NÃO MODIFICAR QUEM INSERIU
                    c.setUsuariocadastro(c.getUsuariocadastro());
                    c.setDtcadastro(Util.formatarDataUS(txtdtcadastro.getText()));
                }
                c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                if (chkcancelado.isSelected()) {
                    c.setCancelado("S");
                } else {
                    c.setCancelado("N");
                }
                // **************************************************************
                TransportadoraDAO.getInstance().salvar(c);
            }
        } else {
            JOptionPane.showMessageDialog(null, "CAMPO NOME É OBRIGATÓRIO O PREENCHIMENTO, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
        readTable();
    }
    
    public void cancelar() throws UnsupportedEncodingException {   // ESTE MÉTODO CANCELA O COLABORADOR E TAMBÉM A SENHA NA TABELA SENHAS
        if (TabelaTransportadora.getSelectedRow() != -1) {
            Date              dataSistema = new Date();
            Transportadora                 c = new Transportadora();
           // TransportadoraDAO transportadoradao = new TransportadoraDAO();
            
            if (chkcancelado.isSelected()) {
               int resposta = JOptionPane.showConfirmDialog(null, "ESTE REGISTRO ESTÁ CANCELADO DESEJA RETIRAR O CANCELAMENTO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
               if (resposta == JOptionPane.YES_OPTION) {
                   chkcancelado.setSelected(false);
                   c.setCancelado("N");
                   c.setId_transportadora((int) TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 0));
                   c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                   c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                   TransportadoraDAO.getInstance().cancelar(c); 
               }
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR ESTE REGISTRO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    chkcancelado.setSelected(true);
                    c.setCancelado("S");
                    c.setId_transportadora((int) TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 0));
                    c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    TransportadoraDAO.getInstance().cancelar(c); 
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UM COLABORADOR PARA CANCELAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnomefantasia.requestFocus();
        }
        readTable();
    }
    
    
       
    public void buscar() {
        if (txtbuscar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INFORME APENAS LETRAS PARA PESQUISA POR NOME OU APENAS NÚMEROS PARA PESQUISA PELA MATRICULA", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtbuscar.requestFocus();
            readTable();
        } else {
            if (txtbuscar.getText().matches("[0-9]*")) {
                int Id = (Integer.parseInt(txtbuscar.getText()));
                readTableForId(Id);
            } else {
                readTableForNome(txtbuscar.getText().toUpperCase());
            }
        }
    }
    
      public void readTable() {
        DefaultTableModel modelo  = (DefaultTableModel) TabelaTransportadora.getModel();
        modelo.setNumRows(0);
        TransportadoraDAO transportadoradao = new TransportadoraDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Transportadora c: transportadoradao.read()){
            modelo.addRow(new Object[]{                
                c.getId_transportadora(),
                c.getNomefantasia(),
                c.getRazaosocial(),
                c.getCpf(),
                c.getCnpj(),
                c.getInscricaoestadual(),
                c.getInscricaomunicipal(),
                c.getEndereco(),
                c.getBairro(),
                c.getComplemento(),
                c.getCidade(),
                c.getUf(),
                c.getCep(),
                c.getTelefone1(),
                c.getTelefone2(),
                c.getTelefone3(),
                c.getEmail(),
                c.getContato(),
                c.getAtivo(),
                c.getUsuariocadastro(),
                df.format(c.getDtcadastro()),
                c.getUsuarioalteracao(),
                df.format(c.getDtalteracao()),
                c.getCancelado()
            });
        }
        limparCampos();
    } 
    
    public void readTableForNome(String desc) {
        DefaultTableModel modelo = (DefaultTableModel) TabelaTransportadora.getModel();
        modelo.setNumRows(0);
        TransportadoraDAO transportadoradao = new TransportadoraDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        List<Transportadora> t = transportadoradao.readForNome(desc);
        if (!t.isEmpty()) {
            for (Transportadora c : transportadoradao.readForNome(desc)) {
                modelo.addRow(new Object[]{
                    c.getId_transportadora(),
                    c.getNomefantasia(),
                    c.getRazaosocial(),
                    c.getCpf(),
                    c.getCnpj(),
                    c.getInscricaoestadual(),
                    c.getInscricaomunicipal(),
                    c.getEndereco(),
                    c.getBairro(),
                    c.getComplemento(),
                    c.getCidade(),
                    c.getUf(),
                    c.getCep(),
                    c.getTelefone1(),
                    c.getTelefone2(),
                    c.getTelefone3(),
                    c.getEmail(),
                    c.getContato(),
                    c.getAtivo(),
                    c.getUsuariocadastro(),
                    df.format(c.getDtcadastro()),
                    c.getUsuarioalteracao(),
                    df.format(c.getDtalteracao()),
                    c.getCancelado()
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, "TRANSPORTADORA NÃO ENCONTRADA. ", "ENTERPRISE - INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            readTable();
        }
    }
    
    
    public void readTableForId(int Id) {
        DefaultTableModel modelo = (DefaultTableModel) TabelaTransportadora.getModel();
        modelo.setNumRows(0);
        TransportadoraDAO transportadoradao = new TransportadoraDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Transportadora c = transportadoradao.readForId(Id);
        if (c != null){
            modelo.addRow(new Object[]{
                c.getId_transportadora(),
                c.getNomefantasia(),
                c.getRazaosocial(),
                c.getCpf(),
                c.getCnpj(),
                c.getInscricaoestadual(),
                c.getInscricaomunicipal(),
                c.getEndereco(),
                c.getBairro(),
                c.getComplemento(),
                c.getCidade(),
                c.getUf(),
                c.getCep(),
                c.getTelefone1(),
                c.getTelefone2(),
                c.getTelefone3(),
                c.getEmail(),
                c.getContato(),
                c.getAtivo(),
                c.getUsuariocadastro(),
                df.format(c.getDtcadastro()),
                c.getUsuarioalteracao(),
                df.format(c.getDtalteracao()),
                c.getCancelado()
            });
        } else {
            JOptionPane.showMessageDialog(null, "TRANSPORTADORA NÃO ENCONTRADA. ", "ENTERPRISE - INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            readTable();
        }
    }
    
    
     public void imprimir(){
        TransportadoraDAO transportadoradao = new TransportadoraDAO();
        transportadoradao.imprimir();
        limparCampos();
    }
    
    public void passagemderegistros(){ //Metodo para a passagem de Registros 
        if (TabelaTransportadora.getSelectedRow()!= -1){
            TransportadoraDAO transportadoradao = new TransportadoraDAO();
            ColaboradorDAO colaboradordao = new ColaboradorDAO();
            txtid_transportadora.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 0).toString());
            txtnomefantasia.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 1).toString());
            txtrazaosocial.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 2).toString());
            txtcpf.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 3).toString());
            txtcnpj.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 4).toString());
            txtinscricaoestadual.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 5).toString());
            txtinscricaomunicipal.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 6).toString());
            txtendereco.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(),7).toString());
            txtbairro.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 8).toString());
            txtcomplemento.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 9).toString());
            txtcidade.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 10).toString());
            
            if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("AC")){
                combouf.setSelectedIndex(1);
            }
            if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("AL")) {
               combouf.setSelectedIndex(2);
            }       
            if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("AP")) {
                combouf.setSelectedIndex(3);
            } 
            if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("AM")) {
                combouf.setSelectedIndex(4);
            }
            if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("BA")) {
                combouf.setSelectedIndex(5);
            }           
            if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("CE")) {
                combouf.setSelectedIndex(6);
            }      
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("DF")) {
                combouf.setSelectedIndex(7);
            }
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("ES")) {
                combouf.setSelectedIndex(8);
           }
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("GO")) {
                combouf.setSelectedIndex(9);
           } 
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("MA")) {
                combouf.setSelectedIndex(10);
           }        
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("MT")) {
                combouf.setSelectedIndex(11);
           }       
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("MS")) {
                combouf.setSelectedIndex(12);
           }        
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("MG")) {
                combouf.setSelectedIndex(13);
           }  
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("PA")) {
                combouf.setSelectedIndex(14);
           }        
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("PB")) {
                combouf.setSelectedIndex(15);
           }        
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("PR")) {
                combouf.setSelectedIndex(16);
           }        
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("PE")) {
                combouf.setSelectedIndex(17);
           }      
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("PI")) {
                combouf.setSelectedIndex(18);
           }     
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("RJ")) {
                combouf.setSelectedIndex(19);
           }      
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("RN")) {
                combouf.setSelectedIndex(20);
           }      
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("RS")) {
                combouf.setSelectedIndex(21);
           }       
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("RO")) {
                combouf.setSelectedIndex(22);
           }      
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("RR")) {
                combouf.setSelectedIndex(23);
           } 
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("SC")) {
                combouf.setSelectedIndex(24);
           } 
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("SP")) {
                combouf.setSelectedIndex(25);
           }      
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("SE")) {
                combouf.setSelectedIndex(26);
           }      
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 11).toString().equals("TO")) {
                combouf.setSelectedIndex(27);
           }      
           txtcep.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 12).toString());
           txttelefone1.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 13).toString());
           txttelefone2.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 14).toString());
           txttelefone3.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 15).toString());
           txtemail.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 16).toString());
           txtcontato.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 17).toString());
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 18).toString().equals("S")){
               chkativo.setSelected(true);
               
           }else {
               chkativo.setSelected(false);
           }
           if(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 19).toString().equals("0")){
              txtusuariocadastro.setText("ADMINISTRADOR");
           } else {
              txtusuariocadastro.setText(colaboradordao.pesquisaId_Colaborador(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(),19).toString()));
           }
           txtdtcadastro.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 20).toString());
           if(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 21).toString().equals("0")){
              txtusuarioalteracao.setText("ADMINISTRADOR");
           } else {   
             txtusuarioalteracao.setText(colaboradordao.pesquisaId_Colaborador(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 21).toString()));
           }             
           txtdtalteracao.setText(TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 22).toString());
           if (TabelaTransportadora.getValueAt(TabelaTransportadora.getSelectedRow(), 23).toString().equals("S")){
               chkcancelado.setSelected(true);
           }else {
               chkcancelado.setSelected(false);
           }
        }
    }
                                 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane AbaDadosComplementares;
    private javax.swing.JDesktopPane AbaDadosPessoais;
    private javax.swing.JPanel PainelAcao;
    private javax.swing.JPanel PainelDadosPessoais;
    private javax.swing.JPanel PainelEndereco;
    private javax.swing.JTabbedPane PainelPrincipal;
    private javax.swing.JScrollPane PainelTabela;
    private javax.swing.JPanel PainellDadosComplementares;
    private javax.swing.JTable TabelaTransportadora;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnlimparcampos1;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JCheckBox chkativo;
    private javax.swing.JCheckBox chkcancelado;
    private javax.swing.JComboBox<String> combouf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPConfigSistema1;
    private javax.swing.JLabel lblbairro;
    private javax.swing.JLabel lblcep;
    private javax.swing.JLabel lblcidade;
    private javax.swing.JLabel lblcnpj;
    private javax.swing.JLabel lblcomplemento;
    private javax.swing.JLabel lblcontato;
    private javax.swing.JLabel lblcpf;
    private javax.swing.JLabel lbldtalteracao;
    private javax.swing.JLabel lbldtcadastro;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblid_transportadora;
    private javax.swing.JLabel lblinscricaoestadual;
    private javax.swing.JLabel lblinscricaomunicipal;
    private javax.swing.JLabel lblnomefantasia;
    private javax.swing.JLabel lblrazaosocial;
    private javax.swing.JLabel lbltelefone1;
    private javax.swing.JLabel lbltelefone2;
    private javax.swing.JLabel lbltelefone3;
    private javax.swing.JLabel lbluf;
    private javax.swing.JLabel lblusuarioalteracao;
    private javax.swing.JLabel lblusuariocadastro;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JTextField txtcontato;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JFormattedTextField txtdtalteracao;
    private javax.swing.JFormattedTextField txtdtcadastro;
    private javax.swing.JFormattedTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtid_transportadora;
    private javax.swing.JTextField txtinscricaoestadual;
    private javax.swing.JFormattedTextField txtinscricaomunicipal;
    private javax.swing.JTextField txtnomefantasia;
    private javax.swing.JTextField txtrazaosocial;
    private javax.swing.JFormattedTextField txttelefone1;
    private javax.swing.JFormattedTextField txttelefone2;
    private javax.swing.JFormattedTextField txttelefone3;
    private javax.swing.JFormattedTextField txtusuarioalteracao;
    private javax.swing.JFormattedTextField txtusuariocadastro;
    // End of variables declaration//GEN-END:variables
}
