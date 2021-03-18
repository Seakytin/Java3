set global time_zone ='-3:00';
show databases;

create database if not exists lesso2;

use lesson2;

CREATE TABLE if not exists users (
    id INT PRIMARY KEY,
    login VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    nick VARCHAR(50) NOT NULL UNIQUE

);

INSERT INTO user (id, login, password, nick) VALUES (1, 'killer', 'killer', 'killer'); 