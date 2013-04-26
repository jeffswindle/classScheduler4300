<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<link href='http://fonts.googleapis.com/css?family=Quicksand' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Vollkorn' rel='stylesheet' type='text/css'>
<title>Oasis v2</title>

<!-- Author: David Schiliro -->

</head>
<body>

<div class="header">
	<h1>UGA Oasis v2.0</h1>
</div>	
<ul class="tabs">
	<li><a href="index.jsp">Home</a></li>
	<li><p>  |  </p></li>
	<li><a href="register.jsp">Register</a></li>
	<li><p>  |  </p></li>
	<li><a href="schedule.jsp?schedule=true">Schedule</a></li>
</ul>
<div class="headerline"></div>
	
<div class="insidetab" style="margin-right:auto; margin-left:auto;">
		<h2>Welcome to the Oasis v2.0, your new class registration tool!</h2>
		<p>Please start your registration session by clicking on the "Registration" tab above</p>
		<p>To see a visualization of your pending classes, please click on the Schedule" tab above</p>
		<p>Notice as you add more classes they will fill the pending area on the left of the page</p>
		<p>This webapp will not allow you to register for duplicate classes or those that conflict with current pending classes</p>
		<p>Have Fun!</p>
</div>

</body>
</html>