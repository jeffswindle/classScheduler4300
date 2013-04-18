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
					"root", "Thisisit03214380");
			System.out.println("Connected to MySql");
			classesSatisfyReq = conn.prepareStatement("SELECT reqCoursePrefix, reqCourseNumber FROM classScheduler.requirement "+
					"WHERE reqMapId = ?");
		
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
	
}
