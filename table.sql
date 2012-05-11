ALTER TABLE filmAchete
	DROP FOREIGN KEY fk_filmAFilm,
	DROP FOREIGN KEY fk_filmAUtil;

ALTER TABLE noteFilm DROP FOREIGN KEY fk_NtFilmFilm;
ALTER TABLE noteFilm DROP FOREIGN KEY fk_NtFilmUtil;

ALTER TABLE film DROP FOREIGN KEY fk_filmRealisateur;

ALTER TABLE appartenir
	DROP FOREIGN KEY fk_appCateg,
	DROP FOREIGN KEY fk_appFilm;

ALTER TABLE cartevideoclub DROP FOREIGN KEY fk_cvcPossesseur;

ALTER TABLE filmloue
	DROP FOREIGN KEY fk_filmlFilm,
	DROP FOREIGN KEY fk_filmlUtil;

ALTER TABLE bandeannonce DROP FOREIGN KEY fk_bdFilm;

ALTER TABLE photo DROP FOREIGN KEY fk_photoFilm;

ALTER TABLE jouer
	DROP FOREIGN KEY fk_jouerFilm,
	DROP FOREIGN KEY fk_jouerPersonnalite;


drop table IF EXISTS filmAchete CASCADE;
drop table IF EXISTS utilisateur CASCADE;
drop table IF EXISTS categorie CASCADE;
drop table IF EXISTS appartenir CASCADE;
drop table IF EXISTS film CASCADE;
drop table IF EXISTS cartevideoclub CASCADE;
drop table IF EXISTS filmloue CASCADE;
drop table IF EXISTS noteFilm CASCADE;
drop table IF EXISTS bandeannonce CASCADE;
drop table IF EXISTS photo CASCADE;
drop table IF EXISTS jouer CASCADE;
drop table IF EXISTS personnalite CASCADE;

