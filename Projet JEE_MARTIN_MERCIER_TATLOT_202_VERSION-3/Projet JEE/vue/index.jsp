
<html>
	<head>
		<title> Tous Au Soleil</title>
		<link type="text/css" rel="stylesheet" href="./styleCSS/index.css"></link>
	</head>
	<body>
		<h1>Bienvenue sur Tous Au Soleil</h1>
			<form METHOD = "GET" ACTION= "/version3/Test" >
				Nom <input type = "text" name = "nom" /> <br>
				<input type="HIDDEN" name = "action" value="test"> 
				<input type="submit" class="btn" value="test"/> </form>
		<div class ="divFond">	
			<h2> Vous êtes déjà inscrit sur notre site ? <br> Connectez vous : </h2> <br>
			<form METHOD = "GET" ACTION= "/version3/Connexion" >
				Login <input type = "text" name = "login" required /> <br>
				Password <input type = "password" name = "password" required /> <br>
				<input type="HIDDEN" name = "action" value="connexion"> 
				<input type="submit" class="btn" value="connexion"/>
			</form> <br> <br>
		</div>
		<div class ="divFond">
			<h2> Vous n'êtes pas encore inscrit sur notre site ? <br> Créez votre compte : </h2> <br>
			<form METHOD = "GET" ACTION= "/version3/Connexion" >
				Nom <input type = "text" name = "nom" required /> <br>
				Prenom <input type = "text" name = "prenom" required /> <br>
				Login <input type = "text" name = "login" required /> <br>
				Password <input type = "password" name = "password" required /> <br>
				
				<input type="HIDDEN" name = "action" value="inscription"> 
				<input type="submit" class="btn" value="inscription"/> 
			</form> 
		</div>
	</body>
</html>



