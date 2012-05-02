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

CREATE TABLE personne (
	pers_id number NOT NULL AUTO_INCREMENT,
	pers_nom VARCHAR(50) NOT NULL,
	pers_prenom VARCHAR(50) NOT NULL,
	pers_Datedenaissance DATE NOT NULL,
	pers_description VARCHAR(255),
	PRIMARY KEY(pers_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE jouer (
	jouer_idFilm number NOT NULL,
	jouer_idPersonne number NOT NULL,
	PRIMARY KEY(joueur_idFilm, joueur_idPersonne)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;7


ALTER TABLE film ADD CONSTRAINT fk_filmRealisateur FOREIGN KEY (film_idRealisateur) REFERENCES personne(pers_id);

ALTER TABLE cartevideoclub ADD CONSTRAINT fk_cvcPossesseur FOREIGN KEY (cvc_idPosseseur) REFERENCES utilisateur(util_id);

ALTER TABLE filmloue ADD CONSTRAINT fk_filmlFilm FOREIGN KEY (filml_idFilm) REFERENCES film(film_id);
ALTER TABLE filmloue ADD CONSTRAINT fk_filmlUtil FOREIGN KEY (filml_idUtil) REFERENCES utilisateur(util_id);

ALTER TABLE bandeannonce ADD CONSTRAINT fk_bdFilm FOREIGN KEY (bd_idFilm) REFERENCES film(film_id);

ALTER TABLE photo ADD CONSTRAINT fk_photoFilm FOREIGN KEY (photo_idFilm) REFERENCES film(film_id);

ALTER TABLE jouer ADD CONSTRAINT fk_jouerFilm FOREIGN KEY (jouer_idFilm) REFERENCES film(film_id);
ALTER TABLE jouer ADD CONSTRAINT fk_jouerPersonne FOREIGN KEY (jouer_idPersonne) REFERENCES personne(pers_id);
