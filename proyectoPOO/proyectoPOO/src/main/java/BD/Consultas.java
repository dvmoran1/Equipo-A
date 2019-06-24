/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import BD.Conexion;
import Modelo.departments;
import Modelo.dept_emp;
import Modelo.employees;
import Modelo.salaries;
import Modelo.titles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author David VM
 */
public class Consultas {
    private Conexion con=null;
    
    public Consultas() {
        con = new Conexion();
    }
  
    
    public ArrayList<employees> getEmployees() {
        PreparedStatement pst = null;
        ResultSet rs = null;

        ArrayList<employees> listEmployees = new ArrayList<>();
        try {
            String consult = "SELECT * FROM employees.employees limit 500;";
            pst = con.getConnection().prepareStatement(consult);
            rs = pst.executeQuery();
            while (rs.next()) {
                employees employee = new employees();
                employee.setEmp_no(rs.getInt("emp_no"));
                employee.setBirth_date(rs.getString("birth_date"));
                employee.setFirst_name(rs.getString("first_name"));
                employee.setLast_name(rs.getString("last_name"));
                employee.setGender(rs.getString("gender"));
                employee.setHire_date(rs.getString("hire_date"));

                listEmployees.add(employee);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (con.getConnection() != null) {
                    con.getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error " + e);
            }
        }
        return listEmployees;
    }
    public employees getEmployee(String id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        employees employee = new employees();
        try {
            String consult = "SELECT * FROM employees.employees\n" +
                "where employees.emp_no = ?";
            pst = con.getConnection().prepareStatement(consult);
            pst.setString(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                employee.setEmp_no(rs.getInt("emp_no"));
                employee.setBirth_date(rs.getString("birth_date"));
                employee.setFirst_name(rs.getString("first_name"));
                employee.setLast_name(rs.getString("last_name"));
                employee.setGender(rs.getString("gender"));
                employee.setHire_date(rs.getString("hire_date"));

            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (con.getConnection() != null) {
                    con.getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error " + e);
            }
        }
        return employee;
    }
    
    public titles getTitles(String id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        titles title = new titles();
        try {
            String consult = "SELECT * FROM employees.titles\n" +
                "where titles.emp_no = ?";
            pst = con.getConnection().prepareStatement(consult);
            pst.setString(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                title.setEmp_no(rs.getInt("emp_no"));
                title.setTitle(rs.getString("title"));
                title.setFrom_date(rs.getString("from_date"));
                title.setTo_date(rs.getString("to_date"));
                

            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (con.getConnection() != null) {
                    con.getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error " + e);
            }
        }
        return title;
    }
    
    public salaries getSalarie(String id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        salaries salarie = new salaries();
        try {
            String consult = "SELECT * FROM employees.salaries\n" +
                "where salaries.emp_no = ? \n" +
                "order by salaries.from_date desc\n" +
                "limit 1;";
            pst = con.getConnection().prepareStatement(consult);
            pst.setString(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                salarie.setEmp_no(rs.getInt("emp_no"));
                salarie.setSalary(rs.getString("salary"));
                salarie.setFrom_date(rs.getString("from_date"));
                salarie.setTo_date(rs.getString("to_date"));
                

            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (con.getConnection() != null) {
                    con.getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error " + e);
            }
        }
        return salarie;
    }

    public dept_emp getED(String id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        dept_emp DE = new dept_emp();
        try {
            String consult = "SELECT * FROM employees.salaries\n" +
                "where salaries.emp_no = ? \n" +
                "order by salaries.from_date desc\n" +
                "limit 1;";
            pst = con.getConnection().prepareStatement(consult);
            pst.setString(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                DE.setEmp_no(rs.getInt("emp_no"));
                DE.setDept_no(rs.getString("dept_no"));
                DE.setDept_name(rs.getString("dept_name"));
                DE.setFrom_date(rs.getString("from_date"));
                DE.setTo_date(rs.getString("to_date"));
                

            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (con.getConnection() != null) {
                    con.getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error " + e);
            }
        }
        return DE;
    }
    
    public ArrayList<departments> getDepartmets() {
        PreparedStatement pst = null;
        ResultSet rs = null;

        ArrayList<departments> listDepartmets = new ArrayList<>();
        try {
            String consult = "SELECT * FROM employees.departments;";
            pst = con.getConnection().prepareStatement(consult);
            rs = pst.executeQuery();
            while (rs.next()) {
                departments department = new departments();
                department.setDept_no(rs.getString("dept_no"));
                department.setDept_name(rs.getString("dept_name"));

                listDepartmets.add(department);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (con.getConnection() != null) {
                    con.getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error " + e);
            }
        }
        return listDepartmets;
    }
}
