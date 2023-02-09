CREATE DEFINER=`root`@`localhost` PROCEDURE `crearCliente`(in dni int, in nombre varchar(20), in apellido varchar(20), in telefono int)
BEGIN
insert into cliente(dniC,nombreC,apellidoC,telefonoC) value(dni,nombre,apellido,telefono);
END