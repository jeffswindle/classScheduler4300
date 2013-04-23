package csci4300_termproject;

import java.util.*;

/**
 * Class that has a main method to run and update course and requirement information
 * in the database
 * @author Jeffrey Swindle
 */
public class SchReaderImpl {

    /**
     * Parses a file to retrieve course information and then updates the listing
     * off courses and their requirements in a database
     * @author Jeffrey Swindle
     */
    public static void main(String[] args) {
        
        //Variable decs
        ScheduleReader reader = new ScheduleReader();
        DBHelper helper = new DBHelper();
        
        //Get the list of classes
        List<ClassObj> classList = reader.readClassSchedule();
        
        //Open a connection to the database
        helper.openConnection();
        
        //Update the list of courses in the database
        helper.updateCourseListing(classList);
        
        //Close the connection to the database
        helper.closeConnection();
        
        
    }
}
