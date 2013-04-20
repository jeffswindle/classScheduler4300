package helper;

import java.util.ArrayList;

public class CourseListing {

	private String coursePrefix;
	private String courseNumber;
	private String courseTitle;
	private ArrayList<ClassSection> classSectionList;
	
	public CourseListing(String coursePrefix, String courseNumber){
		this.coursePrefix = coursePrefix;
		this.courseNumber = courseNumber;
	}
	
	public CourseListing(String coursePrefix, String courseNumber, String courseTitle) {
		this.coursePrefix = coursePrefix;
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		classSectionList = new ArrayList<ClassSection>();
	}

	public String getCoursePrefix() {
		return coursePrefix;
	}

	public void setCoursePrefix(String coursePrefix) {
		this.coursePrefix = coursePrefix;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public ArrayList<ClassSection> getClassSectionList() {
		return classSectionList;
	}
	
	public void addClassSectionList(ClassSection classSection){
		classSectionList.add(classSection);
	}
	
}
