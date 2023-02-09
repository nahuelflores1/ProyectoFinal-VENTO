CREATE DEFINER=`root`@`localhost` PROCEDURE `crearPaquete`(in precio double, in fec date, in lug varchar(45), in trans varchar(45), in hosp varchar(45))
BEGIN
insert into paquete(precioP, fecha, lugar, transporte, hospedaje)value(precio, fec, lug, trans, hosp);
END