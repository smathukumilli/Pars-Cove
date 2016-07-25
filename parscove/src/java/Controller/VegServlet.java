/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import domain.Veg;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.VegDAO;

/**
 *
 * @author shanmukh
 */
@WebServlet(name = "VegServlet", urlPatterns = {"/VegServlet"})
public class VegServlet extends HttpServlet {
    
    @EJB private VegDAO vegDAO;

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
          String VegID = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String operation = request.getParameter("operation");

        Veg veg = new Veg(VegID, name, price);

        if (operation.equalsIgnoreCase("Add")) {
            vegDAO.addVeg(veg);
            request.setAttribute("veg", veg);
        } else if (operation.equalsIgnoreCase("Edit")) {
            vegDAO.editVeg(veg);
            Veg searchedVeg = vegDAO.getVeg(VegID);
            request.setAttribute("veg", searchedVeg);
        } else if (operation.equalsIgnoreCase("Delete")) {
            vegDAO.deleteVeg(VegID);
        } else if (operation.equalsIgnoreCase("Search")) {
            Veg searchedVeg = vegDAO.getVeg(VegID);
            request.setAttribute("veg", searchedVeg);
        }
        request.getRequestDispatcher("veginfo.jsp").forward(request, response);
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
