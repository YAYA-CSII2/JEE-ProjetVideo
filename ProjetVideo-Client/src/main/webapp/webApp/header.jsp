<%
    Cookie[] cookies = request.getCookies();
    boolean foundCookie = false;
    if (cookies != null) {
        int cpt = 0;
        while (foundCookie != true && cpt < cookies.length) {;
            if (cookies[cpt].getName().equals("connected")) {
                System.out.println("foundcookie");
                foundCookie = true;
            }
            cpt++;
        }
    }
%>

<div id="header">
    <div id="logo">
        <a href="Accueil">
            <img src="webApp/images/logo.jpg" alt="" />
        </a>		
    </div>
    <ul id="navigation">
        <li class="selected"><a href="Accueil" class="boutton"><span>ACCEUIL</span></a></li>
        <%
            if (!foundCookie) {
        %>
        <li><a href="Inscription" class="boutton"><span>INSCRIPTION</span></a></li>
        <li><a href="Connexion" class="boutton"><span>CONNEXION</span></a></li>	
        <%
            } else {
        %>
        <li><a href="profil.html" class="boutton"><span>PROFIL</span></a></li>
        <li><a href="Pannier" class="boutton"><span>PANIER</span></a></li>
        <%
            }
        %>
    </ul>
    
    <%
        if (foundCookie) {
    %>
    <ul id="search">
        <li><a href="profil.html" class="boutton"><span>Rechercher</span></a></li>
        <li><input type="text" value="Recherche" /></li>
    </ul>
    <%
        }
    %>
</div>