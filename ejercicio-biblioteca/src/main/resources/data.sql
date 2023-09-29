DROP TABLE IF EXISTS libros;
DROP TABLE IF EXISTS categorias;

CREATE TABLE libros (
	isbn INT NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(50) NOT NULL,
	autor VARCHAR(50),
	precio INT NOT NULL,
	categoriasNombre VARCHAR(50),
	PRIMARY KEY (isbn));

CREATE TABLE categorias (
	nombre VARCHAR(50) NOT NULL,
	descripcion VARCHAR(50) NOT NULL,
	PRIMARY KEY (nombre));
	
ALTER TABLE Libros ADD CONSTRAINT Libros_fk0 FOREIGN KEY (categoriasNombre) REFERENCES Categorias(nombre);

INSERT INTO Categorias (nombre, descripcion) VALUES ('programacion','libros de programacion');
INSERT INTO Categorias (nombre, descripcion) VALUES ('web','libros  tecnologias web');
INSERT INTO Categorias (nombre, descripcion) VALUES ('poesia','no todo es programar');

INSERT INTO Libros (isbn, titulo, autor,  precio,categoriasNombre) VALUES (1, 'Primavera', 'pepito',  23,'poesia');
INSERT INTO Libros (isbn, titulo, autor,  precio,categoriasNombre) VALUES (2, 'Verano', 'jaime', 45,'poesia');
INSERT INTO Libros (isbn, titulo, autor,  precio,categoriasNombre) VALUES (3, 'Java 11', 'sara', 50,'programacion');
INSERT INTO Libros (isbn, titulo, autor,  precio,categoriasNombre) VALUES (4, 'html5', 'andres', 66, 'web');
INSERT INTO Libros (isbn, titulo, autor,  precio,categoriasNombre) VALUES (5, 'CSS', 'sara', 43,'web');