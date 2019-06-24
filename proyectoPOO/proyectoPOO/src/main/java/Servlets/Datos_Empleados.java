/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.departments;
import Modelo.dept_emp;
import Modelo.employees;
import Modelo.salaries;
import Modelo.titles;
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
public class Datos_Empleados extends HttpServlet {

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
            String id = request.getParameter("id");
            Controlador.Employees_C cec = new Controlador.Employees_C();
            
            employees Emplo = cec.getEmployee(id);
            request.setAttribute("Emplo", Emplo);
            
            salaries salarie=cec.getSalarie(id);
            request.setAttribute("salarie",salarie);
            
            titles title=cec.getTitle(id);
            request.setAttribute("title",title);
            
           dept_emp depart=cec.getED(id);
            request.setAttribute("depart",depart);
            
            RequestDispatcher rd = request.getRequestDispatcher("vista/datosempleados.jsp");
            rd.forward(request, response);
        }catch(Exception e){
            System.out.print(e);
        }     
    }  
    private void cargarModulo(HttpServletRequest request, HttpServletResponse response){    
        try{
            //System.out.println("Si llega");
            Controlador.Employees_C cec = new Controlador.Employees_C();
            ArrayList<employees> lista_empleados = cec.getEmployees();
            request.setAttribute("listado", lista_empleados);
            
            //System.out.println(lista_empleados.isEmpty());
            RequestDispatcher rd = request.getRequestDispatcher("vista/Empleados.jsp");
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
