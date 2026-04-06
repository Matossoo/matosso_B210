create database teste_java;
use teste_java;

create table pessoas(
id  int auto_increment primary key ,
nome varchar(100),
idade int not null
);

select * from Pessoas; 

ALTER TABLE pessoas
ADD COLUMN cpf VARCHAR(14);