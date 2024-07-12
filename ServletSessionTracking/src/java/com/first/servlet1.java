// /create
package com.first;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Om Sai143
 */
public class servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String s =req.getParameter("name");
        
       
        out.println("<h1>Welcome "+s+". ");
        RequestDispatcher rd = req.getRequestDispatcher("/create");
        rd.include(req, resp);
        
    }
    
}
