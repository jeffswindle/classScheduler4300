package servlets;

import helper.ClassSection;
import helper.CourseDAO;
import helper.CourseListing;
import helper.PendingCourse;
import helper.Requirement;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @author Chris Bolton
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ServletContext ctx = this.getServletContext();
	HttpSession session = request.getSession();
	RequestDispatcher dispatcher = null;
	
	//Array list for pending courses
	ArrayList<PendingCourse> pendingArray = new ArrayList<PendingCourse>();
	
	//Creating a helper object
	CourseDAO helper = new CourseDAO();
	
	if(request.getParameter("reqMapId") != null){
		//Getting the id from the requirement category
		int reqMapID = Integer.parseInt(request.getParameter("reqMapId"));
		//Setting the course requirement
		request.setAttribute("reqMap",helper.getReqList(reqMapID));
		request.setAttribute("reqMapId", request.getParameter("reqMapId"));
	
		//Forwarding back to the register page
		dispatcher = ctx.getRequestDispatcher("/register.jsp");
		dispatcher.forward(request, response);
	}
	//Checking to see if the user chooses a specific class
	else if(request.getParameter("reqCoursePrefix") != null && request.getParameter("reqCourseNumber") != null){
		System.out.println(request.getParameter("reqCoursePrefix") + request.getParameter("reqCourseNumber"));
		//Creating a course listing object with the three request parameters.
		CourseListing courseListing = helper.getSections(new Requirement(request.getParameter("reqCoursePrefix"), request.getParameter("reqCourseNumber")));
		//Sending the CourseListing object back to the id courseListing
		request.setAttribute("courseListing", courseListing);
		request.setAttribute("reqMapId", request.getParameter("reqMapId"));
		
		dispatcher = ctx.getRequestDispatcher("/register.jsp");
		dispatcher.forward(request, response);
	}
	else if(request.getParameter("coursePrefix") != null && request.getParameter("courseNumber") != null
			&& request.getParameter("callNumber") != null){
		//Parsing the call number from string to int
		int callNumber = Integer.parseInt(request.getParameter("callNumber"));	
		
		//Creating a pending course object with the request parameters.
		PendingCourse pendingCourse = new PendingCourse(request.getParameter("coursePrefix"),
				request.getParameter("courseNumber"), callNumber);
		
		if(helper.courseConflict(pendingArray, pendingCourse)){
			//Then we have a time conflict, so we must send an error message
			int error = 1;
			request.setAttribute("error", error);
			dispatcher = ctx.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
		}
		else{
			//There was no time conflict, so we may add the pending course
			pendingArray.add(pendingCourse);
			dispatcher = ctx.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
		}
	}

}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
}
}

