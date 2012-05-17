package com.projetvideo.controlleur;

import com.epsiyaya.projetvideoejb.distant.remote.IFilmLoueSession;
import com.epsiyaya.projetvideoejb.metier.model.FilmLoue;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Accueil extends HttpServlet {

    public static final String DEFAULT_JNDI_NAME = "com.epsiyaya.projetvideoejb.distant.remote.IFilmLoueSession";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void destroy() {
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Context context = new InitialContext();
            Object obj = context.lookup(DEFAULT_JNDI_NAME);
            IFilmLoueSession flSession = (IFilmLoueSession) PortableRemoteObject.narrow(obj, IFilmLoueSession.class);
            
            Set<FilmLoue> ss = flSession.getTenLast();
            for (FilmLoue fl: ss) {
                System.out.println("Acteur: " + fl.getMonFilmLoue().getNom());
            }
            
            
            //request.setAttribute("filmsLoue", flSession.getTenLast());
            
            request.getRequestDispatcher("webApp/index.jsp").forward(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
