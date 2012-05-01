

CREATE TABLE IF NOT EXISTS `elementpanier` (
  `id_prod` int(11) NOT NULL,
  `quantite` int(11) DEFAULT NULL,
  `prix` float DEFAULT NULL,
  `id_cli` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_prod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `prod_id` int(11) NOT NULL,
  `prod_libelle` varchar(150) DEFAULT NULL,
  `prod_desc` varchar(255) DEFAULT NULL,
  `prod_codebarre` varchar(10) DEFAULT NULL,
  `prod_lienphoto` varchar(70) DEFAULT NULL,
  `prod_prix` float DEFAULT NULL,
  PRIMARY KEY (`prod_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `produit`
--

INSERT INTO `produit` (`prod_id`, `prod_libelle`, `prod_desc`, `prod_codebarre`, `prod_lienphoto`, `prod_prix`) VALUES
(1, 'produit1', 'produit1 !!', '1015239', 'nophoto', 10),
(2, 'produit2', 'cest le produit2', '1015237', 'nophoto', 5.5),
(3, 'Fleur', 'flower', '1015270', 'nophoto', 3.75),
(4, 'FISHHH', 'wut', '119430973', 'nophoto', 20.9);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `elementpanier`
--
ALTER TABLE `elementpanier`
  ADD CONSTRAINT `fk_prod` FOREIGN KEY (`id_prod`) REFERENCES `produit` (`prod_id`);
