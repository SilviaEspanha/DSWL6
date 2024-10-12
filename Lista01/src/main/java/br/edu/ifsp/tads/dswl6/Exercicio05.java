package br.edu.ifsp.tads.dswl6;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Exercicio05 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    private List<String> nomesList = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");

        if (nome != null && !nome.trim().isEmpty()) {
            nomesList.add(nome);
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Lista de Nomes</h1>");
        out.println("<ul>");

        for (String name : nomesList) {
            out.println("<li>" + name + "</li>");
        }

        out.println("</ul>");
        out.println("<form method='get' action='Exercicio05'>");
        out.println("Digite um nome: <input type='text' name='nome' />");
        out.println("<input type='submit' value='Adicionar Nome' />");
        out.println("</form>");
        out.println("</body></html>");
        out.println("<p>Nomes: " + nomesList + "</p>");
    }
}

