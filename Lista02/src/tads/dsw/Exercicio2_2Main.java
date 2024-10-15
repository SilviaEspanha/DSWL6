package tads.dsw;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Exercicio2_2Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String anoNascimentoStr = request.getParameter("anoNascimento");

        //convertendo o ano de nascimento para valor num�rico
        int anoNasc = Integer.parseInt(anoNascimentoStr);      
        
        Date dataAtual = new Date();  //obtendo data atual
        Calendar calendario = Calendar.getInstance(); //usando Calendar para extrair o ano
        calendario.setTime(dataAtual);

        int anoAtual = calendario.get(Calendar.YEAR);
        int idade = anoAtual - anoNasc;
        
        // Adiciona um atributo � requisi��o para ser lido no pr�ximo servlet
        request.setAttribute("idadeUsuario", "Voc�, " + nome + ", tem " + idade + " anos!");

        // Despacha a requisi��o para o ProcessServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("Exercicio2_2Process");
        dispatcher.forward(request, response);
    }
}
