
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
import model.bean.Colaborador;
import model.dao.ColaboradorDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import model.bean.Funcao;
import model.bean.Senha;
import model.dao.FuncaoDAO;
import model.dao.SenhaDAO;
import util.Util;



public class ViewColaborador extends javax.swing.JInternalFrame {

    public String nomereduzido;
    public ViewColaborador() {
         initComponents();
         DefaultTableModel modelo = (DefaultTableModel) TabelaColaborador.getModel();
         TabelaColaborador.setRowSorter(new TableRowSorter(modelo));
         readTable();
         carregarComboFuncao();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JTabbedPane();
        AbaDadosPessoais = new javax.swing.JDesktopPane();
        PainelDadosPessoais = new javax.swing.JPanel();
        lblidcolaborador = new javax.swing.JLabel();
        txtidcolaborador = new javax.swing.JTextField();
        lblnome = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        lblnomereduzido = new javax.swing.JLabel();
        txtnomereduzido = new javax.swing.JTextField();
        lblcpf = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        lblrg = new javax.swing.JLabel();
        txtrg = new javax.swing.JTextField();
        lbldtnascimento = new javax.swing.JLabel();
        txtdtnascimento = new javax.swing.JFormattedTextField();
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
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JFormattedTextField();
        AbaVinculo = new javax.swing.JDesktopPane();
        jPConfigSistema = new javax.swing.JPanel();
        lbldtadmissao = new javax.swing.JLabel();
        txtdtadmissao = new javax.swing.JFormattedTextField();
        lbldtdemissao = new javax.swing.JLabel();
        txtdtdemissao = new javax.swing.JFormattedTextField();
        lblfuncao = new javax.swing.JLabel();
        combofuncao = new javax.swing.JComboBox<>();
        chkfiscal = new javax.swing.JCheckBox();
        chkativo = new javax.swing.JCheckBox();
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
        btnincluir = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        PainelTabela = new javax.swing.JScrollPane();
        TabelaColaborador = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnlimparcampos1 = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("ENTERPRISE - CADASTRO DE COLABORADOR");

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

        lblidcolaborador.setText("Matricula:");

        txtidcolaborador.setEditable(false);

        lblnome.setText("Nome:");

        txtnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnomeFocusGained(evt);
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

        lblnomereduzido.setText("Nome Reduzido:");

        txtnomereduzido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnomereduzidoFocusGained(evt);
            }
        });
        txtnomereduzido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomereduzidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomereduzidoKeyTyped(evt);
            }
        });

        lblcpf.setText("C.P.F......:");

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
        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
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

        lblrg.setText("R.G:");

        txtrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrgActionPerformed(evt);
            }
        });
        txtrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrgKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrgKeyTyped(evt);
            }
        });

        lbldtnascimento.setText("Data Nascimento:");

        try {
            txtdtnascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtnascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdtnascimentoFocusLost(evt);
            }
        });
        txtdtnascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdtnascimentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdtnascimentoKeyTyped(evt);
            }
        });

        lblgenero.setText("Genero:");

        combogenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "MASCULINO", "FEMININO" }));
        combogenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combogeneroFocusLost(evt);
            }
        });
        combogenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combogeneroKeyPressed(evt);
            }
        });

        lblestadocivil.setText("Estado Civil:");

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

        lblnomepai.setText("Pai........:");

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
                .addContainerGap()
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnomepai, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblnomemae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(793, 793, 793))
                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(lblidcolaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidcolaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblnome))
                            .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblnomeconjuge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblcpf, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lblrg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                                                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbldtnascimento)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtdtnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblgenero)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblestadocivil)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblnomereduzido)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtnomereduzido))))
                                    .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtnomepai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                                        .addComponent(txtnomemae, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnomeconjuge, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PainelDadosPessoaisLayout.setVerticalGroup(
            PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDadosPessoaisLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidcolaborador)
                    .addComponent(lblnome)
                    .addComponent(lblnomereduzido)
                    .addComponent(txtidcolaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnomereduzido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcpf)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrg)
                    .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtnascimento)
                    .addComponent(txtdtnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgenero)
                    .addComponent(combogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestadocivil)
                    .addComponent(comboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomeconjuge)
                    .addComponent(txtnomeconjuge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomemae)
                    .addComponent(txtnomemae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomepai)
                    .addComponent(txtnomepai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
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
        });

        lblcomplemento.setText("Complemento:");

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

        lbluf.setText("Estado.:");

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

        lbltelefone1.setText("Celular.:");

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

        lbltelefone2.setText("Telefone Fixo....:");

        try {
            txttelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefone2ActionPerformed(evt);
            }
        });
        txttelefone2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefone2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefone2KeyTyped(evt);
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
                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                                        .addComponent(lbltelefone1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txttelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbltelefone2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                                        .addComponent(lblcidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbluf)
                                    .addComponent(lblemail)))
                            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                                .addComponent(lblbairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblcomplemento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcomplemento)
                            .addComponent(txtemail)
                            .addGroup(PainelEnderecoLayout.createSequentialGroup()
                                .addComponent(combouf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblcep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblendereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        AbaDadosPessoais.setLayer(PainelDadosPessoais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AbaDadosPessoais.setLayer(PainelEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AbaDadosPessoaisLayout = new javax.swing.GroupLayout(AbaDadosPessoais);
        AbaDadosPessoais.setLayout(AbaDadosPessoaisLayout);
        AbaDadosPessoaisLayout.setHorizontalGroup(
            AbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbaDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PainelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE))
                .addContainerGap())
        );
        AbaDadosPessoaisLayout.setVerticalGroup(
            AbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbaDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelPrincipal.addTab("Dados Pessoais", AbaDadosPessoais);

        AbaVinculo.setBackground(new java.awt.Color(240, 240, 240));

        jPConfigSistema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbldtadmissao.setText("Data de Admissão:");

        try {
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_');
            try {
                txtdtadmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtadmissao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdtadmissaoFocusLost(evt);
            }
        });
        txtdtadmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtadmissaoActionPerformed(evt);
            }
        });
        txtdtadmissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdtadmissaoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdtadmissaoKeyTyped(evt);
            }
        });

        lbldtdemissao.setText("Data Demissão:");

        try {
            txtdtdemissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtdemissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdtdemissaoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdtdemissaoKeyTyped(evt);
            }
        });

        lblfuncao.setText("Função:");

        combofuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Função" }));
        combofuncao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combofuncaoFocusLost(evt);
            }
        });
        combofuncao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combofuncaoKeyPressed(evt);
            }
        });

        chkfiscal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkfiscal.setText("FISCAL DE LOJA");
        chkfiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkfiscalActionPerformed(evt);
            }
        });
        chkfiscal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkfiscalKeyPressed(evt);
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

        javax.swing.GroupLayout jPConfigSistemaLayout = new javax.swing.GroupLayout(jPConfigSistema);
        jPConfigSistema.setLayout(jPConfigSistemaLayout);
        jPConfigSistemaLayout.setHorizontalGroup(
            jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbldtadmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdtadmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldtdemissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdtdemissao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combofuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkativo)
                    .addComponent(chkfiscal))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPConfigSistemaLayout.setVerticalGroup(
            jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdtdemissao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldtadmissao)
                        .addComponent(txtdtadmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbldtdemissao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblfuncao)
                        .addComponent(combofuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkfiscal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkativo)
                .addGap(59, 59, 59))
        );

        AbaVinculo.add(jPConfigSistema);
        jPConfigSistema.setBounds(10, 11, 930, 120);

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
                .addContainerGap(214, Short.MAX_VALUE))
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

        AbaVinculo.add(jPConfigSistema1);
        jPConfigSistema1.setBounds(10, 140, 930, 100);

        PainelPrincipal.addTab("Vinculo na Empresa", AbaVinculo);

        PainelAcao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnincluir.setBackground(new java.awt.Color(255, 153, 153));
        btnincluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-plus-16.png"))); // NOI18N
        btnincluir.setText("INCLUIR");
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

        TabelaColaborador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabelaColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRÍCULA", "NOME", "NOME REDUZIDO", "CPF", "R.G", "DT. NASCIMENTO", "GÊNERO", "ESTADO CÍVIL", "CONJUGE", "MÃE", "PAI", "ENDEREÇO", "BAIRRO", "COMPLEMENTO", "CIDADE", "ESTADO", "CEP", "TELEFONE 1", "TELEFONE 2", "E-MAIL", "DT ADMISSÃO", "DT DEMISSÃO", "FUNÇÃO", "FISCAL DE LOJA ", "ATIVO", "CADASTRADO POR", "DT CADASTRO", "ALTERADO POR", "DT ALTERAÇÃO", "CANCELADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaColaborador.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaColaborador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaColaboradorMouseClicked(evt);
            }
        });
        TabelaColaborador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabelaColaboradorKeyPressed(evt);
            }
        });
        PainelTabela.setViewportView(TabelaColaborador);

        jLabel1.setText("APENAS NÚMEROS PESQUISA POR MATRICULA  E APENAS LETRAS POR NOME");
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
                        .addContainerGap()
                        .addComponent(PainelTabela))
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(txtbuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimparcampos1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelAcaoLayout.setVerticalGroup(
            PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAcaoLayout.createSequentialGroup()
                .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addComponent(PainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnincluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelAcaoLayout.createSequentialGroup()
                        .addComponent(btnlimparcampos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        PainelPrincipal.getAccessibleContext().setAccessibleName("Dados Pessoais");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnincluirActionPerformed
        incluir();
    }//GEN-LAST:event_btnincluirActionPerformed

    
    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        try {
            cancelar();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ViewColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtcpfActionPerformed
 
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
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtemail.requestFocus();
         }
    }//GEN-LAST:event_txttelefone2KeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PainelPrincipal.setSelectedIndex(1);
            txtdtadmissao.requestFocus();
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtdtadmissaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtadmissaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          txtdtdemissao.requestFocus();
        }
    }//GEN-LAST:event_txtdtadmissaoKeyPressed

    private void txtdtdemissaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtdemissaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           combofuncao.requestFocus();
        }
    }//GEN-LAST:event_txtdtdemissaoKeyPressed

    private void txtdtadmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtadmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtadmissaoActionPerformed

    private void PainelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PainelPrincipalMouseClicked
         if (PainelPrincipal.getSelectedIndex() == 0 ){
            txtnome.requestFocus();
         }else{
            txtdtadmissao.requestFocus();
         } 
    }//GEN-LAST:event_PainelPrincipalMouseClicked
    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
        if (util.Util.ValidaEmail(txtemail.getText()) == false) {
            JOptionPane.showMessageDialog(null, "E-MAIL INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
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
        if (txttelefone1.getText().trim().length() < 11) {
            JOptionPane.showMessageDialog(null, "TELEFONE INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txttelefone1.requestFocus();
        }
    }//GEN-LAST:event_txttelefone1FocusLost

    private void btnincluirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnincluirFocusGained
        //btnincluir.setBackground(new Color(255,153,153));
        btnincluir.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnincluirFocusGained

    private void btnincluirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnincluirFocusLost
       btnincluir.setBackground(new Color(255,153,153));
       //btnincluir.setBackground(Color.LIGHT_GRAY);
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

    private void btnincluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnincluirKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            incluir();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
               btnatualizar.requestFocus();
        } 
        if(evt.getKeyCode() == KeyEvent.VK_UP){
               btnbuscar.requestFocus();
        }
    }//GEN-LAST:event_btnincluirKeyPressed
    private void btnatualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnatualizarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
                btncancelar.requestFocus();
        } else { 
            if(evt.getKeyCode() == KeyEvent.VK_UP){
                btnincluir.requestFocus();
            }
        }
    }//GEN-LAST:event_btnatualizarKeyPressed
    private void btncancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncancelarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnbuscar.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP){
            btnatualizar.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try { 
                cancelar();
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ViewColaborador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btncancelarKeyPressed

    private void txtrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrgActionPerformed

    private void txtdtnascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtnascimentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            combogenero.requestFocus();
        }
    }//GEN-LAST:event_txtdtnascimentoKeyPressed

    private void combogeneroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combogeneroFocusLost
     if (combogenero.getSelectedItem().equals("Selecione")){
        JOptionPane.showMessageDialog(null, "SELECIONE UM GÊNERO !" , "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        combogenero.requestFocus();
     }
    }//GEN-LAST:event_combogeneroFocusLost

    private void combogeneroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combogeneroKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            comboestadocivil.requestFocus();
       }
    }//GEN-LAST:event_combogeneroKeyPressed

    private void comboestadocivilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboestadocivilFocusLost
     if (comboestadocivil.getSelectedItem().equals("Selecione")){
        JOptionPane.showMessageDialog(null, "SELECIONE O ESTADO CÍVIL !" , "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        comboestadocivil.requestFocus();
     }
    }//GEN-LAST:event_comboestadocivilFocusLost

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

    private void combofuncaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combofuncaoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           chkfiscal.requestFocus();
         }
    }//GEN-LAST:event_combofuncaoKeyPressed

    private void txtdtcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtcadastroActionPerformed

    private void txtdtalteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtalteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtalteracaoActionPerformed

    private void txtusuariocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuariocadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuariocadastroActionPerformed

    private void chkfiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkfiscalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkfiscalActionPerformed

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
            btnincluir.requestFocus();
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
         if (util.Util.ValidacpfCnpj(txtcpf.getText().replaceAll("\\D", "")) ==  false) {
               // JOptionPane.showMessageDialog(null, "ERRO ! CPF INCORRETO OU INVÁLIDO ...");
               JOptionPane.showMessageDialog(null, "CPF INCORRETO OU INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
               txtcpf.requestFocus();
         }
    }//GEN-LAST:event_txtcpfFocusLost

    private void txtcpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtrg.requestFocus();
        }
    }//GEN-LAST:event_txtcpfKeyPressed

    private void txtrgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrgKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtdtnascimento.requestFocus();
        }
    }//GEN-LAST:event_txtrgKeyPressed

    private void txtrgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrgKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-/.[] ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtrgKeyTyped

    private void txtdtnascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdtnascimentoFocusLost
       if(! Util.verificarDataNasc(txtdtnascimento.getText()) || txtdtnascimento.getText().replaceAll("\\D", "").isEmpty()){
          JOptionPane.showMessageDialog(null, "DATA ESTÁ INCORRETA OU É INVÁLIDA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
          txtdtnascimento.requestFocus();
       }
    }//GEN-LAST:event_txtdtnascimentoFocusLost

    private void txttelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefone2ActionPerformed

    private void txtdtadmissaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdtadmissaoFocusLost
       if(txtdtadmissao.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "CAMPO DATA DE ADMISSÃO É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
           txtdtadmissao.requestFocus();
        } 
    }//GEN-LAST:event_txtdtadmissaoFocusLost

    private void combofuncaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combofuncaoFocusLost
        if (combofuncao.getSelectedItem().equals("Selecione a Função")){
           JOptionPane.showMessageDialog(null, "SELECIONE UMA FUNÇÃO É OBRIGATÓRIO O PREENCHIMENTO !" , "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
           combofuncao.requestFocus();
        }
    }//GEN-LAST:event_combofuncaoFocusLost

    private void chkfiscalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkfiscalKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            chkativo.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            chkativo.requestFocus();
        }
    }//GEN-LAST:event_chkfiscalKeyPressed

    private void chkativoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkativoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           btnincluir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            btnincluir.requestFocus();
        }
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            btnincluir.requestFocus();
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

    private void txtnomemaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomemaeFocusLost
        if(txtnomemae.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "CAMPO NOME DA MÃE É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
           txtnomemae.requestFocus();
        } 
    }//GEN-LAST:event_txtnomemaeFocusLost

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
        if(txtendereco.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "CAMPO ENDEREÇO É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
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
        if(txtbairro.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "CAMPO BAIRRO É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE); 
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
            txtnomereduzido.requestFocus();
        }
    }//GEN-LAST:event_txtnomeKeyPressed

    private void txtnomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtnomeKeyTyped

    private void txtnomereduzidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomereduzidoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcpf.requestFocus();
        }
    }//GEN-LAST:event_txtnomereduzidoKeyPressed

    private void txtnomereduzidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomereduzidoKeyTyped
        String caracteres="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtnomereduzidoKeyTyped

    private void PainelPrincipalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PainelPrincipalFocusGained
