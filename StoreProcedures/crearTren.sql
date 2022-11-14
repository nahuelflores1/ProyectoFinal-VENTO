CREATE DEFINER=`root`@`localhost` PROCEDURE `crearTren`(in sec varchar(45), in precio double, in cantA int)
BEGIN
insert into Tren(sector)values(sec);
insert into transporte(tren_idtren, precioT, cantAsientos)values(tren_idtren, precio, cantA);
END