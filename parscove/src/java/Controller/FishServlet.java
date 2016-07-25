/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import domain.Fish;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.FishDAO;

/**
 *
 * @author shanmukh
 */
@WebServlet(name = "FishServlet", urlPatterns = {"/FishServlet"})
public class FishServlet extends HttpServlet {
    @EJB private FishDAO fishDAO;

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
           String fishId = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String operation = request.getParameter("operation");

        Fish fish = new Fish(fishId, name, price);

        if (operation.equalsIgnoreCase("Add")) {
            fishDAO.addFish(fish);
            request.setAttribute("fish", fish);
        } else if (operation.equalsIgnoreCase("Edit")) {
            fishDAO.editFish(fish);
            Fish searchedFish = fishDAO.getFish(fishId);
            request.setAttribute("fish", searchedFish);
        } else if (operation.equalsIgnoreCase("Delete")) {
            fishDAO.deleteFish(fishId);
        } else if (operation.equalsIgnoreCase("Search")) {
            Fish searchedFish = fishDAO.getFish(fishId);
            request.setAttribute("fish", searchedFish);
        }
        request.getRequestDispatcher("fishinfo.jsp").forward(request, response);
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
