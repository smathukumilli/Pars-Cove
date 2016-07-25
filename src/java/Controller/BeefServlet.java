/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import domain.Beef;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.BeefDAO;

/**
 *
 * @author shanmukh
 */
@WebServlet(name = "BeefServlet", urlPatterns = {"/BeefServlet"})
public class BeefServlet extends HttpServlet {

    @EJB private BeefDAO beefDAO;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           String beefID = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String operation = request.getParameter("operation");

       Beef beef = new Beef(beefID, name, price);

        if (operation.equalsIgnoreCase("Add")) {
            beefDAO.addBeef(beef);
            request.setAttribute("beef", beef);
        } else if (operation.equalsIgnoreCase("Edit")) {
            beefDAO.editBeef(beef);
            Beef searchedBeef = beefDAO.getBeef(beefID);
            request.setAttribute("beef", searchedBeef);
        } else if (operation.equalsIgnoreCase("Delete")) {
            beefDAO.deleteBeef(beefID);
        } else if (operation.equalsIgnoreCase("Search")) {
            Beef searchedBeef = beefDAO.getBeef(beefID);
            request.setAttribute("beef", searchedBeef);
        }
        request.getRequestDispatcher("beefinfo.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
