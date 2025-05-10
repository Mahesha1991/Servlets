package com.mahesha;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private String correctUserName = "code";
    private String correctPassword = "java";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set Mime Content Type
        resp.setContentType("text/html");

        // Get Parameter from request Object
        String userName = req.getParameter("username"); //This value is the name="username" from the form
        String password = req.getParameter("password"); //This value is the name="password" in the form

        // Validate the username and password
        if (userName.equals(correctUserName) && password.equals(correctPassword)){
            // Get the Servlet that we need to send and forward the request
            RequestDispatcher rs = req.getRequestDispatcher("/welcome");
            rs.forward(req, resp);
        } else {
            RequestDispatcher rs = req.getRequestDispatcher("index.html");
            rs.forward(req, resp);

        }
    }
}
