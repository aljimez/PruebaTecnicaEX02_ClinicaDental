CREATE DATABASE IF NOT EXISTS dentist;
USE dentist;


CREATE TABLE IF NOT EXISTS clientes(
	id INT NOT NULL AUTO_INCREMENT,
	dni VARCHAR(20) UNIQUE NOT NULL,
	name VARCHAR(255) DEFAULT NULL,
	phoneNum int(20) DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS odontologos(
	id INT NOT NULL AUTO_INCREMENT,
	dni VARCHAR(20) UNIQUE NOT NULL,
	name VARCHAR(255) DEFAULT NULL,
	phoneNum int(20) DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS visitas(
	id INT NOT NULL AUTO_INCREMENT,
	clientes_id INT NOT NULL,
	odontologos_id INT NOT NULL,
	proceso VARCHAR(155) DEFAULT NULL,
	time DATETIME DEFAULT CURRENT_TIMESTAMP,
	prices DECIMAL(10,2) DEFAULT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (clientes_id) REFERENCES clientes(id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (odontologos_id) REFERENCES odontologos(id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO clientes(dni, name, phoneNum, email) VALUES ('128933848', 'Alejandro Jiménez Álvarez', 1781934, 'ajimenezal01@gmail.com');
INSERT INTO clientes(dni, name, phoneNum, email) VALUES ('182399494', 'Alberto Del Pozo', 1783994, 'ajimajl4@gmail.com');
INSERT INTO clientes(dni, name, phoneNum, email) VALUES ('182854849', 'Andrea Dal Pezzo', 2739495, 'aleal10@gmail.com');

INSERT INTO odontologos(dni, name, phoneNum, email)
VALUES ('191010394', 'Jose Marin', 181923, 'josemarin@gmail.com');
INSERT INTO odontologos(dni, name, phoneNum, email)
VALUES ('181892934', 'Carme Fontdevila', 170404, 'carmefont@gmail.com');
INSERT INTO odontologos(dni, name, phoneNum, email)
VALUES ('188181940', 'Teresa Cifuentes', 184244, 'cifuentes@gmail.com');

INSERT INTO visitas(clientes_id, odontologos_id, proceso, time, prices) VALUES (2, 3, 'Implantacion de coronas', '2022-04-25 09:05:00', 300);
INSERT INTO visitas(clientes_id, odontologos_id, proceso, time, prices) VALUES (1, 2, 'Empastes', '2022-04-25 10:00:00', 202);
INSERT INTO visitas(clientes_id, odontologos_id, proceso, time, prices) VALUES (3, 1, 'Blanqueamiento dental', '2022-04-25 12:30:00', 390);
