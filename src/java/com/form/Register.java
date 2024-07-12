package com.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class Register extends HttpServlet {
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registered Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            
            // getting all details
            Random ran = new Random();
            long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

            String name = req.getParameter("name");
            String pass = req.getParameter("pass");
            String mail = req.getParameter("mail");

            out.println("<h1>Welcome Mr "+name+".</h1>");
            out.println("<h3>Your Password is "+pass+".</h3>");
            out.println("<h3>Your Email is "+mail+".</h3>");
           
           
            
            // connection
            Connection con = null;
           
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","raje@143");
                String q = "INSERT INTO user (id, name, password, email) VALUES (?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(q);
                
                pst.setLong(1, random);
                pst.setString(2, name);
                pst.setString(3, pass);
                pst.setString(4, mail);

                 pst.executeUpdate();
                 out.println("Data inserted successfully");
              
            } catch (Exception e) {
                e.printStackTrace();
                out.println("Something Went Wrong");
            } 
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
