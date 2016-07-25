/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import domain.Spirits;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.SpiritDAO;

/**
 *
 * @author shanmukh
 */
@WebServlet(name = "SpiritsServlet", urlPatterns = {"/SpiritsServlet"})
public class SpiritsServlet extends HttpServlet {
           @EJB private SpiritDAO spiritDAO;
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
           String spiritID = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String operation = request.getParameter("operation");

        Spirits spirit = new Spirits(spiritID, name, price);

        if (operation.equalsIgnoreCase("Add")) {
            spiritDAO.addSpirit(spirit);
            request.setAttribute("spirit", spirit);
        } else if (operation.equalsIgnoreCase("Edit")) {
            spiritDAO.editSpirit(spirit);
            Spirits searchedSpirit = spiritDAO.getSpirit(spiritID);
            request.setAttribute("spirit", searchedSpirit);
        } else if (operation.equalsIgnoreCase("Delete")) {
            spiritDAO.deleteSpirit(spiritID);
        } else if (operation.equalsIgnoreCase("Search")) {
            Spirits searchedSpirit = spiritDAO.getSpirit(spiritID);
            request.setAttribute("spirit", searchedSpirit);
        }
        request.getRequestDispatcher("spiritsinfo.jsp").forward(request, response);
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
