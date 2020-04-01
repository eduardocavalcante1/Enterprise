-- Script de Criação do Banco enterprise Postgres 
-- 13/03/2019 13:00:58
-- Version: 1.0



-------------------------------------------------------
-- Schema enterprise
-------------------------------------------------------
-- DROP SCHEMA IF EXISTS `enterprise` ;

-- -----------------------------------------------------
-- Schema enterprise
-- -----------------------------------------------------

 -- Database: enterprise

-- DROP DATABASE enterprise;

-- CREATE DATABASE enterprise
--      WITH 
--      OWNER = postgres
--      ENCODING = 'UTF8'
--      LC_COLLATE = 'Portuguese_Brazil.1252'
--      LC_CTYPE = 'Portuguese_Brazil.1252'
--      TABLESPACE = pg_default
--      CONNECTION LIMIT = -1;

--**************************************************************************
--** ETAPA PARA CRIAÇÃO DAS TABELAS DE CADASTRAMENTOS E PARAMETROS
--**************************************************************************

--------------------------------------------------------
-- Table enterprise.parametros
--------------------------------------------------------
CREATE SEQUENCE parametros_id_parametros_seq;
CREATE TABLE IF NOT EXISTS parametros (
   id_parametros        INT         NOT NULL PRIMARY KEY DEFAULT nextval('parametros_id_parametros_seq'),
   razaosocial          VARCHAR(60) NOT NULL,
   nomefantasia         VARCHAR(45) NOT NULL,
   qtdfiliais           INT         NOT NULL,
   cpf                  VARCHAR(11) NOT NULL,
   cnpj                 VARCHAR(14) NOT NULL,
   inscricaoestadual    VARCHAR(15) NOT NULL,
   inscricaomunicipal   VARCHAR(15) ,
   socioresponsavel     VARCHAR(60) NOT NULL,
   cpfsocioresponsavel  VARCHAR(11) NOT NULL,	
   endereco             VARCHAR(60) NOT NULL,
   bairro               VARCHAR(50) NOT NULL,
   complemento          VARCHAR(45),
   cidade               VARCHAR(45) NOT NULL,
   uf                   VARCHAR(02) NOT NULL,
   cep                  VARCHAR(08) NOT NULL,
   telefone1            VARCHAR(11) NOT NULL,
   telefone2            VARCHAR(11),
   email                VARCHAR(50) NOT NULL,
   pathbancodedados     VARCHAR(60) NOT NULL,
   pathsistema          VARCHAR(60) NOT NULL,
   pathimagens          VARCHAR(60) NOT NULL,
   qtdpdvs              INT         NOT NULL,
   dtinstalacao         TIMESTAMP   WITHOUT TIME ZONE NOT NULL,	
   ativacaopdv          VARCHAR(256) NOT NULL, -- Este campo servirá para a ativação dos pdvs 
   dtativacaopdv        TIMESTAMP   WITHOUT TIME ZONE NOT NULL,
   ativacaoenterprise   VARCHAR(256) NOT NULL, -- Este campo servirá para ativação da retaguarda Enterprise
   dtativacaoenterprise TIMESTAMP   WITHOUT TIME ZONE NOT NULL, 	
   usuariocadastro      INT         NOT NULL,
   dtcadastro           TIMESTAMP   WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao     INT         NOT NULL,
   dtalteracao          TIMESTAMP   WITHOUT TIME ZONE NOT NULL	
);

-- -----------------------------------------------------
-- Table enterprise.filial
-- -----------------------------------------------------

CREATE SEQUENCE filial_id_filial_seq;
CREATE TABLE IF NOT EXISTS filial (
   id_filial        INT         NOT NULL PRIMARY KEY DEFAULT nextval('filial_id_filial_seq'),	
   descricao        VARCHAR(45) NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL	 	
);

-- -----------------------------------------------------
-- Table enterprise.unidade
-- -----------------------------------------------------

CREATE SEQUENCE unidade_id_unidade_seq;
CREATE TABLE IF NOT EXISTS unidade (
   id_unidade INT         NOT NULL PRIMARY KEY DEFAULT nextval('unidade_id_unidade_seq'),	
   sigla      VARCHAR(02)                       NOT NULL,
   descricao  VARCHAR(45)                       NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL		
);

--------------------------------------------------------
-- Table enterprise.grupo
--------------------------------------------------------
CREATE SEQUENCE grupo_id_grupo_seq;
CREATE TABLE IF NOT EXISTS grupo (
  id_grupo    INT         NOT NULL PRIMARY KEY DEFAULT nextval('grupo_id_grupo_seq'),
  descricao   VARCHAR(45) NOT NULL,
  usuariocadastro  INT                         NOT NULL,
  dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  usuarioalteracao INT                         NOT NULL,
  dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  cancelado        VARCHAR(01)                 NOT NULL	 	
);


