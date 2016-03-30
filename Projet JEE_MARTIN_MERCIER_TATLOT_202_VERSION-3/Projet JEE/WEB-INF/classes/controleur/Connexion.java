package controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import persistance.ConnexionBD;
import persistance.TousAuSoleilPersistant;
import modele.Compte;
import modele.Vol;

public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException { 
		
		if(request.getParameter("action").equals("connexion")){
			String login = request.getParameter("login");
		    String password = request.getParameter("password");
		  
			try {
	
				TousAuSoleilPersistant.connecterCompte(login, password);
				
				HttpSession session = request.getSession(true);
				if (login.equals("admin")&&password.equals("password")){
					
					RequestDispatcher d = request.getRequestDispatcher("/vue/accueilAdmin.jsp");
					d.forward(request, response);
				}else{
					RequestDispatcher d = request.getRequestDispatcher("/vue/accueil.jsp");
					d.forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
				e.toString();
			}
		}else if(request.getParameter("action").equals("inscription")){
			PrintWriter out = null;
			out.println("<h1> Vous pouvez désormais vous connecter </h1>");
			String login = request.getParameter("login");
		    String password = request.getParameter("password");
		    String nom = request.getParameter("nom");
		    String prenom = request.getParameter("prenom");
		  
			try {
	
				TousAuSoleilPersistant.creerCompte(login, password, nom, prenom, "Client");
				
				HttpSession session = request.getSession(true);
				
					RequestDispatcher d = request.getRequestDispatcher("/vue/index.jsp");
					d.forward(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
				e.toString();
			}
			
		}

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

		
}
