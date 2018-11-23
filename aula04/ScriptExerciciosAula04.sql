SELECT * from UF; 

SELECT * from CIDADE; 

SELECT * FROM PESSOA;

-- PESSOA E SEUS ENDERECOS
SELECT * FROM PESSOA 
INNER JOIN ENDERECO ON PESSOA.ID = ENDERECO.PESSOA_ID

-- Usando BaseFuscascript.sql
-- Execute antes

SET SQL_SAFE_UPDATES = 0;

-- Execício 1

INSERT INTO UF (NOME) VALUES ('AC'), ('AL'), ('AP'), ('AM'), ('BA'), ('CE'), ('DF'), ('ES'), 
('GO'), ('MT'), ('MS'), ('PA'), ('PB'), ('PR'), ('PE'), ('PI'), ('RJ'), ('RN'), ('RS'), ('RO'), 
('RR'), ('SC'), ('SP'), ('SE'), ('TO'), ('MA'), ('MG') 

-- Execício 2

INSERT INTO CIDADE (NOME, UF_ID) 
VALUES 
('Chapecó', 22), 
('Blumenau',22),
('Joinville', 22),
('Curitiba', 14),
('Maringá', 14),
('Lunardeli', 14),
('Apucarana', 14),
('Santa fé', 14),
('São Miguel do Iguaçu', 14),
('Arapongas', 14),
('Ponta Grossa', 14),
('Jandaia do Sul', 14),
('Ribeirão Preto', 23)


-- Execício 3

DELETE FROM UF WHERE UF.ID NOT IN (22,14,23) 

-- Execício 4

INSERT INTO CIDADE (NOME, UF_ID)
VALUES ('CIDADE1', 23),
('CIDADE2', 23),
('CIDADE3', 23),
('CIDADE4', 23),
('CIDADE5', 23),
('CIDADE6', 23),
('CIDADE7', 23),
('CIDADE8', 23),
('CIDADE9', 23),
('CIDADE10', 23),
('CIDADE11', 23),
('CIDADE12', 23)

-- Execício 5
 

UPDATE CIDADE SET NOME = 'Lunardelli' where CIDADE.ID = 6

UPDATE CIDADE SET NOME = 'Jandaia' where CIDADE.ID = 12

UPDATE CIDADE SET NOME = 'Cidade Canção' where CIDADE.ID = 14 

-- Execício 6

SELECT CIDADE.NOME AS CIDADE, UF.NOME AS UF
 FROM CIDADE 
INNER JOIN UF ON UF.ID = CIDADE.UF_ID
ORDER BY UF.NOME, CIDADE.NOME

-- Execício 7

SELECT  UF.NOME AS UF, COUNT(CIDADE.ID) AS 'Quantidade de cidades' FROM CIDADE 
INNER JOIN UF ON UF.ID = CIDADE.UF_ID
GROUP BY CIDADE.UF_ID
ORDER BY UF.NOME, CIDADE.NOME
-- Execício 8

ALTER TABLE ENDERECO
MODIFY COLUMN  TIPO VARCHAR(10) NULL

INSERT INTO PESSOA (NOME,DOCUMENTO) VALUES
('Joao','11111111111'),
('Maria','22222222222'),
('Jose','33333333333')

INSERT INTO ENDERECO (TIPOLOGRADOURO,LOGRADOURO,NUMERO,COMPLEMENTO,CEP,TIPO,CIDADE_ID,PESSOA_ID) VALUES
('Rua', 'Logradouro1','111','Apto 11', '11111000', 'Comercial', 4,1),
('Av', 'Logradouro2','222','Apto 22', '22222000', 2, 4,1),
('Rua', 'Logradouro3','333','Apto 33', '33333000', 'Comercial', 6,2),
('Av', 'Logradouro4','444','Apto 44', '44444000', 2, 6,2),
('Rua', 'Logradouro5','555','Apto 55', '55555000', 'Comercial', 7,3),
('Av', 'Logradouro6','555','Apto 66', '66666000', 2, 7,3)

-- Exercício 9 

INSERT INTO PESSOA (NOME,DOCUMENTO) VALUES
('Jones','44444444444'),
('Marta','55555555555')

select * from cidade

INSERT INTO ENDERECO (TIPOLOGRADOURO,LOGRADOURO,NUMERO,COMPLEMENTO,CEP,TIPO,CIDADE_ID,PESSOA_ID) VALUES
('Rua', 'Logradouro7','777','Apto 77', '77777000', 'Comercial', 13,4),
('Av', 'Logradouro8','888','Apto 88', '88888000', 'Comercial', 13,4),
('Rua', 'Logradouro9','999','Apto 99', '99999000', 'Comercial', 14,5),
('Av', 'Logradouro10','1010','Apto 1010', '01111000', 'Comercial', 14,5)

-- Exercício 11

SELECT P.NOME, e.logradouro, e.cep, c.nome as cidade, 
u.nome as  estado
FROM PESSOA P
inner join endereco e on e.pessoa_id = p.id
inner join cidade c on c.id = e.cidade_id
inner join uf u on u.id = c.uf_id
order by p.nome, c.nome, u.nome


-- Execício 12 pegadinha
-- deve ser usado funcao ou procedure

-- Execício 14

ALTER TABLE RECIBO CHANGE `prestador_pessoa_id` `prestador_fk` int;

ALTER TABLE RECIBO CHANGE `emitente_pessoa_id` `emitente_fk` int;

ALTER TABLE RECIBO CHANGE `prestador_fk` `cliente_fk` int;

-- Execício 17

select r.id as numeroRecibo, 	r.dataEmissao,    r.valor,
	cliente.nome as nomeCliente, ucliente.nome as  ufCliente,
    emitente.nome as nomeEmitente, emit_uf.nome as ufEmitente
  from recibo r
inner join pessoa cliente on cliente.id = r.cliente_fk
inner join endereco ecliente on ecliente.pessoa_id = cliente.id
inner join cidade ccliente on ccliente.id = ecliente.cidade_id
inner join uf ucliente on ucliente.id = ccliente.uf_id
inner join pessoa emitente on emitente.id = r.emitente_fk
inner join endereco emit_end on emit_end.pessoa_id = emitente.id
inner join cidade emit_cidade on emit_cidade.id = emit_end.cidade_id
inner join uf emit_uf on emit_uf.id = emit_cidade.uf_id
order by r.dataEmissao, cliente.nome, emitente.nome
