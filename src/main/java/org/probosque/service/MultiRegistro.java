package org.probosque.service;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.probosque.controller.ControllerMultiregistros;
import org.probosque.model.OutputJson;
import org.probosque.model.ResponseJson;


@WebServlet(name = "MultiRegistro", urlPatterns = {"/MultiRegistro"})
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 15, // 15 MB
        maxFileSize = 1024 * 1024 * 15, // 15 MB
        maxRequestSize = 1024 * 1024 * 15// 15 MB
        
)
public class MultiRegistro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Configuration.setHeadersJson(response);
        PrintWriter out = response.getWriter();
        OutputJson output = new OutputJson();
        Gson gson = new Gson();

   try {    
            ControllerMultiregistros controller = new ControllerMultiregistros();
            String action = request.getParameter("action");
            switch (action) {
                case "insertMultiregistro":
                      output=controller.insertMultiregistro(request);
                    break;
                 case "updateMultiregistro":
                     output=controller.updateMultiregistro(request);
                    break;   
                 case "deleteMultiregistro":
                     output=controller.deleteMultiregistro(request);
                    break;
                 case "getRepresentantes":
                     output=controller.getRepresentantes(request);
                     break;
                 case "getPoligonos":
                     output=controller.getPoligonos(request);
                     break;
                 case "getImagenes":
                     output=controller.getImagenes(request);
                     break;
                case "insertMultiregistroImagen":
                     
                     output = controller.insertMultiregistroImagen(request);
                    break;
                case  "getAuditorias":
                     output= controller.getAuditorias(request); 
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
