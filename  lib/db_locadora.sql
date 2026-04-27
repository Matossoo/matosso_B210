CREATE DATABASE db_locadora;
USE db_locadora;

CREATE TABLE game (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    plataforma VARCHAR(50),
    genero VARCHAR(50),
    anoLancamento INT,
    precoAluguel DOUBLE
);