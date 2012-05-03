CREATE TABLE utilisateur (
	util_id number NOT NULL AUTO_INCREMENT,
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

CREATE TABLE film (
	film_id number NOT NULL AUTO_INCREMENT,
	film_nom VARCHAR(50) NOT NULL,
	film_synopsis VARCHAR(255),
	film_datedesortie DATE NOT NULL,
	film_duree number NOT NULL,
	film_lienFilm VARCHAR(150),
	film_anneedeproduction YEAR(4),
	film_prixachat float,
	film_prixlocation float,
	film_idRealisateur number NOT NULL,
	PRIMARY KEY(film_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE cartevideoclub (
	cvc_id number NOT NULL AUTO_INCREMENT,
	cvc_pointfidelite number NOT NULL,
	cvc_idPosseseur number NOT NULL,
	PRIMARY KEY(cvc_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--duree = 0  =>  film acheté
CREATE TABLE filmloue (
	filml_idFilm number NOT NULL,
	filml_idUtil VARCHAR(50) NOT NULL,
	filml_datelocation DATE NOT NULL,
	filml_duree number NOT NULL,
	PRIMARY KEY(filml_idFilm, filml_idUtil)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE noteFilm (
	nfilm_idFilm number NOT NULL,
	nfilm_idUtil number NOT NULL,
	nfilm_note number,
	nfilm_commentaire VARCHAR(255),
	PRIMARY KEY(nfilm_idFilm, nfilm_idUtil)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE bandeannonce (
	bd_id number NOT NULL AUTO_INCREMENT,
	bd_lienVideo VARCHAR(150) NOT NULL,
	bd_description VARCHAR(255),
	bd_idFilm number NOT NULL,
	PRIMARY KEY(bd_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE photo (
	photo_id number NOT NULL AUTO_INCREMENT,
	photo_lienPhoto VARCHAR(150) NOT NULL,
	photo_description VARCHAR(255),
	photo_idFilm number NOT NULL,
	PRIMARY KEY(photo_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE personnalite (
	pers_id number NOT NULL AUTO_INCREMENT,
	pers_nom VARCHAR(50) NOT NULL,
	pers_prenom VARCHAR(50) NOT NULL,
	pers_Datedenaissance DATE NOT NULL,
	pers_description VARCHAR(255),
	PRIMARY KEY(pers_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE jouer (
	jouer_idFilm number NOT NULL,
	jouer_idPersonnalite number NOT NULL,
	PRIMARY KEY(joueur_idFilm, jouer_idPersonnalite)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;7


ALTER TABLE film ADD CONSTRAINT fk_filmRealisateur FOREIGN KEY (film_idRealisateur) REFERENCES personnalite(pers_id);

ALTER TABLE cartevideoclub ADD CONSTRAINT fk_cvcPossesseur FOREIGN KEY (cvc_idPosseseur) REFERENCES utilisateur(util_id);

ALTER TABLE filmloue ADD CONSTRAINT fk_filmlFilm FOREIGN KEY (filml_idFilm) REFERENCES film(film_id);
ALTER TABLE filmloue ADD CONSTRAINT fk_filmlUtil FOREIGN KEY (filml_idUtil) REFERENCES utilisateur(util_id);

ALTER TABLE bandeannonce ADD CONSTRAINT fk_bdFilm FOREIGN KEY (bd_idFilm) REFERENCES film(film_id);

ALTER TABLE photo ADD CONSTRAINT fk_photoFilm FOREIGN KEY (photo_idFilm) REFERENCES film(film_id);

ALTER TABLE jouer ADD CONSTRAINT fk_jouerFilm FOREIGN KEY (jouer_idFilm) REFERENCES film(film_id);
ALTER TABLE jouer ADD CONSTRAINT fk_jouerPersonnalite FOREIGN KEY (jouer_idPersonnalite) REFERENCES personnalite(pers_id);


INSERT INTO utilisateur (util_login, util_motdepasse, util_nom, util_prenom, util_adresse,util_codepostale, util_pays, util_numerocartecredit)
("util1", MD5("util1"), "Nom1", "Prenom1", "Adresse1", "20111", "FRANCE", NULL),
("util2", MD5("util2"), "Nom2", "Prenom2", "Adresse2", "20119", "FRANCE", NULL),
("util3", MD5("util3"), "Nom3", "Prenom3", "Adresse3", "20118", "FRANCE", NULL),
("util4", MD5("util4"), "Nom4", "Prenom4", "Adresse4", "60111", "FRANCE", NULL),
("util5", MD5("util5"), "Nom5", "Prenom5", "Adresse5", "60666", "FRANCE", NULL);


INSERT INTO personnalite (pers_nom, pers_prenom, pers_Datedenaissance, pers_description) VALUES
("Personnalite1", "Prenom1", "1960-03-09", NULL),
("Personnalite2", "Prenom2", "1966-06-19", NULL),
("Personnalite3", "Prenom3", "1970-01-21", NULL),
("Personnalite4", "Prenom4", "1980-12-08", NULL),
("Personnalite5", "Prenom5", "1962-04-19", NULL);
	
	
INSERT INTO film (film_nom, film_synopsis, film_datedesortie, film_duree, film_lienFilm, film_anneedeproduction, film_prixachat, film_prixlocation, film_idRealisateur) VALUES
("Film1", "Synopsis du film1", "2012-02-02", 215, "test1.avi", "2012", 20, 0.5, 1),
("Film2", "Synopsis du film2", "2012-02-08", 215, "test2.avi", "2011", 15.99, 0.6, 2),
("Film3", "Synopsis du film3", "2012-02-09", 200, "test3.avi", "2010", 10, 0.3, 1),
("Film4", "Synopsis du film4", "2012-02-22", 180, "test4.avi", "2010", 12.20, 0.35, 2),
("Film5", "Synopsis du film5", "2012-02-06", 255, "test5.avi", "2000", 12, 0.5, 3),
("Film6", "Synopsis du film6", "2012-02-12", 300, "test6.avi", "2009", 12, 0.5, 2),
("Film7", "Synopsis du film7", "2012-02-23", 300, "test7.avi", "2012", 20, 0.9, 1);








