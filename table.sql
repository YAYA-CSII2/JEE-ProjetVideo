CREATE TABLE utilisateur (
	util_id int NOT NULL AUTO_INCREMENT,
	util_login VARCHAR(50) NOT NULL,
	util_motdepasse VARCHAR(100) NOT NULL,
	util_nom VARCHAR(50),
	util_prenom VARCHAR(50),
	util_adresse VARCHAR(100),
	util_codepostale CHAR(5),
	util_pays VARCHAR(50),
	util_numerocartecredit CHAR(16),
	PRIMARY KEY(util_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE categorie (
	categ_id int NOT NULL AUTO_INCREMENT,
	categ_libelle VARCHAR(60) NOT NULL,
	PRIMARY KEY(categ_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE appartenir (
	app_categId int NOT NULL,
	app_filmId int NOT NULL,
	PRIMARY KEY(app_categId, app_filmId)
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
	cvc_pointfidelite int NOT NULL,
	cvc_idPosseseur int NOT NULL,
	PRIMARY KEY(cvc_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--duree = 0  =>  film acheté
CREATE TABLE filmloue (
	filml_idFilm int NOT NULL,
	filml_idUtil VARCHAR(50) NOT NULL,
	filml_datelocation DATE NOT NULL,
	filml_duree int NOT NULL,
	PRIMARY KEY(filml_idFilm, filml_idUtil)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE noteFilm (
	nfilm_idFilm int NOT NULL,
	nfilm_idUtil int NOT NULL,
	nfilm_note int,
	nfilm_commentaire VARCHAR(255),
	PRIMARY KEY(nfilm_idFilm, nfilm_idUtil)
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
	PRIMARY KEY(joueur_idFilm, jouer_idPersonnalite)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;7


ALTER TABLE film ADD CONSTRAINT fk_filmRealisateur FOREIGN KEY (film_idRealisateur) REFERENCES personnalite(pers_id);

ALTER TABLE appartenir
	ADD CONSTRAINT fk_appCateg FOREIGN KEY (app_categId) REFERENCES categorie(categ_id) ON DELETE SET NULL,
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







