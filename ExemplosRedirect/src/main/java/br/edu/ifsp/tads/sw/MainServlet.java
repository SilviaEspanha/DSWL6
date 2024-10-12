package br.edu.ifsp.tads.sw;



import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String par1 = request.getParameter("semana");

        // Adiciona um atributo à requisição para ser lido no próximo servlet
        request.setAttribute("dia_da_semana", "Hoje é: " + par1);

        // Despacha a requisição para o ProcessServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ProcessServlet");
        dispatcher.forward(request, response);
    }
}