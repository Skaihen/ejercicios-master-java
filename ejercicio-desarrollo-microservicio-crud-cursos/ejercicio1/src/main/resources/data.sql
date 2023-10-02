DROP TABLE IF EXISTS cursos;

CREATE TABLE cursos (
	cod_curso INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL DEFAULT 'NA',
	duracion INT,
	precio INT,
	PRIMARY KEY (cod_curso));

INSERT INTO cursos (cod_curso, nombre, duracion, precio) VALUES (1, 'Java', 40, 250);
INSERT INTO cursos (cod_curso, nombre, duracion, precio) VALUES (2, 'PHP', 35, 300);
INSERT INTO cursos (cod_curso, nombre, duracion, precio) VALUES (3, 'Python', 20, 100);
INSERT INTO cursos (cod_curso, nombre, duracion, precio) VALUES (4, 'JavaScript', 60, 450);