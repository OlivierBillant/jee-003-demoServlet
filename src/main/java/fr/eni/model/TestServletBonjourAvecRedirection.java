package fr.eni.model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestInitServlet
 */
@WebServlet("/redirection")
public class TestServletBonjourAvecRedirection extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nbreAppel = 0;
	private int nbreInitialisation = 0;

	/**
	 * doGet : va recupérer le paramètre "prenom" de la requête HTTP pour l'utiliser
	 * dans notre message de bienvenue
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("./confirmation.html");
	}
}