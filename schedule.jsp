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

<script>
	var DAY_ARRAY = new Array("Mon","Tue","Wed","Thu","Fri");
	var HOUR_ARRAY = new Array("8:00","9:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00");
	var DAY_ABBR_ARRAY = new Array("M", "T", "W", "R", "F");
	var START_HOUR_ARRAY = new Array("8", "9", "10", "11", "12", "13", "14", "15", "16", "17");
	var	CLASS_OBJ_ARRAY = new Array();
	var TOP_MARGIN = 100;
	var LEFT_MARGIN = 100;
	var RIGHT_MARGIN = 100;
	var BOTTOM_MARGIN = 100;
	var PIXELS_PER_DAY = 700/5;
	var PIXELS_PER_HOUR = 600/10;
	
	
	
	function drawClassMeeting(){
		var c = document.getElementById("scheduleCanvas");
		var ctx = c.getContext("2d");
		for (var j=0; j<CLASS_OBJ_ARRAY.length; j++){
			var obj = CLASS_OBJ_ARRAY[j];
			for (var i = 0; i<DAY_ABBR_ARRAY.length; i++){
				if ((obj.day)==(DAY_ABBR_ARRAY[i])){
					ctx.fillStyle="#418B41";
					ctx.fillRect(101+(PIXELS_PER_DAY*i), 100 +(START_HOUR_ARRAY.indexOf(obj.startTimeHour)*60) + parseInt(obj.startTimeMinute), PIXELS_PER_DAY-2, obj.duration);
					ctx.fillStyle="#F6F6F6";
					ctx.font="20px Arial";
					ctx.fillText(obj.className, 125+(PIXELS_PER_DAY*i), 145 +(START_HOUR_ARRAY.indexOf(obj.startTimeHour)*60) + parseInt(obj.startTimeMinute));
				}
			}
		}
	}	
	
   function initializeCanvas(){
		var c = document.getElementById("scheduleCanvas");
		var ctx = c.getContext("2d");
		ctx.fillStyle="#F6F6F6";
		ctx.font="25px Arial";
		ctx.fillRect(100,100,700,800); 
		
		for (var i = 0; i<DAY_ARRAY.length; i++){
			ctx.moveTo(i*PIXELS_PER_DAY, 100);
			ctx.fillText(DAY_ARRAY[i], (i*PIXELS_PER_DAY)+150, 85);
			ctx.stroke();
		}	
		for (var i = 0; i<DAY_ARRAY.length+1; i++){
			ctx.moveTo((i*PIXELS_PER_DAY)+100, 100);
			ctx.lineTo((i*PIXELS_PER_DAY)+100, 700);
			ctx.stroke();
		}
		for (var j = 0; j<HOUR_ARRAY.length; j++){
			if(j==0 || j==1){
				ctx.moveTo(100, j*PIXELS_PER_HOUR);
				ctx.fillText(HOUR_ARRAY[j], 35,(j*PIXELS_PER_HOUR)+110);
				ctx.stroke();
			}
			else{
				ctx.moveTo(100, j*PIXELS_PER_HOUR);
				ctx.fillText(HOUR_ARRAY[j], 20,(j*PIXELS_PER_HOUR)+110);
				ctx.stroke();
			}
		}	
		ctx.moveTo(100, 100);
		for (var j = 0; j<HOUR_ARRAY.length; j++){
			ctx.moveTo(85, (j*PIXELS_PER_HOUR)+100);
			ctx.lineTo(800, (j*PIXELS_PER_HOUR)+100);
			ctx.stroke();
		}
   }
</script>
</head>
<body onload="initializeCanvas();drawClassMeeting();">


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

<div class="pending">
		<h3><strong>Pending Courses</strong></h3>
			<table>
				<c:forEach var="pendingList" items="${pendingArray}">
					<tr>
						<td>${pendingList.coursePrefix}${pendingList.courseNumber}</td>
						<td>
								<form name="gtfoClass" action="RegisterController?section=${pendingList.callNumber}" method="post">
									<input type="submit" value="X">
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
<div class="insidetab">
		<canvas id="scheduleCanvas" width="800" height="700"></canvas>
		<c:forEach var="pendingList" items="${pendingArray}">
		<c:set var="className" value="${pendingList.coursePrefix}${pendingList.courseNumber}"/>
			<c:forEach var="classInfo" items="${pendingList.classMeetingsList}">
				<c:set var="startTimeHour" value="${classInfo.periodBeginHour}"/>
				<c:set var="startTimeMinute" value="${classInfo.periodBeginMin}"/>
				<c:set var="duration" value="${classInfo.duration}"/>
				<c:set var="day" value="${classInfo.day}"/>
				<script>
				var classObject = {
						className:"",
						startTimeHour:"",
						startTimeMinute:"",
						duration:"",
						day:""
						};
				classObject.className='<c:out value="${className}"/>';
				classObject.startTimeHour='<c:out value="${startTimeHour}"/>';
				classObject.startTimeMinute='<c:out value="${startTimeMinute}"/>';
				classObject.duration='<c:out value="${duration}"/>';
				classObject.day='<c:out value="${day}"/>';
				CLASS_OBJ_ARRAY.push(classObject);
				</script>
			</c:forEach>
		</c:forEach>
</div>
</body>
</html>