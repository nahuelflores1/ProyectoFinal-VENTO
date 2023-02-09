CREATE DEFINER=`root`@`localhost` PROCEDURE `crearVenta`(in cli varchar(45), in emple varchar(45), in fec date, in lug varchar(450), in trans varchar(450), in hosp varchar(450))
BEGIN
insert into venta(cliente, empleado, fecha, lugares, transportes, hospedajes)values(cli, emple, fec, lug, trans, hosp);
END