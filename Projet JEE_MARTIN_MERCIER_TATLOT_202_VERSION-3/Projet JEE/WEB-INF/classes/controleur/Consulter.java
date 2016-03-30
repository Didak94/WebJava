package controleur;

import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import persistance.TousAuSoleilPersistant;
import modele.*;


public class Consulter extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		String operation = request.getParameter("action");
		String log = request.getParameter("login");
		if (operation.equals("consulter"))
		{
			List<Reservation> resultat = TousAuSoleilPersistant.chercheReservations(log);
			request.setAttribute("lesReservations", resultat);
			request.setAttribute("login", log);
			RequestDispatcher dispatch = request.getRequestDispatcher ("/vue/consulter.jsp");
			dispatch.forward (request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}