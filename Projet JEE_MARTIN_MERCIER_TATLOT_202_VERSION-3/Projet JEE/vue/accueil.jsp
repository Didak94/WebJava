
<html>
	<head>
		<title> Tous Au Soleil</title>
		<link type="text/css" rel="stylesheet" href="./styleCSS/accueil.css"></link>
	</head>
	<body>
		<h1>Tous Au Soleil !</h1>
		
		
		
		<h2> Vous voulez réserver un vol ou consulter vos réservations ? </h2>
		
		<form METHOD = "GET" ACTION= "/version3/Consulter" >
		<input type="HIDDEN" name = "action" value="consulter"> 
		<input type="submit" class="btn" value="Consulter"/> 
		</form>
		<form METHOD = "GET" ACTION= "/version3/Reserver" >
		<input type="HIDDEN" name = "action" value="reserver"> 
		<input type="submit" class="btn" value="Reserver"/> 
		</form>
	</body>
</html>



