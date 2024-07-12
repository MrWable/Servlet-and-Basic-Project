//run on server by /generic
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Om Sai143
 */
public class ServletCreationSecond extends GenericServlet {
    @Override
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("This is generic servlet");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is servlet creation using Generic Class</h1>");
        
    }
    
}
