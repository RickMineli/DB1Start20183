Select * from uf

Select * from CIDADE

-- Usando BaseFuscascript.sql
-- todos os id podem estar errado por conta 
-- do auto increment e testes feitos
-- Execício 1

INSERT INTO UF (NOME) VALUES ('AC'), ('AL'), ('AP'), ('AM'), ('BA'), ('CE'), ('DF'), ('ES'), 
('GO'), ('MT'), ('MS'), ('PA'), ('PB'), ('PR'), ('PE'), ('PI'), ('RJ'), ('RN'), ('RS'), ('RO'), 
('RR'), ('SC'), ('SP'), ('SE'), ('TO'), ('MA'), ('MG') 

-- Execício 2

INSERT INTO CIDADE (NOME, UF_IDUF) 
VALUES ('Chapecó', 26), 
('Blumenau',26),
('Joinville', 26),
('Curitiba', 25),
('Maringá', 25),
('Lunardeli', 25),
('Apucarana', 25),
('Santa fé', 25),
('São Miguel do Iguaçu', 25),
('Arapongas', 25),
('Ponta Grossa', 25),
('Jandaia do Sul', 25),
('Ribeirão Preto', 27)


-- Execício 3

DELETE FROM UF WHERE IDUF NOT IN (26,25,27) 

-- Execício 4

INSERT INTO CIDADE (NOME, UF_IDUF)
VALUES ('CIDADE1', 27),
('CIDADE2', 27),
('CIDADE3', 27),
('CIDADE4', 27),
('CIDADE5', 27),
('CIDADE6', 27),
('CIDADE7', 27),
('CIDADE8', 27),
('CIDADE9', 27),
('CIDADE10', 27),
('CIDADE11', 27),
('CIDADE12', 27)

-- Execício 5

UPDATE CIDADE SET NOME = 'Lunardelli' where idcidade = 12

UPDATE CIDADE SET NOME = 'Jandaia' where idcidade = 18

UPDATE CIDADE SET NOME = 'Cidade Canção' where idcidade = 11 

-- Execício 6

SELECT CIDADE.NOME AS NOMECIDADE, UF.NOME AS NOMEUF
 FROM CIDADE 
INNER JOIN UF ON UF.IDUF = CIDADE.UF_IDUF

-- Execício 7

SELECT COUNT(CIDADE.IDCIDADE) AS 'Quantidade de cidades', UF.NOME FROM CIDADE 
INNER JOIN UF ON UF.IDUF = CIDADE.UF_IDUF
GROUP BY CIDADE.UF_IDUF