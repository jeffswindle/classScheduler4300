package helper;

import java.util.ArrayList;

/**
 * This class represents a PendingCourse object as a pending
 * course on a users schedule
 * @author Jason Beck
 */
public class PendingCourse {

	//Declaration of Variables
	private String coursePrefix;
	private String courseNumber;
	private String courseTitle;
	private int callNumber;
	private ArrayList<ClassMeeting> classMeetingsList;
	
	/**
	 * This constructor will create a PendingCourse object and
	 * instantiate all of the variables
	 * @param coursePrefix course prefix
	 * @param courseNumber course number
	 * @param callNumber call number
	 */
	public PendingCourse(String coursePrefix, String courseNumber, int callNumber) {
		this.coursePrefix = coursePrefix;
		this.courseNumber = courseNumber;
		this.callNumber = callNumber;
		CourseDAO course = new CourseDAO();
		classMeetingsList = course.getMeetings(new Requirement(coursePrefix, courseNumber), callNumber);
		
	}	

	/**
	 * This constructor will create a PendingCourse object and
	 * instantiate all of the variables
	 * @param coursePrefix course prefix
	 * @param courseNumber course number
	 * @param courseTitle course title
	 * @param callNumber call number
	 */
	public PendingCourse(String coursePrefix, String courseNumber, String courseTitle,
			int callNumber) {
		this.coursePrefix = coursePrefix;
		this.courseNumber = courseNumber;
		this.callNumber = callNumber;
		this.courseTitle = courseTitle;
		CourseDAO course = new CourseDAO();
		classMeetingsList = course.getMeetings(new Requirement(coursePrefix, courseNumber), callNumber);
	}	

	
	/**
	 * Gets the call number
	 * @return call number
	 */
	public int getCallNumber() {
		return callNumber;
	}

	/**
	 * Set the call number
	 * @param callNumber call number
	 */
	public void setCallNumber(int callNumber) {
		this.callNumber = callNumber;
	}

	/**
	 * Get the ArrayList of meetings
	 * @return ArrayList of ClassMeetings
	 */
	public ArrayList<ClassMeeting> getClassMeetingsList() {
		return classMeetingsList;
	}
	
	/**
	 * Add a meeting to the ArrayList of ClassMeetings
	 * @param classMeeting ClassMeeting object
	 */
	public void addClassMeetingList(ClassMeeting classMeeting){
		classMeetingsList.add(classMeeting);
	}

	/**
	 * Gets the course prefix
	 * @return course prefix
	 */
	public String getCoursePrefix() {
		return coursePrefix;
	}

	/**
	 * Set the course prefix
	 * @param coursePrefix course prefix
	 */
	public void setCoursePrefix(String coursePrefix) {
		this.coursePrefix = coursePrefix;
	}

	/**
	 * Get the course number
	 * @return course number
	 */
	public String getCourseNumber() {
		return courseNumber;
	}

	/**
	 * Set the course number
	 * @param courseNumber course number
	 */
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	/**
	 * Get the course title
	 * @return course title
	 */
	public String getCourseTitle() {
		return courseTitle;
	}

	/**
	 * Set the course title
	 * @param courseTitle course title
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	
}
