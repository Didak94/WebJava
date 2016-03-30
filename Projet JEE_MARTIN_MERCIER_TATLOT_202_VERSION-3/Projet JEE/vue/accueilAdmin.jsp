
<html>
	<head>
		<title> Tous Au Soleil</title>
		<link type="text/css" rel="stylesheet" href="./styleCSS/accueil.css"></link>
	</head>
	<body>
		<h1>Tous Au Soleil !</h1>
		
		
		
		<h2> Ajoutez un vol </h2>
		
		<form METHOD = "GET" ACTION= "/version3/Ajout" >
		
				Numero vol <input type = "text" name = "numero" required /><br>
				Date <input type = "date" name = "date" required /><br>
				Destination <input type = "text" name = "destination" required /><br>
				Prix <input type = "text" name = "prix" required /><br>
				NombrePlaces <input type = "text" name = "places" required /> <br>
		
		<input type="HIDDEN" name = "action" value="ajout"> 
		<input type="submit" class="btn" value="Ajout"/> 
	
		</form>
	</body>
</html>



