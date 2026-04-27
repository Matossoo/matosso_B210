CREATE DATABASE db_top;
USE db_top;

CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    preco DOUBLE,
    quantidade INT
);