//        if (PainelPrincipal.getSelectedIndex() == 0 ){
//            txtnome.requestFocus();
//        }else{
//           txtdtadmissao.requestFocus();
//        } 
          txtdtadmissao.requestFocus();
    }//GEN-LAST:event_PainelPrincipalFocusGained

    private void TabelaColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaColaboradorMouseClicked
         passagemderegistros();
    }//GEN-LAST:event_TabelaColaboradorMouseClicked

    private void TabelaColaboradorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaColaboradorKeyPressed
        passagemderegistros();
    }//GEN-LAST:event_TabelaColaboradorKeyPressed

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
            btnincluir.requestFocus();
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

    private void txtcepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyTyped
        String caracteres="0123456789";
        if(!caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtcepKeyTyped

    private void txtnomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeFocusGained
        if (txtnome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CAMPO NOME É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnome.requestFocus();
        }
    }//GEN-LAST:event_txtnomeFocusGained

    private void txtnomereduzidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomereduzidoFocusGained
        if (txtnomereduzido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CAMPO NOME REDUZIDO É OBRIGATÓRIO O PREENCHIMENTO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnomereduzido.requestFocus();
        }
        if (txtnomereduzido.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "CAMPO NOME REDUZIDO DEVERÁ CONTER APENAS 15 LETRAS OU NÚMEROS SEM ESPAÇOS !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnomereduzido.requestFocus();
        } 
    }//GEN-LAST:event_txtnomereduzidoFocusGained

    private void txtdtnascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtnascimentoKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdtnascimentoKeyTyped

    private void txtcomplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomplementoKeyTyped
        String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-/[](),.: ";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcomplementoKeyTyped

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

    private void txtdtadmissaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtadmissaoKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdtadmissaoKeyTyped

    private void txtdtdemissaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtdemissaoKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdtdemissaoKeyTyped
    
        
    
    //*************************** Código Limpo **************************************************
    
   
     public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
        txtnome.requestFocus();
    }   
    
    public void limparCampos() {
        txtnome.requestFocus();
        txtidcolaborador.setText("");           
        txtnome.setText("");
        txtnomereduzido.setText("");
        txtcpf.setText("");
        txtrg.setText("");
        txtdtnascimento.setText("");
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
        txtemail.setText("");
        txtdtadmissao.setText("");
        txtdtdemissao.setText("");
        combofuncao.setSelectedIndex(0);
        chkfiscal.setSelected(false);
        chkativo.setSelected(false);
        txtusuariocadastro.setText("");
        txtdtcadastro.setText("");
        txtusuarioalteracao.setText("");
        txtdtalteracao.setText("");
        chkcancelado.setSelected(false);
        txtbuscar.setText("");
        
    }
    
    public void incluir() {
        if (txtnome.getText().trim().isEmpty() || txtnomereduzido.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "CAMPO NOME E NOME REDUZIDO É OBRIGATÓRIO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnome.requestFocus();
        }else{
             int resposta = JOptionPane.showConfirmDialog(null,"CONFIRMA A INCLUSÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
             if (resposta == JOptionPane.YES_OPTION) {
                Date dataSistema = new Date();
                Colaborador                 c = new Colaborador();
                ColaboradorDAO colaboradordao = new ColaboradorDAO();
                FuncaoDAO           funcaodao = new FuncaoDAO();
                Funcao              funcao    = new Funcao();
                c.setNome(txtnome.getText().toUpperCase());
                if(colaboradordao.pesquisaNomeReduzido(txtnomereduzido.getText().toUpperCase())== null){
                   c.setNomereduzido(txtnomereduzido.getText().toUpperCase());
                }else{
                    JOptionPane.showMessageDialog(null, "NOME REDUZIDO JÁ EXISTE, ESCOLHA OUTRO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);           
                    txtnomereduzido.requestFocus();
                }
                c.setCpf(txtcpf.getText().replaceAll("\\D", ""));
                c.setRg(txtrg.getText());
                c.setDtnascimento(Util.formatarDataUS(txtdtnascimento.getText()));
                if (combogenero.getSelectedItem().equals("MASCULINO")){
                    c.setGenero("M");
                }
                if (combogenero.getSelectedItem().equals("FEMININO")){
                    c.setGenero("F");
                }
                c.setEstadocivil(comboestadocivil.getSelectedItem().toString());
                c.setNomeconjuge(txtnomeconjuge.getText().toUpperCase());
                c.setNomemae(txtnomemae.getText().toUpperCase());
                c.setNomepai(txtnomepai.getText().toUpperCase());
                c.setEndereco(txtendereco.getText().toUpperCase());
                c.setBairro(txtbairro.getText().toUpperCase());
                c.setComplemento(txtcomplemento.getText().toUpperCase());
                c.setCidade(txtcidade.getText().toUpperCase());
                if (combouf.getSelectedItem().equals("Acre (AC)")){
                    c.setUf("AC");
                }
                if (combouf.getSelectedItem().equals("Alagoas (AL)")){
                    c.setUf("AL");
                }
                if (combouf.getSelectedItem().equals("Amapá (AP)")){
                    c.setUf("AP");
                }        
                if (combouf.getSelectedItem().equals("Amazonas (AM)")){
                    c.setUf("AM");
                }
                if (combouf.getSelectedItem().equals("Bahia (BA)")){
                    c.setUf("BA");
                }
                if (combouf.getSelectedItem().equals("Ceará (CE)")){
                    c.setUf("CE");
                }
                if (combouf.getSelectedItem().equals("Distrito Federal (DF)")){
                    c.setUf("DF");
                }  
                if (combouf.getSelectedItem().equals("Espirito Santo (ES)")){
                    c.setUf("ES");
                }  
                if (combouf.getSelectedItem().equals("Goiás (GO)")){
                    c.setUf("GO");
                }  
                if (combouf.getSelectedItem().equals("Maranhão (MA)")){
                    c.setUf("MA");
                }  
                if (combouf.getSelectedItem().equals("Mato Grosso (MT)")){
                    c.setUf("MT");
                }  
                if (combouf.getSelectedItem().equals("Mato Grosso do Sul (MS)")){
                   c.setUf("MS");
                }  
                if (combouf.getSelectedItem().equals("Minas Gerais (MG)")){
                   c.setUf("MG");
                }  
                if (combouf.getSelectedItem().equals("Pará (PA)")){
                   c.setUf("PA");
                }  
                if (combouf.getSelectedItem().equals("Paraiba (PB)")){
                    c.setUf("PB");
                }
                if (combouf.getSelectedItem().equals("Paraná (PR)")){
                    c.setUf("PR");
                }
                if (combouf.getSelectedItem().equals("Pernambuco (PE)")){
                    c.setUf("PE");
                }
                if (combouf.getSelectedItem().equals("Piauí (PI)")){
                    c.setUf("PI");
                } 
                if (combouf.getSelectedItem().equals("Rio de Janeiro (RJ)")){
                    c.setUf("RJ");
                }
                if (combouf.getSelectedItem().equals("Rio Grande do Norte (RN)")){
                    c.setUf("RN");
                }
                if (combouf.getSelectedItem().equals("Rio Grande do Sul (RS)")){
                    c.setUf("RS");
                }
                if (combouf.getSelectedItem().equals("Rodônia (RO)")){
                    c.setUf("RO");
                }
                if (combouf.getSelectedItem().equals("Roraima (RR)")){ 
                    c.setUf("RR");
                }
                if (combouf.getSelectedItem().equals("Santa Catarina (SC)")){ 
                    c.setUf("SC");
                }
                if (combouf.getSelectedItem().equals("São Paulo (SP)")){ 
                    c.setUf("SP");
                }
                if (combouf.getSelectedItem().equals("Sergipe (SE)")){ 
                    c.setUf("SE");
                }
                if (combouf.getSelectedItem().equals("Tocantins (TO)")){ 
                    c.setUf("TO");
                }
                c.setCep(txtcep.getText().replaceAll("\\D",""));
                c.setTelefone1(txttelefone1.getText().replaceAll("\\D",""));
                c.setTelefone2(txttelefone2.getText().replaceAll("\\D",""));
                c.setEmail(txtemail.getText().toLowerCase());
                c.setDtadmissao(Util.formatarDataUS(txtdtadmissao.getText()));
                c.setDtdemissao(Util.formatarDataUS("01/01/5000")); // AO INCLUIR PARA A DATA NÃO FICAR COMO NULA
                //c.setFuncao_id(funcaodao.pesquisaDesc(combofuncao.getSelectedItem().toString()));
                funcao.setId_funcao(funcaodao.pesquisaDesc(combofuncao.getSelectedItem().toString()));
                c.setFuncao(funcao);
                
                if (chkfiscal.isSelected()){
                    c.setFiscal("S");
                }else{
                    c.setFiscal("N");
                }
                if (chkativo.isSelected()){
                    c.setAtivo("S");
                }else{
                    c.setAtivo("N");
                }
                c.setUsuariocadastro(Integer.parseInt(ViewLogin.Id_Colaborador));
                c.setDtcadastro(Util.formatarDataPostgres(dataSistema));
                c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                c.setCancelado("N");
                //colaboradordao.create(c);
                ColaboradorDAO.getInstance().salvar(c);
                readTable();
             }  
        }
    }
    
    public void atualizar(){  // Metodo para atualizar o registro
        if (TabelaColaborador.getSelectedRow() != -1 ) {
           if (txtnome.getText().trim().isEmpty() || txtnomereduzido.getText().trim().isEmpty()){
              JOptionPane.showMessageDialog(null, "CAMPO NOME E NOME REDUZIDO É OBRIGATÓRIO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
              txtnome.requestFocus();
            } else {
                int resposta = JOptionPane.showConfirmDialog(null,"CONFIRMA A ALTERAÇÃO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    Date dataSistema = new Date();
                    Colaborador                 c = new Colaborador();
                    ColaboradorDAO colaboradordao = new ColaboradorDAO();
                    FuncaoDAO           funcaodao = new FuncaoDAO();
                    Funcao              funcao    = new Funcao();
                    c.setId_colaborador((int)TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(),0));
                    c.setNome(txtnome.getText().toUpperCase());
                    if (colaboradordao.pesquisaNomeReduzido(txtnomereduzido.getText().toUpperCase()) == null) {
                        c.setNomereduzido(txtnomereduzido.getText().toUpperCase());
                    } else {
                        c.setNomereduzido(nomereduzido); // VARIAVEL PARA PRESERVAR O NOMEREDUZIDO CASO O NOVO EXISTA
                    }
                    c.setCpf(txtcpf.getText().replaceAll("\\D", ""));
                    c.setRg(txtrg.getText());
                    c.setDtnascimento(Util.formatarDataUS(txtdtnascimento.getText()));
                    if (combogenero.getSelectedItem().equals("MASCULINO")){
                       c.setGenero("M");
                    }
                    if (combogenero.getSelectedItem().equals("FEMININO")){
                       c.setGenero("F");
                    }
                    c.setEstadocivil(comboestadocivil.getSelectedItem().toString());
                    c.setNomeconjuge(txtnomeconjuge.getText().toUpperCase());
                    c.setNomemae(txtnomemae.getText().toUpperCase());
                    c.setNomepai(txtnomepai.getText().toUpperCase());
                    c.setEndereco(txtendereco.getText().toUpperCase());
                    c.setBairro(txtbairro.getText().toUpperCase());
                    c.setComplemento(txtcomplemento.getText().toUpperCase());
                    c.setCidade(txtcidade.getText().toUpperCase());
                    if (combouf.getSelectedItem().equals("Acre (AC)")){
                        c.setUf("AC");
                    }
                    if (combouf.getSelectedItem().equals("Alagoas (AL)")){
                        c.setUf("AL");
                    }
                    if (combouf.getSelectedItem().equals("Amapá (AP)")){
                        c.setUf("AP");
                    }        
                    if (combouf.getSelectedItem().equals("Amazonas (AM)")){
                        c.setUf("AM");
                    }
                    if (combouf.getSelectedItem().equals("Bahia (BA)")){
                        c.setUf("BA");
                    }
                    if (combouf.getSelectedItem().equals("Ceará (CE)")){
                        c.setUf("CE");
                    }
                    if (combouf.getSelectedItem().equals("Distrito Federal (DF)")){
                        c.setUf("DF");
                    }  
                    if (combouf.getSelectedItem().equals("Espirito Santo (ES)")){
                        c.setUf("ES");
                    }  
                    if (combouf.getSelectedItem().equals("Goiás (GO)")){
                        c.setUf("GO");
                    }  
                    if (combouf.getSelectedItem().equals("Maranhão (MA)")){
                        c.setUf("MA");
                    }  
                    if (combouf.getSelectedItem().equals("Mato Grosso (MT)")){
                        c.setUf("MT");
                    }  
                    if (combouf.getSelectedItem().equals("Mato Grosso do Sul (MS)")){
                       c.setUf("MS");
                    }  
                    if (combouf.getSelectedItem().equals("Minas Gerais (MG)")){
                       c.setUf("MG");
                    }  
                    if (combouf.getSelectedItem().equals("Pará (PA)")){
                       c.setUf("PA");
                    }  
                    if (combouf.getSelectedItem().equals("Paraiba (PB)")){
                        c.setUf("PB");
                    }
                    if (combouf.getSelectedItem().equals("Paraná (PR)")){
                        c.setUf("PR");
                    }
                    if (combouf.getSelectedItem().equals("Pernambuco (PE)")){
                        c.setUf("PE");
                    }
                    if (combouf.getSelectedItem().equals("Piauí (PI)")){
                        c.setUf("PI");
                    } 
                    if (combouf.getSelectedItem().equals("Rio de Janeiro (RJ)")){
                        c.setUf("RJ");
                    }
                    if (combouf.getSelectedItem().equals("Rio Grande do Norte (RN)")){
                        c.setUf("RN");
                    }
                    if (combouf.getSelectedItem().equals("Rio Grande do Sul (RS)")){
                        c.setUf("RS");
                    }
                    if (combouf.getSelectedItem().equals("Rodônia (RO)")){
                        c.setUf("RO");
                    }
                    if (combouf.getSelectedItem().equals("Roraima (RR)")){ 
                        c.setUf("RR");
                    }
                    if (combouf.getSelectedItem().equals("Santa Catarina (SC)")){ 
                        c.setUf("SC");
                    }
                    if (combouf.getSelectedItem().equals("São Paulo (SP)")){ 
                        c.setUf("SP");
                    }
                    if (combouf.getSelectedItem().equals("Sergipe (SE)")){ 
                        c.setUf("SE");
                    }
                    if (combouf.getSelectedItem().equals("Tocantins (TO)")){ 
                        c.setUf("TO");
                    }
                    c.setCep(txtcep.getText().replaceAll("\\D",""));
                    c.setTelefone1(txttelefone1.getText().replaceAll("\\D",""));
                    c.setTelefone2(txttelefone2.getText().replaceAll("\\D",""));
                    c.setEmail(txtemail.getText().toLowerCase());
                    c.setDtadmissao(Util.formatarDataUS(txtdtadmissao.getText()));
                    c.setDtdemissao(Util.formatarDataUS(txtdtdemissao.getText()));
                    //c.setFuncao_id(funcaodao.pesquisaDesc(combofuncao.getSelectedItem().toString()));
                    funcao.setId_funcao(funcaodao.pesquisaDesc(combofuncao.getSelectedItem().toString()));
                    c.setFuncao(funcao); 
                    
                    if (chkfiscal.isSelected()){
                        c.setFiscal("S");
                    }else{
                        c.setFiscal("N");
                    }
                    if (chkativo.isSelected()){
                        c.setAtivo("S");
                    }else{
                        c.setAtivo("N");
                    }
                    c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    
                   //*****************************************************************
                   // DEVIDO A ALTERAÇÃO PARA O HIBERNATE ESTAMOS INFORMANDO TODOS OS 
                   // CAMPOS MESMO QUE NÃO HAJA NECESSIDADE
                   //*******************************************************************
                    if(txtusuariocadastro.getText() == "ADMINISTRADOR"){
                      c.setUsuariocadastro(0);
                    }else{
                      c.setUsuariocadastro(c.getUsuariocadastro());
                    }
                    c.setDtcadastro(Util.formatarDataUS(txtdtcadastro.getText()));
                    if (chkcancelado.isSelected()){
                        c.setCancelado("S");
                    } else {
                        c.setCancelado("N");
                    }
                    //*******************************************************************
                    //colaboradordao.update(c);
                    ColaboradorDAO.getInstance().salvar(c);
                    readTable();
                }
           }
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UM COLABORADOR PARA ALTERAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnome.requestFocus();
        }
        readTable();
    }
    
    
    public void cancelar() throws UnsupportedEncodingException {   // ESTE MÉTODO CANCELA O COLABORADOR E TAMBÉM A SENHA NA TABELA SENHAS
        if (TabelaColaborador.getSelectedRow() != -1) {
            Date              dataSistema = new Date();
            Colaborador                 c = new Colaborador();
           // ColaboradorDAO colaboradordao = new ColaboradorDAO();
            Senha                       s = new Senha();
            SenhaDAO             senhadao = new SenhaDAO();
            if (chkcancelado.isSelected()) {
               int resposta = JOptionPane.showConfirmDialog(null, "ESTE REGISTRO ESTÁ CANCELADO DESEJA RETIRAR O CANCELAMENTO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
               if (resposta == JOptionPane.YES_OPTION) {
                   if (senhadao.pesquisaId_Senha(txtidcolaborador.getText()) != 0) { // PESQUISA PARA SABER SE EXISTE COLABORADOR COM SENHA CADASTRADA
                       s.setCancelado("N");
                       s.setId_senha(senhadao.pesquisaId_Senha(txtidcolaborador.getText()));
                       s.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                       s.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                   }   
                   chkcancelado.setSelected(false);
                   c.setCancelado("N");
                   c.setId_colaborador((int) TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 0));
                   c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                   c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                   ColaboradorDAO.getInstance().cancelar(c,s); // NA MIGRAÇÃO PARA O HIBERNATE O MÉTODO FICOU O MESMO
               }
            } else {
                int resposta = JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR ESTE REGISTRO ?", "ENTERPRISE - DECISÃO", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                   if (senhadao.pesquisaId_Senha(txtidcolaborador.getText()) != 0) { // PESQUISA PARA SABER SE EXISTE COLABORADOR COM SENHA CADASTRADA
                       s.setCancelado("S");
                       s.setId_senha(senhadao.pesquisaId_Senha(txtidcolaborador.getText()));
                       s.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                       s.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    }    
                    chkcancelado.setSelected(true);
                    c.setCancelado("S");
                    c.setId_colaborador((int) TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 0));
                    c.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
                    c.setDtalteracao(Util.formatarDataPostgres(dataSistema));
                    ColaboradorDAO.getInstance().cancelar(c,s); 
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "SELECIONE UM COLABORADOR PARA CANCELAR !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnome.requestFocus();
        }
        readTable();
    }
    
    
       
     public void buscar(){
        if (txtbuscar.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "INFORME APENAS LETRAS PARA PESQUISA POR NOME OU APENAS NÚMEROS PARA PESQUISA PELA MATRICULA", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
           txtbuscar.requestFocus();
        }else{
           if(txtbuscar.getText().matches("[0-9]*")){
               readTableForMatricula(txtbuscar.getText());
           } else{
               readTableForDesc(txtbuscar.getText().toUpperCase());
           }
        }
        readTable();
    }
    
      public void readTable() {
        DefaultTableModel modelo  = (DefaultTableModel) TabelaColaborador.getModel();
        modelo.setNumRows(0);
        ColaboradorDAO colaboradordao = new ColaboradorDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Colaborador c: colaboradordao.read()){
            modelo.addRow(new Object[]{                
                c.getId_colaborador(),
                c.getNome(),
                c.getNomereduzido(),
                c.getCpf(),
                c.getRg(),
                df.format(c.getDtnascimento()),
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
                c.getEmail(),
                df.format(c.getDtadmissao()),
                df.format(c.getDtdemissao()),
                //c.getFuncao_id(),
                c.getFuncao().getId_funcao(),
                c.getFiscal(),
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
    
    public void readTableForDesc(String desc) {        
        DefaultTableModel modelo  = (DefaultTableModel) TabelaColaborador.getModel();
        modelo.setNumRows(0);
        ColaboradorDAO colaboradordao = new ColaboradorDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Colaborador c: colaboradordao.readForNome(desc)){
            modelo.addRow(new Object[]{                
                c.getId_colaborador(),
                c.getNome(),
                c.getNomereduzido(),
                c.getCpf(),
                c.getRg(),
                df.format(c.getDtnascimento()),
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
                c.getEmail(),
                df.format(c.getDtadmissao()),
                df.format(c.getDtdemissao()),
                //c.getFuncao_id(),
                c.getFuncao().getId_funcao(),
                c.getFiscal(),
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
    
    
    public void readTableForMatricula(String matricula) {        
        DefaultTableModel modelo  = (DefaultTableModel) TabelaColaborador.getModel();
        modelo.setNumRows(0);
        ColaboradorDAO colaboradordao = new ColaboradorDAO();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for(Colaborador c: colaboradordao.readForMatricula(matricula)){
            modelo.addRow(new Object[]{                
                c.getId_colaborador(),
                c.getNome(),
                c.getNomereduzido(),
                c.getCpf(),
                c.getRg(),
                df.format(c.getDtnascimento()),
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
                c.getEmail(),
                df.format(c.getDtadmissao()),
                df.format(c.getDtdemissao()),
                //c.getFuncao_id(),
                c.getFuncao().getId_funcao(),
                c.getFiscal(),
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
    
    
     public void imprimir(){
        ColaboradorDAO colaboradordao = new ColaboradorDAO();
        colaboradordao.imprimir();
        limparCampos();
    }
    
    public void passagemderegistros(){ //Metodo para a passagem de Registros 
        if (TabelaColaborador.getSelectedRow()!= -1){
            FuncaoDAO funcaodao           = new FuncaoDAO();
            ColaboradorDAO colaboradordao = new ColaboradorDAO();
            txtidcolaborador.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 0).toString());
            txtnome.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 1).toString());
            txtnomereduzido.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 2).toString());
            txtcpf.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 3).toString());
            txtrg.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 4).toString());
            txtdtnascimento.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 5).toString());
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 6).toString().equals("M")){
                combogenero.setSelectedIndex(1);
            }
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 6).toString().equals("F")) {
               combogenero.setSelectedIndex(2);
            }   
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 7).toString().equals("CASADO")){
                comboestadocivil.setSelectedIndex(1);
            }
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 7).toString().equals("DIVORCIADO")) {
               comboestadocivil.setSelectedIndex(2);
            }   
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 7).toString().equals("SOLTEIRO")) {
               comboestadocivil.setSelectedIndex(3);
            }   
            txtnomeconjuge.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 8).toString());
            txtnomemae.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 9).toString());
            txtnomepai.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 10).toString());
            txtendereco.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(),11).toString());
            txtbairro.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 12).toString());
            txtcomplemento.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 13).toString());
            txtcidade.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 14).toString());
            
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("AC")){
                combouf.setSelectedIndex(1);
            }
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("AL")) {
               combouf.setSelectedIndex(2);
            }       
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("AP")) {
                combouf.setSelectedIndex(3);
            } 
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("AM")) {
                combouf.setSelectedIndex(4);
            }
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("BA")) {
                combouf.setSelectedIndex(5);
            }           
            if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("CE")) {
                combouf.setSelectedIndex(6);
            }      
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("DF")) {
                combouf.setSelectedIndex(7);
            }
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("ES")) {
                combouf.setSelectedIndex(8);
           }
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("GO")) {
                combouf.setSelectedIndex(9);
           } 
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("MA")) {
                combouf.setSelectedIndex(10);
           }        
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("MT")) {
                combouf.setSelectedIndex(11);
           }       
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("MS")) {
                combouf.setSelectedIndex(12);
           }        
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("MG")) {
                combouf.setSelectedIndex(13);
           }  
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("PA")) {
                combouf.setSelectedIndex(14);
           }        
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("PB")) {
                combouf.setSelectedIndex(15);
           }        
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("PR")) {
                combouf.setSelectedIndex(16);
           }        
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("PE")) {
                combouf.setSelectedIndex(17);
           }      
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("PI")) {
                combouf.setSelectedIndex(18);
           }     
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("RJ")) {
                combouf.setSelectedIndex(19);
           }      
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("RN")) {
                combouf.setSelectedIndex(20);
           }      
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("RS")) {
                combouf.setSelectedIndex(21);
           }       
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("RO")) {
                combouf.setSelectedIndex(22);
           }      
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("RR")) {
                combouf.setSelectedIndex(23);
           } 
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("SC")) {
                combouf.setSelectedIndex(24);
           } 
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("SP")) {
                combouf.setSelectedIndex(25);
           }      
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("SE")) {
                combouf.setSelectedIndex(26);
           }      
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 15).toString().equals("TO")) {
                combouf.setSelectedIndex(27);
           }      
           txtcep.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 16).toString());
           txttelefone1.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 17).toString());
           txttelefone2.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 18).toString());
           txtemail.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 19).toString());
           txtdtadmissao.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 20).toString());
           txtdtdemissao.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 21).toString());
           combofuncao.getModel().setSelectedItem(funcaodao.pesquisaId(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 22).toString()));
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 23).toString().equals("S")){
               chkfiscal.setSelected(true);
               
           }else {
               chkfiscal.setSelected(false);
           }
           
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 24).toString().equals("S")){
               chkativo.setSelected(true);
               
           }else {
               chkativo.setSelected(false);
           }
           if(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 25).toString().equals("0")){
              txtusuariocadastro.setText("ADMINISTRADOR");
           } else {
              txtusuariocadastro.setText(colaboradordao.pesquisaId_Colaborador(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 25).toString()));
           }
           txtdtcadastro.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 26).toString());
           if(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 27).toString().equals("0")){
              txtusuarioalteracao.setText("ADMINISTRADOR");
           } else {   
             txtusuarioalteracao.setText(colaboradordao.pesquisaId_Colaborador(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 27).toString()));
           }             
           txtdtalteracao.setText(TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 28).toString());
           if (TabelaColaborador.getValueAt(TabelaColaborador.getSelectedRow(), 29).toString().equals("S")){
               chkcancelado.setSelected(true);
           }else {
               chkcancelado.setSelected(false);
           }
        }
    }
    public void carregarComboFuncao(){
          FuncaoDAO funcaodao = new FuncaoDAO();
          //combofuncao.addItem("");  
          for(Funcao funcao: funcaodao.read()){
             combofuncao.addItem(funcao.getDescricao());
          }
    }
     
                                 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane AbaDadosPessoais;
    private javax.swing.JDesktopPane AbaVinculo;
    private javax.swing.JPanel PainelAcao;
    private javax.swing.JPanel PainelDadosPessoais;
    private javax.swing.JPanel PainelEndereco;
    private javax.swing.JTabbedPane PainelPrincipal;
    private javax.swing.JScrollPane PainelTabela;
    private javax.swing.JTable TabelaColaborador;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnincluir;
    private javax.swing.JButton btnlimparcampos1;
    private javax.swing.JCheckBox chkativo;
    private javax.swing.JCheckBox chkcancelado;
    private javax.swing.JCheckBox chkfiscal;
    private javax.swing.JComboBox<String> comboestadocivil;
    private javax.swing.JComboBox<String> combofuncao;
    private javax.swing.JComboBox<String> combogenero;
    private javax.swing.JComboBox<String> combouf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPConfigSistema;
    private javax.swing.JPanel jPConfigSistema1;
    private javax.swing.JLabel lblbairro;
    private javax.swing.JLabel lblcep;
    private javax.swing.JLabel lblcidade;
    private javax.swing.JLabel lblcomplemento;
    private javax.swing.JLabel lblcpf;
    private javax.swing.JLabel lbldtadmissao;
    private javax.swing.JLabel lbldtalteracao;
    private javax.swing.JLabel lbldtcadastro;
    private javax.swing.JLabel lbldtdemissao;
    private javax.swing.JLabel lbldtnascimento;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblestadocivil;
    private javax.swing.JLabel lblfuncao;
    private javax.swing.JLabel lblgenero;
    private javax.swing.JLabel lblidcolaborador;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblnomeconjuge;
    private javax.swing.JLabel lblnomemae;
    private javax.swing.JLabel lblnomepai;
    private javax.swing.JLabel lblnomereduzido;
    private javax.swing.JLabel lblrg;
    private javax.swing.JLabel lbltelefone1;
    private javax.swing.JLabel lbltelefone2;
    private javax.swing.JLabel lbluf;
    private javax.swing.JLabel lblusuarioalteracao;
    private javax.swing.JLabel lblusuariocadastro;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JFormattedTextField txtdtadmissao;
    private javax.swing.JFormattedTextField txtdtalteracao;
    private javax.swing.JFormattedTextField txtdtcadastro;
    private javax.swing.JFormattedTextField txtdtdemissao;
    private javax.swing.JFormattedTextField txtdtnascimento;
    private javax.swing.JFormattedTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtidcolaborador;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnomeconjuge;
    private javax.swing.JTextField txtnomemae;
    private javax.swing.JTextField txtnomepai;
    private javax.swing.JTextField txtnomereduzido;
    private javax.swing.JTextField txtrg;
    private javax.swing.JFormattedTextField txttelefone1;
    private javax.swing.JFormattedTextField txttelefone2;
    private javax.swing.JFormattedTextField txtusuarioalteracao;
    private javax.swing.JFormattedTextField txtusuariocadastro;
    // End of variables declaration//GEN-END:variables
}
