/**
 * Class to represent a SectionMeeting
 * @author Chris Bolton
 */
public class SectionMeeting {
/**
* private variables to specify a SectionMeeting
*/
private String startTime;
private String className;
private String duration;
/**
* Default constructor for a SectionMeeting
*/
public SectionMeeting(){
this.startTime = "";
this.className = "";
this.duration = "";
}
/**
* Constructor that takes in three parameters
* @param startTime
* @param className
* @param duration
*/
public SectionMeeting(String startTime, String className, String duration){
this.startTime = startTime;
this.className = className;
this.duration = duration;
}
/**
* Returns the startTime of a SectionMeeting
* @return
*/
public String getStartTime() {
return this.startTime;
}
/**
* Sets the startTime of a SectionMeeting
* @param startTime
*/
public void setStartTime(String startTime) {
this.startTime = startTime;
}
/**
* Returns the className of a SectionMeeting
* @return
*/
public String getClassName() {
return this.className;
}
/**
* Sets the className of a SectionMeeting
* @param className
*/
public void setClassName(String className) {
this.className = className;
}
/**
* Returns the duration of a section meeting
* @return
*/
public String getDuration() {
return this.duration;
}
/**
* Sets the duration of a SectionMeeting
* @param duration
*/
public void setDuration(String duration) {
this.duration = duration;
}
}
