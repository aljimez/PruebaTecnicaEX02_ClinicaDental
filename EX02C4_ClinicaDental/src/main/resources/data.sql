CREATE DATABASE IF NOT EXISTS dentista;
USE dentista;


DROP TABLE IF EXISTS visitas;
DROP TABLE IF EXISTS clientes;
DROP TABLE IF EXISTS odontologos;

CREATE TABLE IF NOT EXISTS clientes(
	id INT NOT NULL AUTO_INCREMENT,
	dni varchar(20) UNIQUE NOT NULL,
	name VARCHAR(255) DEFAULT NULL,
	phoneNum bigint(20) DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS odontologos(
	codigo INT NOT NULL AUTO_INCREMENT,
	dni varchar(20) UNIQUE NOT NULL,
	name VARCHAR(255) DEFAULT NULL,
	phoneNum bigint(20) DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
PRIMARY KEY(codigo)
);

CREATE TABLE IF NOT EXISTS visitas(
	id INT NOT NULL AUTO_INCREMENT,
	clientes_id INT NOT NULL,
	odontologo_codigo INT NOT NULL,
	proceso VARCHAR(155) DEFAULT NULL,
	time DATETIME DEFAULT CURRENT_TIMESTAMP,
	prices bigint DEFAULT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (clientes_id) REFERENCES clientes(id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (odontologo_codigo) REFERENCES odontologos(codigo) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO clientes(dni, name, phoneNum, email) VALUES ('128933848H', 'Alejandro', 1781934, 'ajimenezal01@gmail.com');
INSERT INTO clientes(dni, name, phoneNum, email) VALUES ('182349994J', 'Alberto', 1783994, 'ajimajl4@gmail.com');
INSERT INTO clientes(dni, name, phoneNum, email) VALUES ('128548449E', 'Andrea', 2739495, 'aleal10@gmail.com');

INSERT INTO odontologos(dni, name, phoneNum, email)
VALUES ('191010394A', 'Jose', 181923, 'josemarin@gmail.com');
INSERT INTO odontologos(dni, name, phoneNum, email)
VALUES ('181892934I', 'Carme', 170404, 'carmefont@gmail.com');
INSERT INTO odontologos(dni, name, phoneNum, email)
VALUES ('188181940S', 'Teresa', 184244, 'cifuentes@gmail.com');

INSERT INTO visitas(clientes_id, odontologo_codigo, proceso, time, prices) VALUES (2, 3, 'Implantacion de coronas', '2022-04-25 09:05:00', 300);
INSERT INTO visitas(clientes_id, odontologo_codigo, proceso, time, prices) VALUES (1, 2, 'Empastes', '2022-04-25 10:00:00', 202);
INSERT INTO visitas(clientes_id, odontologo_codigo, proceso, time, prices) VALUES (3, 1, 'Blanqueamiento dental', '2022-04-25 12:30:00', 390);
