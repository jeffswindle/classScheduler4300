package helper;

/**
 * Class that represents a requirement
 */
public class Requirement {
    
	//Variable Decs
    private int reqMapId;
    private String reqCoursePrefix;
    private String reqCourseNumber;
	private String reqCourseTitle;
	
	/**
	*
	*
	*/
	public Requirement(String reqCoursePrefix, String reqCourseNumber) {
		this.reqCoursePrefix = reqCoursePrefix;
		this.reqCourseNumber = reqCourseNumber;
	}

	/**
	*
	*
	*/
	public Requirement(int reqTypeID, String reqCoursePrefix, String reqCourseNumber) {
		this.reqMapId = reqTypeID;
		this.reqCoursePrefix = reqCoursePrefix;
		this.reqCourseNumber = reqCourseNumber;
	}
	
	/**
	*
	*
	*/
	public Requirement(int reqTypeID, String reqCoursePrefix, String reqCourseNumber, String reqCourseTitle) {
		this.reqMapId = reqTypeID;
		this.reqCoursePrefix = reqCoursePrefix;
		this.reqCourseNumber = reqCourseNumber;
		this.reqCourseTitle = reqCourseTitle;
	}

	/**
	*
	*
	*/
	public int getReqMapId() {
		return reqMapId;
	}

	/**
	*
	*
	*/
	public void setReqMapId(int reqMapId) {
		this.reqMapId = reqMapId;
	}

	/**
	*
	*
	*/
	public String getReqCoursePrefix() {
		return reqCoursePrefix;
	}

	/**
	*
	*
	*/
	public void setReqCoursePrefix(String reqCoursePrefix) {
		this.reqCoursePrefix = reqCoursePrefix;
	}

	/**
	*
	*
	*/
	public String getReqCourseNumber() {
		return reqCourseNumber;
	}

	/**
	*
	*
	*/
	public void setReqCourseNumber(String reqCourseNumber) {
		this.reqCourseNumber = reqCourseNumber;
	}
	
	/**
	*
	*
	*/
	public String getReqCourseTitle() {
		return reqCourseTitle;
	}

	/**
	*
	*
	*/
	public void setReqCourseTitle(String reqCourseTitle) {
		this.reqCourseTitle = reqCourseTitle;
	}
	
}
