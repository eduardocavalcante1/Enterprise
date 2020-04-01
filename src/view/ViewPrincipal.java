
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.dao.GenericoDAO;

public class ViewPrincipal extends javax.swing.JFrame {

    public ViewPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
//        if (GenericoDAO.getInstance().checkConexao()) {
//            lblmensagem.setText(" ");
//        } else {
//            lblmensagem.setText(" ");
//        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JDesktopPane();
        lblicone = new javax.swing.JLabel();
        lblmensagem = new javax.swing.JLabel();
        PainelRodape = new javax.swing.JPanel();
        lbldata = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lblcodigousuario = new javax.swing.JLabel();
        lblnomeusuario = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        MItemCliente = new javax.swing.JMenuItem();
        MItemFornecedor = new javax.swing.JMenuItem();
        MItemProduto = new javax.swing.JMenuItem();
        MItemTransportadora = new javax.swing.JMenuItem();
        JMenuMovimentacao = new javax.swing.JMenu();
        jMenuMovCompras = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuMovProdutos = new javax.swing.JMenu();
        MItemEntradadeProdutos = new javax.swing.JMenuItem();
        MItemPrecificacao = new javax.swing.JMenuItem();
        MItemAjusteEstoque = new javax.swing.JMenuItem();
        jMenuMovFinanceiras = new javax.swing.JMenu();
        MItemContasaPagar = new javax.swing.JMenuItem();
        MItemContasaReceber = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuConfig = new javax.swing.JMenu();
        jMenuParametros = new javax.swing.JMenu();
        MItemParametrizar = new javax.swing.JMenuItem();
        jMenuImportar = new javax.swing.JMenu();
        jMtemCidadesIbge = new javax.swing.JMenuItem();
        jMItemFilial = new javax.swing.JMenuItem();
        MItemGrupo = new javax.swing.JMenuItem();
        MItemSubgrupo = new javax.swing.JMenuItem();
        MItemUnidade = new javax.swing.JMenuItem();
        MItemTamanho = new javax.swing.JMenuItem();
        MtemNcm = new javax.swing.JMenuItem();
        MItemTipoFrete = new javax.swing.JMenuItem();
        MItemTipoVenda = new javax.swing.JMenuItem();
        MItemNaturezaOpe = new javax.swing.JMenuItem();
        MtemCfop = new javax.swing.JMenuItem();
        MItemTributos = new javax.swing.JMenuItem();
        MItemFormaPagamento = new javax.swing.JMenuItem();
        MItemPdv = new javax.swing.JMenuItem();
        MItemFuncao = new javax.swing.JMenuItem();
        MItemColaborador = new javax.swing.JMenu();
        MItemCadastroColaborador = new javax.swing.JMenuItem();
        MItemPermissao = new javax.swing.JMenuItem();
        MItemCadastroSenha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enterprise -  Gestão Empresarial");
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PainelPrincipal.setBackground(new java.awt.Color(0, 51, 102));

        lblicone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-símbolo-de-star-trek-nova-geração-30.png"))); // NOI18N

        lblmensagem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensagem.setForeground(new java.awt.Color(255, 255, 255));

