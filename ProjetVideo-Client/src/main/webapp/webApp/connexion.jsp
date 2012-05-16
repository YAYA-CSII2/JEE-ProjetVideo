<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">

    <head>
        <title>Connexion</title>
        <link rel="stylesheet" type="text/css" href="webApp/styles/style.css" media="all" />
    </head>
    <body>
        <jsp:include page="header.jsp" />
        
        <div id="body">
            <form action="Connexion" class="contact" method="post">
                <fieldset>
                    <h1>CONNEXION</h1>
                    <label for="login">Login :</label><input type="text" value="" id="login" name="login" /><br />
                    <label for="motDePasse">Mot de Passe :</label><input type="password" value="" id="motDePasse" name="motDePasse" /><br />
                    <input type="submit" value="Connexion" name="action" />
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