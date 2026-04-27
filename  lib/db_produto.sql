CREATE DATABASE db_produto;
USE db_produto;

CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    preco DOUBLE,
    quantidade INT
);