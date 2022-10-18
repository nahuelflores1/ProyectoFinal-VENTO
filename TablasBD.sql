create database paquetesTristicos;
use paquetesTristicos;
create table vendedor(
dniV int primary key not null,
nombreV varchar(20),
apellidoV varchar(20),
edadV int,
sueldo double
);

create table paquete(
idPaquete int not null auto_increment primary key,
nombreP varchar(20),
precio double
);

create table Cliente(
dniC int not null primary key,
nombreC varchar(20),
apellidoC varchar(20),
edadC int,
domicilio varchar(50)
);

create table Transporte(
idTransporte int not null auto_increment primary key,
tipo varchar(10)
);

create table avion(
idAvion int not null auto_increment primary key
);

create table Colectivo(
patente varchar(10) not null primary key,
asientos int 
);

create table Tren(
idtren int not null auto_increment primary key,
vagones int,
asientosxvagon int
);
