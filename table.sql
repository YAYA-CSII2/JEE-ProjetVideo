CREATE TABLE elementpanier (
id_prod int PRIMARY KEY,
quantite int,
prix float,
id_cli int
);

CREATE TABLE produit (
	prod_id int PRIMARY KEY,
	prod_libelle varchar(150),
	prod_desc varchar(255),
	prod_codebarre varchar(10),
	prod_lienphoto varchar(70),
	prod_prix float
);

ALTER TABLE elementpanier ADD CONSTRAINT fk_prod FOREIGN KEY (id_prod)  REFERENCES produit(prod_id);