--liquibase formatted sql
--changeset patricia:202408191938 - colocamos os dados de quem criou ou alterou e a data, coloquei a data do nome do arquivo
--comment: boards table create

CREATE TABLE BOARDS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

--rollback DROP TABLE BOARDS