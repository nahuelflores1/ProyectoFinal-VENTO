CREATE DEFINER=`root`@`localhost` TRIGGER `cliente_AFTER_INSERT` AFTER INSERT ON `cliente` FOR EACH ROW BEGIN
declare dni int;
declare apeC varchar(20);
select dniC into dni from cliente;
select mayus(apellidoC, dniC) into apeC from cliente;
update cliente set apellidoC = apeC where dniC = dni;
END