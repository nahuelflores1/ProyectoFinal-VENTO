CREATE DEFINER=`root`@`localhost` FUNCTION `mayus`(apellido varchar(20), dniC int) RETURNS varchar(20) CHARSET utf8mb3
    DETERMINISTIC
BEGIN
declare ape varchar(20);
select apellido as mayuscula into ape from cliente where dni = dniC;
select upper(ape) into ape;
RETURN ape;
END