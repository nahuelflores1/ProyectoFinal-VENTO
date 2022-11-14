CREATE DEFINER=`root`@`localhost` PROCEDURE `crearMicro`(in cC tinyint, in precio double, in cantA int)
BEGIN
insert into micro(cocheCama)values(cC);
insert into transporte(colectivo_patente, precioT, cantAsientos)values(colectivo_patente, precio, cantA);
END