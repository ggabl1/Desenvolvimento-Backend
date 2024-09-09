create database floricultura;
create database db_floricultura;
use db_floricultura;
create table tb_flores (id int primary key, especie varchar(255), preco decimal (5,2));
insert into tb_flores values (1, 'rosa', 20.00);
insert into tb_flores values (2, 'orquidea', 35.00);
select * from tb_flores;