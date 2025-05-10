package com.mahesha;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set Mime Content Type
        resp.setContentType("text/html");

        // Get PrintWriter out Object from response
        PrintWriter out = resp.getWriter();

        // Use out Object to println HTML code
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("<h1> Hello World </h1>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
