create database  db_escola_tech;
use db_escola_tech;

create table  tb_endereco(
id INT auto_increment PRIMARY key,
logradouro VARCHAR(255),
bairro VARCHAR (255),
numero  INT,
uf CHAR (2),
pais VARCHAR(255));

insert into tb_endereco (logradouro, bairro, numero, uf, pais) value
	("jd miray", "aracare", 1360, 'sp', "br");
    insert into tb_endereco (logradouro, bairro, numero, uf, pais) value
	("padaria", "sla", 700, 'MG', "BR");
    
create table  tb_filial(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255),
cnpj CHAR(14),
id_endereco INT);

ALTER TABLE tb_filial ADD constraint chaveEstrangeira foreign key (id_endereco) REFERENCES tb_endereco(id);
 
insert into tb_filial (nome, cnpj, id_endereco) value
    ("itaqua", 782937, 1);
    insert into tb_filial (nome, cnpj, id_endereco) value
    ("suzano", 6163638, 2);
    
    select * from tb_filial;