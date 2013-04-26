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
	ArrayList<PendingCourse> pendingArray = null;
	//Array list for pending courses
	//System.out.println(((ArrayList<PendingCourse>)session.getAttribute("pendingArray")).size());
	if (session.getAttribute("pendingArray")==null || ((ArrayList<PendingCourse>)session.getAttribute("pendingArray")).size()==0){
		pendingArray = new ArrayList<PendingCourse>();
		session.setAttribute("pendingArray", pendingArray);
		
	}
	else{
		pendingArray = (ArrayList<PendingCourse>)session.getAttribute("pendingArray");
	}
	
	//Creating a helper object
	CourseDAO helper = new CourseDAO();
	
	if(request.getParameter("reqMapId") != null){
		//Getting the id from the requirement category
		int reqMapID = Integer.parseInt(request.getParameter("reqMapId"));
		//Setting the course requirement
		request.setAttribute("reqMap",helper.getReqList(reqMapID));
		request.setAttribute("reqMapId", request.getParameter("reqMapId"));
		request.setAttribute("reqCatName", helper.getReqMapNames().get(reqMapID-1));
	
		//Forwarding back to the register page
		dispatcher = ctx.getRequestDispatcher("/register.jsp");
		dispatcher.forward(request, response);
	}
	//Checking to see if the user chooses a specific class
	else if(request.getParameter("reqCoursePrefix") != null && request.getParameter("reqCourseNumber") != null){
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
			session.setAttribute("pendingArray", pendingArray);
			System.out.println(pendingArray);
			System.out.println(session.getAttribute("pendingArray"));
			
			dispatcher = ctx.getRequestDispatcher("/register.jsp");
			dispatcher.forward(request, response);
		}
	}
	

}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ServletContext ctx = this.getServletContext();
	HttpSession session = request.getSession();
	RequestDispatcher dispatcher = null;
	ArrayList<PendingCourse> pendingArray = (ArrayList<PendingCourse>)session.getAttribute("pendingArray");
	CourseDAO helper = new CourseDAO();
	if(request.getParameter("section") != null){
		//Then we need to delete an item from pending array list.
		int section = Integer.parseInt(request.getParameter("section"));
		System.out.println(request.getParameter("section"));
		System.out.println(pendingArray.size());
		pendingArray = helper.removePendingCourse(pendingArray, section);
		System.out.println(pendingArray.size());
		session.setAttribute("pendingArray", pendingArray);
		dispatcher = ctx.getRequestDispatcher("/register.jsp");
		dispatcher.forward(request, response);
	}
}
}

