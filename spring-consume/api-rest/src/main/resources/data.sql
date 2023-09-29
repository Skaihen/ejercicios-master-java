DROP TABLE IF EXISTS libros;

CREATE TABLE libros (
	isbn INT NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(50) NOT NULL,
	autor VARCHAR(50),
	precio INT NOT NULL,
	PRIMARY KEY (isbn));

INSERT INTO Libros (isbn, titulo, autor,  precio) VALUES (1, 'Java', 'pepito', 23);
INSERT INTO Libros (isbn, titulo, autor,  precio) VALUES (2, 'PHP', 'jaime', 45);
INSERT INTO Libros (isbn, titulo, autor,  precio) VALUES (3, 'JavaScript', 'sara', 50);
INSERT INTO Libros (isbn, titulo, autor,  precio) VALUES (4, 'html5', 'andres', 66);
INSERT INTO Libros (isbn, titulo, autor,  precio) VALUES (5, 'CSS', 'sara', 43);