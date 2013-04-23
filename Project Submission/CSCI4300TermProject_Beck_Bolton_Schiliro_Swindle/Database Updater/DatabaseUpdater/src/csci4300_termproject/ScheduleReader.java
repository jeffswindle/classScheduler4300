package csci4300_termproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.*;

/**
 * Class used to read in a list of classes from a csv class schedule file
 * @author Jeffrey Swindle
 */
public class ScheduleReader {

    /**
     * A method that reads in a pre-determined csv file that contains a list
     * of classes and converts each row in the file to one class object. It
     * then returns a list of those class objects
     * @return Returns a list of classes
     * @author Jeffrey Swindle
     */
    public List<ClassObj> readClassSchedule(){
        //Variable Decs
        List<String> inList;// = new LinkedList<>();
        List<ClassObj> classList = new LinkedList<ClassObj>();
        ClassObj cObj;
        String line;
        
        //Try to read in the file and error if unsuccessful
        try{
            
            //Define URL for file
            URL classURL = new URL("https://apps.reg.uga.edu/reporting/static_reports/course_offering_UNIV_201308.csv");
            
            //Open the buffered reader for the URL
            BufferedReader br = new BufferedReader(new InputStreamReader(classURL.openStream()));   
            
            //While there is another line to read
            while ((line = br.readLine()) != null) {
                
                //Replace all quotes with an empty string
                line = line.replace("\"", "");

                //Generate a linked list of strings based on splitting the data on commas
                inList = new LinkedList<String>(Arrays.asList(line.split(",")));
                
                //Check if the original list had a comma in the instructor name 
                //merge the two strings together and remove the extra string
                if( inList.get(7).equals("Available") ||  inList.get(7).equals("Cancelled") || inList.get(7).equals("Full")){
                    inList.set(5, inList.get(5) + ", " + inList.get(6));
                    inList.remove(6);
                }
                
                //Is the instructor name is null change to NULL
                if( inList.get(5).trim().equals("null") ){
                    inList.set(5, "NULL");
                }
                
                //If there are any other fields that equal null change them to 0
                for( int i = 0 ; i < inList.size() ; i++ ){
                    if( inList.get(i).equals("null") ){
                        inList.set(i, "0");
                    }
                }
                
                //Instantiate a class object from the linked list
                cObj = new ClassObj(Integer.parseInt(inList.get(0)),Integer.parseInt(inList.get(1)),inList.get(2),inList.get(3),inList.get(4),
                        inList.get(5),inList.get(6),new BigDecimal(Float.parseFloat(inList.get(7))),inList.get(8),inList.get(9),inList.get(10),
                        inList.get(11),Integer.parseInt(inList.get(12)),Integer.parseInt(inList.get(13)),Integer.parseInt(inList.get(14)),
                        Integer.parseInt(inList.get(15)),Integer.parseInt(inList.get(16)),Integer.parseInt(inList.get(17)),
                        Integer.parseInt(inList.get(18)),inList.get(19),inList.get(20),new BigDecimal(Float.parseFloat(inList.get(21))),inList.get(22));
                
                //Add the class to the class list
                classList.add(cObj);
            }

        }
        //Catch any exception and print error info
        catch(Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
            System.out.flush();
            e.printStackTrace();
        }

        //return the class list
        return classList;
    }
}
