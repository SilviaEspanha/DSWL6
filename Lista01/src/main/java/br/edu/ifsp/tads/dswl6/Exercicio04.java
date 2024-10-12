package br.edu.ifsp.tads.dswl6;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Exercicio04 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    private int contadorAcesso = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	contadorAcesso++;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Contador de Acessos</h1>");
        out.println("<p>Este servlet foi acessado " + contadorAcesso + " vezes.</p>");
        out.println("</body></html>");
    }
}
