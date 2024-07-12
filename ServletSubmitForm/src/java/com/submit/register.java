
package com.submit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class register extends HttpServlet{
    
    protected void doPost(HttpServletRequest req , HttpServletResponse resp)throws ServletException,IOException
    {
        resp.setContentType("text/html");
        PrintWriter out =resp.getWriter();
        
        String name=req.getParameter("user");
        String Pass =req.getParameter("pass");
        String mail=req.getParameter("email");
        String gender=req.getParameter("gender");
        String course = req.getParameter("Courses");
        
        String cond= req.getParameter("condition");
        if(cond!=null)
        {
            if(cond.equals("check"))
            {
                out.println("<h1>Form Submited Successfully</h1>");
                out.println("<h2>Name is : "+name+"<h2>");
             out.println("<h2>Password is : "+Pass+"<h2>");
             out.println("<h2>Email is : "+mail+"<h2>");
             out.println("<h2>Selected Course is : "+course+"<h2>");
            }
            else
            {
                out.println("<h1>Accept the term and conditions</h1>");
            }
                
        }
        else
            {
                out.println("<h1>Accept the term and conditions</h1>");
                //want to include o/p of index.html
                
                //get object of RequestDispatcher
                RequestDispatcher rd = req.getRequestDispatcher("index.html");
                //calling include method
                rd.include(req, resp);
            }
        
    }
}
