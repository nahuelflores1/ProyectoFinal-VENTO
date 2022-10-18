-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `paquetestristicos` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema paquetestristicos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema paquetestristicos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `paquetestristicos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `paquetestristicos` ;

-- -----------------------------------------------------
-- Table `paquetestristicos`.`Ubicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetestristicos`.`Ubicacion` (
  `idUbicacion` INT NOT NULL,
  `origen` VARCHAR(45) NOT NULL,
  `destino` VARCHAR(45) NOT NULL,
  `precio` DOUBLE NOT NULL,
  PRIMARY KEY (`idUbicacion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`Hotel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  `paquetestristicos`.`Hotel` (
  `idHotel` INT NOT NULL,
  `habitacion` INT NOT NULL,
  `capacidadH` INT NOT NULL,
  `precio` DOUBLE NOT NULL,
  PRIMARY KEY (`idHotel`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`apartamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  `paquetestristicos`.`apartamento` (
  `idApartamento` INT NOT NULL,
  `habitacion` INT NOT NULL,
  `capacidadA` INT NOT NULL,
  `precio` DOUBLE NOT NULL,
  PRIMARY KEY (`idApartamento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`hostel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  `paquetestristicos`.`hostel` (
  `idhostel` INT NOT NULL,
  `habitacion` INT NOT NULL,
  `capacidad` INT NOT NULL,
  `precio` DOUBLE NOT NULL,
  PRIMARY KEY (`idhostel`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`hospedaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  `paquetestristicos`.`hospedaje` (
  `idhospedaje` INT NOT NULL,
  `habitacion` INT NOT NULL,
  `capacidad` INT NOT NULL,
  `precio` DOUBLE NULL,
  `Hotel_idHotel` INT NOT NULL,
  `apartamento_idApartamento` INT NOT NULL,
  `hostel_idhostel` INT NOT NULL,
  PRIMARY KEY (`idhospedaje`, `Hotel_idHotel`, `apartamento_idApartamento`, `hostel_idhostel`),
  INDEX `fk_hospedaje_Hotel_idx` (`Hotel_idHotel` ASC) VISIBLE,
  INDEX `fk_hospedaje_apartamento1_idx` (`apartamento_idApartamento` ASC) VISIBLE,
  INDEX `fk_hospedaje_hostel1_idx` (`hostel_idhostel` ASC) VISIBLE,
  CONSTRAINT `fk_hospedaje_Hotel`
    FOREIGN KEY (`Hotel_idHotel`)
    REFERENCES `paquetestristicos`.`Hotel` (`idHotel`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hospedaje_apartamento1`
    FOREIGN KEY (`apartamento_idApartamento`)
    REFERENCES `paquetestristicos`.`apartamento` (`idApartamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hospedaje_hostel1`
    FOREIGN KEY (`hostel_idhostel`)
    REFERENCES `paquetestristicos`.`hostel` (`idhostel`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `paquetestristicos` ;

-- -----------------------------------------------------
-- Table `paquetestristicos`.`avion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetestristicos`.`avion` (
  `idAvion` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idAvion`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetestristicos`.`cliente` (
  `dniC` INT NOT NULL,
  `nombreC` VARCHAR(20) NULL DEFAULT NULL,
  `apellidoC` VARCHAR(20) NULL DEFAULT NULL,
  `edadC` INT NULL DEFAULT NULL,
  `domicilio` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`dniC`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`colectivo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetestristicos`.`colectivo` (
  `patente` VARCHAR(10) NOT NULL,
  `asientos` INT NULL DEFAULT NULL,
  PRIMARY KEY (`patente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetestristicos`.`vendedor` (
  `dniV` INT NOT NULL,
  `nombreV` VARCHAR(20) NULL DEFAULT NULL,
  `apellidoV` VARCHAR(20) NULL DEFAULT NULL,
  `edadV` INT NULL DEFAULT NULL,
  `sueldo` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`dniV`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`tren`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetestristicos`.`tren` (
  `idtren` INT NOT NULL AUTO_INCREMENT,
  `vagones` INT NULL DEFAULT NULL,
  `asientosxvagon` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idtren`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`transporte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetestristicos`.`transporte` (
  `idTransporte` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(10) NULL DEFAULT NULL,
  `colectivo_patente` VARCHAR(10) NOT NULL,
  `avion_idAvion` INT NOT NULL,
  `tren_idtren` INT NOT NULL,
  PRIMARY KEY (`idTransporte`, `colectivo_patente`, `avion_idAvion`, `tren_idtren`),
  INDEX `fk_transporte_colectivo1_idx` (`colectivo_patente` ASC) VISIBLE,
  INDEX `fk_transporte_avion1_idx` (`avion_idAvion` ASC) VISIBLE,
  INDEX `fk_transporte_tren1_idx` (`tren_idtren` ASC) VISIBLE,
  CONSTRAINT `fk_transporte_colectivo1`
    FOREIGN KEY (`colectivo_patente`)
    REFERENCES `paquetestristicos`.`colectivo` (`patente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_transporte_avion1`
    FOREIGN KEY (`avion_idAvion`)
    REFERENCES `paquetestristicos`.`avion` (`idAvion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_transporte_tren1`
    FOREIGN KEY (`tren_idtren`)
    REFERENCES `paquetestristicos`.`tren` (`idtren`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `paquetestristicos`.`paquete`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `paquetestristicos`.`paquete` (
  `idPaquete` INT NOT NULL AUTO_INCREMENT,
  `nombreP` VARCHAR(20) NOT NULL,
  `fecha` DATETIME NULL,
  `vendedor_dniV` INT NOT NULL,
  `cliente_dniC` INT NOT NULL,
  `Ubicacion_idUbicacion` INT NOT NULL,
  `transporte_idTransporte` INT NOT NULL,
  `hospedaje_idhospedaje` INT NOT NULL,
  PRIMARY KEY (`idPaquete`, `vendedor_dniV`, `cliente_dniC`, `Ubicacion_idUbicacion`, `transporte_idTransporte`, `hospedaje_idhospedaje`),
  INDEX `fk_paquete_vendedor1_idx` (`vendedor_dniV` ASC) VISIBLE,
  INDEX `fk_paquete_cliente1_idx` (`cliente_dniC` ASC) VISIBLE,
  INDEX `fk_paquete_Ubicacion1_idx` (`Ubicacion_idUbicacion` ASC) VISIBLE,
  INDEX `fk_paquete_transporte1_idx` (`transporte_idTransporte` ASC) VISIBLE,
  INDEX `fk_paquete_hospedaje1_idx` (`hospedaje_idhospedaje` ASC) VISIBLE,
  CONSTRAINT `fk_paquete_vendedor1`
    FOREIGN KEY (`vendedor_dniV`)
    REFERENCES `paquetestristicos`.`vendedor` (`dniV`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_paquete_cliente1`
    FOREIGN KEY (`cliente_dniC`)
    REFERENCES `paquetestristicos`.`cliente` (`dniC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_paquete_Ubicacion1`
    FOREIGN KEY (`Ubicacion_idUbicacion`)
    REFERENCES `paquetestristicos`.`Ubicacion` (`idUbicacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_paquete_transporte1`
    FOREIGN KEY (`transporte_idTransporte`)
    REFERENCES `paquetestristicos`.`transporte` (`idTransporte`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_paquete_hospedaje1`
    FOREIGN KEY (`hospedaje_idhospedaje`)
    REFERENCES `paquetestristicos`.`hospedaje` (`idhospedaje`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
