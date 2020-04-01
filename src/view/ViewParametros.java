
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Parametros;
import model.dao.ParametrosDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.MaskFormatter;
import model.dao.ColaboradorDAO;
import util.Util;


public class ViewParametros extends javax.swing.JInternalFrame {

    private int txtid_parametros;
    
    public ViewParametros() {
         initComponents();
        // Formatando a mascara da Data no construtor
        //-------------------------------------------
        MaskFormatter mascaraData = null;
        try {
            mascaraData = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            Logger.getLogger(ViewParametros.class.getName()).log(Level.SEVERE, null, ex);
        }
	mascaraData.setPlaceholderCharacter('_');
       
        //----------------------------------------------
        readDados(); 
    }
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AbaParametros = new javax.swing.JTabbedPane();
        SubAbaEmpresa = new javax.swing.JDesktopPane();
        jPEmpresaDados = new javax.swing.JPanel();
        lblrazaosocial = new javax.swing.JLabel();
        txtrazaosocial = new javax.swing.JFormattedTextField();
        lblnomefantasia = new javax.swing.JLabel();
        txtnomefantasia = new javax.swing.JFormattedTextField();
        lblcpf = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        lblcnpj = new javax.swing.JLabel();
        txtcnpj = new javax.swing.JFormattedTextField();
        lblinscricaoestadual = new javax.swing.JLabel();
        txtinscricaoestadual = new javax.swing.JFormattedTextField();
        lblinscricaomunicipal = new javax.swing.JLabel();
        txtinscricaomunicipal = new javax.swing.JFormattedTextField();
        lblqtdfiliais = new javax.swing.JLabel();
        txtqtdfiliais = new javax.swing.JFormattedTextField();
        lblsocioresponsavel = new javax.swing.JLabel();
        txtsocioresponsavel = new javax.swing.JFormattedTextField();
        lblcpfsocioresponsavel = new javax.swing.JLabel();
        txtcpfsocioresponsavel = new javax.swing.JFormattedTextField();
        jPEmpresaEndereco = new javax.swing.JPanel();
        lblendereco = new javax.swing.JLabel();
        txtendereco = new javax.swing.JFormattedTextField();
        lblbairro = new javax.swing.JLabel();
        txtbairro = new javax.swing.JFormattedTextField();
        lblcomplemento = new javax.swing.JLabel();
        txtcomplemento = new javax.swing.JFormattedTextField();
        lblcidade = new javax.swing.JLabel();
        txtcidade = new javax.swing.JFormattedTextField();
        lbluf = new javax.swing.JLabel();
        jCBuf = new javax.swing.JComboBox<>();
        lblcep = new javax.swing.JLabel();
        txtcep = new javax.swing.JFormattedTextField();
        lbltelefone1 = new javax.swing.JLabel();
        txttelefone1 = new javax.swing.JFormattedTextField();
        lbltelefone2 = new javax.swing.JLabel();
        txttelefone2 = new javax.swing.JFormattedTextField();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JFormattedTextField();
        SubAbaSistema = new javax.swing.JDesktopPane();
        jPConfigSistema = new javax.swing.JPanel();
        lblpathbancodedados = new javax.swing.JLabel();
        txtpathbancodedados = new javax.swing.JFormattedTextField();
        lblpathsistema = new javax.swing.JLabel();
        txtpathsistema = new javax.swing.JFormattedTextField();
        lblpathimagens = new javax.swing.JLabel();
        txtpathimagens = new javax.swing.JFormattedTextField();
        lblqtdpdvs = new javax.swing.JLabel();
        txtqtdpdvs = new javax.swing.JFormattedTextField();
        lbldtinstalcao = new javax.swing.JLabel();
        txtdtinstalacao = new javax.swing.JFormattedTextField();
        lblativacaopdv = new javax.swing.JLabel();
        txtativacaopdv = new javax.swing.JFormattedTextField();
        lblativacaoenterprise = new javax.swing.JLabel();
        lbldtativacaopdv = new javax.swing.JLabel();
        txtdtativacaopdv = new javax.swing.JFormattedTextField();
        txtativacaoenterprise = new javax.swing.JFormattedTextField();
        lbldtativacaoenter = new javax.swing.JLabel();
        txtdtativacaoenterprise = new javax.swing.JFormattedTextField();
        lblusuariocadastro = new javax.swing.JLabel();
        txtusuariocadastro = new javax.swing.JFormattedTextField();
        lblusuarioalteracao = new javax.swing.JLabel();
        txtusuarioalteracao = new javax.swing.JFormattedTextField();
        lbldtcadastro = new javax.swing.JLabel();
        txtdtcadastro = new javax.swing.JFormattedTextField();
        lbldtalteracao = new javax.swing.JLabel();
        txtdtalteracao = new javax.swing.JFormattedTextField();
        jPOperacao = new javax.swing.JPanel();
        btnincluir = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Enterprise - Parâmetros");

