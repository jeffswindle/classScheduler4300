<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<!-- Author: David Schiliro -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Oasis v2</title>
</head>
<body>

<div class="header">
	<h1>UGA Oasis 2.0</h1>
</div>	
<ul class="tabs">
	<li><a href="index.jsp">Home</a></li>
	<li><p>  |  </p></li>
	<li><a href="register.jsp">Register</a></li>
	<li><p>  |  </p></li>
	<li><a href="schedule.jsp">Schedule</a></li>
	<li><p>  |  </p></li>
	<li><a href="help.jsp">Help</a></li>
</ul>
<div class="headerline"></div>

<div class="collegereq">
	<h4><strong>UGA Requirements</strong></h4>
	<a href="register.jsp?reqMapId=1">Cultural Diversity</a><br>
	<a href="register.jsp?reqMapId=2">Environmental Literacy</a><br>
	<a href="register.jsp?reqMapId=3">Core Curriculum I: Foundation Courses</a><br>
	<a href="register.jsp?reqMapId=4">Core Curriculum II: Physical Sciences</a><br>
	<a href="register.jsp?reqMapId=5">Core Curriculum II: Life Sciences</a><br>
	<a href="register.jsp?reqMapId=6">Core Curriculum III: Quantitative Reasoning</a><br>
	<a href="register.jsp?reqMapId=7">Core Curriculum IV: World Languages and Culture</a><br>
	<a href="register.jsp?reqMapId=8">Core Curriculum IV: Humanities and Arts</a><br>
	<a href="register.jsp?reqMapId=9">Core Curriculum V: Social Sciences</a><br>
	<h4>Franklin College Requirements</h4>
	<a href="register.jsp?reqMapId=10">Foreign Language</a><br>
	<a href="register.jsp?reqMapId=11">Literature</a><br>
	<a href="register.jsp?reqMapId=12">Fine Arts/Philosophy/Religion</a><br>
	<a href="register.jsp?reqMapId=13">History</a><br>
	<a href="register.jsp?reqMapId=14">Social Sciences other than History</a><br>
	<a href="register.jsp?reqMapId=15">Biological Sciences</a><br>
	<a href="register.jsp?reqMapId=16">Physical Sciences</a><br>
	<a href="register.jsp?reqMapId=17">Multi-cultural Requirement</a><br>
	<h4>Major Requirements</h4>
	<a href="register.jsp?reqMapId=18">Core CurriculumVI: Major related courses</a><br>
	<a href="register.jsp?reqMapId=19">Computer Science Major Courses</a><br>
	
</div>
<div class="pending">
		<h3><strong>Pending Courses</strong></h3>
</div>
<div class="register">
	<table>
		<tr>
			<th>Class</th>
			<th>Section</th>
			<th>Days</th>
			<th>Start</th>
			<th>End</th>
		</tr>
		<c:forEach var="mapReq" items="${reqMap}">
			<tr>	
				<td><a href="register.jsp?pendingSelection="><c:out value="${mapReq.getCoursePrefix+mapReq.getCourseName}"/></a></td>
				<td><c:out value="${mapReq.getCallNumber}"/></td>
				<td><c:out value="${mapReq.getDays}"/></td>
				<td><c:out value="${mapReq.getPeriodBegin}"/></td>
				<td><c:out value="${mapReq.getPeriodEnd}"/></td>
			</tr>
		</c:forEach>
	</table>
</div>

	
	
</body>
</html>