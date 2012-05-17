insert into utilisateur(util_login, util_motdepasse, util_nom, util_prenom, util_adresse, util_codepostale, util_pays, util_numerocartecredit, util_admin) values
("yann","123456","k","yann","12 rue saint charles","33000","france","0123456789123456",true),
("yanni","123456","t","yannick","12 rue saint charles","33000","france","0123456789123456",false),
("arnaud","123456","d","arnaud","12 rue saint charles","33000","france","0123456789123456",true),
("ahmed","123456","b","ahmed","12 rue saint charles","33000","france","0123456789123456",true);

insert into categorie(categ_libelle) values
("Romantique"),
("Action"),
("Aventure"),
("Animé");

insert into personnalite(pers_nom, pers_prenom, pers_Datedenaissance, pers_description) values
("Debbouze","Jamel","10/5/2011","artiste et réalisateur"),
("Alain","Chabat","10/3/2012","artiste et réalisateur"),
("Fred","Testot","10/2/2010","artiste et réalisateur"),
("Chris","Evans","10/1/2011","artiste et réalisateur"),
("Mark","Ruffalo","10/1/2001","artiste et réalisateur");

insert into film(film_nom, film_lienAffiche, film_synopsis, film_datedesortie, film_duree, film_lienFilm, film_anneedeproduction, film_prixachat, film_prixlocation, film_idRealisateur) values
("Un homme par hasard","C:\affiche\afficheUn homme par hasard.jpg","azerty","01/01/2012","90","C:\film\filmUn homme par hasard.avi","2011",56.2,10.2,1),
("Les Hauts de Hurlevent","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmLes Hauts de Hurlevent.avi","2011",56.2,10.2,1),
("Shadow & moi","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmShadow & moi.avi","2011",56.2,10.2,2),
("First Night","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmFirst Night.avi","2011",56.2,10.2,2),
("Sexe, Champagne et Chocolat","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmSexe, Champagne et Chocolat.avi","2011",56.2,10.2,2),
("Devil May Cry","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmDevil May Cry.avi","2011",56.2,10.2,2),
("Spider-Man","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmSpider-Man.avi","2011",56.2,10.2,3),
("Avengers","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmAvengers.avi","2011",56.2,10.2,3),
("StreetDance 2","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmStreetDance 2.avi","2011",56.2,10.2,3),
("Sur la piste du Marsupilami","C:\affiche\afficheLes Hauts de Hurlevent.jpg","azerty","01/01/2012","90","C:\film\filmSur la piste du Marsupilami.avi","2011",56.2,10.2,3);

insert into appartenir(app_categId,app_filmId) values
(1, 1),
(1, 2),
(1, 4),
(1, 3),
(1, 5),
(2, 10),
(2, 7),
(2, 9),
(3, 6),
(4, 8),
(4, 5),
(4, 6);

insert into cartevideoclub(cvc_numeroCarteFidel,cvc_pointfidelite,cvc_idPosseseur) values
("0123456789",10,1),
("0123456788",15,2),
("0123456777",20,3),
("0123456666",31,4);


insert into filmloue(filml_idFilm, filml_idUtil, filml_datelocation, filml_duree) values
(1,1,"01/04/2012",50),
(2,1,"01/04/2012",20),
(3,2,"01/04/2012",100),
(7,3,"01/04/2012",2);


insert into noteFilm(nfilm_idFilm, nfilm_idUtil, nfilm_note, nfilm_commentaire) values
(1,1,5,"bon film"),
(2,2,5,"bon film"),
(3,2,1,"mauvais film"),
(4,3,1,"mauvais film");

insert into bandeannonce(bd_lienVideo, bd_description, bd_idFilm) values
("C:\bd\bdShadow & moi.avi","bande annonce du film",3),
("C:\bd\bdUn homme par hasard1.avi","bande annonce explosive du film",1),
("C:\bd\bdLes Hauts de Hurlevent.avi","une très bonne intro",2),
("C:\bd\bdUn homme par hasard2.avi","bande annonce a ne pas raté du film",1);


insert into photo(photo_lienPhoto, photo_description, photo_idFilm) values
("C:\photo\photoShadow & moi.jpg","photo du film",3),
("C:\photo\photoUn homme par hasard1.jpg","photo explosive du film",1),
("C:\photo\photoLes Hauts de Hurlevent.jpg","une très bonne prise de vu",2),
("C:\photo\photoUn homme par hasard2.jpg","photo a ne pas raté du film",1);


insert into jouer(jouer_idFilm, jouer_idPersonnalite) values
(1,2),
(1,1),
(1,3),
(1,4),
(2,2),
(2,3),
(9,1),
(8,2);
