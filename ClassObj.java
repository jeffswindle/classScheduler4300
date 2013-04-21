package helper;


/**
 * Class that represents a class/course object
 * @author Jeffrey Swindle
 */
public class ClassObj {
    


    //Variable Decs
    private int callNumber;
    private String coursePrefix;
    private String courseNumber;
    private String courseTitle;
    private String days;
    private String periodBegin;
    private String periodEnd;
    private String bldg;
    private String room;
    
    /**
     * Constructor for a class object
     * @param callNumber class call number 
     * @param coursePrefix class course prefix
     * @param courseNumber class course number
     * @param courseTitle class course title
     * @param days class days
     * @param periodBegin class period begin
     * @param periodEnd class period end
     * @param bldg class building
     * @param room class rooms
     */
    public ClassObj(int callNumber, String coursePrefix, String courseNumber,
			String courseTitle, String days, String periodBegin,
			String periodEnd, String bldg, String room) {
		super();
		this.callNumber = callNumber;
		this.coursePrefix = coursePrefix;
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.days = days;
		this.periodBegin = periodBegin;
		this.periodEnd = periodEnd;
		this.bldg = bldg;
		this.room = room;
	}

    /**
     * Method that gets the class call number
     * @return class call number
     */
    public int getCallNumber() {
        return callNumber;
    }

    /**
     * Method that sets the class call number
     * @param callNumber class call number
     */
    private void setCallNumber(int callNumber) {
        this.callNumber = callNumber;
    }

    /**
     * Method that gets the class prefix
     * @return class prefix
     */
    public String getCoursePrefix() {
        return coursePrefix;
    }

    /**
     * Method that sets the class prefix
     * @param coursePrefix class prefix
     */
    private void setCoursePrefix(String coursePrefix) {
        this.coursePrefix = coursePrefix;
    }

    /**
     * Method that gets the class number
     * @return class number
     */
    public String getCourseNumber() {
        return courseNumber;
    }
    
    /**
     * Method that sets the class number
     * @param courseNumber class number
     */
    private void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    /**
     * Method that gets the class title
     * @return class title
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Method that sets the class title
     * @param courseTitle class title
     */
    private void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

     /**
     * Method that sets the class days
     * @param days class days
     */
    private void setDays(String days) {
        this.days = days;
    }

    /**
     * Method that gets the class period begin
     * @return class period begin
     */
    public String getPeriodBegin() {
        return periodBegin;
    }

    /**
     * Method that sets the class period begin
     * @param periodBegin class period begin
     */
    private void setPeriodBegin(String periodBegin) {
        this.periodBegin = periodBegin;
    }

    /**
     * Method that gets the class period end
     * @return class period end
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Method that sets the class period end
     * @param periodEnd class period end
     */
    private void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    /**
     * Method that sets the class building
     * @param bldg class building
     */
    private void setBldg(String bldg) {
        this.bldg = bldg;
    }
    
    /**
     * Method that gets the building number
     * @return bldg class building
     */
    public String getBldg() {
    	return bldg;
    }

    /**
     * Method that gets the class room
     * @return class room
     */
    public String getRoom() {
        return room;
    }

    /**
     * Method that gets the days
     * @return days days of class
     */
    public String getDays() {
		return days;
	}

	/**
     * Method that sets the class room
     * @param room class toom
     */
    private void setRoom(String room) {
        this.room = room;
    }

	@Override
	public String toString() {
		return "ClassObj [callNumber=" + callNumber + ", coursePrefix="
				+ coursePrefix + ", courseNumber=" + courseNumber + ", days="
				+ days + ", periodBegin=" + periodBegin + ", periodEnd="
				+ periodEnd + ", bldg=" + bldg + ", room=" + room + "]";
	}
  
}
