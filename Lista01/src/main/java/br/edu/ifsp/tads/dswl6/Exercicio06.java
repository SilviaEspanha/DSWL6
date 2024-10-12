package br.edu.ifsp.tads.dswl6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Exercicio06 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private List<String> comentariosList = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Comentários</h1>");

        out.println("<form method='post' action='Exercicio06'>");
        out.println("Digite seu comentário: <input type='text' name='comentario' />");
        out.println("<input type='submit' value='Enviar Comentário' />");
        out.println("</form>");

        out.println("<h2>Comentários Enviados:</h2>");
        out.println("<ul>");
        for (String comentario : comentariosList) {
            out.println("<li>" + comentario + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String comentario = request.getParameter("comentario");

        if (comentario != null && !comentario.trim().isEmpty()) {
        	comentariosList.add(comentario);
        }

        doGet(request, response);
    }
}
