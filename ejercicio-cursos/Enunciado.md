# Ejercicio

Un curso está identificado por los siguientes campos:

- código del curso: código asignado al curso
- nombre: nombre del curso
- duración: duración del curso en número de horas (entero)
- precio: precio del curso (entero)

Deberá exponer los siguientes recursos:

alta de curso: recibirá en el cuerpo de la petición un JSON con los datos del curso y lo dará de alta, devolviendo como resultado una lista con los cursos existentes.

eliminación curso: recibirá en la url el código del curso y lo eliminará, devolviendo como resultado una lista con los cursos existentes.

buscar curso: a partir del código del curso recibido en la url, devolverá un JSON con los datos del curso.

actualización de la duración: recibe en la url el código del curso y el número de horas, procediedno a la actualización de dicho dato en el almacen. No devuelve ningún valor
