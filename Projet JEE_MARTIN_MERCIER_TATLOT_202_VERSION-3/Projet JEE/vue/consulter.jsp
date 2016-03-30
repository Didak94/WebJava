<%@ page import="modele.Reservation,java.util.List" %>

<%
	List<Reservation> lesReservations = (List<Reservation>) request.getAttribute("lesReservations");
	String login = request.getAttribute("login");
%>

<html>
	<head>
		<title> Tous Au Soleil</title>
		<link type="text/css" rel="stylesheet" href="/styleCSS/style.css"></link>
		<style>
		
body {
	background-color:blue;
}

h1 {
	color:#fff;
	text-align: center;
	font-size: 60px;
}

h2 {
	color:#fff;
	text-align: center;
	font-size: 25px;
}

.formulaire{
	position:center;
}


		</style>
	</head>
	<body>
		<h1>Bienvenue sur Tous Au Soleil      wesssssssssssssssssshhhhhhhhhhhhhhhhh</h1>
		
		<% if (! lesReservations.isEmpty()) { 
		for (Reservation r : lesReservations) {%>
		<%= r.toString() login.toString()%>  <br>   
	<%}}
	else { %>
		Il n'y a aucune réservation de disponible <%= login.toString() %>  
	<%}%>
	

		
	</body>
</html>



