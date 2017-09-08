/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.probosque.service;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.probosque.controller.ControllerPredios;
import org.probosque.model.OutputJson;
import org.probosque.model.ResponseJson;

/**
 *
 * @author Erick_G
 */
@WebServlet(name = "Predios", urlPatterns = {"/Predios"})
public class Predios extends HttpServlet {

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

        Configuration.setHeadersJson(response);
        PrintWriter out = response.getWriter();
        OutputJson output = new OutputJson();

        Gson gson = new Gson();
                            ControllerPredios controller = new ControllerPredios();

        try {
            String action = request.getParameter("action");
            switch (action) {
                case "getPredio":
                     output = controller.getPredio(request);
                       break;
                case "insertPredio":
                     output = controller.insertPredio(request);
                    break;

                case "updatePredio":
                    controller = new ControllerPredios();
                    output = controller.updatePredio(request);
                    break;

                case "deletePredio":
                    controller = new ControllerPredios();
                    output = controller.deletePredio(request);
                    break;
                }
        } catch (Exception ex) {
            ResponseJson reponseJson = new ResponseJson();
            reponseJson.setSucessfull(false);
            reponseJson.setMessage(ex.getMessage());
            output.setResponse(reponseJson);
        } finally {
            out.print(gson.toJson(output));
            out.close();
        }
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
