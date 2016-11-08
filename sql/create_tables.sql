--------------------------------------------------------
------------- Table TipoPista --------------------------
--------------------------------------------------------
CREATE TABLE IF NOT EXISTS TipoPista (
  id INT NOT NULL UNIQUE,
  descricao VARCHAR(30) NULL,
  PRIMARY KEY (idevento));
  
  
--------------------------------------------------------
------------- Table TipoEnvolvido ----------------------
--------------------------------------------------------
CREATE TABLE IF NOT EXISTS TipoEnvolvido (
  id INT NOT NULL UNIQUE,
  descricao VARCHAR(30) NULL,
  PRIMARY KEY (idevento));

  
--------------------------------------------------------
------------- Table TipoVeiculo ------------------------
--------------------------------------------------------
CREATE TABLE IF NOT EXISTS TipoVeiculo (
  id INT NOT NULL UNIQUE,
  descricao VARCHAR(30) NULL,
  PRIMARY KEY (idevento));

  
--------------------------------------------------------
------------- Table TipoAcidente -----------------------
--------------------------------------------------------
CREATE TABLE IF NOT EXISTS TipoAcidente (
  id INT NOT NULL UNIQUE,
  descricao VARCHAR(30) NULL,
  PRIMARY KEY (idevento));

