//run on server by /create
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletCreation implements Servlet {
    ServletConfig conf;
   
      public void init(ServletConfig conf)
    {
     this.conf=conf;
     System.out.println("Creating Object...");
    }
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
    System.out.println("Servicing method...");
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    out.println("<h1>Welcome today is "+new Date().toString()+"</h1>");
    out.println("<h1>This is first way of servlet creation</h1>");
    }
    public void destroy()
    {
    System.out.println("Going to destroy object");
            
    }
    
    
    
   //Non life cycle method override
    
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    
    public String getServletInfo()
    {
        return "Servlet created by Rushi";
    }
        
}
