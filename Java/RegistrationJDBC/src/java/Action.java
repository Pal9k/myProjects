/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import java.sql.*;

/**
 *
 * @author palat
 */
public class Action extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
       
        String em = req.getParameter("email");
        String p = req.getParameter("psw");
        String pr = req.getParameter("psw-repeat");
        
        PrintWriter out = res.getWriter();
        
        if(Action1.method1(em,p,pr)){
            out.println("SuccessFull !!");
        }
        else{
            out.println("Not Successfull !!!");
        }
        
//        try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/16it152","16it152","root");
//            
//            Statement s = cn.createStatement();
//            
//            int i;
//            i = s.executeUpdate("INSERT INTO `myform` (`email`, `password`, `Reapet_password`) VALUES (em,p,pr)");
//            
//            //int j = s.executeUpdate("INSERT INTO EMP VALUES (10, 'PAL')");
//            
//            s.close();
//            cn.close();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        
        
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
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>

}
