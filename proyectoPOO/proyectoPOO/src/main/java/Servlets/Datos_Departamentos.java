/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.departments;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jauregui
 */
public class Datos_Departamentos extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("ACCION");
        switch(accion){
            case "MODULO": cargarModulo(request, response); break;
            case "MostrarEspecifico": especifico(request,response); break;
            default: break;
        }
    }
    private void especifico(HttpServletRequest request, HttpServletResponse response){    
        try{
            RequestDispatcher rd = request.getRequestDispatcher("vista/datos_departamento.jsp");
            rd.forward(request, response);
        }catch(Exception e){
            System.out.print(e);
        }     
    } 
    private void cargarModulo(HttpServletRequest request, HttpServletResponse response){    
        try{
           Controlador.Employees_C cec = new Controlador.Employees_C();
            ArrayList<departments> lista_D = cec.getDepartmets();
            request.setAttribute("listado", lista_D);
            
            RequestDispatcher rd = request.getRequestDispatcher("vista/Departamentos.jsp");
            rd.forward(request, response);
        }catch(Exception e){
            System.out.print(e);
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
