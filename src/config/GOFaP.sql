-- MySQL Script generated by MySQL Workbench
-- 11/30/14 12:55:20
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema GOFaP
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema GOFaP
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `GOFaP` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `GOFaP` ;

-- -----------------------------------------------------
-- Table `GOFaP`.`fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`fornecedor` (
  `id_fornecedor` INT NOT NULL,
  `codigo` INT NULL,
  `sigla` VARCHAR(45) NULL,
  `nome` VARCHAR(45) NULL,
  `cnpj` VARCHAR(45) NULL,
  PRIMARY KEY (`id_fornecedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`pf_acesso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`pf_acesso` (
  `id_pf_acesso` INT NOT NULL,
  `codigo` INT NULL,
  `nome` VARCHAR(45) NULL,
  `descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`id_pf_acesso`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`usuario` (
  `id_usuario` INT NOT NULL,
  `matricula` VARCHAR(45) NULL,
  `id_pf_acesso` INT NOT NULL,
  `senha` VARCHAR(45) NULL,
  PRIMARY KEY (`id_usuario`),
  INDEX `fk_Usuario_pf_acesso1_idx` (`id_pf_acesso` ASC),
  CONSTRAINT `fk_Usuario_pf_acesso1`
    FOREIGN KEY (`id_pf_acesso`)
    REFERENCES `GOFaP`.`pf_acesso` (`id_pf_acesso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`ling_programacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`ling_programacao` (
  `id_ling_programacao` INT NOT NULL,
  `codigo` INT NULL,
  `nome` VARCHAR(45) NULL,
  `peso` FLOAT NULL,
  PRIMARY KEY (`id_ling_programacao`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`vertical`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`vertical` (
  `id_vertical` INT NOT NULL,
  `codigo` INT NULL,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`id_vertical`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`coordenacoes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`coordenacoes` (
  `id_coordenacoes` INT NOT NULL,
  `codigo` INT NULL,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`id_coordenacoes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`solicitacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`solicitacao` (
  `id_solicitacao` INT NOT NULL,
  `numero` VARCHAR(45) NULL,
  `nome_comp` VARCHAR(45) NULL,
  `numero_gd` INT NULL,
  `qtd_ponto_funcao` FLOAT NULL,
  `mat_analista_resp` VARCHAR(45) NULL,
  `mat_gerente_tec` VARCHAR(45) NULL,
  `mat_gerente_info` VARCHAR(45) NULL,
  `tipo_solicitacao` VARCHAR(45) NULL,
  `id_fornecedor` INT NOT NULL,
  `id_usuario` INT NOT NULL,
  `id_ling_programacao` INT NOT NULL,
  `id_vertical` INT NOT NULL,
  `id_coordenacoes` INT NOT NULL,
  PRIMARY KEY (`id_solicitacao`),
  INDEX `fk_solicitacao_fornecedor1_idx` (`id_fornecedor` ASC),
  INDEX `fk_solicitacao_Usuario1_idx` (`id_usuario` ASC),
  INDEX `fk_solicitacao_ling_programacao1_idx` (`id_ling_programacao` ASC),
  INDEX `fk_solicitacao_vertical1_idx` (`id_vertical` ASC),
  INDEX `fk_solicitacao_Coordenações1_idx` (`id_coordenacoes` ASC),
  CONSTRAINT `fk_solicitacao_fornecedor1`
    FOREIGN KEY (`id_fornecedor`)
    REFERENCES `GOFaP`.`fornecedor` (`id_fornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_solicitacao_Usuario1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `GOFaP`.`Usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_solicitacao_ling_programacao1`
    FOREIGN KEY (`id_ling_programacao`)
    REFERENCES `GOFaP`.`ling_programacao` (`id_ling_programacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_solicitacao_vertical1`
    FOREIGN KEY (`id_vertical`)
    REFERENCES `GOFaP`.`vertical` (`id_vertical`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_solicitacao_Coordenações1`
    FOREIGN KEY (`id_coordenacoes`)
    REFERENCES `GOFaP`.`coordenacoes` (`id_coordenacoes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`representantes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`representantes` (
  `id_representantes` INT NOT NULL,
  `mat_representante` VARCHAR(45) NULL,
  `id_fornecedor` INT NOT NULL,
  PRIMARY KEY (`id_representantes`),
  INDEX `fk_representantes_fornecedor_idx` (`id_fornecedor` ASC),
  CONSTRAINT `fk_representantes_fornecedor`
    FOREIGN KEY (`id_fornecedor`)
    REFERENCES `GOFaP`.`fornecedor` (`id_fornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`custo_hora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`custo_hora` (
  `id_custo_hora` INT NOT NULL,
  `vl_custo_hora` FLOAT NULL,
  `dt_inicio_validade` DATE NULL,
  `id_fornecedor` INT NOT NULL,
  PRIMARY KEY (`id_custo_hora`),
  INDEX `fk_custo_hora_fornecedor1_idx` (`id_fornecedor` ASC),
  CONSTRAINT `fk_custo_hora_fornecedor1`
    FOREIGN KEY (`id_fornecedor`)
    REFERENCES `GOFaP`.`fornecedor` (`id_fornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`tipo_registro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`tipo_registro` (
  `id_tipo_registro` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`id_tipo_registro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`registro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`registro` (
  `id_registro` INT NOT NULL,
  `datahora_registro` TIMESTAMP NULL,
  `responsavel` INT NULL,
  `id_solicitacao` INT NOT NULL,
  `id_tipo_registro` INT NOT NULL,
  PRIMARY KEY (`id_registro`),
  INDEX `fk_registro_solicitacao1_idx` (`id_solicitacao` ASC),
  INDEX `fk_registro_tipo_registro1_idx` (`id_tipo_registro` ASC),
  CONSTRAINT `fk_registro_solicitacao1`
    FOREIGN KEY (`id_solicitacao`)
    REFERENCES `GOFaP`.`solicitacao` (`id_solicitacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_tipo_registro1`
    FOREIGN KEY (`id_tipo_registro`)
    REFERENCES `GOFaP`.`tipo_registro` (`id_tipo_registro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`justificativa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`justificativa` (
  `id_justificativa` INT NOT NULL,
  `justificativa_informada` VARCHAR(45) NULL,
  `id_registro` INT NOT NULL,
  PRIMARY KEY (`id_justificativa`, `id_registro`),
  INDEX `fk_justificativa_registro1_idx` (`id_registro` ASC),
  CONSTRAINT `fk_justificativa_registro1`
    FOREIGN KEY (`id_registro`)
    REFERENCES `GOFaP`.`registro` (`id_registro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`indicacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`indicacao` (
  `id_indicacao` INT NOT NULL,
  `mat_dev_indicado` VARCHAR(45) NULL,
  `id_registro` INT NOT NULL,
  PRIMARY KEY (`id_indicacao`, `id_registro`),
  INDEX `fk_indicacao_registro1_idx` (`id_registro` ASC),
  CONSTRAINT `fk_indicacao_registro1`
    FOREIGN KEY (`id_registro`)
    REFERENCES `GOFaP`.`registro` (`id_registro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`custo_efetivo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`custo_efetivo` (
  `id_custo_efetivo` INT NOT NULL,
  `custo_efetivo` FLOAT NULL,
  `id_registro` INT NOT NULL,
  PRIMARY KEY (`id_custo_efetivo`, `id_registro`),
  INDEX `fk_custo_efetivo_registro1_idx` (`id_registro` ASC),
  CONSTRAINT `fk_custo_efetivo_registro1`
    FOREIGN KEY (`id_registro`)
    REFERENCES `GOFaP`.`registro` (`id_registro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`rgti`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`rgti` (
  `id_rgti` INT NOT NULL,
  `matricula` VARCHAR(45) NULL,
  `nome` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `cod_area_tel_comercial` VARCHAR(2) NULL,
  `num_tel_comercial` VARCHAR(9) NULL,
  PRIMARY KEY (`id_rgti`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`csra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`csra` (
  `id_csra` INT NOT NULL,
  `nome_comp` VARCHAR(100) NULL,
  `linguagem` VARCHAR(45) NULL,
  `status_comp` VARCHAR(45) NULL,
  `coord_comp` VARCHAR(45) NULL,
  `vertical_comp` VARCHAR(45) NULL,
  `mat_gi` VARCHAR(45) NULL,
  `mat_gt` VARCHAR(45) NULL,
  `mat_ar` VARCHAR(45) NULL,
  `mat_as` VARCHAR(45) NULL,
  PRIMARY KEY (`id_csra`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GOFaP`.`gdcs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `GOFaP`.`gdcs` (
  `id_gdcs` INT NOT NULL,
  `num_gd` INT NULL,
  `status_gd` VARCHAR(45) NULL,
  `mat_tngd` VARCHAR(45) NULL,
  `mat_gtgd` VARCHAR(45) NULL,
  `mat_gigd` VARCHAR(45) NULL,
  PRIMARY KEY (`id_gdcs`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
