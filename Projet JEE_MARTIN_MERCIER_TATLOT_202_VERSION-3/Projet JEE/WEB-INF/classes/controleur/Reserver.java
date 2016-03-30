package controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Vol;
import persistance.TousAuSoleilPersistant;

public class Reserver extends HttpServlet {
	
private static final long serialVersionUID = 1L;	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException { 
		
	/*		String operation = request.getParameter("action");
		
		if (operation.equals("reserver")){
			TousAuSoleilPersistant.ajouterReservation(request.getParameter("login"), Integer.parseInt(request.getParameter("numero")),
					Integer.parseInt(request.getParameter("places")), request.getParameter("Non"));
			
			
		}
		}*/
	String operation = request.getParameter("action");
	
	if (operation.equals("reserver"))
	{
		List<Vol> resultat = TousAuSoleilPersistant.chercheVols();
		request.setAttribute("lesVols", resultat);
		RequestDispatcher dispatch = request.getRequestDispatcher ("/vue/reserver.jsp");
		dispatch.forward (request, response);
		
	}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
