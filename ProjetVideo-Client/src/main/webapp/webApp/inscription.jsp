<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">

    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>YAYA VOD</title>
        <link rel="stylesheet" type="text/css" href="webApp/styles/style.css" media="all" />
    </head>
    <body>
        <jsp:include page="header.jsp" />

        <div id="body">
            <form action="Inscription" method="post">
                <h1>INSCRIPTION</h1>
                <fieldset>
                    <label for="login">Login: </label><input type="text" value="" id="login" /><br />
                    <label for="motDePasse">Mot de Passe: </label><input type="text" value="" id="motDePasse" /><br />
                    <label for="nom">Nom: </label><input type="text" value="" id="nom" /><br />
                    <label for="prenom">Prenom: </label><input type="text" value="" id="prenom" /><br />
                    <label for="adresse">Adresse: </label><input type="text" value="" id="adresse"/><br />
                    <label for="codePostale">Code Postale: </label><input type="text" value="" id="codePostale"/><br />

                    Pays: 
                    <select id="pays">
                        <option>France</option>
                        <option>Tunisie</option>
                        <option>Italie</option>
                        <option>Allemagne</option>
                        <option>Grande Bretagne</option>
                        <option>Etats Unis</option>
                    </select><br />

                    <!--<label for="numeroCarteCredit">Numero Carte de Credit</label><input type="text" value="" id="numeroCarteCredit"/><br />-->

                    <label for="mail">Email: </label><input type="text" value="" id="mail"/><br />

                    <input type="submit" name="action" />
                </fieldset>
            </form>
        </div>
        <div id="footer">
            <div>
                <div>
                    <h3>Contactez-nous</h3>
                    <ul>
                        <li>toto@toto.fr</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>
            </div>
            <div>
                <p>&copy; Copyright 2012. All rights reserved YAYA Corp</p>
            </div>
        </div>
    </body>
</html>