CREATE DEFINER=`root`@`localhost` PROCEDURE `crearAvion`(in cla varchar(45), in precio double, in cantA int)
BEGIN
insert into avion(clase)values(cla);
insert into transporte(avion_idAvion, precioT, cantAsientos)values(avion_idAvion, precio, cantA);
END