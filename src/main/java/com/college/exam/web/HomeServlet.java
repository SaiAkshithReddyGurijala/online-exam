package com.college.exam.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head><title>Online Examination System</title></head><body>");
            out.println("<h1>Online Examination System</h1>");
            out.println("<p>Welcome to the College Online Examination System.</p>");
            out.println("<ul>");
            out.println("<li><a href='login.html'>Student Login</a></li>");
            out.println("<li><a href='exams.html'>Available Examinations</a></li>");
            out.println("<li><a href='question-bank.html'>Faculty Question Bank</a></li>");
            out.println("</ul>");
            out.println("</body></html>");
        }
    }
}
