CREATE DEFINER=`root`@`localhost` PROCEDURE `crearUbicacion`(in origenCu varchar(20), in destinoCu varchar(20), in distanciaCu int)
BEGIN
insert into ubicacion(origen, destino, distancia)values(origenCu, destinoCu, distanciaCu);
END