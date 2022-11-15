CREATE DEFINER=`root`@`localhost` PROCEDURE `crearHostel`(in cantC int, in hab int, in cap int, in pre double)
BEGIN
insert into hotsel(cantCamas)values(cantC);
insert into hospedaje(hostel_idhostel, habitacion, capacidad, precio)values(hostel_idhostel, hab, cap, pre);
END