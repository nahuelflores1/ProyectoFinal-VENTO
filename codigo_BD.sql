-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema paquetesturisticos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema paquetesturisticos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `paquetesturisticos` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `paquetesturisticos` ;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`apartamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`apartamento` (
  `idApartamento` INT NOT NULL,
  `ambiente` INT NOT NULL,
  `piscina` TINYINT NOT NULL,
  PRIMARY KEY (`idApartamento`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`avion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`avion` (
  `idAvion` INT NOT NULL AUTO_INCREMENT,
  `clase` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAvion`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`cliente` (
  `dniC` INT NOT NULL,
  `nombreC` VARCHAR(20) NULL DEFAULT NULL,
  `apellidoC` VARCHAR(20) NULL DEFAULT NULL,
  `telefonoC` INT NULL DEFAULT NULL,
  PRIMARY KEY (`dniC`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`micro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`micro` (
  `patente` VARCHAR(10) NOT NULL,
  `cocheCama` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`patente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`empleado` (
  `idEmple` INT NOT NULL AUTO_INCREMENT,
  `nombreE` VARCHAR(20) NULL DEFAULT NULL,
  `apellidoE` VARCHAR(20) NULL DEFAULT NULL,
  `sueldoE` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`idEmple`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`hostel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`hostel` (
  `idhostel` INT NOT NULL,
  `cantCamas` INT NOT NULL,
  PRIMARY KEY (`idhostel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`hotel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`hotel` (
  `idHotel` INT NOT NULL,
  `valoracion` VARCHAR(45) NOT NULL,
  `piscina` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`idHotel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`hospedaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`hospedaje` (
  `idhospedaje` INT NOT NULL AUTO_INCREMENT,
  `Hotel_idHotel` INT NULL,
  `apartamento_idApartamento` INT NULL,
  `hostel_idhostel` INT NULL,
  `habitacion` INT NULL,
  `capacidad` INT NULL,
  `precio` DOUBLE NULL,
  PRIMARY KEY (`idhospedaje`),
  INDEX `fk_hospedaje_Hotel_idx` (`Hotel_idHotel` ASC) VISIBLE,
  INDEX `fk_hospedaje_apartamento1_idx` (`apartamento_idApartamento` ASC) VISIBLE,
  INDEX `fk_hospedaje_hostel1_idx` (`hostel_idhostel` ASC) VISIBLE,
  CONSTRAINT `fk_hospedaje_apartamento1`
    FOREIGN KEY (`apartamento_idApartamento`)
    REFERENCES `paquetesturisticos`.`apartamento` (`idApartamento`),
  CONSTRAINT `fk_hospedaje_hostel1`
    FOREIGN KEY (`hostel_idhostel`)
    REFERENCES `paquetesturisticos`.`hostel` (`idhostel`),
  CONSTRAINT `fk_hospedaje_Hotel`
    FOREIGN KEY (`Hotel_idHotel`)
    REFERENCES `paquetesturisticos`.`hotel` (`idHotel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`tren`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`tren` (
  `idtren` INT NOT NULL AUTO_INCREMENT,
  `sector` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idtren`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`transporte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`transporte` (
  `idTransporte` INT NOT NULL AUTO_INCREMENT,
  `colectivo_patente` VARCHAR(20) NULL,
  `avion_idAvion` INT NULL,
  `tren_idtren` INT NULL,
  `precioT` DOUBLE NOT NULL,
  `cantAsientos` INT NOT NULL,
  PRIMARY KEY (`idTransporte`),
  INDEX `fk_transporte_colectivo1_idx` (`colectivo_patente` ASC) VISIBLE,
  INDEX `fk_transporte_avion1_idx` (`avion_idAvion` ASC) VISIBLE,
  INDEX `fk_transporte_tren1_idx` (`tren_idtren` ASC) VISIBLE,
  CONSTRAINT `fk_transporte_avion1`
    FOREIGN KEY (`avion_idAvion`)
    REFERENCES `paquetesturisticos`.`avion` (`idAvion`),
  CONSTRAINT `fk_transporte_colectivo1`
    FOREIGN KEY (`colectivo_patente`)
    REFERENCES `paquetesturisticos`.`micro` (`patente`),
  CONSTRAINT `fk_transporte_tren1`
    FOREIGN KEY (`tren_idtren`)
    REFERENCES `paquetesturisticos`.`tren` (`idtren`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`ubicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`ubicacion` (
  `idUbicacion` INT NOT NULL AUTO_INCREMENT,
  `origen` VARCHAR(45) NOT NULL,
  `destino` VARCHAR(45) NOT NULL,
  `distancia` INT NOT NULL,
  PRIMARY KEY (`idUbicacion`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`paquete`
-- -----------------------------------------------------
drop table paquete;
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`paquete` (
  `idPaquete` INT NOT NULL AUTO_INCREMENT,
  `Ubicacion_idUbicacion` INT NULL,
  `transporte_idTransporte` INT NULL,
  `hospedaje_idhospedaje` INT NULL,
  `precioP` INT NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `lugar` VARCHAR(45) NULL DEFAULT NULL,
  `transporte` VARCHAR(45) NULL DEFAULT NULL,
  `hospedaje` VARCHAR(45) NULL,
  PRIMARY KEY (`idPaquete`),
  index `pk_idPaquete1_idx` (`idPaquete` ASC) VISIBLE,
  INDEX `fk_paquete_Ubicacion1_idx` (`Ubicacion_idUbicacion` ASC) VISIBLE,
  INDEX `fk_paquete_transporte1_idx` (`transporte_idTransporte` ASC) VISIBLE,
  INDEX `fk_paquete_hospedaje1_idx` (`hospedaje_idhospedaje` ASC) VISIBLE,
  CONSTRAINT `fk_paquete_hospedaje1`
    FOREIGN KEY (`hospedaje_idhospedaje`)
    REFERENCES `paquetesturisticos`.`hospedaje` (`idhospedaje`),
  CONSTRAINT `fk_paquete_transporte1`
    FOREIGN KEY (`transporte_idTransporte`)
    REFERENCES `paquetesturisticos`.`transporte` (`idTransporte`),
  CONSTRAINT `fk_paquete_Ubicacion1`
    FOREIGN KEY (`Ubicacion_idUbicacion`)
    REFERENCES `paquetesturisticos`.`ubicacion` (`idUbicacion`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `paquetesturisticos`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetesturisticos`.`venta` (
  `nroFact` INT NOT NULL AUTO_INCREMENT,
  `cliente_dniC` INT NULL,
  `vendedor_dniV` INT NULL,
  `paquete_idPaquete` INT NULL,
  `paquete_Ubicacion_idUbicacion` INT NULL,
  `paquete_transporte_idTransporte` INT NULL,
  `paquete_hospedaje_idhospedaje` INT NULL,
  `cliente` VARCHAR(45) NULL,
  `empleado` VARCHAR(45) NULL,
  `fecha` DATE NULL,
  `lugar` VARCHAR(45) NULL DEFAULT NULL,
  `transporte` VARCHAR(45) NULL,
  `hospedaje` VARCHAR(45) NULL,
  PRIMARY KEY (`nroFact`),
  INDEX `fk_Venta_vendedor1_idx` (`vendedor_dniV` ASC) VISIBLE,
  INDEX `fk_Venta_cliente1_idx` (`cliente_dniC` ASC) VISIBLE,
  INDEX `fk_Venta_paquete1_idx` (`paquete_idPaquete` ASC) VISIBLE,
  CONSTRAINT `fk_Venta_cliente1`
    FOREIGN KEY (`cliente_dniC`)
    REFERENCES `paquetesturisticos`.`cliente` (`dniC`),
  CONSTRAINT `fk_Venta_paquete1`
    FOREIGN KEY (`paquete_idPaquete`)
    REFERENCES `paquetesturisticos`.`paquete` (`idPaquete`),
  CONSTRAINT `fk_Venta_vendedor1`
    FOREIGN KEY (`vendedor_dniV`)
    REFERENCES `paquetesturisticos`.`empleado` (`idEmple`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
