<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Oasis v2</title>

<!-- Author: David Schiliro -->

</head>
<body>

<c:if test="${error==1}">
	<script>
		alert("Duplicate class or time conflict detected (Skynet is watching)");
	</script>
</c:if>

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

<div class="collegereq">
	<h4>Requirement Categories</h4>
	<a href="RegisterController?reqMapId=1">Cultural Diversity</a><br>
	<a href="RegisterController?reqMapId=2">Environmental Literacy</a><br>
	<a href="RegisterController?reqMapId=3">Core Curriculum I: Foundation Courses</a><br>
	<a href="RegisterController?reqMapId=4">Core Curriculum II: Physical Sciences</a><br>
	<a href="RegisterController?reqMapId=5">Core Curriculum II: Life Sciences</a><br>
	<a href="RegisterController?reqMapId=6">Core Curriculum III: Quantitative Reasoning</a><br>
	<a href="RegisterController?reqMapId=7">Core Curriculum IV: World Languages and Culture</a><br>
	<a href="RegisterController?reqMapId=8">Core Curriculum IV: Humanities and Arts</a><br>
	<a href="RegisterController?reqMapId=9">Core Curriculum V: Social Sciences</a><br>
	<a href="RegisterController?reqMapId=10">Foreign Language</a><br>
	<a href="RegisterController?reqMapId=11">Literature</a><br>
	<a href="RegisterController?reqMapId=12">Fine Arts/Philosophy/Religion</a><br>
	<a href="RegisterController?reqMapId=13">History</a><br>
	<a href="RegisterController?reqMapId=14">Social Sciences other than History</a><br>
	<a href="RegisterController?reqMapId=15">Biological Sciences</a><br>
	<a href="RegisterController?reqMapId=16">Physical Sciences</a><br>
	<a href="RegisterController?reqMapId=17">Multi-cultural Requirement</a><br>
	<a href="RegisterController?reqMapId=18">Core CurriculumVI: Major related courses</a><br>
	<a href="RegisterController?reqMapId=19">Computer Science Major Courses</a><br>
	
</div>
<div class="pending">
		<h3><strong>Pending Courses</strong></h3>
			<table>
				<c:forEach var="pendingList" items="${pendingArray}">
					<tr>
						<td>${pendingList.coursePrefix}${pendingList.courseNumber}</td>
						<td>
								<form name="gtfoClass" action="RegisterController" method="post">
									<input name="section" type="hidden" value="${pendingList.callNumber}"/>
									<input type="submit" value="X"/>
								</form>
							</td>
					</tr>
					<c:forEach var="pendingInfo" items="${pendingList.classMeetingsList}">
						<tr>
							<td>${pendingInfo.day}</td>
							<td>${pendingInfo.periodBegin}</td>
							<td>${pendingInfo.periodEnd}</td>
						</tr>
					</c:forEach>
				</c:forEach>
			</table>
</div>
<div class="register">
	<c:choose>
		<c:when test="${empty reqMapId && empty courseListing}">
			<h2>Please make a category selection to your left</h2>
		</c:when>
		<c:when test="${not empty reqMapId || not empty courseListing}">
			<c:choose>
				<c:when test="${empty reqMapId && not empty courseListing}">
					<h2>${courseListing.coursePrefix}${courseListing.courseNumber}</h2>
					<table>
					<tr>		
						<th>Section</th>
						<th>Days</th>
						<th>Start</th>
						<th>End</th>
						<th>Bldg</th>
						<th>Room</th>
					</tr>
					<c:forEach var="sectionList" items="${courseListing.classSectionList}">
						<tr>
							<td><a href="RegisterController?coursePrefix=${courseListing.coursePrefix}&courseNumber=${courseListing.courseNumber}
								&callNumber=${sectionList.callNumber}">${sectionList.callNumber}</a></td>
							<td colSpan="5">${courseListing.courseTitle}</td>	
							<c:forEach var="courseMeetInfo" items="${sectionList.classMeetingsList}">
								<tr>
								<td></td>
								<td>${courseMeetInfo.day}</td>
								<td>${courseMeetInfo.periodBegin}</td>
								<td>${courseMeetInfo.periodEnd}</td>
								<td>${courseMeetInfo.bldg}</td>
								<td>${courseMeetInfo.room}</td>
								</tr>
							</c:forEach>
						</tr>
					</c:forEach>
					</table>
				</c:when>
				<c:when test="${not empty reqMapId && empty courseListing}">
					<c:set var="count" value="0"/>
					<h2>${reqCatName}</h2>
					<table>
						<c:forEach var="mapReq" items="${reqMap}" step="3">
							<tr>
								<td><a href="RegisterController?reqCoursePrefix=${reqMap[count].reqCoursePrefix}&reqCourseNumber=${reqMap[count].reqCourseNumber}">
									${reqMap[count].reqCoursePrefix}${reqMap[count].reqCourseNumber}</a></td>
								<td><a href="RegisterController?reqCoursePrefix=${reqMap[count+1].reqCoursePrefix}&reqCourseNumber=${reqMap[count+1].reqCourseNumber}">
									${reqMap[count+1].reqCoursePrefix}${reqMap[count+1].reqCourseNumber}</a></td>
								<td><a href="RegisterController?reqCoursePrefix=${reqMap[count+2].reqCoursePrefix}&reqCourseNumber=${reqMap[count+2].reqCourseNumber}">
									${reqMap[count+2].reqCoursePrefix}${reqMap[count+2].reqCourseNumber}</a></td>
								<c:set var="count" value="${count+3}"/>
							</tr>
						</c:forEach>
					</table>
				</c:when>
			</c:choose>
		</c:when>
	</c:choose>
</div>
	
</body>
</html>