package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * This class will create methods for the controller to access information
 * from the database
 * @author Jason Beck
 */
public class CourseDAO {

	/**
	 * This PreparedStatement will query the database to find all of the classes
	 * that satisfy a given requirement
	 */
	private PreparedStatement classesSatisfyReq;
	
	/**
	 * This PreparedStatement will query the database to find all meetings of a
	 * given course
	 */
	private PreparedStatement meetingsForCourse;
	
	/**
	 * ArrayLists of classes that satisfy the appropriate requirement number
	 */
	private ArrayList<requirement> req1List;
	private ArrayList<requirement> req2List;
	private ArrayList<requirement> req3List;
	private ArrayList<requirement> req4List;
	private ArrayList<requirement> req5List;
	private ArrayList<requirement> req6List;
	private ArrayList<requirement> req7List;
	private ArrayList<requirement> req8List;
	private ArrayList<requirement> req9List;
	private ArrayList<requirement> req10List;
	private ArrayList<requirement> req11List;
	private ArrayList<requirement> req12List;
	private ArrayList<requirement> req13List;
	private ArrayList<requirement> req14List;
	private ArrayList<requirement> req15List;
	private ArrayList<requirement> req16List;
	private ArrayList<requirement> req17List;
	private ArrayList<requirement> req18List;
	private ArrayList<requirement> req19List;
	
	
	/**
	 * A constructor for a CourseDAO object to connect to the database and prepare the
	 * PreparedStatements
	 */
	public CourseDAO() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Instantiated MySQL driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://172.17.152.60/classScheduler", 
					"classSchedUser", "Thisisit03214380");
			System.out.println("Connected to MySql");
			meetingsForCourse = conn.prepareStatement("select * from classScheduler.course course, classScheduler.courseRequirement creq, " +
					"(Select req.reqId from classScheduler.requirement req where req.reqCourseNumber = ? AND req.reqCoursePrefix = ? AND " +
					"req.reqMapId = ?) AS reqOut where reqOut.reqId = creq.reqId AND creq.courseId = course.courseUID");
			
			/*classesSatisfyReq = conn.prepareStatement("SELECT reqID FROM classScheduler.requirement WHERE reqMapID = ? AND " +
																									"reqCoursePrefix = ? AND " +
																									"reqCourseNumber = ? ");
*/
			classesSatisfyReq = conn.prepareStatement("SELECT * FROM classScheduler.requirement WHERE reqMapID = ?");
			req1List = getCoursesForReq(1);
			req2List = getCoursesForReq(2);
			req3List = getCoursesForReq(3);
			req4List = getCoursesForReq(4);
			req5List = getCoursesForReq(5);
			req6List = getCoursesForReq(6);
			req7List = getCoursesForReq(7);
			req8List = getCoursesForReq(8);
			req9List = getCoursesForReq(9);
			req10List = getCoursesForReq(10);
			req11List = getCoursesForReq(11);
			req12List = getCoursesForReq(12);
			req13List = getCoursesForReq(13);
			req14List = getCoursesForReq(14);
			req15List = getCoursesForReq(15);
			req16List = getCoursesForReq(16);
			req17List = getCoursesForReq(17);
			req18List = getCoursesForReq(18);
			req19List = getCoursesForReq(19);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * This will create an arraylist of courses that will statisfy
	 * a given requirement
	 * @param requirement requirement object
	 * @return arraylist of class objects
	 */
	private ArrayList<requirement> getCoursesForReq(int reqMapId){
		ArrayList<requirement> list = new ArrayList<requirement>();
		try{
			classesSatisfyReq.setInt(1, reqMapId);
			ResultSet rs = classesSatisfyReq.executeQuery();
			while(rs.next()){
				//creates and adds a requirement object to the list from
				//the record
				String reqCoursePrefix = rs.getString("reqCoursePrefix");
				String reqCourseNumber = rs.getString("reqCourseNumber");
				list.add(new requirement(reqMapId, reqCoursePrefix, reqCourseNumber));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
		return list;
	}
	
	/**
	 * 
	 * @param requirement requirement object
	 * @return 
	 */
	public CourseListing getSections(requirement requirement){
		CourseListing course = new CourseListing(requirement.getReqCoursePrefix(), requirement.getReqCourseNumber());
		try{
			meetingsForCourse.setInt(1, requirement.getReqTypeID());
			meetingsForCourse.setString(2,requirement.getReqCoursePrefix());
			meetingsForCourse.setString(3,requirement.getReqCourseNumber());
			ResultSet rs = meetingsForCourse.executeQuery();
			while(rs.next()){
				String days = rs.getString("days");
				String periodBegin = rs.getString("periodBegin");
				String periodEnd = rs.getString("periodEnd");
				int periodBegins = 1; //TODO
				int periodEnds = 1; //TODO
				ClassMeeting meeting = new ClassMeeting(days, periodBegins, periodEnds);
				int callNumber = rs.getInt("callNumber");
				ClassSection section = new ClassSection(callNumber);
				section.addClassMeetingList(meeting);
				String coursePrefix = rs.getString("coursePrefix");
				String courseNumber = rs.getString("courseNumber");
				String courseTitle = rs.getString("courseTitle");
				course.setCourseTitle(courseTitle);
				course.addClassSectionList(section);
				if(!rs.isLast()){
					if(rs.next() && rs.getInt("callNumber") == callNumber){
						
					}
					else{
						rs.previous();
					}
				}
			}
		}
		catch (SQLException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
		return course;
	}
	
	/**
	 * Get a list of classes that satisfy a requirement
	 * @param reqMapId requirement id
	 * @return arraylist of classes satisfying the given requirement
	 */
	public ArrayList<requirement> getReqList(int reqMapId){
		switch(reqMapId){
			case 1: return req1List;
			case 2: return req2List;
			case 3: return req3List;
			case 4: return req4List;
			case 5: return req5List;
			case 6: return req6List;
			case 7: return req7List;
			case 8: return req8List;
			case 9: return req9List;
			case 10: return req10List;
			case 11: return req11List;
			case 12: return req12List;
			case 13: return req13List;
			case 14: return req14List;
			case 15: return req15List;
			case 16: return req16List;
			case 17: return req17List;
			case 18: return req18List;
			case 19: return req19List;
			default: return null;
		}
	}
	
	/**
	 * Return an arraylist of strings representing the requirement names
	 * @return return an arraylist of strings representing the requirement names
	 * @author Jeffrey Swindle
	 */
	public ArrayList<String> getReqMapNames(){
		//Variable Decs
		ResultSet rSet = null;
		String sqlStatement;
		CallableStatement call = null;
		ArrayList<String> reqNames = new ArrayList<String>();
		
		//Try to get a customer by id with purchases and error if unsuccessful
		try{

			//Build req name query
			System.out.println("Build Query");
			sqlStatement = "SELECT reqMapName FROM classScheduler.requirementMapping;";   
			call = connect.prepareCall(sqlStatement);
	      
			//Execute req name query
			System.out.println("Execute Query");
			rSet = call.executeQuery();
			
			//Run through the result set and add each requirement mapping 
			//name to the array list of requirement names
			while(rSet.next()){
				reqName.add(rSet.getString("reqMapName");
			}

			//Return the array list of requirement mapping names
			return reqName;
	      
		}
		catch( SQLException e ){
			System.out.println("Error with SQL query");
			e.printStackTrace();
			System.exit(1);
		}

		return null;

	}
	
}
