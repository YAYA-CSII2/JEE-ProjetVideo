package com.projetvideo.controlleur;

import com.epsiyaya.projetvideoejb.distant.remote.IPannierSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Inscription extends HttpServlet {

    public static final String DEFAULT_JNDI_NAME = "com.epsiyaya.projetvideoejb.distant.remote.IPannierSession";

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
            
            if (foundCookie) {
                response.sendRedirect("Accueil");
            } else {
                if (request.getParameter("action") != null) {
                    Context context = new InitialContext();
                    Object obj = context.lookup(DEFAULT_JNDI_NAME);
                    IPannierSession pannierSession = (IPannierSession) PortableRemoteObject.narrow(obj, IPannierSession.class);


                    //request.setAttribute("lesDoc", pannierSession.getPannier(1));
                    
                    System.out.println("daccord");
                } else {
                    System.out.println("pas daccord");
                }

                request.getRequestDispatcher("webApp/inscription.jsp").forward(request, response);
            }

            //if (!foundCookie) { Cookie cookie1 = new Cookie("color", "cyan");
            //  cookie1.setMaxAge(24 * 60 * 60); response.addCookie(cookie1);
            //}

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
