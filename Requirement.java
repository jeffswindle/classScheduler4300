package helper;

/**
 * Class that represents a requirement object
 * @author Jason Beck
 */
public class Requirement {
    
	//Variable Declarations
    private int reqMapId;
    private String reqCoursePrefix;
    private String reqCourseNumber;
	private String reqCourseTitle;

	/**
	 * Constructor to instantiate a requirement object
	 * @param reqCoursePrefix course prefix
	 * @param reqCourseNumber course number
	 */
	public Requirement(String reqCoursePrefix, String reqCourseNumber) {
		this.reqCoursePrefix = reqCoursePrefix;
		this.reqCourseNumber = reqCourseNumber;
	}

	/**
	 * Constructor to instantiate a requirement object
	 * @param reqTypeID requirement type id
	 * @param reqCoursePrefix course prefix
	 * @param reqCourseNumber course number
	 */
	public Requirement(int reqTypeID, String reqCoursePrefix, String reqCourseNumber) {
		this.reqMapId = reqTypeID;
		this.reqCoursePrefix = reqCoursePrefix;
		this.reqCourseNumber = reqCourseNumber;
	}

	/**
	 * Constructor to instantiate a requirement object
	 * @param reqTypeID requirement type id
	 * @param reqCoursePrefix course prefix
	 * @param reqCourseNumber course number
	 * @param reqCourseTitle course title
	 */
	public Requirement(int reqTypeID, String reqCoursePrefix, String reqCourseNumber, String reqCourseTitle) {
		this.reqMapId = reqTypeID;
		this.reqCoursePrefix = reqCoursePrefix;
		this.reqCourseNumber = reqCourseNumber;
		this.reqCourseTitle = reqCourseTitle;
	}

	/**
	 * Get the map id
	 * @return map id
	 */
	public int getReqMapId() {
		return reqMapId;
	}

	/**
	 * Set the map id
	 * @param reqMapId map id
	 */
	public void setReqMapId(int reqMapId) {
		this.reqMapId = reqMapId;
	}

	/**
	 * Get the course prefix
	 * @return course prefix
	 */
	public String getReqCoursePrefix() {
		return reqCoursePrefix;
	}

	/**
	 * Set the course prefix
	 * @param reqCoursePrefix course prefix
	 */
	public void setReqCoursePrefix(String reqCoursePrefix) {
		this.reqCoursePrefix = reqCoursePrefix;
	}

	/**
	 * Get the course number
	 * @return course number
	 */
	public String getReqCourseNumber() {
		return reqCourseNumber;
	}

	/**
	 * Set the course number
	 * @param reqCourseNumber course number
	 */
	public void setReqCourseNumber(String reqCourseNumber) {
		this.reqCourseNumber = reqCourseNumber;
	}

	/**
	 * Get the course title
	 * @return course title
	 */
	public String getReqCourseTitle() {
		return reqCourseTitle;
	}

	/**
	 * Set the course title
	 * @param reqCourseTitle course title
	 */
	public void setReqCourseTitle(String reqCourseTitle) {
		this.reqCourseTitle = reqCourseTitle;
	}

}
