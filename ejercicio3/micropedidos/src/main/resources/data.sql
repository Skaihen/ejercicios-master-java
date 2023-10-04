DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS pedidos;

CREATE TABLE productos (
	codigo_producto INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50),
	precio_unitario DOUBLE,
    stock INT,
	PRIMARY KEY (codigo_producto)
);

CREATE TABLE pedidos (
    id_pedido INT NOT NULL AUTO_INCREMENT,
    codigo_producto INT,
    unidades INT,
    total DOUBLE,
    fecha DATETIME,
    PRIMARY KEY (id_pedido),
    FOREIGN KEY (codigo_producto) REFERENCES productos(codigo_producto)
);

INSERT INTO productos (codigo_producto, nombre, precio_unitario, stock) VALUES (1, 'Libro', 100, 10);
INSERT INTO productos (codigo_producto, nombre, precio_unitario, stock) VALUES (2, 'Monitor', 200, 20);
INSERT INTO productos (codigo_producto, nombre, precio_unitario, stock) VALUES (3, 'Teclado', 50, 30);
INSERT INTO productos (codigo_producto, nombre, precio_unitario, stock) VALUES (4, 'Auriculares', 30, 40);

INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (1, 1, 4, 100, '2022-05-01');
INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (2, 2, 3, 200, '2022-05-02');
INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (3, 3, 2, 50, '2022-05-03');
INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (4, 4, 1, 30, '2022-05-04');