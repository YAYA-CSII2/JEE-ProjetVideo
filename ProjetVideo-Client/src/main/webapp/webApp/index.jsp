<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">

    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>YAYA VOD</title>
        <link rel="stylesheet" type="text/css" href="webApp/styles/style.css" media="all" />
    </head>
    <body>
        <jsp:include page="header.jsp" />

        <div class="conteneurFilmGenre">
            Derniers Films Lou&eacute;s :
            <ul>
                <li><a href="Film">Film1</a></li>
                <li><a href="Film">Film2</a></li>
                <li><a href="Film">Film3</a></li>
                <li><a href="Film">Film4</a></li>
                <li><a href="Film">Film5</a></li>
                <li><a href="Film">Film6</a></li>
                <li><a href="Film">Film7</a></li>
                <li><a href="Film">Film8</a></li>
                <li><a href="Film">Film9</a></li>
                <li><a href="Film">Film10</a></li>
            </ul>
        </div>
        <div class="conteneurFilmGenre">
            Top 10 :
            <ul>
                <!-- sa plante...
                <c:forEach var="filmLoue" items="${filmsLoue}">
                    <li><a href="http://www.allocine.fr">${filmLoue.getMonFilmLoue().getNom()}</a></li>
                </c:forEach>-->
                <li><a href="http://www.allocine.fr">Film1</a></li>
                <li><a href="Film">Film2</a></li>
                <li><a href="Film">Film3</a></li>
                <li><a href="Film">Film4</a></li>
                <li><a href="Film">Film5</a></li>
                <li><a href="Film">Film6</a></li>
                <li><a href="Film">Film7</a></li>
                <li><a href="Film">Film8</a></li>
                <li><a href="Film">Film9</a></li>
                <li><a href="Film">Film10</a></li>
            </ul>
        </div>
        <div class="conteneurFilmGenre">
            Genre :
            <ul>
                <li><a href="Categorie">Genre1</a></li>
                <li><a href="Categorie">Genre2</a></li>
                <li><a href="Categorie">Genre3</a></li>
                <li><a href="Categorie">Genre4</a></li>
                <li><a href="Categorie">Genre5</a></li>
                <li><a href="Categorie">Genre6</a></li>
                <li><a href="Categorie">Genre7</a></li>
                <li><a href="Categorie">Genre8</a></li>
                <li><a href="Categorie">Genre9</a></li>
                <li><a href="Categorie">Genre10</a></li>
            </ul>
        </div>
        <div id="tag">
            Tag : 
            <a href="Film">Tag1</a>, 
            <a href="Film">Tag1</a>,
            <a href="Film">Tag1</a>, 
            <a href="Film">Tag1</a>, 
            <a href="Film">Tag1</a>, 
            <a href="Film">Tag1</a>
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