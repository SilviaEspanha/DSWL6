package br.edu.ifsp.tads.sw;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class LoginSessionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        // Cria uma nova sessão para o usuário
        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        // Redireciona para o dashboard
        response.sendRedirect("DashboardServlet");
    }
}