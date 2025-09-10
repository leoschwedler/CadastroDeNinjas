-- V1__Create_tables.sql
-- Cria a tabela de missões primeiro
CREATE TABLE tb_missoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    dificulty VARCHAR(255)
);

CREATE TABLE tb_cadastro (
    id BIGINT NOT NULL AUTO_INCREMENT,
    age INT,
    email VARCHAR(255),
    img_url VARCHAR(255),
    name VARCHAR(255),
    `rank` VARCHAR(255),
    missoes_id BIGINT,
    PRIMARY KEY (id)
) ENGINE=InnoDB;