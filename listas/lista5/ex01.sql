create database db_empresa_eventos;
use db_empresa_eventos;
show tables;
create table tb_eventos (id INT primary key, nome VARCHAR(255), localizacao VARCHAR(255), precoIngresso decimal(6,2));
describe tb_eventos;
insert into tb_eventos values (1, 'casamento', 'dom bosco 233 SP', 79.99);
SELECT * from tb_eventos;
insert into tb_eventos values (2, 'festa de quinze anos', 'rua cambara, 1360 SP', 30);
insert into tb_eventos values (3, 'apresentacao de danca', 'theatro RuthEscobar SP', 50);