
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
import model.bean.Cliente;
import model.dao.ClienteDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import model.dao.ColaboradorDAO;
import util.Util;



public class ViewCliente extends javax.swing.JInternalFrame {

    public Double limiteanterior;
    public ViewCliente() {
         initComponents();
         DefaultTableModel modelo = (DefaultTableModel) TabelaCliente.getModel();
         TabelaCliente.setRowSorter(new TableRowSorter(modelo));
         readTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JTabbedPane();
        AbaDadosPessoais = new javax.swing.JDesktopPane();
        PainelDadosPessoais = new javax.swing.JPanel();
        lblid_cliente = new javax.swing.JLabel();
        txtid_cliente = new javax.swing.JTextField();
        lblnome = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
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
        lbldtnascimentofundacao = new javax.swing.JLabel();
        txtdtnascimentofundacao = new javax.swing.JFormattedTextField();
        lblgenero = new javax.swing.JLabel();
        combogenero = new javax.swing.JComboBox<>();
        lblestadocivil = new javax.swing.JLabel();
        comboestadocivil = new javax.swing.JComboBox<>();
        lblnomeconjuge = new javax.swing.JLabel();
        txtnomeconjuge = new javax.swing.JTextField();
        lblnomemae = new javax.swing.JLabel();
        txtnomemae = new javax.swing.JTextField();
        lblnomepai = new javax.swing.JLabel();
        txtnomepai = new javax.swing.JTextField();
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
        AbaDadosComplementares = new javax.swing.JDesktopPane();
        PainellDadosComplementares = new javax.swing.JPanel();
        lblatividadeprofissional = new javax.swing.JLabel();
        txtatividadeprofissional = new javax.swing.JTextField();
        chkativo = new javax.swing.JCheckBox();
        lbllimitecredito = new javax.swing.JLabel();
        txtlimitecredito = new javax.swing.JFormattedTextField();
        lblsaldo = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JFormattedTextField();
        lblcodigomigracao = new javax.swing.JLabel();
        txtcodigomigracao = new javax.swing.JTextField();
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
        TabelaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnlimparcampos1 = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("ENTERPRISE - CADASTRO DE CLIENTES");

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

        lblid_cliente.setText("Id Cliente:");

        txtid_cliente.setEditable(false);

        lblnome.setText("Nome:");

        txtnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomeFocusLost(evt);
            }
        });
        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomeKeyTyped(evt);
            }
        });

        lblrazaosocial.setText("Razão Social.......:");

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

        lblcpf.setText("C.P.F.....:");

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

        lblcnpj.setText("C.N.P.J:");

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcnpjKeyTyped(evt);
            }
        });

        lblinscricaoestadual.setText("Insc. Estadual:");

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

        lblinscricaomunicipal.setText("Insc.  Municipal:");

        txtinscricaomunicipal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtinscricaomunicipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtinscricaomunicipalFocusLost(evt);
            }
        });
        txtinscricaomunicipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinscricaomunicipalActionPerformed(evt);
            }
        });
        txtinscricaomunicipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinscricaomunicipalKeyPressed(evt);
            }
        });

        lbldtnascimentofundacao.setText("Data Nascimento / Fundação:");

        try {
            txtdtnascimentofundacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtnascimentofundacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdtnascimentofundacaoFocusLost(evt);
            }
        });
        txtdtnascimentofundacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdtnascimentofundacaoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdtnascimentofundacaoKeyTyped(evt);
            }
        });

        lblgenero.setText("Genero:");

        combogenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "MASCULINO", "FEMININO" }));
        combogenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combogeneroKeyPressed(evt);
            }
        });

        lblestadocivil.setText("Estado Civil....:");

        comboestadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CASADO", "DIVORCIADO", "SOLTEIRO", " " }));
        comboestadocivil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboestadocivilFocusLost(evt);
            }
        });
        comboestadocivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboestadocivilKeyPressed(evt);
            }
        });

        lblnomeconjuge.setText("Conjuge:");

        txtnomeconjuge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomeconjugeFocusLost(evt);
            }
        });
        txtnomeconjuge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomeconjugeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomeconjugeKeyTyped(evt);
            }
        });

        lblnomemae.setText("Mãe......:");

        txtnomemae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomemaeFocusLost(evt);
            }
        });
        txtnomemae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomemaeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomemaeKeyTyped(evt);
            }
        });

        lblnomepai.setText("Pai:");

        txtnomepai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomepaiFocusLost(evt);
            }
        });
        txtnomepai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomepaiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomepaiKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PainelDadosPessoaisLayout = new javax.swing.GroupLayout(PainelDadosPessoais);
        PainelDadosPessoais.setLayout(PainelDadosPessoaisLayout);
        PainelDadosPessoaisLayout.setHorizontalGroup(
            PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lblid_cliente)
                        .addGap(3, 3, 3)
                        .addComponent(txtid_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblnome)
                        .addGap(10, 10, 10)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrazaosocial))
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lblcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblcnpj)
                        .addGap(4, 4, 4)
                        .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblinscricaoestadual, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtinscricaoestadual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblinscricaomunicipal)
                        .addGap(4, 4, 4)
                        .addComponent(txtinscricaomunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lbldtnascimentofundacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdtnascimentofundacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lblgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(comboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblnomeconjuge, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(lblnomemae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(lblnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnomeconjuge, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        PainelDadosPessoaisLayout.setVerticalGroup(
            PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblid_cliente)
                            .addComponent(lblnome)
                            .addComponent(lblrazaosocial))))
                .addGap(16, 16, 16)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtinscricaoestadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtinscricaomunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcpf)
                            .addComponent(lblcnpj)
                            .addComponent(lblinscricaoestadual)
                            .addComponent(lblinscricaomunicipal)
                            .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbldtnascimentofundacao)
                                .addComponent(txtdtnascimentofundacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(8, 8, 8)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgenero)
                            .addComponent(lblestadocivil))))
                .addGap(18, 18, 18)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomeconjuge)
                    .addComponent(txtnomeconjuge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnomemae)
                            .addComponent(lblnomepai)))))
        );

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

        lblbairro.setText("Bairro...:");

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

        lblcomplemento.setText("Complemento:");

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

        lblcidade.setText("Cidade.:");

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

        lbluf.setText("Estado...........:");

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

        lbltelefone1.setText("Telefone 1:");

        try {
            txttelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttelefone1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttelefone1FocusGained(evt);
            }
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

        lbltelefone2.setText("Telefone 2:");

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

        javax.swing.GroupLayout PainelEnderecoLayout = new javax.swing.GroupLayout(PainelEndereco);
        PainelEndereco.setLayout(PainelEnderecoLayout);
        PainelEnderecoLayout.setHorizontalGroup(
            PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(lbltelefone1)
                        .addGap(2, 2, 2)
                        .addComponent(txttelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltelefone2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltelefone3)
                        .addGap(2, 2, 2)
                        .addComponent(txttelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblcidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblbairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblendereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(lblcomplemento))
                            .addComponent(txtendereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEnderecoLayout.createSequentialGroup()
                                .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbluf)))))
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblemail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcomplemento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                                .addComponent(combouf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblcep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelEnderecoLayout.setVerticalGroup(
            PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblendereco)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbairro)
                    .addComponent(lblcomplemento)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcidade)
                    .addComponent(lbluf)
                    .addComponent(combouf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcep)
                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefone1)
                    .addComponent(txttelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefone2)
                    .addComponent(txttelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefone3)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
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
                    .addComponent(PainelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                    .addComponent(PainelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        AbaDadosPessoaisLayout.setVerticalGroup(
            AbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbaDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelPrincipal.addTab("Dados Pessoais", AbaDadosPessoais);

        AbaDadosComplementares.setBackground(new java.awt.Color(240, 240, 240));

        PainellDadosComplementares.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblatividadeprofissional.setText("Atividade Profissional:");

        txtatividadeprofissional.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtatividadeprofissionalFocusLost(evt);
            }
        });
        txtatividadeprofissional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtatividadeprofissionalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtatividadeprofissionalKeyTyped(evt);
            }
        });

        chkativo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkativo.setText("ATIVO");
        chkativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkativoKeyPressed(evt);
            }
        });

        lbllimitecredito.setText("Limite de Crédito.......:");

        txtlimitecredito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,##0.00"))));
        txtlimitecredito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtlimitecredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlimitecreditoKeyPressed(evt);
            }
        });

        lblsaldo.setText("Saldo Atual.......:");

        txtsaldo.setEditable(false);
        txtsaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###,##0.00"))));
        txtsaldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblcodigomigracao.setText("Código Migração........:");

        txtcodigomigracao.setEditable(false);

        javax.swing.GroupLayout PainellDadosComplementaresLayout = new javax.swing.GroupLayout(PainellDadosComplementares);
        PainellDadosComplementares.setLayout(PainellDadosComplementaresLayout);
        PainellDadosComplementaresLayout.setHorizontalGroup(
            PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainellDadosComplementaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcodigomigracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbllimitecredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblatividadeprofissional, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainellDadosComplementaresLayout.createSequentialGroup()
                        .addGroup(PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainellDadosComplementaresLayout.createSequentialGroup()
                                .addComponent(txtlimitecredito, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(lblsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtatividadeprofissional))
                        .addGap(18, 18, 18)
                        .addComponent(chkativo)
                        .addGap(359, 359, 359))
                    .addGroup(PainellDadosComplementaresLayout.createSequentialGroup()
                        .addComponent(txtcodigomigracao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PainellDadosComplementaresLayout.setVerticalGroup(
            PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainellDadosComplementaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblatividadeprofissional)
                    .addComponent(txtatividadeprofissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllimitecredito)
                    .addComponent(txtlimitecredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsaldo)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainellDadosComplementaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigomigracao)
                    .addComponent(txtcodigomigracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        TabelaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "RAZÃO SOCIAL", "CPF", "CNPJ", "INSCRIÇÃO ESTADUAL", "INSCRIÇÃO MUNICIPAL", "DT. NASC / FUND", "GÊNERO", "ESTADO CÍVIL", "CONJUGE", "MÃE", "PAI", "ENDEREÇO", "BAIRRO", "COMPLEMENTO", "CIDADE", "ESTADO", "CEP", "TELEFONE 1", "TELEFONE 2", "TELEFONE 3", "E-MAIL", "ATIVIDADE", "LIMITE", "SALDO", "CÓD. MIGRAÇÃO", "ATIVO", "CADASTRADO POR", "DT CADASTRO", "ALTERADO POR", "DT ALTERAÇÃO", "CANCELADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClienteMouseClicked(evt);
            }
        });
        TabelaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabelaClienteKeyPressed(evt);
            }
        });
        PainelTabela.setViewportView(TabelaCliente);

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
                        .addGap(0, 361, Short.MAX_VALUE))
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelTabela)))
                .addContainerGap())
        );
        PainelAcaoLayout.setVerticalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAcaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
            .addComponent(PainelAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, ex);
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
            if (util.Util.ValidaEmail(txtemail.getText()) == true) {
                PainelPrincipal.setSelectedIndex(1);
                txtatividadeprofissional.requestFocus();
            }
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void PainelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PainelPrincipalMouseClicked
         if (PainelPrincipal.getSelectedIndex() == 0 ){
            txtnome.requestFocus();
         }else{
            txtatividadeprofissional.requestFocus();
         } 
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
            JOptionPane.showMessageDialog(null, "TELEFONE INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
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
                Logger.getLogger(ViewCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btncancelarKeyPressed

    private void txtdtnascimentofundacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtnascimentofundacaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            combogenero.requestFocus();
        }
    }//GEN-LAST:event_txtdtnascimentofundacaoKeyPressed

    private void combogeneroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combogeneroKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            comboestadocivil.requestFocus();
       }
    }//GEN-LAST:event_combogeneroKeyPressed

    private void comboestadocivilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboestadocivilKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           if(comboestadocivil.getSelectedItem().equals("CASADO")){
              txtnomeconjuge.setEditable(true);
              txtnomeconjuge.requestFocus();
           } else {
              txtnomeconjuge.setEditable(false);
              txtnomemae.requestFocus();
           }  
        }
    }//GEN-LAST:event_comboestadocivilKeyPressed

    private void txtdtcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtcadastroActionPerformed

    private void txtdtalteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtalteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtalteracaoActionPerformed

    private void txtusuariocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuariocadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuariocadastroActionPerformed

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

    private void txtdtnascimentofundacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdtnascimentofundacaoFocusLost
       if(! Util.verificarDataNasc(txtdtnascimentofundacao.getText()) || txtdtnascimentofundacao.getText().replaceAll("\\D", "").isEmpty()){
          JOptionPane.showMessageDialog(null, "DATA ESTÁ INCORRETA OU É INVÁLIDA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
          txtdtnascimentofundacao.requestFocus();
       } else {
           combogenero.requestFocus();
       }
    }//GEN-LAST:event_txtdtnascimentofundacaoFocusLost

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

    private void txtnomeconjugeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeconjugeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txtnomemae.requestFocus();
        }
    }//GEN-LAST:event_txtnomeconjugeKeyPressed

    private void txtnomeconjugeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeconjugeKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
           evt.consume();
        }
    }//GEN-LAST:event_txtnomeconjugeKeyTyped

    private void txtnomemaeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomemaeKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtnomemaeKeyTyped

    private void txtnomepaiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomepaiKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtnomepaiKeyTyped

    private void txtnomemaeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomemaeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          txtnomepai.requestFocus();
        }
    }//GEN-LAST:event_txtnomemaeKeyPressed

    private void txtnomepaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomepaiKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txtendereco.requestFocus();
        }
    }//GEN-LAST:event_txtnomepaiKeyPressed

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

    private void txtnomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtnome.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "CAMPO NOME É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtnome.requestFocus();
            } else {
                txtrazaosocial.requestFocus();
            }
        }
    }//GEN-LAST:event_txtnomeKeyPressed

    private void txtnomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtnomeKeyTyped

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
         txtatividadeprofissional.requestFocus();
    }//GEN-LAST:event_PainelPrincipalFocusGained

    private void TabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClienteMouseClicked
         passagemderegistros();
    }//GEN-LAST:event_TabelaClienteMouseClicked

    private void TabelaClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaClienteKeyPressed
        passagemderegistros();
    }//GEN-LAST:event_TabelaClienteKeyPressed

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
         if(!txtcnpj.getText().replaceAll("\\D", "").isEmpty()){
            if (util.Util.ValidacpfCnpj(txtcnpj.getText().replaceAll("\\D", "")) == false) {
               JOptionPane.showMessageDialog(null, "CNPJ INCORRETO OU INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
               txtcnpj.requestFocus();
            }
         } else {
            if ((txtcpf.getText().replaceAll("\\D", "").isEmpty()) && (txtcnpj.getText().replaceAll("\\D", "").isEmpty())) {
                JOptionPane.showMessageDialog(null, "POR FAVOR INFORME PELO MENOS O CPF OU O CNPJ, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
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
            txtdtnascimentofundacao.requestFocus();
        }
    }//GEN-LAST:event_txtinscricaomunicipalKeyPressed

    private void txttelefone3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone3KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtemail.requestFocus();
         }
    }//GEN-LAST:event_txttelefone3KeyPressed

    private void comboestadocivilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboestadocivilFocusLost
         if (comboestadocivil.getSelectedItem().equals("CASADO")) {
            txtnomeconjuge.setEditable(true);
            txtnomeconjuge.requestFocus();
        } else {
            txtnomeconjuge.setEditable(false);
            txtnomemae.requestFocus();
        }
    }//GEN-LAST:event_comboestadocivilFocusLost

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

    private void txtatividadeprofissionalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtatividadeprofissionalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtlimitecredito.requestFocus();
        }
    }//GEN-LAST:event_txtatividadeprofissionalKeyPressed

    private void txtlimitecreditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlimitecreditoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            chkativo.requestFocus();
        }
    }//GEN-LAST:event_txtlimitecreditoKeyPressed

    private void txtinscricaomunicipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinscricaomunicipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinscricaomunicipalActionPerformed

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

    private void txtnomeconjugeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeconjugeFocusLost
         if (txtnomeconjuge.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ PODERÁ CONTER ATÉ 60 CARACETERES, CORRIJA!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnomeconjuge.requestFocus();
        }
    }//GEN-LAST:event_txtnomeconjugeFocusLost

    private void txtnomemaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomemaeFocusLost
        if (txtnomemae.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ PODERÁ CONTER ATÉ 60 CARACETERES, CORRIJA!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnomemae.requestFocus();
        }
    }//GEN-LAST:event_txtnomemaeFocusLost

    private void txtnomepaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomepaiFocusLost
        if (txtnomepai.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ PODERÁ CONTER ATÉ 60 CARACETERES, CORRIJA!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnomepai.requestFocus();
        }
    }//GEN-LAST:event_txtnomepaiFocusLost

    private void txtnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeFocusLost
        if (txtnome.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 60 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnome.requestFocus();
        }
        
    }//GEN-LAST:event_txtnomeFocusLost

    private void txtcomplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcomplementoFocusLost
        if (txtcomplemento.getText().length() > 45) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 45 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtcomplemento.requestFocus();
        }
    }//GEN-LAST:event_txtcomplementoFocusLost

    private void txtatividadeprofissionalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtatividadeprofissionalFocusLost
         if (txtatividadeprofissional.getText().length() > 45) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 45 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtatividadeprofissional.requestFocus();
        }
    }//GEN-LAST:event_txtatividadeprofissionalFocusLost

    private void txtrazaosocialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrazaosocialFocusLost
        if (txtrazaosocial.getText().length() > 60) {
            JOptionPane.showMessageDialog(null, "CAMPO SÓ DEVERÁ CONTER ATÉ 60 CARACTERES, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtrazaosocial.requestFocus();
        }
    }//GEN-LAST:event_txtrazaosocialFocusLost

    private void txtcnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnpjKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }  
    }//GEN-LAST:event_txtcnpjKeyTyped

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

    private void txtatividadeprofissionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtatividadeprofissionalKeyTyped
      String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtatividadeprofissionalKeyTyped

    private void txttelefone1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefone1FocusGained
        if (txttelefone1.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "TELEFONE INVÁLIDO, ESSE CAMPO E OBRIGATORIO, CORRIJA!", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txttelefone1.requestFocus();
        }
    }//GEN-LAST:event_txttelefone1FocusGained

    private void txtdtnascimentofundacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtnascimentofundacaoKeyTyped
        String caracteres="0123456789";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtdtnascimentofundacaoKeyTyped
    
        
    
    //*************************** Código Limpo **************************************************
    
   
     public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
        txtnome.requestFocus();
    }   
    
    public void limparCampos() {
        TabelaCliente.clearSelection();
        PainelPrincipal.setSelectedIndex(0);
        txtnome.requestFocus();
        txtid_cliente.setText("");           
        txtnome.setText("");
        txtrazaosocial.setText("");
        txtcpf.setText("");
        txtcnpj.setText("");
        txtinscricaoestadual.setText("");
        txtinscricaomunicipal.setText("");
        txtdtnascimentofundacao.setText("");
        combogenero.setSelectedIndex(0);
        comboestadocivil.setSelectedIndex(0);
        txtnomeconjuge.setText("");
        txtnomemae.setText("");
        txtnomepai.setText("");
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
        txtatividadeprofissional.setText("");
        txtlimitecredito.setText("");
        txtsaldo.setText("");
        chkativo.setSelected(false);
        txtusuariocadastro.setText("");
        txtdtcadastro.setText("");
        txtusuarioalteracao.setText("");
        txtdtalteracao.setText("");
        chkcancelado.setSelected(false);
        txtbuscar.setText("");
    }
    
    public void salvar() {
        int resposta = JOptionPane.showConfirmDialog(null, "DESEJA SALVAR AS INFORMAÇÕES  ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            if (!txtnome.getText().isEmpty()) {
                Date dataSistema = new Date();
                Cliente c = new Cliente();
                ClienteDAO clientedao = new ClienteDAO();
                if (TabelaCliente.getSelectedRow() != -1) { // SE FOR ATUALIZAÇÃO RECEBERÁ O 
                    c.setId_cliente((int) TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 0));
                }
                c.setNome(txtnome.getText().toUpperCase());
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
                c.setDtnascimentofundacao(Util.formatarDataUS(txtdtnascimentofundacao.getText()));
                if (combogenero.getSelectedItem().equals("MASCULINO")) {
                    c.setGenero("M");
                }
                if (combogenero.getSelectedItem().equals("FEMININO")) {
                    c.setGenero("F");
                }
                if (combogenero.getSelectedItem().equals("Selecione")) {
                    c.setGenero("E"); // NO CASO DO CADASTRO SER UMA EMPRESA 
                }
                if (comboestadocivil.getSelectedItem().equals("Selecione")) {
                    c.setEstadocivil("EMPRESA"); // NO CASO DO CADASTRO SER UMA EMPRESA 
                } else {
                    c.setEstadocivil(comboestadocivil.getSelectedItem().toString());
                }
                c.setNomeconjuge(txtnomeconjuge.getText().toUpperCase());
                c.setNomemae(txtnomemae.getText().toUpperCase());
                c.setNomepai(txtnomepai.getText().toUpperCase());
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
                c.setAtividadeprofissional(txtatividadeprofissional.getText().toUpperCase());

                c.setLimitecredito(Double.parseDouble(Util.formatarDecimalUs(txtlimitecredito.getText())));
                if (TabelaCliente.getSelectedRow() != -1) {  // SE FOR ALTERAÇÃO HAVERÁ UM OPERAÇÃO PARA ATUALIZAÇÃO DO SALDO
                    Double saldo = 0.00;
                    if (txtlimitecredito.getText().replaceAll("\\D", "").isEmpty()) {
                        c.setLimitecredito(saldo); // SE LIMITECREDITO ESTIVER EM BRANCO ASSUME 0.00
                    }
                    Double limiteatual = (Double.parseDouble(Util.formatarDecimalUs(txtlimitecredito.getText())));
                    Double saldoanterior = (Double.parseDouble(Util.formatarDecimalUs(txtsaldo.getText())));
                    saldo = ((limiteanterior - limiteatual) + saldoanterior);
                    if (limiteatual < saldoanterior) {
                        saldo = limiteatual;
                    } else {
                        saldo = ((limiteatual - saldoanterior) + saldoanterior);
                    }
                    c.setSaldo(saldo);
                } else {  // SER FOR INSERT O SALDO INICIAL SERÁ O LIMITE DE CREDITO
                    c.setSaldo(Double.parseDouble(Util.formatarDecimalUs(txtlimitecredito.getText())));
                }

                if (chkativo.isSelected()) {
                    c.setAtivo("S");
                } else {
                    c.setAtivo("N");
                }
                // c.setCodigomigracao(Integer.parseInt(txtcodigomigracao.getText()));

                // APERFEIÇOAMENTO DO CÓDIGO 26/05/2019
                //********************************************************
                if (TabelaCliente.getSelectedRow() == -1) { // SE FOR INSERT INSERIR O USUARIO
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

                ClienteDAO.getInstance().salvar(c);
            } else {
                JOptionPane.showMessageDialog(null, "CAMPO NOME É OBRIGATÓRIO O PREENCHIMENTO, CORRIJA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            }

        }
        readTable();
    }
    
    public void cancelar() throws UnsupportedEncodingException {   // ESTE MÉTODO CANCELA O COLABORADOR E TAMBÉM A SENHA NA TABELA SENHAS
        if (TabelaCliente.getSelectedRow() != -1) {
            Date              dataSistema = new Date();
            Cliente                 c = new Cliente();
           // ClienteDAO clientedao = new ClienteDAO();
            
            if (chkcancelado.isSelected()) {
               int resposta = JOptionPane.showConfirmDialog(null, "ESTE REGISTRO ESTÁ CANCELADO DESEJA RETIRAR O CANCELAMENTO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
               if (resposta == JOptionPane.YES_OPTION) {
                   chkcancelado.setSelected(false);
                   c.setCancelado("N");
                   c.setId_cliente((int) TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 0));
                   c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                   c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                   ClienteDAO.getInstance().cancelar(c); 
               }
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR ESTE REGISTRO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    chkcancelado.setSelected(true);
                    c.setCancelado("S");
                    c.setId_cliente((int) TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 0));
                    c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    ClienteDAO.getInstance().cancelar(c); 
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UM COLABORADOR PARA CANCELAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnome.requestFocus();
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
        DefaultTableModel modelo  = (DefaultTableModel) TabelaCliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO clientedao = new ClienteDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Cliente c: clientedao.read()){
            limiteanterior  = c.getLimitecredito(); 
            modelo.addRow(new Object[]{                
                c.getId_cliente(),
                c.getNome(),
                c.getRazaosocial(),
                c.getCpf(),
                c.getCnpj(),
                c.getInscricaoestadual(),
                c.getInscricaomunicipal(),
                df.format(c.getDtnascimentofundacao()),
                c.getGenero(),
                c.getEstadocivil(),
                c.getNomeconjuge(),
                c.getNomemae(),
                c.getNomepai(),
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
                c.getAtividadeprofissional(),
                c.getLimitecredito(),
                c.getSaldo(),
                c.getAtivo(),
                c.getCodigomigracao(),
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
        DefaultTableModel modelo = (DefaultTableModel) TabelaCliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO clientedao = new ClienteDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        List<Cliente> cliente = clientedao.readForNome(desc);
        if (!cliente.isEmpty()) {
            for (Cliente c : clientedao.readForNome(desc)) {
                modelo.addRow(new Object[]{
                    c.getId_cliente(),
                    c.getNome(),
                    c.getRazaosocial(),
                    c.getCpf(),
                    c.getCnpj(),
                    c.getInscricaoestadual(),
                    c.getInscricaomunicipal(),
                    df.format(c.getDtnascimentofundacao()),
                    c.getGenero(),
                    c.getEstadocivil(),
                    c.getNomeconjuge(),
                    c.getNomemae(),
                    c.getNomepai(),
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
                    c.getAtividadeprofissional(),
                    c.getLimitecredito(),
                    c.getSaldo(),
                    c.getAtivo(),
                    c.getCodigomigracao(),
                    c.getUsuariocadastro(),
                    df.format(c.getDtcadastro()),
                    c.getUsuarioalteracao(),
                    df.format(c.getDtalteracao()),
                    c.getCancelado()
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO. ", "ENTERPRISE - INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            readTable();
        }
        limparCampos();
    }
    
    
    public void readTableForId(int Id) {
        DefaultTableModel modelo = (DefaultTableModel) TabelaCliente.getModel();
        modelo.setNumRows(0);
        ClienteDAO clientedao = new ClienteDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Cliente c = clientedao.readForId(Id);
        if (c != null){
            modelo.addRow(new Object[]{
                c.getId_cliente(),
                c.getNome(),
                c.getRazaosocial(),
                c.getCpf(),
                c.getCnpj(),
                c.getInscricaoestadual(),
                c.getInscricaomunicipal(),
                df.format(c.getDtnascimentofundacao()),
                c.getGenero(),
                c.getEstadocivil(),
                c.getNomeconjuge(),
                c.getNomemae(),
                c.getNomepai(),
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
                c.getAtividadeprofissional(),
                c.getLimitecredito(),
                c.getSaldo(),
                c.getAtivo(),
                c.getCodigomigracao(),
                c.getUsuariocadastro(),
                df.format(c.getDtcadastro()),
                c.getUsuarioalteracao(),
                df.format(c.getDtalteracao()),
                c.getCancelado()
            });
        } else {
            JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO. ", "ENTERPRISE - INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            readTable();
        }
    }
    
    
     public void imprimir(){
        ClienteDAO clientedao = new ClienteDAO();
        clientedao.imprimir();
        limparCampos();
    }
    
    public void passagemderegistros(){ //Metodo para a passagem de Registros 
        if (TabelaCliente.getSelectedRow()!= -1){
            ClienteDAO clientedao = new ClienteDAO();
            ColaboradorDAO colaboradordao = new ColaboradorDAO();
            txtid_cliente.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 0).toString());
            txtnome.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 1).toString());
            txtrazaosocial.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 2).toString());
            txtcpf.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 3).toString());
            txtcnpj.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 4).toString());
            txtinscricaoestadual.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 5).toString());
            txtinscricaomunicipal.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 6).toString());
            
            txtdtnascimentofundacao.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 7).toString());
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 8).toString().equals("M")){
                combogenero.setSelectedIndex(1);
            }
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 8).toString().equals("F")) {
               combogenero.setSelectedIndex(2);
            }   
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 9).toString().equals("CASADO")){
                comboestadocivil.setSelectedIndex(1);
            }
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 9).toString().equals("DIVORCIADO")) {
               comboestadocivil.setSelectedIndex(2);
            }   
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 9).toString().equals("SOLTEIRO")) {
               comboestadocivil.setSelectedIndex(3);
            }   
            txtnomeconjuge.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 10).toString());
            txtnomemae.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 11).toString());
            txtnomepai.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 12).toString());
            txtendereco.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),13).toString());
            txtbairro.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 14).toString());
            txtcomplemento.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 15).toString());
            txtcidade.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 16).toString());
            
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("AC")){
                combouf.setSelectedIndex(1);
            }
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("AL")) {
               combouf.setSelectedIndex(2);
            }       
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("AP")) {
                combouf.setSelectedIndex(3);
            } 
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("AM")) {
                combouf.setSelectedIndex(4);
            }
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("BA")) {
                combouf.setSelectedIndex(5);
            }           
            if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("CE")) {
                combouf.setSelectedIndex(6);
            }      
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("DF")) {
                combouf.setSelectedIndex(7);
            }
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("ES")) {
                combouf.setSelectedIndex(8);
           }
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("GO")) {
                combouf.setSelectedIndex(9);
           } 
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("MA")) {
                combouf.setSelectedIndex(10);
           }        
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("MT")) {
                combouf.setSelectedIndex(11);
           }       
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("MS")) {
                combouf.setSelectedIndex(12);
           }        
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("MG")) {
                combouf.setSelectedIndex(13);
           }  
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("PA")) {
                combouf.setSelectedIndex(14);
           }        
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("PB")) {
                combouf.setSelectedIndex(15);
           }        
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("PR")) {
                combouf.setSelectedIndex(16);
           }        
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("PE")) {
                combouf.setSelectedIndex(17);
           }      
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("PI")) {
                combouf.setSelectedIndex(18);
           }     
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("RJ")) {
                combouf.setSelectedIndex(19);
           }      
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("RN")) {
                combouf.setSelectedIndex(20);
           }      
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("RS")) {
                combouf.setSelectedIndex(21);
           }       
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("RO")) {
                combouf.setSelectedIndex(22);
           }      
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("RR")) {
                combouf.setSelectedIndex(23);
           } 
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("SC")) {
                combouf.setSelectedIndex(24);
           } 
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("SP")) {
                combouf.setSelectedIndex(25);
           }      
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("SE")) {
                combouf.setSelectedIndex(26);
           }      
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 17).toString().equals("TO")) {
                combouf.setSelectedIndex(27);
           }      
           txtcep.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 18).toString());
           txttelefone1.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 19).toString());
           txttelefone2.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 20).toString());
           txttelefone3.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 21).toString());
           txtemail.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 22).toString());
           txtatividadeprofissional.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 23).toString());
           txtlimitecredito.setText(Util.formatarDecimalBR(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 24)));
           txtsaldo.setText(Util.formatarDecimalBR(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 25)));
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 26).toString().equals("S")){
               chkativo.setSelected(true);
               
           }else {
               chkativo.setSelected(false);
           }
           txtcodigomigracao.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 27).toString());
           
           if(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 28).toString().equals("0")){
              txtusuariocadastro.setText("ADMINISTRADOR");
           } else {
              txtusuariocadastro.setText(colaboradordao.pesquisaId_Colaborador(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 28).toString()));
           }
           txtdtcadastro.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 29).toString());
           if(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 30).toString().equals("0")){
              txtusuarioalteracao.setText("ADMINISTRADOR");
           } else {   
             txtusuarioalteracao.setText(colaboradordao.pesquisaId_Colaborador(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 30).toString()));
           }             
           txtdtalteracao.setText(TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 31).toString());
           if (TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(), 32).toString().equals("S")){
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
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnlimparcampos1;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JCheckBox chkativo;
    private javax.swing.JCheckBox chkcancelado;
    private javax.swing.JComboBox<String> comboestadocivil;
    private javax.swing.JComboBox<String> combogenero;
    private javax.swing.JComboBox<String> combouf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPConfigSistema1;
    private javax.swing.JLabel lblatividadeprofissional;
    private javax.swing.JLabel lblbairro;
    private javax.swing.JLabel lblcep;
    private javax.swing.JLabel lblcidade;
    private javax.swing.JLabel lblcnpj;
    private javax.swing.JLabel lblcodigomigracao;
    private javax.swing.JLabel lblcomplemento;
    private javax.swing.JLabel lblcpf;
    private javax.swing.JLabel lbldtalteracao;
    private javax.swing.JLabel lbldtcadastro;
    private javax.swing.JLabel lbldtnascimentofundacao;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblestadocivil;
    private javax.swing.JLabel lblgenero;
    private javax.swing.JLabel lblid_cliente;
    private javax.swing.JLabel lblinscricaoestadual;
    private javax.swing.JLabel lblinscricaomunicipal;
    private javax.swing.JLabel lbllimitecredito;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblnomeconjuge;
    private javax.swing.JLabel lblnomemae;
    private javax.swing.JLabel lblnomepai;
    private javax.swing.JLabel lblrazaosocial;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JLabel lbltelefone1;
    private javax.swing.JLabel lbltelefone2;
    private javax.swing.JLabel lbltelefone3;
    private javax.swing.JLabel lbluf;
    private javax.swing.JLabel lblusuarioalteracao;
    private javax.swing.JLabel lblusuariocadastro;
    private javax.swing.JTextField txtatividadeprofissional;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JTextField txtcodigomigracao;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JFormattedTextField txtdtalteracao;
    private javax.swing.JFormattedTextField txtdtcadastro;
    private javax.swing.JFormattedTextField txtdtnascimentofundacao;
    private javax.swing.JFormattedTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtid_cliente;
    private javax.swing.JTextField txtinscricaoestadual;
    private javax.swing.JFormattedTextField txtinscricaomunicipal;
    private javax.swing.JFormattedTextField txtlimitecredito;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnomeconjuge;
    private javax.swing.JTextField txtnomemae;
    private javax.swing.JTextField txtnomepai;
    private javax.swing.JTextField txtrazaosocial;
    private javax.swing.JFormattedTextField txtsaldo;
    private javax.swing.JFormattedTextField txttelefone1;
    private javax.swing.JFormattedTextField txttelefone2;
    private javax.swing.JFormattedTextField txttelefone3;
    private javax.swing.JFormattedTextField txtusuarioalteracao;
    private javax.swing.JFormattedTextField txtusuariocadastro;
    // End of variables declaration//GEN-END:variables
}
