package csci4300_termproject;

import java.sql.*;
import java.util.*;

/**
 * Helper class to connect to the database and update course information
 * @author Jeffrey Swindle
 */
public class DBHelper {
    
	//Variable decs
	final String jdbcDriver = "com.mysql.jdbc.Driver";  
	final String dbPath = "jdbc:mysql://172.17.152.60/classScheduler";
	final String userName = "classSchedUser";
	final String password = "Thisisit03214380";		
	//Connection variables
	Connection connect = null;
	
	/**
	 * Method that opens the connection to the database
         * @author Jeffrey Swindle
	 */
	public boolean openConnection(){

		System.out.print("Connection opening to " + dbPath + " ...");
		
		//Try to connect to db and error if unsuccessful
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection(dbPath, userName, password);
		}
		catch(SQLException e){
			System.out.println("Error with database connection");
			e.printStackTrace();
			return false;
		}
		catch(Exception e){
			System.out.println("Error with driver");
			e.printStackTrace();
			return false;
		}
		
		System.out.println("Connection open.");
		return true;
		
	}
	
	/**
	 * Method that closes a connection to the database
         * @author Jeffrey Swindle
	 */
	public boolean closeConnection(){
		
		System.out.print("Connection Closing to "+ dbPath +" ...");
		//Try to close connection to db and error unsuccessful
		try{
			connect.close();
		}
		catch(SQLException e){
			System.out.println("Error closing database connection");
			e.printStackTrace();
			return false;
		}
		
		System.out.println("Connection closed.");
		return true;

	}
		
        /**
         * Method that updates the list of courses and their requirements in the database
         * @author Jeffrey Swindle
         * @param classList list of all classes
         * @return true if successful and false otherwise
         */
	public boolean updateCourseListing( List<ClassObj> classList ){
            //Variable decs
            PreparedStatement call = null;
            ResultSet rSet = null;
            List<List<Object>> shortCourseList = new LinkedList<List<Object>>();
            
            //Truncate course and courseRequirement tables
            try{
                //Truncate Requirement table
                System.out.println("Truncating courseRequirement table.");
                call = connect.prepareCall("TRUNCATE TABLE classScheduler.courseRequirement");		
                call.execute();
                //Truncate course table
                System.out.println("Truncating course table.");
                call = connect.prepareCall("TRUNCATE TABLE classScheduler.course");		
                call.execute();
            }   
            //Catch any SQL errors and return false
            catch(SQLException e){
                System.out.println("Error with SQL query");
                e.printStackTrace();
                return false;
            }
            
            
            //Try to execute SQL query and error if unsuccessful
            try{
                                
                for( int i = 0 ; i < classList.size() ; i ++){
                        
                    System.out.println("Entering new class " + i );

                    call = connect.prepareCall("INSERT INTO classScheduler.course (callNumber, coursePrefix,"
                        +"courseNumber, courseTitle, instructor, available, creditHours, session, days, periodBegin, periodEnd,"
                        +"bldg, room) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
				
                    //Set the attributes in the prepared call
                    call.setInt(1, classList.get(i).getCallNumber());
                    call.setString(2, classList.get(i).getCoursePrefix());
                    call.setString(3, classList.get(i).getCourseNumber());
                    call.setString(4, classList.get(i).getCourseTitle());
                    call.setString(5, classList.get(i).getInstructor());
                    call.setString(6, classList.get(i).getAvailable());
                    call.setBigDecimal(7, classList.get(i).getCreditHours());
                    call.setString(8, classList.get(i).getSession());
                    call.setString(9, classList.get(i).getDays());
                    call.setString(10, classList.get(i).getPeriodBegin());
                    call.setString(11, classList.get(i).getPeriodEnd());
                    call.setString(12, classList.get(i).getBldg());
                    call.setString(13, classList.get(i).getRoom());
			
                    //Execute the stored procedure
                    call.execute();
             }

	}
        //Catch any SQL errors and return false
        catch( SQLException e ){
            System.out.println("Error with SQL query");
            e.printStackTrace();
            return false;
	}
            
        //Insert into courseRequirement table as necessary
        try{
    
            System.out.println("Updating course requirements" );
            
            //Build the query to update the courseRequirement table based on information
            //in the course and requirement tables
            call = connect.prepareCall("INSERT INTO classScheduler.courseRequirement " +
                "(courseId, reqId) " +
                "select course.courseUID, req.reqId " +
                "from classScheduler.course course, classScheduler.requirement req " +
                "where course.coursePrefix = req.reqCoursePrefix " +
                "and course.courseNumber = reqCourseNumber ");
            
            //Execute the query
            call.execute();
            
            //All steps completed successfully, return true
            return true;
            
        }//try
        //Catch any SQL errors and return false
        catch( SQLException e){
            System.out.println("Error with SQL query");
            e.printStackTrace();
            return false;
        }//catch

    }//updateCourseListings
 
}//class
