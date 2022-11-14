CREATE DEFINER=`root`@`localhost` PROCEDURE `crearApartamento`(in amb int, in pisci tinyint, in hab int, in cap int, in pre double)
BEGIN
insert into hotel(ambiente, piscina)values(amb, pisci);
insert into hospedaje(apartamento_idApartamento, habitacion, capacidad, precio)values(apartamento_idApartamento, hab, cap, pre);
END