CREATE DEFINER=`root`@`localhost` PROCEDURE `crearEmpleado`(in nombre varchar(20), in apellido varchar(20), in sueldo double)
BEGIN
insert into empleado(nombreE, apellidoE, sueldoE) values(nombre, apellido, sueldo);
END