        PainelPrincipal.setLayer(lblicone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PainelPrincipal.setLayer(lblmensagem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap(690, Short.MAX_VALUE)
                .addComponent(lblicone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(lblmensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(lblmensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(lblicone)
                .addContainerGap())
        );

        lbldata.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbldata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldata.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblhora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblcodigousuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblcodigousuario.setForeground(java.awt.Color.blue);
        lblcodigousuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcodigousuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblcodigousuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblnomeusuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblnomeusuario.setForeground(java.awt.Color.blue);
        lblnomeusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnomeusuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblnomeusuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout PainelRodapeLayout = new javax.swing.GroupLayout(PainelRodape);
        PainelRodape.setLayout(PainelRodapeLayout);
        PainelRodapeLayout.setHorizontalGroup(
            PainelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRodapeLayout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(lblcodigousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblnomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        PainelRodapeLayout.setVerticalGroup(
            PainelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRodapeLayout.createSequentialGroup()
                .addGroup(PainelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcodigousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        menuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-opened-folder-30.png"))); // NOI18N
        jMenuCadastro.setText("CADASTROS");

        MItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-people-30.png"))); // NOI18N
        MItemCliente.setText("Clientes");
        MItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(MItemCliente);

        MItemFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-buying-30.png"))); // NOI18N
        MItemFornecedor.setText("Fornecedores");
        jMenuCadastro.add(MItemFornecedor);

        MItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-product-30.png"))); // NOI18N
        MItemProduto.setText("Produtos");
        jMenuCadastro.add(MItemProduto);

        MItemTransportadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-truck-30.png"))); // NOI18N
        MItemTransportadora.setText("Transportadoras");
        MItemTransportadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemTransportadoraActionPerformed(evt);
            }
        });
        jMenuCadastro.add(MItemTransportadora);

        menuPrincipal.add(jMenuCadastro);

        JMenuMovimentacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JMenuMovimentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-process-30.png"))); // NOI18N
        JMenuMovimentacao.setText("MOVIMENTAÇÕES");

        jMenuMovCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-comprar-30.png"))); // NOI18N
        jMenuMovCompras.setText("Compras");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-fatura-30.png"))); // NOI18N
        jMenuItem1.setText("Pedido de Compra");
        jMenuMovCompras.add(jMenuItem1);

        JMenuMovimentacao.add(jMenuMovCompras);

        jMenuMovProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-product-30.png"))); // NOI18N
        jMenuMovProdutos.setText("Produtos");

        MItemEntradadeProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-movimento-de-estoque-filled-30.png"))); // NOI18N
        MItemEntradadeProdutos.setText("Entrada de Produtos");
        jMenuMovProdutos.add(MItemEntradadeProdutos);

        MItemPrecificacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pricing-30.png"))); // NOI18N
        MItemPrecificacao.setText("Precificação");
        jMenuMovProdutos.add(MItemPrecificacao);

        MItemAjusteEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-contabilidade-30.png"))); // NOI18N
        MItemAjusteEstoque.setText("Ajuste de Estoque");
        jMenuMovProdutos.add(MItemAjusteEstoque);

        JMenuMovimentacao.add(jMenuMovProdutos);

        jMenuMovFinanceiras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuMovFinanceiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-banco-30.png"))); // NOI18N
        jMenuMovFinanceiras.setText("Financeiras");

        MItemContasaPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-dinheiro-na-mão-30.png"))); // NOI18N
        MItemContasaPagar.setText("Contas a Pagar");
        jMenuMovFinanceiras.add(MItemContasaPagar);

        MItemContasaReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-restituição-30.png"))); // NOI18N
        MItemContasaReceber.setText("Contas a Receber");
        jMenuMovFinanceiras.add(MItemContasaReceber);

        JMenuMovimentacao.add(jMenuMovFinanceiras);

        menuPrincipal.add(JMenuMovimentacao);

        jMenuRelatorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-google-presentation-30.png"))); // NOI18N
        jMenuRelatorio.setText("RELATÓRIOS");
        menuPrincipal.add(jMenuRelatorio);

        jMenuConfig.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-services-30.png"))); // NOI18N
        jMenuConfig.setText("CONFIGURAÇÕES");
        jMenuConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConfigActionPerformed(evt);
            }
        });

        jMenuParametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-support-30.png"))); // NOI18N
        jMenuParametros.setText("Parâmetros e Importações");

        MItemParametrizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-administrative-tools-30.png"))); // NOI18N
        MItemParametrizar.setText("Parametrizar");
        MItemParametrizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemParametrizarActionPerformed(evt);
            }
        });
        jMenuParametros.add(MItemParametrizar);

        jMenuImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-abrir-documento-30.png"))); // NOI18N
        jMenuImportar.setText("Importações");

        jMtemCidadesIbge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-abrir-documento-30.png"))); // NOI18N
        jMtemCidadesIbge.setText("Importações  Cidades IBGE");
        jMtemCidadesIbge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMtemCidadesIbgeActionPerformed(evt);
            }
        });
        jMenuImportar.add(jMtemCidadesIbge);

        jMenuParametros.add(jMenuImportar);

        jMenuConfig.add(jMenuParametros);

        jMItemFilial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-empresas-relacionadas-30.png"))); // NOI18N
        jMItemFilial.setText("Filiais");
        jMItemFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemFilialActionPerformed(evt);
            }
        });
        jMenuConfig.add(jMItemFilial);

        MItemGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-open-box-30.png"))); // NOI18N
        MItemGrupo.setText("Grupos de Produtos");
        MItemGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemGrupoActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemGrupo);

        MItemSubgrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-trolley-30.png"))); // NOI18N
        MItemSubgrupo.setText("Sub-Grupos de Produtos ");
        MItemSubgrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemSubgrupoActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemSubgrupo);

        MItemUnidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-weight-30.png"))); // NOI18N
        MItemUnidade.setText("Pesos e Medidas");
        MItemUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemUnidadeActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemUnidade);

        MItemTamanho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-length-30.png"))); // NOI18N
        MItemTamanho.setText("Tamanhos");
        MItemTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemTamanhoActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemTamanho);

        MtemNcm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-informatics-30.png"))); // NOI18N
        MtemNcm.setText("NCM");
        MtemNcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MtemNcmActionPerformed(evt);
            }
        });
        jMenuConfig.add(MtemNcm);

        MItemTipoFrete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-public-transportation-30.png"))); // NOI18N
        MItemTipoFrete.setText("Tipo de Frete");
        MItemTipoFrete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemTipoFreteActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemTipoFrete);

        MItemTipoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-land-sales-30.png"))); // NOI18N
        MItemTipoVenda.setText("Tipo de Vendas");
        MItemTipoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemTipoVendaActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemTipoVenda);

        MItemNaturezaOpe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-transition-both-directions-30.png"))); // NOI18N
        MItemNaturezaOpe.setText("Naturezas de Operações");
        MItemNaturezaOpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemNaturezaOpeActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemNaturezaOpe);

        MtemCfop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-registry-editor-30.png"))); // NOI18N
        MtemCfop.setText("CFOP");
        MtemCfop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MtemCfopActionPerformed(evt);
            }
        });
        jMenuConfig.add(MtemCfop);

        MItemTributos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-community-grants-30.png"))); // NOI18N
        MItemTributos.setText("Tributação");
        MItemTributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemTributosActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemTributos);

        MItemFormaPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cheap-2-30.png"))); // NOI18N
        MItemFormaPagamento.setText("Forma de Pagamento");
        MItemFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemFormaPagamentoActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemFormaPagamento);

        MItemPdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cash-register-30.png"))); // NOI18N
        MItemPdv.setText("PDVs");
        MItemPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemPdvActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemPdv);

        MItemFuncao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-send-hot-list-30.png"))); // NOI18N
        MItemFuncao.setText("Funcões");
        MItemFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemFuncaoActionPerformed(evt);
            }
        });
        jMenuConfig.add(MItemFuncao);

        MItemColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-workers-30.png"))); // NOI18N
        MItemColaborador.setText("Colaboradores");

        MItemCadastroColaborador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cartão-de-identificação-30.png"))); // NOI18N
        MItemCadastroColaborador.setText("Cadastro");
        MItemCadastroColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemCadastroColaboradorActionPerformed(evt);
            }
        });
        MItemColaborador.add(MItemCadastroColaborador);

        MItemPermissao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-key-30.png"))); // NOI18N
        MItemPermissao.setText("Permissão de Acesso");
        MItemColaborador.add(MItemPermissao);

        MItemCadastroSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-criptografia-de-dados-30.png"))); // NOI18N
        MItemCadastroSenha.setText("Senhas");
        MItemCadastroSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemCadastroSenhaActionPerformed(evt);
            }
        });
        MItemColaborador.add(MItemCadastroSenha);

        jMenuConfig.add(MItemColaborador);

        menuPrincipal.add(jMenuConfig);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal)
            .addComponent(PainelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MItemGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemGrupoActionPerformed
        // TODO add your handling code here:
        ViewGrupo gp = new ViewGrupo();
        PainelPrincipal.add(gp);
        gp.setVisible(true);
        gp.setPosicao();
    }//GEN-LAST:event_MItemGrupoActionPerformed

    private void MItemFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemFormaPagamentoActionPerformed
        // TODO add your handling code here:
        ViewFormaPagamento fp = new ViewFormaPagamento();
        PainelPrincipal.add(fp);
        fp.setVisible(true);
        fp.setPosicao();
       
    }//GEN-LAST:event_MItemFormaPagamentoActionPerformed

    private void jMenuConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuConfigActionPerformed

    private void MItemParametrizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemParametrizarActionPerformed
        ViewParametros p = new ViewParametros();
        PainelPrincipal.add(p);
        p.setVisible(true);
        p.setPosicao();
        
    }//GEN-LAST:event_MItemParametrizarActionPerformed

    private void MItemSubgrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemSubgrupoActionPerformed
        ViewSubGrupo sgp = new ViewSubGrupo();
        PainelPrincipal.add(sgp);
        sgp.setVisible(true);
        sgp.setPosicao();
    }//GEN-LAST:event_MItemSubgrupoActionPerformed

    private void MItemUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemUnidadeActionPerformed
        ViewUnidade und = new ViewUnidade();
        PainelPrincipal.add(und);
        und.setVisible(true);
        und.setPosicao();
    }//GEN-LAST:event_MItemUnidadeActionPerformed

    private void MItemTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemTamanhoActionPerformed
        ViewTamanho tm = new ViewTamanho();
        PainelPrincipal.add(tm);
        tm.setVisible(true);
        tm.setPosicao();
    }//GEN-LAST:event_MItemTamanhoActionPerformed

    private void MtemNcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MtemNcmActionPerformed
        ViewNcm nc = new ViewNcm();
        PainelPrincipal.add(nc);
        nc.setVisible(true);
        nc.setPosicao();
    }//GEN-LAST:event_MtemNcmActionPerformed

    private void MItemTipoFreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemTipoFreteActionPerformed
        ViewFrete ft = new ViewFrete();
        PainelPrincipal.add(ft);
        ft.setVisible(true);
        ft.setPosicao();
    }//GEN-LAST:event_MItemTipoFreteActionPerformed

    private void MItemTipoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemTipoVendaActionPerformed
        ViewTipoVenda tv = new ViewTipoVenda();
        PainelPrincipal.add(tv);
        tv.setVisible(true);
        tv.setPosicao();
    }//GEN-LAST:event_MItemTipoVendaActionPerformed

    private void MItemNaturezaOpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemNaturezaOpeActionPerformed
        ViewNaturezaOpe no = new ViewNaturezaOpe();
        PainelPrincipal.add(no);
        no.setVisible(true);
        no.setPosicao();
    }//GEN-LAST:event_MItemNaturezaOpeActionPerformed

    private void MItemTributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemTributosActionPerformed
        ViewTributacao t = new ViewTributacao();
        PainelPrincipal.add(t);
        t.setVisible(true);
        t.setPosicao();
    }//GEN-LAST:event_MItemTributosActionPerformed

    private void MtemCfopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MtemCfopActionPerformed
        ViewCfop c = new ViewCfop();
        PainelPrincipal.add(c);
        c.setVisible(true);
        c.setPosicao();
    }//GEN-LAST:event_MtemCfopActionPerformed

    private void jMItemFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemFilialActionPerformed
        ViewFilial f = new ViewFilial();
        PainelPrincipal.add(f);
        f.setVisible(true);
        f.setPosicao();
    }//GEN-LAST:event_jMItemFilialActionPerformed

    private void MItemPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemPdvActionPerformed
        ViewPdv p = new ViewPdv();
        PainelPrincipal.add(p);
        p.setVisible(true);
        p.setPosicao();
    }//GEN-LAST:event_MItemPdvActionPerformed

    private void MItemFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemFuncaoActionPerformed
        ViewFuncao f = new ViewFuncao();
        PainelPrincipal.add(f);
        f.setVisible(true);
        f.setPosicao();
    }//GEN-LAST:event_MItemFuncaoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      //this.setExtendedState(MAXIMIZED_BOTH);
      //AJUSTE DATA RODAPE
      Date dataSistema = new Date();
      SimpleDateFormat formatodata  = new SimpleDateFormat("dd/MM/yyyy");
      lbldata.setText(formatodata.format(dataSistema));
      lblcodigousuario.setText(ViewLogin.Id_Colaborador);
      lblnomeusuario.setText(ViewLogin.NomeColaborador);
      
      //AJUSTE HORA RODAPE
      Timer timer = new Timer(1000, new hora());
      timer.start();
      
    }//GEN-LAST:event_formWindowOpened

    private void MItemCadastroColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemCadastroColaboradorActionPerformed
        ViewColaborador c = new ViewColaborador();
        PainelPrincipal.add(c);
        c.setVisible(true);
        c.setPosicao();
    }//GEN-LAST:event_MItemCadastroColaboradorActionPerformed

    private void MItemCadastroSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemCadastroSenhaActionPerformed
        ViewSenha s = new ViewSenha();
        PainelPrincipal.add(s);
        s.setVisible(true);
        s.setPosicao();
    }//GEN-LAST:event_MItemCadastroSenhaActionPerformed

    private void jMtemCidadesIbgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMtemCidadesIbgeActionPerformed
        ViewImportarCidadesIbge i = new ViewImportarCidadesIbge();
        PainelPrincipal.add(i);
        i.setVisible(true);
        i.setPosicao();
    }//GEN-LAST:event_jMtemCidadesIbgeActionPerformed

    private void MItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemClienteActionPerformed
        ViewCliente cliente = new ViewCliente();
        PainelPrincipal.add(cliente);
        cliente.setVisible(true);
        cliente.setPosicao();
    }//GEN-LAST:event_MItemClienteActionPerformed

    private void MItemTransportadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemTransportadoraActionPerformed
        ViewTransportadora transportadora = new ViewTransportadora();
        PainelPrincipal.add(transportadora);
        transportadora.setVisible(true);
        transportadora.setPosicao();
    }//GEN-LAST:event_MItemTransportadoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
        
    }
    
    class hora implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e) {
              Calendar now = Calendar.getInstance();
              lblhora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
          }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuMovimentacao;
    private javax.swing.JMenuItem MItemAjusteEstoque;
    private javax.swing.JMenuItem MItemCadastroColaborador;
    private javax.swing.JMenuItem MItemCadastroSenha;
    private javax.swing.JMenuItem MItemCliente;
    private javax.swing.JMenu MItemColaborador;
    private javax.swing.JMenuItem MItemContasaPagar;
    private javax.swing.JMenuItem MItemContasaReceber;
    private javax.swing.JMenuItem MItemEntradadeProdutos;
    private javax.swing.JMenuItem MItemFormaPagamento;
    private javax.swing.JMenuItem MItemFornecedor;
    private javax.swing.JMenuItem MItemFuncao;
    private javax.swing.JMenuItem MItemGrupo;
    private javax.swing.JMenuItem MItemNaturezaOpe;
    private javax.swing.JMenuItem MItemParametrizar;
    private javax.swing.JMenuItem MItemPdv;
    private javax.swing.JMenuItem MItemPermissao;
    private javax.swing.JMenuItem MItemPrecificacao;
    private javax.swing.JMenuItem MItemProduto;
    private javax.swing.JMenuItem MItemSubgrupo;
    private javax.swing.JMenuItem MItemTamanho;
    private javax.swing.JMenuItem MItemTipoFrete;
    private javax.swing.JMenuItem MItemTipoVenda;
    private javax.swing.JMenuItem MItemTransportadora;
    private javax.swing.JMenuItem MItemTributos;
    private javax.swing.JMenuItem MItemUnidade;
    private javax.swing.JMenuItem MtemCfop;
    private javax.swing.JMenuItem MtemNcm;
    private javax.swing.JDesktopPane PainelPrincipal;
    private javax.swing.JPanel PainelRodape;
    private javax.swing.JMenuItem jMItemFilial;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConfig;
    private javax.swing.JMenu jMenuImportar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuMovCompras;
    private javax.swing.JMenu jMenuMovFinanceiras;
    private javax.swing.JMenu jMenuMovProdutos;
    private javax.swing.JMenu jMenuParametros;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenuItem jMtemCidadesIbge;
    private javax.swing.JLabel lblcodigousuario;
    private javax.swing.JLabel lbldata;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblicone;
    private javax.swing.JLabel lblmensagem;
    private javax.swing.JLabel lblnomeusuario;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
