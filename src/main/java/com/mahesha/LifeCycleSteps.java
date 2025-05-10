package com.mahesha;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/life")
public class LifeCycleSteps extends HttpServlet {

    public LifeCycleSteps() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("In the Init");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("inside destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("Hello This is it");

        try {
            // As we have added sleep, client page will be loading for the below number of sleep seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            out.println("2nd line");
        }

        out.close();

        System.out.println("in the do-get");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