-- -----------------------------------------------------
-- Table enterprise.subgrupo`
-- -----------------------------------------------------
CREATE SEQUENCE subgrupo_id_subgrupo_seq;
CREATE TABLE IF NOT EXISTS subgrupo (
   id_subgrupo      INT         NOT NULL PRIMARY KEY DEFAULT nextval('subgrupo_id_subgrupo_seq'),
   descricao        VARCHAR(45) NOT NULL,
   grupo_id         INT         NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL,		
FOREIGN KEY (grupo_id) REFERENCES grupo (id_grupo)
);	
	
	
---------------------------------------------------------
-- Table enterprise.ncm
-- ------------------------------------------------------
CREATE SEQUENCE ncm_id_ncm_seq;
CREATE TABLE IF NOT EXISTS ncm (
   id_ncm    INT          NOT NULL PRIMARY KEY DEFAULT nextval('ncm_id_ncm_seq'),
   ncm       VARCHAR(08)  NOT NULL,
   descricao VARCHAR(100) NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL		
);

---------------------------------------------------------
-- Table enterprise.frete
-- ------------------------------------------------------
CREATE SEQUENCE frete_id_frete_seq;
CREATE TABLE IF NOT EXISTS frete (
   id_frete         INT       NOT NULL PRIMARY KEY DEFAULT nextval('frete_id_frete_seq'),
   descricao        VARCHAR(45)                 NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL		
);

-------------------------------------------------------
-- Table enterprise.formapagamento
-------------------------------------------------------
CREATE SEQUENCE formapagamento_id_formapagamento_seq;
CREATE TABLE IF NOT EXISTS formapagamento (
   id_formapagamento   INT           NOT NULL 
                       PRIMARY KEY   DEFAULT nextval('formapagamento_id_formapagamento_seq'),
   descricao           VARCHAR(45)   NOT NULL,
   descontopercentual  DECIMAL(3,2),
   acrescimopercentual DECIMAL(3,2),
   prazo               INT,
   usuariocadastro     INT                         NOT NULL,
   dtcadastro          TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao    INT                         NOT NULL,
   dtalteracao         TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado           VARCHAR(01)                 NOT NULL		
);


-- -----------------------------------------------------
-- Table enterprise.estadocivil
-- -----------------------------------------------------
-- CREATE SEQUENCE estadocivil_id_estadocivil_seq;
-- CREATE TABLE IF NOT EXISTS estadocivil (
--    id_estadocivil INT         NOT NULL 
-- 	                          PRIMARY KEY DEFAULT nextval('estadocivil_id_estadocivil_seq'),
--    descricao      VARCHAR(45) NOT NULL,
--    usuariocadastro  INT                         NOT NULL,
--    dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
--    usuarioalteracao INT                         NOT NULL,
--    dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
--    cancelado        VARCHAR(01)                 NOT NULL		
-- );

-- -----------------------------------------------------
-- Table enterprise.tipovenda
-- -----------------------------------------------------
CREATE SEQUENCE tipovenda_id_tipovenda_seq;
CREATE TABLE IF NOT EXISTS tipovenda (
   id_tipovenda INT           NOT NULL
	                          PRIMARY KEY DEFAULT nextval('tipovenda_id_tipovenda_seq'),
   descricao    VARCHAR(45)                     NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL		
);

-- --------------------------------------------------------------
-- Table enterprise.funcao   --   AMARRAR OS ACESSOS PELA FUNÇÃO.
-- ---------------------------------------------------------------
CREATE SEQUENCE funcao_id_funcao_seq;
CREATE TABLE IF NOT EXISTS funcao (
   id_funcao  INT             NOT NULL 
	                          PRIMARY KEY DEFAULT nextval('funcao_id_funcao_seq'),
   descricao    VARCHAR(45)   NOT NULL,
   comissaoperc DECIMAL(18,2) NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL		
);


-- -----------------------------------------------------
-- Table enterpise.pdv
-- -----------------------------------------------------
CREATE SEQUENCE pdv_id_pdv_seq;
CREATE TABLE IF NOT EXISTS pdv (
   id_pdv           INT                             NOT NULL 
	                PRIMARY KEY DEFAULT nextval('pdv_id_pdv_seq'),
   descricao        VARCHAR(45)                     NOT NULL,
   codigopdv        VARCHAR(04)                             , -- CAMPO CRIADO PARA ATENDER AO CODIGO JÁ EXISTENTE NO COMÉRCIO
   filial_id        INT                             NOT NULL,
   dtultcarga       TIMESTAMP WITHOUT TIME ZONE     NOT NULL,
   aberto           VARCHAR(01)                     NOT NULL,
   usuariocadastro  INT                             NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE     NOT NULL,
   usuarioalteracao INT                             NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE     NOT NULL,
   cancelado        VARCHAR(01)                     NOT NULL,		
   FOREIGN KEY (filial_id)    REFERENCES filial (id_filial)
	    
);

-- --------------------------------------------------------------------------------
-- Table enterpise.ibgecidades - ESTA TABELA SERÁ IMPORTADA DO SITE DO IBGE
-- --------------------------------------------------------------------------------
CREATE SEQUENCE ibgecidades_id_ibgecidades_seq;
CREATE TABLE IF NOT EXISTS ibgecidades (
   id_ibgecidades    INT                        NOT NULL 
	             PRIMARY KEY DEFAULT nextval('ibgecidades_id_ibgecidades_seq'),
   nomecidade       VARCHAR(150)                NOT NULL,
   codigocidade     VARCHAR(07)                 NOT NULL,
   uf               VARCHAR(100)                NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL
);


-- -----------------------------------------------------
-- Table enterprise.colaborador
-- -----------------------------------------------------
CREATE SEQUENCE colaborador_id_colaborador_seq;
CREATE TABLE IF NOT EXISTS colaborador (
   id_colaborador   INT                         NOT NULL
	                PRIMARY KEY DEFAULT nextval('colaborador_id_colaborador_seq'),
   nome             VARCHAR(60)                 NOT NULL,
   nomereduzido     VARCHAR(20)                 NOT NULL,
   cpf              VARCHAR(11)                 NOT NULL,
   rg               VARCHAR(20)                         ,
   dtnascimento     DATE                        NOT NULL,
   genero           VARCHAR(01)                 NOT NULL,
   estadocivil      VARCHAR(50)                 NOT NULL,
   nomeconjuge      VARCHAR(60)                         ,
   nomemae          VARCHAR(60)                 NOT NULL,
   nomepai          VARCHAR(60)                         ,
   endereco         VARCHAR(60)                 NOT NULL,
   bairro           VARCHAR(50)                 NOT NULL,
   complemento      VARCHAR(45)                         ,
   cidade           VARCHAR(50)                 NOT NULL,
   uf               VARCHAR(02)                 NOT NULL,
   cep              VARCHAR(08)                 NOT NULL,
   telefone1        VARCHAR(11)                 NOT NULL,
   telefone2        VARCHAR(11)                         ,
   email            VARCHAR(50)                         ,
-- estadocivil_id   INT                         NOT NULL,
   dtadmissao       DATE                        NOT NULL,
   dtdemissao       DATE                      	        ,
   funcao_id        INT                         NOT NULL,
   fiscal           VARCHAR(01)                 NOT NULL,
   ativo            VARCHAR(01)                 NOT NULL,	
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL,	
-- FOREIGN KEY (estadocivil_id) REFERENCES estadocivil (id_estadocivil),
   FOREIGN KEY (funcao_id)      REFERENCES funcao (id_funcao)
	
);

-- -----------------------------------------------------
-- Table enterprise.senhas
-- -----------------------------------------------------
CREATE SEQUENCE senha_id_senha_seq;
CREATE TABLE IF NOT EXISTS senhas (
   id_senha         INT                         NOT NULL 
	                            PRIMARY KEY DEFAULT nextval('senha_id_senha_seq'),
   colaborador_id   INT                         NOT NULL,
   senha            VARCHAR(256)                NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL,	
   FOREIGN KEY (colaborador_id) REFERENCES colaborador (id_colaborador)
);


-- -----------------------------------------------------
-- Table enterprise.permissao
-- -----------------------------------------------------
CREATE SEQUENCE permissao_id_permissao_seq;
CREATE TABLE IF NOT EXISTS permissao (
   id_permissao     INT                         NOT NULL 
	                PRIMARY KEY DEFAULT nextval('permissao_id_permissao_seq'),
   colaborador_id   INT                         NOT NULL,
   rotina           VARCHAR(6)                  NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL,		
   FOREIGN KEY (colaborador_id) REFERENCES colaborador (id_colaborador)
);

-- -----------------------------------------------------
-- Table enterprise.tamanho
-- -----------------------------------------------------
CREATE SEQUENCE tamanho_id_tamanho_seq;
CREATE TABLE IF NOT EXISTS tamanho (
   id_tamanho       INT                         NOT NULL PRIMARY KEY DEFAULT nextval('tamanho_id_tamanho_seq'),
   codigo           VARCHAR(03)                 NOT NULL,
   descricao        VARCHAR(45)                 NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL		
);

-- -----------------------------------------------------
-- Table enterprise.naturezaope
-- -----------------------------------------------------
CREATE SEQUENCE naturezaope_id_naturezaope_seq;
CREATE TABLE IF NOT EXISTS naturezaope (
   id_naturezaope   INT                         NOT NULL PRIMARY KEY DEFAULT nextval('naturezaope_id_naturezaope_seq'),
   descricao        VARCHAR(45)                 NOT NULL,
   classificacao    VARCHAR(04)                 NOT NULL,
   saidaentrada     VARCHAR(01)                 NOT NULL,
   planocontas      VARCHAR(15)                 NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL		
);

-- -----------------------------------------------------
-- Table enterprise.cfop
-- -----------------------------------------------------
CREATE SEQUENCE cfop_id_cfop_seq;
CREATE TABLE IF NOT EXISTS cfop (
   id_cfop          INT                         NOT NULL PRIMARY KEY DEFAULT nextval('cfop_id_cfop_seq'),
   descricao        TEXT                        NOT NULL,
   codigocfop       VARCHAR(05)                 NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL
   		
);

-- -----------------------------------------------------
-- Table enterprise.fornecedor
-- -----------------------------------------------------
CREATE SEQUENCE fornecedor_id_fornecedor_seq;
CREATE TABLE IF NOT EXISTS fornecedor (
   id_fornecedor       INT         NOT NULL PRIMARY KEY DEFAULT nextval('fornecedor_id_fornecedor_seq'),
   razaosocial         VARCHAR(60) NOT NULL,
   nomefantasia        VARCHAR(60) NOT NULL,
   cpf                 VARCHAR(11) NOT NULL,
   cnpj                VARCHAR(14) NOT NULL,
   inscricaoestadual   VARCHAR(15) NOT NULL,
   inscricaomunicipal  VARCHAR(15) NOT NULL,
   endereco            VARCHAR(60) NOT NULL,
   bairro              VARCHAR(50) NOT NULL,
   complemento         VARCHAR(45) NOT NULL,
   cidade              VARCHAR(45) NOT NULL,
   estado              VARCHAR(02) NOT NULL,
   cep                 VARCHAR(08) NOT NULL,
   inicioatividade     DATE        NOT NULL,
   telefone1           VARCHAR(11) NOT NULL,
   telefone2           VARCHAR(11) NOT NULL,
   telefone3           VARCHAR(11) NOT NULL,
   email               VARCHAR(50) NOT NULL,
   sociorepresentante  VARCHAR(45) NOT NULL,
   vendedor            VARCHAR(45) NOT NULL,
   codigomigracao      INT,                   -- ESTE CÓDIGO RECEBE O ID DO PRODUTO QUE ESTÁ SENDO IMPORTADO
   usuariocadastro     INT         NOT NULL,
   dtcadastro          TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao    INT                         NOT NULL,
   dtalteracao         TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado           VARCHAR(01)                 NOT NULL
  	
 );

-- -----------------------------------------------------
-- Table enterprise.produto
-- -----------------------------------------------------
CREATE SEQUENCE produto_id_produto_seq;
CREATE TABLE IF NOT EXISTS produto (
   id_produto         INT                         NOT NULL 
	                  PRIMARY KEY DEFAULT nextval('produto_id_produto_seq'),	
   descricao          VARCHAR(120)                NOT NULL,
   nomereduzido       VARCHAR(60)                 NOT NULL,
   unidade_id         INT                         NOT NULL,
   tamanho_id         INT                         NOT NULL,
   fornecedor_id      INT                         NOT NULL,
   ncm_Id             INT                         NOT NULL,
   subgrupo_id        INT                         NOT NULL,
   fatorconversao     DECIMAL(18,4)               NOT NULL,
   datavalidade       DATE                        NOT NULL,
-- secao              VARCHAR(06)                 NOT NULL,
   codbarrasund       VARCHAR(14)                 NOT NULL,
   codbarraspct       VARCHAR(14)                 NOT NULL,
   classeabc          CHAR(01)                    NOT NULL,
   pesoliquido        DECIMAL(18,4)               NOT NULL,
   pesobruto          DECIMAL(18,4)               NOT NULL,
   cfop               VARCHAR(30)                 NOT NULL,
   garantia           INT                         NOT NULL,
   origem             VARCHAR(01)                 NOT NULL,
   codigofornec       VARCHAR(15)                 NOT NULL, -- CÓDIGO QUE VEM DIRETAMENTE DO FORNECEDOR;
   codigomigracao     INT,	                                -- ESTE CÓDIGO RECEBE O ID DO PRODUTO QUE ESTÁ SENDO IMPORTADO
   usuariocadastro    INT                         NOT NULL,
   dtcadastro         TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao   INT                         NOT NULL,
   dtalteracao        TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   observacao         TEXT                        NOT NULL,
   cancelado          VARCHAR(01)                 NOT NULL,
   FOREIGN KEY (unidade_id)    REFERENCES unidade (id_unidade),
   FOREIGN KEY (tamanho_id)    REFERENCES tamanho (id_tamanho),
   FOREIGN KEY (fornecedor_id) REFERENCES fornecedor (id_fornecedor),
   FOREIGN KEY (subgrupo_id)   REFERENCES subgrupo (id_subgrupo),
   FOREIGN KEY (ncm_id)        REFERENCES ncm (id_ncm)
);


-- -----------------------------------------------------
-- Table enterprise.precificacao
-- -----------------------------------------------------
CREATE SEQUENCE precificacao_id_precificacao_seq;
CREATE TABLE IF NOT EXISTS precificacao (
   id_precificacao   INT                         NOT NULL 
	                 PRIMARY KEY   DEFAULT nextval('precificacao_id_precificacao_seq'),	
   produto_id        INT                         NOT NULL,
   undvenda_Id       INT                         NOT NULL, -- unidade de venda que poderá ser cx ou und
   codbarras         VARCHAR(13)                 NOT NULL,
   precovenda        DECIMAL(18,2)               NOT NULL,
   precocusto        DECIMAL(18,2)               NOT NULL,
   dtinipromocao     TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   dtfimpromocao     TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   precopromocao     DECIMAL(18,2)               NOT NULL,
   descpromocao      DECIMAL(18,4)               NOT NULL,
   usuariocadastro   INT                         NOT NULL,
   dtcadastro        TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao  INT                         NOT NULL,
   dtalteracao       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                  NOT NULL,	
   FOREIGN KEY (produto_id)    REFERENCES produto (id_produto),
   FOREIGN KEY (undvenda_id)   REFERENCES unidade (id_unidade)	
);


-- -----------------------------------------------------
-- Table enterprise.tributacao - CADASTRO DE TRIBUTAÇÃO
-- -----------------------------------------------------
CREATE SEQUENCE tributacao_id_tributacao_seq;
CREATE TABLE IF NOT EXISTS tributacao (
   id_tributacao    INT                         NOT NULL 
	                PRIMARY KEY DEFAULT nextval('tributacao_id_tributacao_seq'),
   descricao        VARCHAR(45)                 NOT NULL,
   uf               VARCHAR(02)                 NOT NULL,
   aliquota         DECIMAL(18,4)               NOT NULL,
   redutor          DECIMAL(18,4)               NOT NULL,
   entradasaida     VARCHAR(01)                 NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL		
);

-- -----------------------------------------------------
-- Table enterprise.produtotributacao
-- -----------------------------------------------------
CREATE SEQUENCE produtotributacao_id_produtotributacao_seq;

CREATE TABLE IF NOT EXISTS produtotributacao (
   id_produtotributacao INT                     NOT NULL 
	                              PRIMARY KEY DEFAULT nextval('produtotributacao_id_produtotributacao_seq'),
   produto_id       INT                         NOT NULL,
   tributacao_id    INT                         NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL,		
   FOREIGN KEY (produto_id)       REFERENCES produto    (id_produto),
   FOREIGN KEY (tributacao_id)    REFERENCES tributacao (id_tributacao)
   	
);


-- -----------------------------------------------------
-- Table enterprise.estoque
-- -----------------------------------------------------
CREATE SEQUENCE estoque_id_estoque_seq;
CREATE TABLE IF NOT EXISTS estoque (
   id_estoque  INT           NOT NULL PRIMARY KEY DEFAULT nextval('estoque_id_estoque_seq'),
   produto_id  INT                              NOT NULL,
   quantidade  DECIMAL(18,4)                    NOT NULL,
   qtdminima   DECIMAL(18,4)                    NOT NULL,
   qtdmaxima   DECIMAL(18,4)                    NOT NULL,
   usuariocadastro  INT                         NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao INT                         NOT NULL,
   dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                 NOT NULL,		
   FOREIGN KEY (produto_id)  REFERENCES produto (id_produto)	
 );
 
 -- -----------------------------------------------------
-- Table enterprise.transportadora
-- -----------------------------------------------------
CREATE SEQUENCE transportadora_id_transportadora_seq;
CREATE TABLE IF NOT EXISTS transportadora (
   id_transportadora  INT                         NOT NULL 
	                  PRIMARY KEY DEFAULT nextval('transportadora_id_transportadora_seq'),
   razãosocial        VARCHAR(60)                         ,
   nomefantasia       VARCHAR(45)                 NOT NULL,
   cpf                VARCHAR(11)                 NOT NULL,
   cnpj               VARCHAR(14)                 NOT NULL,
   inscricaoestadual  VARCHAR(15)                 NOT NULL,
   inscricaomunicipal VARCHAR(15)                         ,
   endereco           VARCHAR(60)                 NOT NULL,
   bairro             VARCHAR(50)                 NOT NULL,
   complemento        VARCHAR(45)                         ,
   cidade             VARCHAR(45)                 NOT NULL,
   uf                 VARCHAR(02)                 NOT NULL,
   cep                VARCHAR(08)                 NOT NULL,
   telefone1          VARCHAR(11)                         ,
   telefone2          VARCHAR(11)                         ,
   telefone3          VARCHAR(11)                         ,
   email              VARCHAR(50)                 NOT NULL,
   contato            VARCHAR(45)                         ,
   ativo              VARCHAR(01)                 NOT NULL,
   usuariocadastro    INT                         NOT NULL,
   dtcadastro         TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao   INT                         NOT NULL,
   dtalteracao        TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado        VARCHAR(01)                   NOT NULL		
 );

---------------------------------------------------------------------------------
-- Table enterprise.pedcompracab  -- Tabela de Cabeçalhos de Pedidos de Compras
----------------------------------------------------------------------------------
CREATE SEQUENCE pedcompracab_id_pedcompracab_seq;
CREATE TABLE IF NOT EXISTS pedcompracab (
   id_pedcompracab    INT                         NOT NULL 
	                  PRIMARY KEY   DEFAULT nextval('pedcompracab_id_pedcompracab_seq'),
   fornecedor_id      INT                         NOT NULL,
   colaborador_id     INT                         NOT NULL,
   transportadora_id  INT                         NOT NULL,	
   frete_id           INT                         NOT NULL,
   datapedido         DATE                        NOT NULL,
   dataentrega        DATE                        NOT NULL,
   valortotal         DECIMAL(18,2)               NOT NULL,
   formapagamento_id  INT                         NOT NULL,
   usuariocadastro    INT                         NOT NULL,
   dtcadastro         TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao   INT                         NOT NULL,
   dtalteracao        TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado          VARCHAR(01)                 NOT NULL,		
   FOREIGN KEY (fornecedor_id)      REFERENCES fornecedor     (id_fornecedor),
   FOREIGN KEY (colaborador_id)     REFERENCES colaborador    (id_colaborador),	
   FOREIGN KEY (transportadora_id)  REFERENCES transportadora (id_transportadora),
   FOREIGN KEY (frete_id)           REFERENCES frete          (id_frete)		
  
 );


-- --------------------------------------------------------------------------
-- Table enterprise.pedcomprasitens - Tabela de itens de pedidos de compras
--                                  - Tabela amarrada a tabela pedcompracab
-- --------------------------------------------------------------------------
CREATE SEQUENCE pedcompraitens_id_pedcompraitens_seq;
CREATE TABLE IF NOT EXISTS pedcompraitens (

  id_pedcompraitens     INT                    NOT NULL 
	                    PRIMARY KEY   DEFAULT nextval('pedcompraitens_id_pedcompraitens_seq'),	
  pedcompracab_id       INT                    NOT NULL,
  produto_id            INT                    NOT NULL,
  unidade_id            INT                    NOT NULL,
  ncm_id                INT                    NOT NULL,
  quantidade            INT                    NOT NULL,
  valorunt              DECIMAL(18,2)          NOT NULL,
  valortotal            DECIMAL(18,2)          NOT NULL,
  cfop                  VARCHAR(05)            NOT NULL,
  baseicms              DECIMAL(18,2)          NOT NULL,
  aliquotaicms          DECIMAL(18,4)          NOT NULL,
  valoricms             DECIMAL(18,2)          NOT NULL,
  baseipi               DECIMAL(18,2)          NOT NULL,
  aliquotaipi           DECIMAL(18,4)          NOT NULL,
  valoripi              DECIMAL(18,2)          NOT NULL,
  usuariocadastro  INT                         NOT NULL,
  dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  usuarioalteracao INT                         NOT NULL,
  dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  cancelado        VARCHAR(01)                 NOT NULL		
  FOREIGN KEY (pedcompracab_id)       REFERENCES pedcompracab (id_pedcompracab),
  FOREIGN KEY (produto_id)            REFERENCES produto      (id_produto),
  FOREIGN KEY (unidade_id)            REFERENCES unidade      (id_unidade),	
  FOREIGN KEY (ncm_id)	              REFERENCES ncm          (id_ncm)

);

---------------------------------------------------------------------------------
-- Table enterprise.nfecab  -- Tabela do cabeçalho das notas fiscais de entrada
--                          -- Tabela amarrada a nfeitens
---------------------------------------------------------------------------------
CREATE SEQUENCE nfecab_id_nfecab_seq;
CREATE TABLE IF NOT EXISTS nfecab (
   id_nfecab         INT                         NOT NULL 
                     PRIMARY KEY   DEFAULT nextval('nfecab_id_nfecab_seq'),
   produto_id        INT                         NOT NULL,
   fornecedor_id     INT                         NOT NULL,
   pedcompracab_id   INT                         NOT NULL,
   naturezaope_id    INT                         NOT NULL,
   frete_id          INT                         NOT NULL,	
   numnf             VARCHAR(15)                 NOT NULL,
   numnfdev          VARCHAR(15)                 NOT NULL, -- ALTERAR URGENTE...
   serienf           VARCHAR(04)                 NOT NULL,
   tipoes            VARCHAR(01)                 NOT NULL,
   dataemissao       DATE                        NOT NULL,
   dataentrega       DATE                        NOT NULL,
   valornf           DECIMAL(18,2)               NOT NULL, 
   baseicms          DECIMAL(18,2)               NOT NULL,
   valoricms         DECIMAL(18,2)               NOT NULL,
   baseicmsst        DECIMAL(18,2)               NOT NULL,
   valoricmsst       DECIMAL(18,2)               NOT NULL,
   valoripi          DECIMAL(18,2)               NOT NULL,
   valorpis          DECIMAL(18,2)               NOT NULL,
   valorconfins      DECIMAL(18,2)               NOT NULL,
   valorimport       DECIMAL(18,2)               NOT NULL,
   valorseguro       DECIMAL(18,2)               NOT NULL,
   valorfrete        DECIMAL(18,4)               NOT NULL,
   valoroutrasdesp   DECIMAL(18,2)               NOT NULL,
   desconto          DECIMAL(18,2)               NOT NULL,
   volumes           INT                         NOT NULL,
   pesobruto         DECIMAL(18,4)               NOT NULL,
   pesoliquido       DECIMAL(18,4)               NOT NULL,
   transportadora_id INT                         NOT NULL,
   usuariocadastro   INT                         NOT NULL,
   dtcadastro        TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao  INT                         NOT NULL,
   dtalteracao       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado         VARCHAR(01)                 NOT NULL,		
   FOREIGN KEY (produto_id)        REFERENCES produto      (id_produto),
   FOREIGN KEY (fornecedor_id)     REFERENCES fornecedor   (id_fornecedor),	
   FOREIGN KEY (pedcompracab_id)   REFERENCES pedcompracab (id_pedcompracab),
   FOREIGN KEY (naturezaope_id)    REFERENCES naturezaope  (id_naturezaope),	
   FOREIGN KEY (frete_id)          REFERENCES frete        (id_frete)	
 );

 
 -- ------------------------------------------------------------------------------
-- Table enterprise.nfeitens -- Tabela com os itens das notas fiscais de entradas
--                           -- Tabela amarrada a tabela nefcab 
-- -------------------------------------------------------------------------------
CREATE SEQUENCE nfeitens_id_nfeitens_seq;
CREATE TABLE IF NOT EXISTS nfeitens (
   id_nfeitens       INT                         NOT NULL 
                     PRIMARY KEY   DEFAULT nextval('nfeitens_id_nfeitens_seq'),
   nfecab_id         INT                         NOT NULL,
   produto_id        INT                         NOT NULL,
   ncm_id            INT                         NOT NULL,	
   siglaunidade      VARCHAR(02)                 NOT NULL, -- SIGLA DA UNIDADE DO PRODUTO
   quantidade        DECIMAL(18,4)               NOT NULL,
   valorunt          DECIMAL(18,2)               NOT NULL,
   valortotal        DECIMAL(18,2)               NOT NULL,
   cfop              VARCHAR(05)                 NOT NULL,
   baseicms          DECIMAL(18,2)               NOT NULL,
   valoricms         DECIMAL(18,2)               NOT NULL,
   aliquotaicms      DECIMAL(18,4)               NOT NULL,
   baseipi           DECIMAL(18,2)               NOT NULL,
   valoripi          DECIMAL(18,2)               NOT NULL,
   aliquotaipi       DECIMAL(18,4)               NOT NULL,
   usuariocadastro   INT                         NOT NULL,
   dtcadastro        TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   usuarioalteracao  INT                         NOT NULL,
   dtalteracao       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cancelado         VARCHAR(01)                 NOT NULL,		
   FOREIGN KEY (nfecab_id)         REFERENCES nfecab   (id_nfecab),
   FOREIGN KEY (produto_id)        REFERENCES produto  (id_produto),
   FOREIGN KEY (ncm_id)            REFERENCES ncm      (id_ncm)	
	
);

-- --------------------------------------------------------------
-- Table enterprise.cliente - Tabela com os dados dos clientes
-- ---------------------------------------------------------------
CREATE SEQUENCE cliente_id_cliente_seq;
CREATE TABLE IF NOT EXISTS cliente (
  id_cliente            INT                         NOT NULL 
                        PRIMARY KEY                 DEFAULT nextval('cliente_id_cliente_seq'),	
  nome                  VARCHAR(60)                 NOT NULL,
  razaosocial           VARCHAR(60)                         ,	
  cpf                   VARCHAR(11)                 NOT NULL, -- colocar zero ser for CNPJ
  cnpj                  VARCHAR(14)                 NOT NULL, -- colocar zero se for CPF	
  inscricaoestadual     VARCHAR(15)                 NOT NULL, -- colocar isento para forçar o cadastro
  inscricaomunicipal    VARCHAR(15)                         ,
  endereco              VARCHAR(60)                 NOT NULL,
  bairro                VARCHAR(50)                 NOT NULL,
  complemento           VARCHAR(45)                 NOT NULL,
  cidade                VARCHAR(50)                 NOT NULL,
  estado                VARCHAR(02)                 NOT NULL,
  cep                   VARCHAR(08)                 NOT NULL,
  dtnascimentofundacao  DATE                        NOT NULL,
  telefone1             VARCHAR(09)                 NOT NULL,
  telefone2                                                 ,
  telefone3             VARCHAR(09)                         ,
  email                 VARCHAR(50)                 NOT NULL,
  nomeconjuge           VARCHAR(60)                         ,
  nomepai               VARCHAR(60)                         ,
  nomemae               VARCHAR(60)                         ,
  genero                VARCHAR(01)                         ,
  atividadeprofissional VARCHAR(45)                         ,
  limitecredito         DECIMAL(18,2)               NOT NULL,
  saldo                 DECIMAL(18,2)               NOT NULL,
  ativo                 VARCHAR(01)                 NOT NULL,
  codigomigracao        INT                                 , -- ESTE CÓDIGO RECEBE O ID DO PRODUTO QUE ESTÁ SENDO IMPORTADO
  usuariocadastro       INT                         NOT NULL,	
  dtcadastro            TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  usuarioalteracao      INT                         NOT NULL,
  dtalteracao           TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  cancelado             VARCHAR(01)                 NOT NULL		
   	
);


--******************************************************************************
-- ETAPA DE COMUNICAÇÃO  FRENTE DE LOJA (PDV) COM A RETAGUARDA (ENTERPRISE) E
--                       RETAGUARDA (ENTERPRISE) COM A FRENTE DE LOJA (PDV)  
-- ETAPA DE IMPORTAÇÃO E EXPORTACAO DOS DADOS DAS VENDAS REALIZADAS NO PDV
--*******************************************************************************


--------------------------------------------------------------------------------
-- Table enterprise.fechapdvret  -- Tabela com os fechamentos diários dos pdvs
--------------------------------------------------------------------------------

CREATE SEQUENCE fechapdvret_id_fechapdvret_seq;
CREATE TABLE IF NOT EXISTS fechapdvret (
  id_openpdvret    INT NOT NULL 
                   PRIMARY KEY  DEFAULT nextval('fechapdvret_id_fechapdvret_seq'),	
  pdv_id           INT                          NOT NULL,
  colaborador_id   INT                          NOT NULL,
  dtabertura       TIMESTAMP WITHOUT TIME ZONE  NOT NULL,
  dtfechamento     TIMESTAMP WITHOUT TIME ZONE  NOT NULL,
  saldoabertura    DECIMAL(18,2)                NOT NULL,
  vltotdinheiro    DECIMAL(18,2)                NOT NULL,
  vltotcheque      DECIMAL(18,2)                NOT NULL,
  vltotcartao      DECIMAL(18,2)	            NOT NULL,
  vltotoutros      DECIMAL(18,2)                NOT NULL,	
  vltotsangria     DECIMAL(18,2)                NOT NULL,  -- O valor da Sangria é a retirada em dinheiro do PDV
  vltotliquido     DECIMAL(18,2)                NOT NULL,  -- valorliquido = valordinheiro - valorsangria
  totalvendas      INT                          NOT NULL,
  usuariocadastro  INT                          NOT NULL,
  dtcadastro       TIMESTAMP WITHOUT TIME ZONE  NOT NULL,
  FOREIGN KEY (pdv_id)          REFERENCES pdv (id_pdv),	
  FOREIGN KEY (colaborador_id)  REFERENCES colaborador (id_colaborador)	  
	
);


-----------------------------------------------------------------------------------------------------
-- Table enterprise.pedvendacab  -- Tabela com os cabecalhos de todos os pedidos de vendas realizados
------------------------------------------------------------------------------------------------------
CREATE SEQUENCE pedvendacab_id_pedvendacab_seq;
CREATE TABLE IF NOT EXISTS pedvendacab (
   id_pedvendacab     INT                         NOT NULL
	                  PRIMARY KEY   DEFAULT nextval('pedvendacab_id_pedvendacab_seq'),
   cliente_id         INT                         NOT NULL,
   vendedor_id        INT                         NOT NULL,
   colaborador_id     INT                         NOT NULL,
   valortotalvenda    DECIMAL(18,2)               NOT NULL,
   valortotaldesconto DECIMAL(18,2)               NOT NULL,
   formapagamento_id  INT                         NOT NULL,
   datapedido         TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   datavalidadeped    TIMESTAMP WITHOUT TIME ZONE NOT NULL, -- data de validade do pedido  	
   totalitens         INT                         NOT NULL,
   usuariocadastro    INT                         NOT NULL,
   dtcadastro         TIMESTAMP WITHOUT TIME ZONE NOT NULL,	
   FOREIGN KEY (cliente_id)         REFERENCES cliente     (id_cliente),	
   FOREIGN KEY (vendedor_id)        REFERENCES colaborador (id_colaborador), 
   FOREIGN KEY (colaborador_id)     REFERENCES colaborador (id_colaborador)	   
  
 );

-- ---------------------------------------------------------------------------------
-- Table enterprise.pedvendaitens - Tabela com os itens dos pedidos de vendas
-- ---------------------------------------------------------------------------------
CREATE SEQUENCE pedvendaitens_id_pedvendaitens_seq;
CREATE TABLE IF NOT EXISTS pedvendaitens (
 id_pedvendaitens  INT           NOT NULL 
	                    PRIMARY KEY   DEFAULT nextval('pedvendaitens_id_pedvendaitens_seq'),	
  pedvendacab_id   INT           NOT NULL,
  produto_id       INT           NOT NULL, -- codigo do produto
  unidade_id       INT           NOT NULL, -- unidade de venda se é unidade, cx, fardo etc
  ncm_id           INT           NOT NULL,	
  quantidade       DECIMAL(18,4) NOT NULL, -- quantidade a ser vendida
  valorunt         DECIMAL(18,2) NOT NULL, -- valor unitario do produto
  valoruntpromocao DECIMAL(18,2) NOT NULL, -- valor unitario promocional. caso preenchido será ele a prioridade
  valortotal       DECIMAL(18,2) NOT NULL, -- valor total da quantidade do produto
  descontoperc     DECIMAL(18,4) NOT NULL, -- percentual de desconto
  descontovalor    DECIMAL(18,2) NOT NULL, -- valor de desconto
  cfop             VARCHAR(05)   NOT NULL, -- código fiscal de operações e prestações das entradas e saídas de mercadorias
  baseicms         DECIMAL(18,2) NOT NULL, -- base  do ICMS do produto no momento do pedido
  aliquotaicms     DECIMAL(18,4) NOT NULL, -- aliquota do ICMS do produto no momento do pedido
  valoricms        DECIMAL(18,2) NOT NULL, -- valor do ICMS do produto no momento do pedido
  baseipi          DECIMAL(18,2) NOT NULL, -- base IPI do produto no momento do pedido
  aliquotaipi      DECIMAL(18,4) NOT NULL, -- aliquota do IPI do produto no momento do pedido
  valoripi         DECIMAL(18,2) NOT NULL, -- valor do IPI do produto no momento do pedido
  usuariocadastro  INT           NOT NULL,
  dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,		
  FOREIGN KEY (pedvendacab_id)   REFERENCES pedvendacab (id_pedvendacab),
  FOREIGN KEY (produto_id)       REFERENCES produto     (id_produto),
  FOREIGN KEY (unidade_id)       REFERENCES unidade     (id_unidade),	
  FOREIGN KEY (ncm_id)	         REFERENCES ncm         (id_ncm)

);



------------------------------------------------------------------------------------------------------------
-- Table enterprise.vendacab -- Tabela com os cabeçalhos de todas as vendas realizadas e importadas dos pdvs
------------------------------------------------------------------------------------------------------------
CREATE SEQUENCE vendacab_id_vendacab_seq;
CREATE TABLE IF NOT EXISTS vendacab (
   id_vendacab        INT           NOT NULL
	                  PRIMARY KEY   DEFAULT nextval('vendacab_id_vendacab_seq'),
   pdv_id             INT           NOT NULL,
   colaborador_id     INT           NOT NULL,
   cliente_id         INT           NOT NULL,
   vendedor_id        INT           NOT NULL,
   pedvendacab_id     INT           NOT NULL,
   valortotalvenda    DECIMAL(18,2) NOT NULL,
   valortotaldesconto DECIMAL(18,2) NOT NULL,
   valorpago          DECIMAL(18,2) NOT NULL,
   numnf              VARCHAR(45)   NOT NULL,
   serienf            VARCHAR(04)   NOT NULL,	
   datavenda          TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   totalitens         INT           NOT NULL, 	
   usuariocadastro    INT           NOT NULL,
   dtcadastro         TIMESTAMP WITHOUT TIME ZONE NOT NULL,		
   FOREIGN KEY (pdv_id)             REFERENCES pdv         (id_pdv),
   FOREIGN KEY (colaborador_id)     REFERENCES colaborador (id_colaborador),
   FOREIGN KEY (cliente_id)         REFERENCES cliente     (id_cliente),	
   FOREIGN KEY (vendedor_id)        REFERENCES colaborador (id_colaborador),	
   FOREIGN KEY (pedvendacab_id)     REFERENCES pedvendacab (id_pedvendacab) 
	
 );

-----------------------------------------------------------------------------------------
-- Table enterprise.vendaitens -- Tabela com todos os itens vendidos e importados do pdv 
-----------------------------------------------------------------------------------------
CREATE SEQUENCE vendaitens_id_vendaitens_seq;
CREATE TABLE IF NOT EXISTS vendaitens (
   id_vendaitens    INT           NOT NULL 
	                PRIMARY KEY DEFAULT nextval('vendaitens_id_vendaitens_seq'),
   pdv_id           INT           NOT NULL, -- pdv (caixa) que foi realizada a venda
   vendacab_id      INT           NOT NULL, -- cabeçalho da venda
   produto_id       INT           NOT NULL, -- codigo do produto
   undvenda         VARCHAR(02)   NOT NULL,	-- unidade de venda se é unidade, cx, fardo etc
   quantidade       DECIMAL(18,4) NOT NULL, -- quantidade a ser vendida
   valorunt         DECIMAL(18,2) NOT NULL, -- valor unitario
   valoruntpromocao DECIMAL(18,2) NOT NULL, -- valor unitario promocional. caso preenchido será ele a prioridade
   valortotal       DECIMAL(18,2) NOT NULL, -- 
   descontoperc     DECIMAL(18,4) NOT NULL, -- percentual de desconto
   descontovalor    DECIMAL(18,2) NOT NULL, -- valhor de desconto
   dtvenda          TIMESTAMP WITHOUT TIME ZONE NOT NULL, -- data da venda
   cfop             VARCHAR(05)   NOT NULL, -- código fiscal de operações e prestações das entradas e saídas de mercadorias
   baseicms         DECIMAL(18,2) NOT NULL, -- base  do ICMS do produto no momento do pedido
   aliquotaicms     DECIMAL(18,4) NOT NULL, -- aliquota do ICMS do produto no momento do pedido
   valoricms        DECIMAL(18,2) NOT NULL, -- valor do ICMS do produto no momento do pedido
   baseipi          DECIMAL(18,2) NOT NULL, -- base IPI do produto no momento do pedido
   aliquotaipi      DECIMAL(18,4) NOT NULL, -- aliquota do IPI do produto no momento do pedido
   valoripi         DECIMAL(18,2) NOT NULL, -- valor do IPI do produto no momento do pedido
   usuariocadastro  INT           NOT NULL,
   dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL,		
   FOREIGN KEY (pdv_id)           REFERENCES pdv         (id_pdv),
   FOREIGN KEY (vendacab_id)      REFERENCES vendacab    (id_vendacab),
   FOREIGN KEY (produto_id)       REFERENCES produto     (id_produto)	
 
);

-----------------------------------------------------------------------------------------------------
-- Table enterprise.formapgvenda  -- Formas de pagamento das vendas realizadas no pdv. 
----------------------------------------------------------------------------------------------------
CREATE SEQUENCE formapgvenda_id_formapgvenda_seq;
CREATE TABLE IF NOT EXISTS formapgvenda (
   id_formapgvenda    INT           NOT NULL
	                  PRIMARY KEY   DEFAULT nextval('formapgvenda_id_formapgvenda_seq'),
	 
   formapagamento_id  INT           NOT NULL,
   vendacab_id        INT           NOT NULL,
   valorpagamento     DECIMAL(18,2) NOT NULL,               -- valor do pagamento       	
   dtregistro         TIMESTAMP WITHOUT TIME ZONE NOT NULL, -- data do registro
   usuariocadastro    INT                         NOT NULL,
   dtcadastro         TIMESTAMP WITHOUT TIME ZONE NOT NULL,	 	
   FOREIGN KEY (formapagamento_id)  REFERENCES formapagamento  (id_formapagamento),
   FOREIGN KEY (vendacab_id)        REFERENCES vendacab        (id_vendacab) 	

);

