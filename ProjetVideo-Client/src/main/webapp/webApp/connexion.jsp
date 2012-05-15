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
            <form action="Connexion" class="contact">
                <fieldset>
                    <h1>CONNEXION</h1>
                    <label for="login">Login :</label><input type="text" value="" id="login" name="login" /><br /><br />
                    
                    <label for="motDePasse">Mot de Passe :</label><input type="password" value="" id="motDePasse" name="motDePasse" /><br /><br />
                    
                    <input type="submit" value="Connexion" name="action" />
                </fieldset>
            </form>
        </div>
        <div id="footer">
            <div>
                <div>
                    <h3>america</h3>
                    <ul>
                        <li>457-380-1654 main</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>		
                <div>
                    <h3>europe</h3>
                    <ul>
                        <li>457-380-1654 main</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>	
                <div>
                    <h3>canada</h3>
                    <ul>
                        <li>457-380-1654 main</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>	
                <div>
                    <h3>middle east</h3>
                    <ul>
                        <li>457-380-1654 main</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>	
                <div>
                    <h3>follow us:</h3>
                    <a class="facebook" href="http://facebook.com/freewebsitetemplates" target="_blank">facebook</a>		
                    <a class="twitter" href="http://twitter.com/fwtemplates" target="_blank">twitter</a>
                </div>	
            </div>
            <div>
                <p>&copy; Copyright 2012. All rights reserved</p>
            </div>
        </div>
    </body>
</html>