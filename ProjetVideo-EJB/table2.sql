-- phpMyAdmin SQL Dump
-- version 3.3.9.2
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Jeu 17 Mai 2012 à 01:38
-- Version du serveur: 5.5.9
-- Version de PHP: 5.3.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Base de données: `VideoClub`
--

-- --------------------------------------------------------

--
-- Structure de la table `appartenir`
--

CREATE TABLE `appartenir` (
  `app_id` int(11) NOT NULL AUTO_INCREMENT,
  `app_categId` int(11) NOT NULL,
  `app_filmId` int(11) NOT NULL,
  PRIMARY KEY (`app_id`),
  KEY `fk_appCateg` (`app_categId`),
  KEY `fk_appFilm` (`app_filmId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `appartenir`
--


-- --------------------------------------------------------

--
-- Structure de la table `bandeannonce`
--

CREATE TABLE `bandeannonce` (
  `bd_id` int(11) NOT NULL AUTO_INCREMENT,
  `bd_lienVideo` varchar(150) NOT NULL,
  `bd_description` varchar(255) DEFAULT NULL,
  `bd_idFilm` int(11) NOT NULL,
  PRIMARY KEY (`bd_id`),
  KEY `fk_bdFilm` (`bd_idFilm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `bandeannonce`
--


-- --------------------------------------------------------

--
-- Structure de la table `cartevideoclub`
--

CREATE TABLE `cartevideoclub` (
  `cvc_id` int(11) NOT NULL AUTO_INCREMENT,
  `cvc_numeroCarteFidel` char(10) NOT NULL,
  `cvc_pointfidelite` int(11) NOT NULL,
  PRIMARY KEY (`cvc_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `cartevideoclub`
--

INSERT INTO `cartevideoclub` VALUES(1, '7897878765', 10);

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `categ_id` int(11) NOT NULL AUTO_INCREMENT,
  `categ_libelle` varchar(60) NOT NULL,
  PRIMARY KEY (`categ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `categorie`
--


-- --------------------------------------------------------

--
-- Structure de la table `film`
--

CREATE TABLE `film` (
  `film_id` int(11) NOT NULL AUTO_INCREMENT,
  `film_nom` varchar(50) NOT NULL,
  `film_lienAffiche` varchar(50) NOT NULL,
  `film_synopsis` varchar(255) DEFAULT NULL,
  `film_datedesortie` date NOT NULL,
  `film_duree` int(11) NOT NULL,
  `film_lienFilm` varchar(150) DEFAULT NULL,
  `film_anneedeproduction` year(4) DEFAULT NULL,
  `film_prixachat` float DEFAULT NULL,
  `film_prixlocation` float DEFAULT NULL,
  `film_idRealisateur` int(11) NOT NULL,
  PRIMARY KEY (`film_id`),
  KEY `fk_filmRealisateur` (`film_idRealisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `film`
--


-- --------------------------------------------------------

--
-- Structure de la table `filmAchete`
--

CREATE TABLE `filmAchete` (
  `filmA_id` int(11) NOT NULL AUTO_INCREMENT,
  `filmA_idFilm` int(11) NOT NULL,
  `filmA_idUtil` int(11) NOT NULL,
  `filmA_dateAchat` date NOT NULL,
  PRIMARY KEY (`filmA_id`),
  KEY `fk_filmAFilm` (`filmA_idFilm`),
  KEY `fk_filmAUtil` (`filmA_idUtil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `filmAchete`
--


-- --------------------------------------------------------

--
-- Structure de la table `filmloue`
--

CREATE TABLE `filmloue` (
  `filml_id` int(11) NOT NULL AUTO_INCREMENT,
  `filml_idFilm` int(11) NOT NULL,
  `filml_idUtil` int(11) NOT NULL,
  `filml_datelocation` date NOT NULL,
  `filml_duree` int(11) NOT NULL,
  PRIMARY KEY (`filml_id`),
  KEY `fk_filmlFilm` (`filml_idFilm`),
  KEY `fk_filmlUtil` (`filml_idUtil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `filmloue`
--


-- --------------------------------------------------------

--
-- Structure de la table `jouer`
--

CREATE TABLE `jouer` (
  `jouer_idFilm` int(11) NOT NULL,
  `jouer_idPersonnalite` int(11) NOT NULL,
  PRIMARY KEY (`jouer_idFilm`,`jouer_idPersonnalite`),
  KEY `fk_jouerPersonnalite` (`jouer_idPersonnalite`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `jouer`
--


-- --------------------------------------------------------

--
-- Structure de la table `noteFilm`
--

CREATE TABLE `noteFilm` (
  `nfilm_id` int(11) NOT NULL AUTO_INCREMENT,
  `nfilm_idFilm` int(11) NOT NULL,
  `nfilm_idUtil` int(11) NOT NULL,
  `nfilm_note` int(11) DEFAULT NULL,
  `nfilm_commentaire` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nfilm_id`),
  KEY `fk_NtFilmFilm` (`nfilm_idFilm`),
  KEY `fk_NtFilmUtil` (`nfilm_idUtil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `noteFilm`
--


-- --------------------------------------------------------

--
-- Structure de la table `personnalite`
--

CREATE TABLE `personnalite` (
  `pers_id` int(11) NOT NULL AUTO_INCREMENT,
  `pers_nom` varchar(50) NOT NULL,
  `pers_prenom` varchar(50) NOT NULL,
  `pers_Datedenaissance` date NOT NULL,
  `pers_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pers_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `personnalite`
--


-- --------------------------------------------------------

--
-- Structure de la table `photo`
--

CREATE TABLE `photo` (
  `photo_id` int(11) NOT NULL AUTO_INCREMENT,
  `photo_lienPhoto` varchar(150) NOT NULL,
  `photo_description` varchar(255) DEFAULT NULL,
  `photo_idFilm` int(11) NOT NULL,
  PRIMARY KEY (`photo_id`),
  KEY `fk_photoFilm` (`photo_idFilm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Contenu de la table `photo`
--


-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `util_id` int(11) NOT NULL AUTO_INCREMENT,
  `util_login` varchar(50) NOT NULL,
  `util_motdepasse` varchar(100) NOT NULL,
  `util_nom` varchar(50) DEFAULT NULL,
  `util_prenom` varchar(50) DEFAULT NULL,
  `util_adresse` varchar(100) DEFAULT NULL,
  `util_codepostale` varchar(10) DEFAULT NULL,
  `util_pays` varchar(50) DEFAULT NULL,
  `util_numerocartecredit` char(16) DEFAULT NULL,
  `util_admin` tinyint(1) NOT NULL DEFAULT '0',
  `util_cvc_Id` int(11) DEFAULT NULL,
  PRIMARY KEY (`util_id`),
  KEY `fk_CarteVideoClub` (`util_cvc_Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `utilisateur`
--


--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `appartenir`
--
ALTER TABLE `appartenir`
  ADD CONSTRAINT `fk_appCateg` FOREIGN KEY (`app_categId`) REFERENCES `categorie` (`categ_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_appFilm` FOREIGN KEY (`app_filmId`) REFERENCES `film` (`film_id`) ON DELETE CASCADE;

--
-- Contraintes pour la table `bandeannonce`
--
ALTER TABLE `bandeannonce`
  ADD CONSTRAINT `fk_bdFilm` FOREIGN KEY (`bd_idFilm`) REFERENCES `film` (`film_id`) ON DELETE CASCADE;

--
-- Contraintes pour la table `film`
--
ALTER TABLE `film`
  ADD CONSTRAINT `fk_filmRealisateur` FOREIGN KEY (`film_idRealisateur`) REFERENCES `personnalite` (`pers_id`);

--
-- Contraintes pour la table `filmAchete`
--
ALTER TABLE `filmAchete`
  ADD CONSTRAINT `fk_filmAFilm` FOREIGN KEY (`filmA_idFilm`) REFERENCES `film` (`film_id`),
  ADD CONSTRAINT `fk_filmAUtil` FOREIGN KEY (`filmA_idUtil`) REFERENCES `utilisateur` (`util_id`) ON DELETE CASCADE;

--
-- Contraintes pour la table `filmloue`
--
ALTER TABLE `filmloue`
  ADD CONSTRAINT `fk_filmlFilm` FOREIGN KEY (`filml_idFilm`) REFERENCES `film` (`film_id`),
  ADD CONSTRAINT `fk_filmlUtil` FOREIGN KEY (`filml_idUtil`) REFERENCES `utilisateur` (`util_id`) ON DELETE CASCADE;

--
-- Contraintes pour la table `jouer`
--
ALTER TABLE `jouer`
  ADD CONSTRAINT `fk_jouerFilm` FOREIGN KEY (`jouer_idFilm`) REFERENCES `film` (`film_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_jouerPersonnalite` FOREIGN KEY (`jouer_idPersonnalite`) REFERENCES `personnalite` (`pers_id`);

--
-- Contraintes pour la table `noteFilm`
--
ALTER TABLE `noteFilm`
  ADD CONSTRAINT `fk_NtFilmFilm` FOREIGN KEY (`nfilm_idFilm`) REFERENCES `film` (`film_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_NtFilmUtil` FOREIGN KEY (`nfilm_idUtil`) REFERENCES `utilisateur` (`util_id`) ON DELETE CASCADE;

--
-- Contraintes pour la table `photo`
--
ALTER TABLE `photo`
  ADD CONSTRAINT `fk_photoFilm` FOREIGN KEY (`photo_idFilm`) REFERENCES `film` (`film_id`) ON DELETE CASCADE;

--
-- Contraintes pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD CONSTRAINT `fk_CarteVideoClub` FOREIGN KEY (`util_cvc_Id`) REFERENCES `cartevideoclub` (`cvc_id`);