        AbaParametros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbaParametrosMouseClicked(evt);
            }
        });

        SubAbaEmpresa.setBackground(new java.awt.Color(240, 240, 240));

        jPEmpresaDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblrazaosocial.setText("Razão Social.......:");

        try {
            txtrazaosocial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtrazaosocial.setNextFocusableComponent(txtcpf);
        txtrazaosocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrazaosocialFocusLost(evt);
            }
        });
        txtrazaosocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrazaosocialActionPerformed(evt);
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

        lblnomefantasia.setText("Nome Fantasia....:");

        try {
            txtnomefantasia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
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

        lblcpf.setText("C.P.F:");

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
        txtcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnpjActionPerformed(evt);
            }
        });
        txtcnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcnpjKeyPressed(evt);
            }
        });

        lblinscricaoestadual.setText("Inscrição Estadual:");

        txtinscricaoestadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtinscricaoestadual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinscricaoestadualKeyPressed(evt);
            }
        });

        lblinscricaomunicipal.setText("Inscrição Municipal:");

        txtinscricaomunicipal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtinscricaomunicipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinscricaomunicipalKeyPressed(evt);
            }
        });

        lblqtdfiliais.setText("Qtd Filiais.:");

        txtqtdfiliais.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("000"))));
        txtqtdfiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtdfiliaisActionPerformed(evt);
            }
        });
        txtqtdfiliais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtqtdfiliaisKeyPressed(evt);
            }
        });

        lblsocioresponsavel.setText("Sócio Responsável:");

        try {
            txtsocioresponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtsocioresponsavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsocioresponsavelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsocioresponsavelKeyTyped(evt);
            }
        });

        lblcpfsocioresponsavel.setText("C.P.F Sócio:");

        try {
            txtcpfsocioresponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpfsocioresponsavel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcpfsocioresponsavelFocusLost(evt);
            }
        });
        txtcpfsocioresponsavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcpfsocioresponsavelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPEmpresaDadosLayout = new javax.swing.GroupLayout(jPEmpresaDados);
        jPEmpresaDados.setLayout(jPEmpresaDadosLayout);
        jPEmpresaDadosLayout.setHorizontalGroup(
            jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                        .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblinscricaoestadual, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(lblinscricaomunicipal)
                                .addComponent(lblnomefantasia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                                .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                                        .addComponent(txtsocioresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(lblcpfsocioresponsavel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcpfsocioresponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                    .addComponent(txtinscricaoestadual, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                                        .addComponent(txtinscricaomunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblqtdfiliais)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtqtdfiliais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61))
                            .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                                .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                                        .addComponent(txtrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                                        .addComponent(txtnomefantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblcnpj)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtcpf))
                                .addGap(63, 63, 63))))
                    .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                        .addComponent(lblsocioresponsavel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPEmpresaDadosLayout.setVerticalGroup(
            jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcpf)
                            .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcnpj)
                            .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPEmpresaDadosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblrazaosocial)
                            .addComponent(txtrazaosocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnomefantasia)
                            .addComponent(txtnomefantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinscricaoestadual)
                    .addComponent(txtinscricaoestadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblinscricaomunicipal)
                    .addComponent(txtinscricaomunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblqtdfiliais)
                    .addComponent(txtqtdfiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblcpfsocioresponsavel)
                        .addComponent(txtcpfsocioresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPEmpresaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblsocioresponsavel)
                        .addComponent(txtsocioresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPEmpresaEndereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblendereco.setText("Endereço.........:");

        try {
            txtendereco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtendereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtenderecoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtenderecoKeyTyped(evt);
            }
        });

        lblbairro.setText("Bairro.............:");

        try {
            txtbairro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtbairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbairroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbairroKeyTyped(evt);
            }
        });

        lblcomplemento.setText("Complemento:");

        try {
            txtcomplemento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcomplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcomplementoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcomplementoKeyTyped(evt);
            }
        });

        lblcidade.setText("Cidade............:");

        try {
            txtcidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcidadeKeyTyped(evt);
            }
        });

        lbluf.setText("Estado.:");

        jCBuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o estado", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espirito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraiba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rodônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        jCBuf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCBufFocusLost(evt);
            }
        });
        jCBuf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCBufKeyPressed(evt);
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcepKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcepKeyTyped(evt);
            }
        });

        lbltelefone1.setText("Celular............:");

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
        });

        lbltelefone2.setText("Telefone Fixo..:");

        try {
            txttelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txttelefone2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefone2KeyPressed(evt);
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

        javax.swing.GroupLayout jPEmpresaEnderecoLayout = new javax.swing.GroupLayout(jPEmpresaEndereco);
        jPEmpresaEndereco.setLayout(jPEmpresaEnderecoLayout);
        jPEmpresaEnderecoLayout.setHorizontalGroup(
            jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpresaEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPEmpresaEnderecoLayout.createSequentialGroup()
                        .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPEmpresaEnderecoLayout.createSequentialGroup()
                                .addComponent(lbltelefone1)
                                .addGap(18, 18, 18)
                                .addComponent(txttelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltelefone2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPEmpresaEnderecoLayout.createSequentialGroup()
                                .addComponent(lblcidade)
                                .addGap(18, 18, 18)
                                .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblemail)
                            .addComponent(lbluf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPEmpresaEnderecoLayout.createSequentialGroup()
                                .addComponent(jCBuf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPEmpresaEnderecoLayout.createSequentialGroup()
                        .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblbairro)
                            .addComponent(lblendereco))
                        .addGap(14, 14, 14)
                        .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPEmpresaEnderecoLayout.createSequentialGroup()
                                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcomplemento)))))
                .addGap(13, 22, Short.MAX_VALUE))
        );
        jPEmpresaEnderecoLayout.setVerticalGroup(
            jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpresaEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblendereco)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbairro)
                    .addComponent(lblcomplemento)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcidade)
                    .addComponent(lbluf)
                    .addComponent(jCBuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcep)
                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPEmpresaEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefone1)
                    .addComponent(txttelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefone2)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        SubAbaEmpresa.setLayer(jPEmpresaDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SubAbaEmpresa.setLayer(jPEmpresaEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout SubAbaEmpresaLayout = new javax.swing.GroupLayout(SubAbaEmpresa);
        SubAbaEmpresa.setLayout(SubAbaEmpresaLayout);
        SubAbaEmpresaLayout.setHorizontalGroup(
            SubAbaEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPEmpresaDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPEmpresaEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SubAbaEmpresaLayout.setVerticalGroup(
            SubAbaEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubAbaEmpresaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPEmpresaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPEmpresaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        AbaParametros.addTab("Empresa", SubAbaEmpresa);

        SubAbaSistema.setBackground(new java.awt.Color(240, 240, 240));

        jPConfigSistema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblpathbancodedados.setText("Path Banco de Dados:");

        try {
            txtpathbancodedados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtpathbancodedados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpathbancodedadosKeyPressed(evt);
            }
        });

        lblpathsistema.setText("Path Sistema............:");

        try {
            txtpathsistema.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtpathsistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpathsistemaActionPerformed(evt);
            }
        });
        txtpathsistema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpathsistemaKeyPressed(evt);
            }
        });

        lblpathimagens.setText("Path Imagens...........:");

        try {
            txtpathimagens.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("************************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtpathimagens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpathimagensKeyPressed(evt);
            }
        });

        lblqtdpdvs.setText("Quant.  PDVs....:");

        txtqtdpdvs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtqtdpdvs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtqtdpdvsKeyPressed(evt);
            }
        });

        lbldtinstalcao.setText("Data Instalação:");

        try {
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_');
            try {
                txtdtinstalacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtinstalacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtinstalacaoActionPerformed(evt);
            }
        });
        txtdtinstalacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdtinstalacaoKeyPressed(evt);
            }
        });

        lblativacaopdv.setText("Ativação PDV...........:");

        try {
            txtativacaopdv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtativacaopdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtativacaopdvKeyPressed(evt);
            }
        });

        lblativacaoenterprise.setText("Ativação Enterprise.:");

        lbldtativacaopdv.setText("Data Ativação PDV..........:");

        try {
            txtdtativacaopdv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtativacaopdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdtativacaopdvKeyPressed(evt);
            }
        });

        try {
            txtativacaoenterprise.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtativacaoenterprise.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtativacaoenterpriseKeyPressed(evt);
            }
        });

        lbldtativacaoenter.setText("Data Ativação Enterprise:");

        try {
            txtdtativacaoenterprise.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdtativacaoenterprise.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdtativacaoenterpriseKeyPressed(evt);
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

        lblusuarioalteracao.setText("Alterado por....:");

        txtusuarioalteracao.setEditable(false);
        try {
            txtusuarioalteracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*********************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        javax.swing.GroupLayout jPConfigSistemaLayout = new javax.swing.GroupLayout(jPConfigSistema);
        jPConfigSistema.setLayout(jPConfigSistemaLayout);
        jPConfigSistemaLayout.setHorizontalGroup(
            jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConfigSistemaLayout.createSequentialGroup()
                        .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblpathsistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblpathbancodedados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpathimagens, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtdtativacaoenterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPConfigSistemaLayout.createSequentialGroup()
                                    .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPConfigSistemaLayout.createSequentialGroup()
                                            .addComponent(txtpathbancodedados, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblqtdpdvs, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPConfigSistemaLayout.createSequentialGroup()
                                                .addComponent(txtativacaopdv, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbldtativacaopdv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPConfigSistemaLayout.createSequentialGroup()
                                                .addComponent(txtpathsistema, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbldtinstalcao))))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtqtdpdvs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtdtativacaopdv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtdtinstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(lblpathimagens)
                    .addGroup(jPConfigSistemaLayout.createSequentialGroup()
                        .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblativacaopdv, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(lblativacaoenterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtativacaoenterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbldtativacaoenter, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConfigSistemaLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldtcadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        jPConfigSistemaLayout.setVerticalGroup(
            jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConfigSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpathbancodedados)
                    .addComponent(lblqtdpdvs)
                    .addComponent(txtqtdpdvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpathbancodedados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpathsistema)
                    .addComponent(lbldtinstalcao)
                    .addComponent(txtdtinstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpathsistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpathimagens)
                    .addComponent(txtpathimagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblativacaopdv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtativacaopdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtativacaopdv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtativacaopdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblativacaoenterprise)
                    .addComponent(txtativacaoenterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtativacaoenter)
                    .addComponent(txtdtativacaoenterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusuariocadastro)
                    .addComponent(txtusuariocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPConfigSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdtalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldtalteracao)
                    .addComponent(lblusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuarioalteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        SubAbaSistema.add(jPConfigSistema);
        jPConfigSistema.setBounds(10, 11, 766, 250);

        AbaParametros.addTab("Sistema", SubAbaSistema);

        jPOperacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout jPOperacaoLayout = new javax.swing.GroupLayout(jPOperacao);
        jPOperacao.setLayout(jPOperacaoLayout);
        jPOperacaoLayout.setHorizontalGroup(
            jPOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOperacaoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPOperacaoLayout.setVerticalGroup(
            jPOperacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPOperacaoLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(btnincluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnatualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPOperacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AbaParametros, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AbaParametros, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpathsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpathsistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpathsistemaActionPerformed

    private void btnincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnincluirActionPerformed
       incluir();
    }//GEN-LAST:event_btnincluirActionPerformed

    
    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void txtcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnpjActionPerformed

    private void txtrazaosocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrazaosocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrazaosocialActionPerformed

    private void txtrazaosocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazaosocialKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
           txtcpf.requestFocus();
        }
    }//GEN-LAST:event_txtrazaosocialKeyPressed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtcpfActionPerformed

    private void txtcpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
           txtnomefantasia.requestFocus();    
        }     
    }//GEN-LAST:event_txtcpfKeyPressed
 
    private void txtnomefantasiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomefantasiaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           txtcnpj.requestFocus();
        }
    }//GEN-LAST:event_txtnomefantasiaKeyPressed

    private void txtcnpjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnpjKeyPressed
        // TODO add your handling code here:
        
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtinscricaoestadual.requestFocus();    
         }
         
    }//GEN-LAST:event_txtcnpjKeyPressed

    private void txtinscricaoestadualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinscricaoestadualKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtinscricaomunicipal.requestFocus();
            }
    }//GEN-LAST:event_txtinscricaoestadualKeyPressed

    private void txtinscricaomunicipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinscricaomunicipalKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                txtqtdfiliais.requestFocus();
            }
    }//GEN-LAST:event_txtinscricaomunicipalKeyPressed

    private void txtqtdfiliaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtdfiliaisKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                txtsocioresponsavel.requestFocus();
            }
    }//GEN-LAST:event_txtqtdfiliaisKeyPressed

    private void txtsocioresponsavelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsocioresponsavelKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
               txtcpfsocioresponsavel.requestFocus();
            }
                    
    }//GEN-LAST:event_txtsocioresponsavelKeyPressed

    private void txtcpfsocioresponsavelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfsocioresponsavelKeyPressed
          if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             txtendereco.requestFocus();
          }
    }//GEN-LAST:event_txtcpfsocioresponsavelKeyPressed

    private void txtenderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenderecoKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                txtbairro.requestFocus();
            }
    }//GEN-LAST:event_txtenderecoKeyPressed

    private void txtbairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbairroKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                txtcomplemento.requestFocus();
            }
    }//GEN-LAST:event_txtbairroKeyPressed

    private void txtcidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcidadeKeyPressed
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              jCBuf.requestFocus();
            }
    }//GEN-LAST:event_txtcidadeKeyPressed

    private void jCBufKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBufKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtcep.requestFocus();
         }
    }//GEN-LAST:event_jCBufKeyPressed

    private void txtcepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txttelefone1.requestFocus();
            }
    }//GEN-LAST:event_txtcepKeyPressed

    private void txttelefone1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone1KeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txttelefone2.requestFocus();
            }
        
    }//GEN-LAST:event_txttelefone1KeyPressed

    private void txttelefone2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefone2KeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtemail.requestFocus();
            }
    }//GEN-LAST:event_txttelefone2KeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
           if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
              txtpathbancodedados.requestFocus();
              AbaParametros.setSelectedIndex(1);
              
           }
        
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtcomplementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomplementoKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                txtcidade.requestFocus();
            }
        
    }//GEN-LAST:event_txtcomplementoKeyPressed

    private void txtpathbancodedadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpathbancodedadosKeyPressed
        // TODO add your handling code here:
        
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtqtdpdvs.requestFocus();
            }
    }//GEN-LAST:event_txtpathbancodedadosKeyPressed

    private void txtqtdpdvsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtdpdvsKeyPressed
        // TODO add your handling code here:
        
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtpathsistema.requestFocus();
            }
    }//GEN-LAST:event_txtqtdpdvsKeyPressed

    private void txtpathsistemaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpathsistemaKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtdtinstalacao.requestFocus();
            }
    }//GEN-LAST:event_txtpathsistemaKeyPressed

    private void txtdtinstalacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtinstalacaoKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtpathimagens.requestFocus();
            }
    }//GEN-LAST:event_txtdtinstalacaoKeyPressed

    private void txtpathimagensKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpathimagensKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtativacaopdv.requestFocus();
            }
    }//GEN-LAST:event_txtpathimagensKeyPressed

    private void txtativacaopdvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtativacaopdvKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtdtativacaopdv.requestFocus();
            }
        
    }//GEN-LAST:event_txtativacaopdvKeyPressed

    private void txtdtativacaopdvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtativacaopdvKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtativacaoenterprise.requestFocus();
            }
    }//GEN-LAST:event_txtdtativacaopdvKeyPressed

    private void txtativacaoenterpriseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtativacaoenterpriseKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                txtdtativacaoenterprise.requestFocus();
            }
    }//GEN-LAST:event_txtativacaoenterpriseKeyPressed

    private void txtdtativacaoenterpriseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdtativacaoenterpriseKeyPressed
        // TODO add your handling code here:
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                btnatualizar.requestFocus();
            }
    }//GEN-LAST:event_txtdtativacaoenterpriseKeyPressed

    private void txtdtinstalacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtinstalacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtinstalacaoActionPerformed

    private void txtqtdfiliaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtdfiliaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtdfiliaisActionPerformed

    private void AbaParametrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbaParametrosMouseClicked
        // TODO add your handling code here:
        
          txtpathbancodedados.requestFocus();
    }//GEN-LAST:event_AbaParametrosMouseClicked

    private void txtcepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcepKeyReleased

    private void txtcpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcpfFocusLost
            
            if (util.Util.ValidacpfCnpj(txtcpf.getText().replaceAll("\\D", "")) ==  false) {
               // JOptionPane.showMessageDialog(null, "ERRO ! CPF INCORRETO OU INVÁLIDO ...");
               JOptionPane.showMessageDialog(null, "CPF INCORRETO OU INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
               txtcpf.requestFocus();
            }
    }//GEN-LAST:event_txtcpfFocusLost

    private void txtcpfsocioresponsavelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcpfsocioresponsavelFocusLost

            if (util.Util.ValidacpfCnpj(txtcpfsocioresponsavel.getText().replaceAll("\\D", "")) ==  false) {
                JOptionPane.showMessageDialog(null, "CPF INCORRETO OU INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                txtcpfsocioresponsavel.requestFocus();
            }
    }//GEN-LAST:event_txtcpfsocioresponsavelFocusLost

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
                             
               if (util.Util.ValidaEmail(txtemail.getText())== false) {
                  JOptionPane.showMessageDialog(null, "E-MAIL INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                  txtemail.requestFocus();
               }
                              
                     
    }//GEN-LAST:event_txtemailFocusLost

    private void txtcnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcnpjFocusLost
            
            if (util.Util.ValidacpfCnpj(txtcnpj.getText().replaceAll("\\D", "")) ==  false) {
               JOptionPane.showMessageDialog(null, "CNPJ INCORRETO OU INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
               txtcnpj.requestFocus();
            }
      
        

        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnpjFocusLost

    private void txtcepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcepFocusLost
        // TODO add your handling code here:
       
        if (txtcep.getText().trim().length() < 8) {
            JOptionPane.showMessageDialog(null, "CEP INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtcep.requestFocus();
        }
    }//GEN-LAST:event_txtcepFocusLost

    private void jCBufFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBufFocusLost
        if (jCBuf.getSelectedItem().equals("Selecione o estado")){
            JOptionPane.showMessageDialog(null, "ESTADO (UF) INVÁLIDO !" , "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            jCBuf.requestFocus();
                
        }
    }//GEN-LAST:event_jCBufFocusLost

    private void txttelefone1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefone1FocusLost
        // TODO add your handling code here:
        if (txttelefone1.getText().trim().length() < 11) {
            JOptionPane.showMessageDialog(null, "TELEFONE INVÁLIDO !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txttelefone1.requestFocus();
        }
        
    }//GEN-LAST:event_txttelefone1FocusLost

    private void txtrazaosocialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrazaosocialFocusLost
        // TODO add your handling code here:
        if (txtrazaosocial.getText().trim().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "PREENCHIMENTO OBRIGÁTORIO DA RAZÃO SOCIAL !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtrazaosocial.requestFocus();
        }
        
    }//GEN-LAST:event_txtrazaosocialFocusLost

    private void txtnomefantasiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomefantasiaFocusLost

        if (txtnomefantasia.getText().trim().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "PREENCHIMENTO OBRIGÁTORIO DO NOME FANTASIA !", "ENTERPRISE - ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            txtnomefantasia.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomefantasiaFocusLost

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

    private void btnincluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnincluirKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            incluir();
        }    
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN){
               btnatualizar.requestFocus();
        }
    }//GEN-LAST:event_btnincluirKeyPressed

    private void btnatualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnatualizarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN ) {
            btnincluir.requestFocus();
        }
    }//GEN-LAST:event_btnatualizarKeyPressed

    private void txtusuariocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuariocadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuariocadastroActionPerformed

    private void txtdtcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtcadastroActionPerformed

    private void txtdtalteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtalteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtalteracaoActionPerformed

    private void txtrazaosocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazaosocialKeyTyped
        String caracteres="ãÃáÁâÂÉéêÊíÍóÓôÔúÚçÇ";
        if(caracteres.contains(evt.getKeyChar()+"")){
          evt.consume();
        }
    }//GEN-LAST:event_txtrazaosocialKeyTyped

    private void txtnomefantasiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomefantasiaKeyTyped
        String caracteres = "ãÃáÁâÂÉéêÊíÍóÓôÔúÚçÇ";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnomefantasiaKeyTyped

    private void txtsocioresponsavelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsocioresponsavelKeyTyped
        String caracteres = "ãÃáÁâÂÉéêÊíÍóÓôÔúÚçÇ";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtsocioresponsavelKeyTyped

    private void txtenderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenderecoKeyTyped
        String caracteres = "ãÃáÁâÂÉéêÊíÍóÓôÔúÚçÇ";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtenderecoKeyTyped

    private void txtbairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbairroKeyTyped
        String caracteres = "ãÃáÁâÂÉéêÊíÍóÓôÔúÚçÇ";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtbairroKeyTyped

    private void txtcomplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcomplementoKeyTyped
        String caracteres = "ãÃáÁâÂÉéêÊíÍóÓôÔúÚçÇ";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcomplementoKeyTyped

    private void txtcidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcidadeKeyTyped
        String caracteres = "ãÃáÁâÂÉéêÊíÍóÓôÔúÚçÇ";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcidadeKeyTyped

    private void txtcepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcepKeyTyped
        String caracteres = "0123456789";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcepKeyTyped
    
    //****************************** Código Limpo ***********************************************
    
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    txtrazaosocial.requestFocus();
    }
    
    public void incluir() {
        Parametros p = new Parametros();
        ParametrosDAO parametrosdao = new ParametrosDAO();
        Date dataSistema = new Date();
        p.setId_parametros(txtid_parametros);
        p.setRazaosocial(txtrazaosocial.getText().toUpperCase());
        p.setNomefantasia(txtnomefantasia.getText().toUpperCase());
        p.setCpf(txtcpf.getText().replaceAll("\\D", ""));
        p.setCnpj(txtcnpj.getText().replaceAll("\\D", ""));
        p.setInscricaoestadual(txtinscricaoestadual.getText());
        p.setInscricaomunicipal(txtinscricaomunicipal.getText());
        p.setQtdfiliais(Integer.parseInt(txtqtdfiliais.getText()));
        p.setSocioresponsavel(txtsocioresponsavel.getText().toUpperCase());
        p.setCpfsocioresponsavel(txtcpfsocioresponsavel.getText().replaceAll("\\D", ""));
        p.setEndereco(txtendereco.getText().toUpperCase());
        p.setBairro(txtbairro.getText().toUpperCase());
        p.setComplemento(txtcomplemento.getText().toUpperCase());
        p.setCidade(txtcidade.getText().toUpperCase());
        if (jCBuf.getSelectedItem().equals("Acre (AC)")) {
            p.setUf("AC");
        }
        if (jCBuf.getSelectedItem().equals("Alagoas (AL)")) {
            p.setUf("AL");
        }
        if (jCBuf.getSelectedItem().equals("Amapá (AP)")) {
            p.setUf("AP");
        }
        if (jCBuf.getSelectedItem().equals("Amazonas (AM)")) {
            p.setUf("AM");
        }
        if (jCBuf.getSelectedItem().equals("Bahia (BA)")) {
            p.setUf("BA");
        }
        if (jCBuf.getSelectedItem().equals("Ceará (CE)")) {
            p.setUf("CE");
        }
        if (jCBuf.getSelectedItem().equals("Distrito Federal (DF)")) {
            p.setUf("DF");
        }
        if (jCBuf.getSelectedItem().equals("Espirito Santo (ES)")) {
            p.setUf("ES");
        }
        if (jCBuf.getSelectedItem().equals("Goiás (GO)")) {
            p.setUf("GO");
        }
        if (jCBuf.getSelectedItem().equals("Maranhão (MA)")) {
            p.setUf("MA");
        }
        if (jCBuf.getSelectedItem().equals("Mato Grosso (MT)")) {
            p.setUf("MT");
        }
        if (jCBuf.getSelectedItem().equals("Mato Grosso do Sul (MS)")) {
            p.setUf("MS");
        }
        if (jCBuf.getSelectedItem().equals("Minas Gerais (MG)")) {
            p.setUf("MG");
        }
        if (jCBuf.getSelectedItem().equals("Pará (PA)")) {
            p.setUf("PA");
        }
        if (jCBuf.getSelectedItem().equals("Paraiba (PB)")) {
            p.setUf("PB");
        }
        if (jCBuf.getSelectedItem().equals("Paraná (PR)")) {
            p.setUf("PR");
        }
        if (jCBuf.getSelectedItem().equals("Pernambuco (PE)")) {
            p.setUf("PE");
        }
        if (jCBuf.getSelectedItem().equals("Piauí (PI)")) {
            p.setUf("PI");
        }
        if (jCBuf.getSelectedItem().equals("Rio de Janeiro (RJ)")) {
            p.setUf("RJ");
        }
        if (jCBuf.getSelectedItem().equals("Rio Grande do Norte (RN)")) {
            p.setUf("RN");
        }
        if (jCBuf.getSelectedItem().equals("Rio Grande do Sul (RS)")) {
            p.setUf("RS");
        }
        if (jCBuf.getSelectedItem().equals("Rodônia (RO)")) {
            p.setUf("RO");
        }
        if (jCBuf.getSelectedItem().equals("Roraima (RR)")) {
            p.setUf("RR");
        }
        if (jCBuf.getSelectedItem().equals("Santa Catarina (SC)")) {
            p.setUf("SC");
        }
        if (jCBuf.getSelectedItem().equals("São Paulo (SP)")) {
            p.setUf("SP");
        }
        if (jCBuf.getSelectedItem().equals("Sergipe (SE)")) {
            p.setUf("SE");
        }
        if (jCBuf.getSelectedItem().equals("Tocantins (TO)")) {
            p.setUf("TO");
        }
        p.setCep(txtcep.getText().replaceAll("\\D", ""));
        p.setTelefone1(txttelefone1.getText().replaceAll("\\D", ""));
        p.setTelefone2(txttelefone2.getText().replaceAll("\\D", ""));
        p.setEmail(txtemail.getText().toLowerCase());
        p.setPathbancodedados(txtpathbancodedados.getText().toUpperCase());
        p.setPathsistema(txtpathsistema.getText().toUpperCase());
        p.setPathimagens(txtpathimagens.getText().toUpperCase());
        p.setQtdpdvs(Integer.parseInt(txtqtdpdvs.getText()));
        DateFormat formatodata = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date vdata = null;
        try {
            vdata = new java.sql.Date(((java.util.Date) formatodata.parse(txtdtinstalacao.getText())).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(ViewParametros.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setDtinstalacao(vdata);
        p.setAtivacaopdv(txtativacaopdv.getText().toUpperCase());
        try {
            vdata = new java.sql.Date(((java.util.Date) formatodata.parse(txtdtativacaopdv.getText())).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(ViewParametros.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setDtativacaopdv(vdata);
        p.setAtivacaoenterprise(txtativacaoenterprise.getText().toUpperCase());
        try {
            vdata = new java.sql.Date(((java.util.Date) formatodata.parse(txtdtativacaoenterprise.getText())).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(ViewParametros.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setDtativacaoenterprise(vdata);
        p.setUsuariocadastro(Integer.parseInt(ViewLogin.Id_Colaborador));
        p.setDtcadastro(Util.formatarDataPostgres(dataSistema));
        p.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
        p.setDtalteracao(Util.formatarDataPostgres(dataSistema));
        //parametrosdao.create(p);
        ParametrosDAO.getInstance().create(p);
        JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO !", "ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        readDados(); 
    }

    
    public void atualizar() {
        Parametros     p           = new Parametros();
        ParametrosDAO parametrosdao = new ParametrosDAO();
        Date dataSistema = new Date();
        p.setId_parametros(txtid_parametros);
        p.setRazaosocial(txtrazaosocial.getText().toUpperCase());
        p.setNomefantasia(txtnomefantasia.getText().toUpperCase());
        p.setQtdfiliais(Integer.parseInt(txtqtdfiliais.getText()));
        p.setCpf(txtcpf.getText().replaceAll("\\D",""));
        p.setCnpj(txtcnpj.getText().replaceAll("\\D",""));
        p.setInscricaoestadual(txtinscricaoestadual.getText());
        p.setInscricaomunicipal(txtinscricaomunicipal.getText());
        p.setSocioresponsavel(txtsocioresponsavel.getText().toUpperCase());
        p.setCpfsocioresponsavel(txtcpfsocioresponsavel.getText().replaceAll("\\D",""));
        p.setEndereco(txtendereco.getText().toUpperCase());
        p.setBairro(txtbairro.getText().toUpperCase());
        p.setComplemento(txtcomplemento.getText().toUpperCase());
        p.setCidade(txtcidade.getText().toUpperCase());
        if (jCBuf.getSelectedItem().equals("Acre (AC)")){
            p.setUf("AC");
        }
        if (jCBuf.getSelectedItem().equals("Alagoas (AL)")){
            p.setUf("AL");
        }
        if (jCBuf.getSelectedItem().equals("Amapá (AP)")){
            p.setUf("AP");
        }        
        if (jCBuf.getSelectedItem().equals("Amazonas (AM)")){
            p.setUf("AM");
        }
        if (jCBuf.getSelectedItem().equals("Bahia (BA)")){
            p.setUf("BA");
        }
        if (jCBuf.getSelectedItem().equals("Ceará (CE)")){
            p.setUf("CE");
        }
        if (jCBuf.getSelectedItem().equals("Distrito Federal (DF)")){
            p.setUf("DF");
        }  
        if (jCBuf.getSelectedItem().equals("Espirito Santo (ES)")){
            p.setUf("ES");
        }  
        if (jCBuf.getSelectedItem().equals("Goiás (GO)")){
            p.setUf("GO");
        }  
        if (jCBuf.getSelectedItem().equals("Maranhão (MA)")){
            p.setUf("MA");
        }  
        if (jCBuf.getSelectedItem().equals("Mato Grosso (MT)")){
            p.setUf("MT");
        }  
        if (jCBuf.getSelectedItem().equals("Mato Grosso do Sul (MS)")){
           p.setUf("MS");
        }  
        if (jCBuf.getSelectedItem().equals("Minas Gerais (MG)")){
           p.setUf("MG");
        }  
        if (jCBuf.getSelectedItem().equals("Pará (PA)")){
           p.setUf("PA");
        }  
        if (jCBuf.getSelectedItem().equals("Paraiba (PB)")){
            p.setUf("PB");
        }
        if (jCBuf.getSelectedItem().equals("Paraná (PR)")){
            p.setUf("PR");
        }
        if (jCBuf.getSelectedItem().equals("Pernambuco (PE)")){
            p.setUf("PE");
        }
        if (jCBuf.getSelectedItem().equals("Piauí (PI)")){
            p.setUf("PI");
        } 
        if (jCBuf.getSelectedItem().equals("Rio de Janeiro (RJ)")){
            p.setUf("RJ");
        }
        if (jCBuf.getSelectedItem().equals("Rio Grande do Norte (RN)")){
            p.setUf("RN");
        }
        if (jCBuf.getSelectedItem().equals("Rio Grande do Sul (RS)")){
            p.setUf("RS");
        }
        if (jCBuf.getSelectedItem().equals("Rodônia (RO)")){
            p.setUf("RO");
        }
        if (jCBuf.getSelectedItem().equals("Roraima (RR)")){ 
            p.setUf("RR");
        }
        if (jCBuf.getSelectedItem().equals("Santa Catarina (SC)")){ 
            p.setUf("SC");
        }
        if (jCBuf.getSelectedItem().equals("São Paulo (SP)")){ 
            p.setUf("SP");
        }
        if (jCBuf.getSelectedItem().equals("Sergipe (SE)")){ 
            p.setUf("SE");
        }
        if (jCBuf.getSelectedItem().equals("Tocantins (TO)")){ 
            p.setUf("TO");
        }              
        p.setCep(txtcep.getText().replaceAll("\\D",""));
        p.setTelefone1(txttelefone1.getText().replaceAll("\\D",""));
        p.setTelefone2(txttelefone2.getText().replaceAll("\\D",""));
        p.setEmail(txtemail.getText().toLowerCase());
        p.setPathbancodedados(txtpathbancodedados.getText().toUpperCase());
        p.setPathsistema(txtpathsistema.getText().toUpperCase());
        p.setPathimagens(txtpathimagens.getText().toUpperCase());
        p.setQtdpdvs(Integer.parseInt(txtqtdpdvs.getText()));
        DateFormat formatodata = new SimpleDateFormat("dd/MM/yyyy");  
        java.sql.Date vdata = null;
        try {
            vdata = new java.sql.Date( ((java.util.Date)formatodata.parse(txtdtinstalacao.getText())).getTime() );
        }catch (ParseException ex) {
            Logger.getLogger(ViewParametros.class.getName()).log(Level.SEVERE, null, ex);
        }
         p.setDtinstalacao(vdata);
         p.setAtivacaopdv(txtativacaopdv.getText().toUpperCase());
         
        try {
            vdata = new java.sql.Date( ((java.util.Date)formatodata.parse(txtdtativacaopdv.getText())).getTime() );
        }catch (ParseException ex) {
            Logger.getLogger(ViewParametros.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setDtativacaopdv(vdata);     
        p.setAtivacaoenterprise(txtativacaoenterprise.getText().toUpperCase());

        try {
            vdata = new java.sql.Date( ((java.util.Date)formatodata.parse(txtdtativacaoenterprise.getText())).getTime() );
        }catch (ParseException ex) {
            Logger.getLogger(ViewParametros.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setDtativacaoenterprise(vdata);   

//        p.setUsuariocadastro(Integer.parseInt(txtusuariocadastro.getText()));
      
        try {
            p.setDtcadastro(((java.util.Date)formatodata.parse(txtdtcadastro.getText())));
        } catch (ParseException ex) {
            Logger.getLogger(ViewParametros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        p.setUsuarioalteracao(Integer.parseInt(ViewLogin.Id_Colaborador));
        p.setDtalteracao(Util.formatarDataPostgres(dataSistema));
        //parametrosdao.update(p);
        ParametrosDAO.getInstance().update(p);
        JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO !", "ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        readDados();
    }
                   
    public void readDados() {
        ParametrosDAO parametrosdao = new ParametrosDAO();
        SimpleDateFormat formatadorbr;
        formatadorbr = new SimpleDateFormat("dd/MM/yyyy");
        ColaboradorDAO colaboradordao = new ColaboradorDAO();
        for (Parametros p : parametrosdao.read()) {
            txtid_parametros = p.getId_parametros();
            txtrazaosocial.setText(p.getRazaosocial());
            txtcpf.setText(p.getCpf());
            txtnomefantasia.setText(p.getNomefantasia());
            txtcnpj.setText(p.getCnpj());
            txtcnpj.setText(p.getCnpj());
            txtinscricaoestadual.setText(p.getInscricaoestadual());
            txtinscricaomunicipal.setText(p.getInscricaomunicipal());
            txtqtdfiliais.setText(Integer.toString(p.getQtdfiliais()));
            txtsocioresponsavel.setText(p.getSocioresponsavel());
            txtcpfsocioresponsavel.setText(p.getCpfsocioresponsavel());
            txtendereco.setText(p.getEndereco());
            txtbairro.setText(p.getBairro());
            txtcomplemento.setText(p.getComplemento());
            txtcidade.setText(p.getCidade());
            if (p.getUf().contains("AC")) {
                jCBuf.setSelectedIndex(1);
            }
            if (p.getUf().contains("AL")) {
                jCBuf.setSelectedIndex(2);
            }
            if (p.getUf().contains("AP")) {
                jCBuf.setSelectedIndex(3);
            }
            if (p.getUf().contains("AM")) {
                jCBuf.setSelectedIndex(4);
            }
            if (p.getUf().contains("BA")) {
                jCBuf.setSelectedIndex(5);
            }
            if (p.getUf().contains("CE")) {
                jCBuf.setSelectedIndex(6);
            }
            if (p.getUf().contains("DF")) {
                jCBuf.setSelectedIndex(7);
            }
            if (p.getUf().contains("ES")) {
                jCBuf.setSelectedIndex(8);
            }
            if (p.getUf().contains("GO")) {
                jCBuf.setSelectedIndex(9);
            }
            if (p.getUf().contains("MA")) {
                jCBuf.setSelectedIndex(10);
            }
            if (p.getUf().contains("MT")) {
                jCBuf.setSelectedIndex(11);
            }
            if (p.getUf().contains("MS")) {
                jCBuf.setSelectedIndex(12);
            }
            if (p.getUf().contains("MG")) {
                jCBuf.setSelectedIndex(13);
            }
            if (p.getUf().contains("PA")) {
                jCBuf.setSelectedIndex(14);
            }
            if (p.getUf().contains("PB")) {
                jCBuf.setSelectedIndex(15);
            }
            if (p.getUf().contains("PR")) {
                jCBuf.setSelectedIndex(16);
            }
            if (p.getUf().contains("PE")) {
                jCBuf.setSelectedIndex(17);
            }
            if (p.getUf().contains("PI")) {
                jCBuf.setSelectedIndex(18);
            }
            if (p.getUf().contains("RJ")) {
                jCBuf.setSelectedIndex(19);
            }
            if (p.getUf().contains("RN")) {
                jCBuf.setSelectedIndex(20);
            }
            if (p.getUf().contains("RS")) {
                jCBuf.setSelectedIndex(21);
            }
            if (p.getUf().contains("RO")) {
                jCBuf.setSelectedIndex(22);
            }
            if (p.getUf().contains("RR")) {
                jCBuf.setSelectedIndex(23);
            }
            if (p.getUf().contains("SC")) {
                jCBuf.setSelectedIndex(24);
            }
            if (p.getUf().contains("SP")) {
                jCBuf.setSelectedIndex(25);
            }
            if (p.getUf().contains("SE")) {
                jCBuf.setSelectedIndex(26);
            }
            if (p.getUf().contains("TO")) {
                jCBuf.setSelectedIndex(27);
            }
            txtcep.setText(p.getCep());
            txttelefone1.setText(p.getTelefone1());
            txttelefone2.setText(p.getTelefone2());
            txtemail.setText(p.getEmail());
            txtpathbancodedados.setText(p.getPathbancodedados());
            txtpathsistema.setText(p.getPathsistema());
            txtpathimagens.setText(p.getPathimagens());
            txtqtdpdvs.setText(Integer.toString(p.getQtdpdvs()));
            txtdtinstalacao.setText(formatadorbr.format(p.getDtinstalacao()));
            txtativacaopdv.setText(p.getAtivacaopdv());
            txtdtativacaopdv.setText(formatadorbr.format(p.getDtativacaopdv()));
            txtativacaoenterprise.setText(p.getAtivacaoenterprise());
            txtdtativacaoenterprise.setText(formatadorbr.format(p.getDtativacaoenterprise()));
            if (p.getUsuariocadastro() == 0) {
                txtusuariocadastro.setText("ADMINISTRADOR");
            } else {
                txtusuariocadastro.setText(colaboradordao.pesquisaId_Colaborador(String.valueOf(p.getUsuariocadastro())));
            }
            txtdtcadastro.setText(formatadorbr.format(p.getDtcadastro()));
            if (p.getUsuarioalteracao() == 0) {
                txtusuarioalteracao.setText("ADMINISTRADOR");
            } else {
                txtusuarioalteracao.setText(colaboradordao.pesquisaId_Colaborador(String.valueOf(p.getUsuarioalteracao())));
            }
            txtdtalteracao.setText(formatadorbr.format(p.getDtalteracao()));
        }
        txtrazaosocial.requestFocus();
        AbaParametros.setSelectedIndex(0);
    }
                 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AbaParametros;
    private javax.swing.JDesktopPane SubAbaEmpresa;
    private javax.swing.JDesktopPane SubAbaSistema;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnincluir;
    private javax.swing.JComboBox<String> jCBuf;
    private javax.swing.JPanel jPConfigSistema;
    private javax.swing.JPanel jPEmpresaDados;
    private javax.swing.JPanel jPEmpresaEndereco;
    private javax.swing.JPanel jPOperacao;
    private javax.swing.JLabel lblativacaoenterprise;
    private javax.swing.JLabel lblativacaopdv;
    private javax.swing.JLabel lblbairro;
    private javax.swing.JLabel lblcep;
    private javax.swing.JLabel lblcidade;
    private javax.swing.JLabel lblcnpj;
    private javax.swing.JLabel lblcomplemento;
    private javax.swing.JLabel lblcpf;
    private javax.swing.JLabel lblcpfsocioresponsavel;
    private javax.swing.JLabel lbldtalteracao;
    private javax.swing.JLabel lbldtativacaoenter;
    private javax.swing.JLabel lbldtativacaopdv;
    private javax.swing.JLabel lbldtcadastro;
    private javax.swing.JLabel lbldtinstalcao;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblinscricaoestadual;
    private javax.swing.JLabel lblinscricaomunicipal;
    private javax.swing.JLabel lblnomefantasia;
    private javax.swing.JLabel lblpathbancodedados;
    private javax.swing.JLabel lblpathimagens;
    private javax.swing.JLabel lblpathsistema;
    private javax.swing.JLabel lblqtdfiliais;
    private javax.swing.JLabel lblqtdpdvs;
    private javax.swing.JLabel lblrazaosocial;
    private javax.swing.JLabel lblsocioresponsavel;
    private javax.swing.JLabel lbltelefone1;
    private javax.swing.JLabel lbltelefone2;
    private javax.swing.JLabel lbluf;
    private javax.swing.JLabel lblusuarioalteracao;
    private javax.swing.JLabel lblusuariocadastro;
    private javax.swing.JFormattedTextField txtativacaoenterprise;
    private javax.swing.JFormattedTextField txtativacaopdv;
    private javax.swing.JFormattedTextField txtbairro;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JFormattedTextField txtcidade;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JFormattedTextField txtcomplemento;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JFormattedTextField txtcpfsocioresponsavel;
    private javax.swing.JFormattedTextField txtdtalteracao;
    private javax.swing.JFormattedTextField txtdtativacaoenterprise;
    private javax.swing.JFormattedTextField txtdtativacaopdv;
    private javax.swing.JFormattedTextField txtdtcadastro;
    private javax.swing.JFormattedTextField txtdtinstalacao;
    private javax.swing.JFormattedTextField txtemail;
    private javax.swing.JFormattedTextField txtendereco;
    private javax.swing.JFormattedTextField txtinscricaoestadual;
    private javax.swing.JFormattedTextField txtinscricaomunicipal;
    private javax.swing.JFormattedTextField txtnomefantasia;
    private javax.swing.JFormattedTextField txtpathbancodedados;
    private javax.swing.JFormattedTextField txtpathimagens;
    private javax.swing.JFormattedTextField txtpathsistema;
    private javax.swing.JFormattedTextField txtqtdfiliais;
    private javax.swing.JFormattedTextField txtqtdpdvs;
    private javax.swing.JFormattedTextField txtrazaosocial;
    private javax.swing.JFormattedTextField txtsocioresponsavel;
    private javax.swing.JFormattedTextField txttelefone1;
    private javax.swing.JFormattedTextField txttelefone2;
    private javax.swing.JFormattedTextField txtusuarioalteracao;
    private javax.swing.JFormattedTextField txtusuariocadastro;
    // End of variables declaration//GEN-END:variables
}
