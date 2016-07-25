/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import domain.Salads;
import java.io.IOException;
import static java.lang.System.out;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.SaladDAO;

/**
 *
 * @author shanmukh
 */
@WebServlet(name = "SaladServlet", urlPatterns = {"/SaladServlet"})
public class SaladServlet extends HttpServlet {

    @EJB
    private SaladDAO saladDAO;
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
        String saladId = request.getParameter("saladId");
        String saladname = request.getParameter("saladname");
        String saladPrice = request.getParameter("saladPrice");
        String operation = request.getParameter("operation");

        Salads salad = new Salads(saladId,saladname,saladPrice);

        if (operation.equalsIgnoreCase("Add")) {
            saladDAO.addSalad(salad);            
            request.setAttribute("salad", salad);           
        } else if (operation.equalsIgnoreCase("Edit")) {
            saladDAO.editSalad(salad);
            Salads searchedSalad = saladDAO.getSalad(saladId);
            request.setAttribute("salad", searchedSalad);
        } else if (operation.equalsIgnoreCase("Delete")) {
            saladDAO.deleteSalad(saladId);
        } else if (operation.equalsIgnoreCase("Search")) {
            Salads searchedSalad = saladDAO.getSalad(saladId);
            request.setAttribute("salad", searchedSalad);
        }
        request.getRequestDispatcher("saladinfo.jsp").forward(request, response);
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
         request.getRequestDispatcher("saladinfo.jsp").forward(request, response);
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
