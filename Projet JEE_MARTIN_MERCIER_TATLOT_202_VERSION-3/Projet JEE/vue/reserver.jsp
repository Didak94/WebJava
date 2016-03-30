<%@ page import="modele.Vol,java.util.List" %>

<%
	List<Vol> lesVols = (List<Vol>) request.getAttribute("lesVols");
%>

<html>
	<head>
		<title> Tous Au Soleil</title>
		<link type="text/css" rel="stylesheet" href="./vue/styleCSS/style.css"></link>
	</head>
	<body>
		<h1>Bienvenue sur Tous Au Soleil</h1>
		
		<% if (! lesVols.isEmpty()) { 
		for (Vol v : lesVols) {%>
		<%= v.toString() %>  <%= v.getNumeroVol() %> <%= v.getDestination() %>    <%= v.getDateDepart() %>   <%= v.getNombrePlaces() %> <%= v.getNombrePlaces() %> <br>   
	<%}}
	else { %>
		Aucun vol disponible
	<%}%>
	
	<form METHOD = "GET" ACTION= "/version3/Consulter" >
				Retapez votre login <input type = "text" name = "login" required />
				Numero vol <input type = "text" name = "numero" required />
				NombrePlaces <input type = "text" name = "places" required /> <br>
				
				<input type="HIDDEN" name = "action" value="consulter"> 
				<input type="submit" class="btn" value="Reserver ce vol"/> 
			</form> 
		
	</body>
</html>



