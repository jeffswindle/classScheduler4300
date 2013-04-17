package helper;

/**
 * Class to represent a pending course
 * @author Chris Bolton
 */
public class PendingCourse {
/**
* private string variables for a pending course
*/
private String courseName;
private String timePeriod;
private String daysOffered;
/**
* Default constructor to create a pending course
*/
public PendingCourse(){
this.courseName = null;
this.timePeriod = null;
this.daysOffered = null;
}
/**
* Constructor with three arguments to assign values to the courseName, timePeriod
* and daysOffered private class variables.
* @param courseName
* @param timePeriod
* @param daysOffered
*/
public PendingCourse(String courseName, String timePeriod, String daysOffered){
this.courseName = courseName;
this.timePeriod = timePeriod;
this.daysOffered = daysOffered;
}

/**
* Return a string with the name of the pending course
* @return
*/
public String getCourseName() {
return this.courseName;
}
/**
* Receives a string input and sets the courseName to the given string input
* @param courseName
*/
public void setCourseName(String courseName) {
this.courseName = courseName;
}

/**
* Returns a string with the time period of the pending course
* @return
*/
public String getTimePeriod() {
return this.timePeriod;
}
/**
* Receives a string input and sets the timePeriod to the given string input
 
* @param timePeriod
*/
public void setTimePeriod(String timePeriod) {
this.timePeriod = timePeriod;
}
/**
* Returns a string with the days offered of the pending course
* @return
*/
public String getDaysOffered() {
return this.daysOffered;
}

/**
* Receives a string input and sets the daysOffered to the given string input
* @param daysOffered
*/
public void setDaysOffered(String daysOffered) {
this.daysOffered = daysOffered;
}
}




