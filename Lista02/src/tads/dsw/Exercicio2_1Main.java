package tads.dsw;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exercicio2_1Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String par1 = request.getParameter("idade");

        // Adiciona um atributo � requisi��o para ser lido no pr�ximo servlet
        request.setAttribute("idadeUsuario", "Voc� tem " + par1 + " anos!");

        // Despacha a requisi��o para o ProcessServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("Exercicio2_1Process");
        dispatcher.forward(request, response);
    }

}
