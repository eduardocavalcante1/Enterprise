--select * from colaborador;
--update colaborador set dtdemissao = to_date('20190102', 'YYYYMMDD') where id_colaborador = 7;

--update cfop
--set usuariocadastro  =  0, dtcadastro = current_timestamp,
--usuarioalteracao = 7, dtalteracao =  current_timestamp,
--cancelado =  'N';
--select * from cfop;

select * from filial;
alter column minha_date set default current_timestamp

ALTER TABLE parametros
ADD COLUMN  usuariocadastro  INT NOT NULL DEFAULT 0,
ADD COLUMN  dtcadastro       TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
ADD COLUMN  usuarioalteracao INT                         NOT NULL DEFAULT 0,
ADD COLUMN  dtalteracao      TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
ADD COLUMN  cancelado        VARCHAR(01)                NOT NULL DEFAULT 'N';	


select * from parametros;
select * from filial;

