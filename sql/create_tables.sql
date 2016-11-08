--------------------------------------------------------
------------- TABLE TIPOPISTA --------------------------
--------------------------------------------------------
CREATE SEQUENCE SEQ_ID_TIPO_PISTA
  INCREMENT 1
  MINVALUE 0
  MAXVALUE 999999999999999999
  START 0
  CACHE 1;

  
CREATE TABLE IF NOT EXISTS TIPO_PISTA (
  ID_TIPO_PISTA INT NOT NULL DEFAULT nextval('SEQ_ID_TIPO_PISTA'::regclass),
  DESCRICAO VARCHAR(30) NULL UNIQUE,
  PRIMARY KEY (ID_TIPO_PISTA));
  
  
--------------------------------------------------------
------------- TABLE TIPOENVOLVIDO ----------------------
--------------------------------------------------------
CREATE SEQUENCE SEQ_ID_TIPO_ENVOLVIDO
  INCREMENT 1
  MINVALUE 0
  MAXVALUE 999999999999999999
  START 0
  CACHE 1;
  
CREATE TABLE IF NOT EXISTS TIPO_ENVOLVIDO (
  ID_TIPO_ENVOLVIDO INT NOT NULL DEFAULT nextval('SEQ_ID_TIPO_ENVOLVIDO'::regclass),
  DESCRICAO VARCHAR(30) NULL UNIQUE,
  PRIMARY KEY (ID_TIPO_ENVOLVIDO));

  
--------------------------------------------------------
------------- TABLE TIPOVEICULO ------------------------
--------------------------------------------------------
CREATE SEQUENCE SEQ_ID_TIPO_VEICULO
  INCREMENT 1
  MINVALUE 0
  MAXVALUE 999999999999999999
  START 0
  CACHE 1;
  
CREATE TABLE IF NOT EXISTS TIPO_VEICULO (
  ID_TIPO_VEICULO INT NOT NULL DEFAULT nextval('SEQ_ID_TIPO_VEICULO'::regclass),
  DESCRICAO VARCHAR(30) NULL UNIQUE,
  PRIMARY KEY (ID_TIPO_VEICULO));

  
--------------------------------------------------------
------------- TABLE TIPOACIDENTE -----------------------
--------------------------------------------------------
CREATE SEQUENCE SEQ_ID_TIPO_ACIDENTE
  INCREMENT 1
  MINVALUE 0
  MAXVALUE 999999999999999999
  START 0
  CACHE 1;
  
CREATE TABLE IF NOT EXISTS TIPO_ACIDENTE (
  ID_TIPO_ACIDENTE INT NOT NULL DEFAULT nextval('SEQ_ID_TIPO_ACIDENTE'::regclass),
  DESCRICAO VARCHAR(30) NULL UNIQUE,
  PRIMARY KEY (ID_TIPO_ACIDENTE));



