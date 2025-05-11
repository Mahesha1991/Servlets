package com.mahesha.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set Mime Content Type
        resp.setContentType("text/html");

        // Get PrintWriter out Object from response
        PrintWriter out = resp.getWriter();

        // Create a String Object which will be added to the session
        String sessionObj = "Mobile";

        // Get the session
        HttpSession session = req.getSession();

        // Add the attribute to the session
        session.setAttribute("uname", sessionObj);

        // Use out Object to println HTML code
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("<h1> Hello World " + sessionObj + "</h1>");
        out.println("</BODY>");
        out.println("</HTML>");

        // Close the out Object
        out.close();
    }
}