CREATE TABLE utilisateur (
	util_id int NOT NULL AUTO_INCREMENT,
	util_login VARCHAR(50) NOT NULL,
	util_motdepasse VARCHAR(100) NOT NULL,
	util_nom VARCHAR(50),
	util_prenom VARCHAR(50),
	util_adresse VARCHAR(100),
	util_codepostale VARCHAR(10),
	util_pays VARCHAR(50),
	util_numerocartecredit CHAR(16),
        util_admin boolean NOT NULL DEFAULT false,
	PRIMARY KEY(util_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE categorie (
	categ_id int NOT NULL AUTO_INCREMENT,
	categ_libelle VARCHAR(60) NOT NULL,
	PRIMARY KEY(categ_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE appartenir (
        app_id int NOT NULL AUTO_INCREMENT,
	app_categId int NOT NULL,
	app_filmId int NOT NULL,
	PRIMARY KEY(app_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE film (
	film_id int NOT NULL AUTO_INCREMENT,
	film_nom VARCHAR(50) NOT NULL,
	film_lienAffiche VARCHAR(50) NOT NULL,
	film_synopsis VARCHAR(255),
	film_datedesortie DATE NOT NULL,
	film_duree int NOT NULL,
	film_lienFilm VARCHAR(150),
	film_anneedeproduction YEAR(4),
	film_prixachat float,
	film_prixlocation float,
	film_idRealisateur int NOT NULL,
	PRIMARY KEY(film_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE cartevideoclub (
	cvc_id int NOT NULL AUTO_INCREMENT,
        cvc_numeroCarteFidel CHAR(10) NOT NULL,
	cvc_pointfidelite int NOT NULL,
	cvc_idPosseseur int NOT NULL,
	PRIMARY KEY(cvc_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE filmloue (
        filml_id int NOT NULL AUTO_INCREMENT,
	filml_idFilm int NOT NULL,
	filml_idUtil int NOT NULL,
	filml_datelocation DATE NOT NULL,
	filml_duree int NOT NULL,
	PRIMARY KEY(filml_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE noteFilm (
        nfilm_id int NOT NULL AUTO_INCREMENT,
	nfilm_idFilm int NOT NULL,
	nfilm_idUtil int NOT NULL,
	nfilm_note int,
	nfilm_commentaire VARCHAR(255),
	PRIMARY KEY(nfilm_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE bandeannonce (
	bd_id int NOT NULL AUTO_INCREMENT,
	bd_lienVideo VARCHAR(150) NOT NULL,
	bd_description VARCHAR(255),
	bd_idFilm int NOT NULL,
	PRIMARY KEY(bd_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE photo (
	photo_id int NOT NULL AUTO_INCREMENT,
	photo_lienPhoto VARCHAR(150) NOT NULL,
	photo_description VARCHAR(255),
	photo_idFilm int NOT NULL,
	PRIMARY KEY(photo_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE personnalite (
	pers_id int NOT NULL AUTO_INCREMENT,
	pers_nom VARCHAR(50) NOT NULL,
	pers_prenom VARCHAR(50) NOT NULL,
	pers_Datedenaissance DATE NOT NULL,
	pers_description VARCHAR(255),
	PRIMARY KEY(pers_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE jouer (
	jouer_idFilm int NOT NULL,
	jouer_idPersonnalite int NOT NULL,
	PRIMARY KEY(jouer_idFilm, jouer_idPersonnalite)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table filmAchete(
        filmA_id int NOT NULL AUTO_INCREMENT,
	filmA_idFilm int NOT NULL,
	filmA_idUtil int NOT NULL,
	filmA_dateAchat DATE NOT NULL,
        primary key(filmA_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


ALTER TABLE film ADD CONSTRAINT fk_filmRealisateur FOREIGN KEY (film_idRealisateur) REFERENCES personnalite(pers_id);

ALTER TABLE appartenir
	ADD CONSTRAINT fk_appCateg FOREIGN KEY (app_categId) REFERENCES categorie(categ_id) ON DELETE CASCADE,
	ADD CONSTRAINT fk_appFilm FOREIGN KEY (app_filmId) REFERENCES film(film_id) ON DELETE CASCADE;

ALTER TABLE cartevideoclub ADD CONSTRAINT fk_cvcPossesseur FOREIGN KEY (cvc_idPosseseur) REFERENCES utilisateur(util_id) ON DELETE CASCADE;

ALTER TABLE filmloue
	ADD CONSTRAINT fk_filmlFilm FOREIGN KEY (filml_idFilm) REFERENCES film(film_id),
	ADD CONSTRAINT fk_filmlUtil FOREIGN KEY (filml_idUtil) REFERENCES utilisateur(util_id) ON DELETE CASCADE;

ALTER TABLE bandeannonce ADD CONSTRAINT fk_bdFilm FOREIGN KEY (bd_idFilm) REFERENCES film(film_id) ON DELETE CASCADE;

ALTER TABLE photo ADD CONSTRAINT fk_photoFilm FOREIGN KEY (photo_idFilm) REFERENCES film(film_id) ON DELETE CASCADE;

ALTER TABLE jouer
	ADD CONSTRAINT fk_jouerFilm FOREIGN KEY (jouer_idFilm) REFERENCES film(film_id) ON DELETE CASCADE,
	ADD CONSTRAINT fk_jouerPersonnalite FOREIGN KEY (jouer_idPersonnalite) REFERENCES personnalite(pers_id);

ALTER TABLE noteFilm
        ADD CONSTRAINT fk_NtFilmFilm Foreign KEY(nfilm_idFilm) References film(film_id) on delete cascade,
        ADD CONSTRAINT fk_NtFilmUtil Foreign KEY(nfilm_idUtil) References utilisateur(util_id) on delete cascade;

ALTER TABLE filmAchete
	ADD CONSTRAINT fk_filmAFilm FOREIGN KEY (filmA_idFilm) REFERENCES film(film_id),
	ADD CONSTRAINT fk_filmAUtil FOREIGN KEY (filmA_idUtil) REFERENCES utilisateur(util_id) ON DELETE CASCADE;

