package br.edu.ifsp.tads.sw;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class DashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Obtém a sessão atual
        HttpSession session = request.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            out.println("<h1>Welcome, " + username + "!</h1>");
            out.println("<a href=" + "LogoutServlet" + ">Logout</a>");
        } else {
            out.println("<h1>No active session. Please login.</h1>");
        }
    }
}