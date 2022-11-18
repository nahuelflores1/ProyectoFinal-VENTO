CREATE DEFINER=`root`@`localhost` PROCEDURE `crearHotel`(in val int, in pisci tinyint, in hab int, in cap int, in pre double)
BEGIN
insert into hotel(valoracion, piscina)values(val, pisci);
insert into hospedaje(Hotel_idHotel, habitacion, capacidad, precio)values(Hotel_idHotel, hab, cap, pre);
END