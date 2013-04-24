package helper;

import java.util.ArrayList;

/**
 * Class that represents a CourseListing object used to contain
 * a list of sections for this course
 * @author Jason Beck
 */
public class CourseListing {

	//Declaration of variables
	private String coursePrefix;
	private String courseNumber;
	private String courseTitle;
	private ArrayList<ClassSection> classSectionList;
	
	/**
	 * Constructor to instantiate a CourseListing object
	 * @param coursePrefix course prefix
	 * @param courseNumber course number
	 */
	public CourseListing(String coursePrefix, String courseNumber){
		this.coursePrefix = coursePrefix;
		this.courseNumber = courseNumber;
	}

	/**
	 * Constructor to instantiate a CourseListing object
	 * @param coursePrefix course prefix
	 * @param courseNumber course number
	 * @param courseTitle course title
	 */
	public CourseListing(String coursePrefix, String courseNumber, String courseTitle) {
		this.coursePrefix = coursePrefix;
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		classSectionList = new ArrayList<ClassSection>();
	}

	/**
	 * Get the course prefix
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
	 * Get the course title
	 * @param courseTitle course title
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	/**
	 * Gt the ArraList of sections for this course
	 * @return ArrayList of sections
	 */
	public ArrayList<ClassSection> getClassSectionList() {
		return classSectionList;
	}
	
	/**
	 * Add a section to this course
	 * @param classSection ClassSection object
	 */
	public void addClassSectionList(ClassSection classSection){
		classSectionList.add(classSection);
	}
	
}
