package br.edu.ifsp.tads.sw;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProcessServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String dia_semana = (String) request.getAttribute("dia_da_semana");
        
        // Exibe a mensagem passada pelo MainServlet
        out.println("<h1>" + dia_semana + "</h1>");
    }
}


