/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BD.Conexion;
import BD.Consultas;
import Modelo.departments;
import Modelo.dept_emp;
import java.util.ArrayList;

/**
 *
 * @author David VM
 */
import Modelo.employees;
import Modelo.salaries;
import Modelo.titles;

public class Employees_C {
    public ArrayList<employees> getEmployees (){
        Consultas Con = new Consultas();
        return Con.getEmployees();
    }
    public employees getEmployee (String id){
        Consultas Con = new Consultas();
        return Con.getEmployee(id);
    }
    public titles getTitle (String id){
        Consultas Con = new Consultas();
        return Con.getTitles(id);
    }
    public salaries getSalarie (String id){
        Consultas Con = new Consultas();
        return Con.getSalarie(id);
    }
    public dept_emp getED (String id){
        Consultas Con = new Consultas();
        return Con.getED(id);
    }
    public ArrayList<dept_emp> getDE (String id){
        Consultas Con = new Consultas();
        return Con.getDE(id);
    }
    public ArrayList<departments> getDepartmets (){
        Consultas Con = new Consultas();
        return Con.getDepartmets();
    }
//   public static void main(String [] arg) {
//        Employees_C c = new Employees_C();
//        ArrayList<employees> a=  c.getEmployees();
//        System.out.println(a.isEmpty());
//   } 
   
}
