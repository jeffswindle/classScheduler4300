package helper;

/**
 * Class that represents a requirement
 */
public class requirement {
    
    private int reqMapId;
    private String reqCoursePrefix;
    private String reqCourseNumber;

	public requirement(int reqTypeID, String reqCoursePrefix, String reqCourseNumber) {
		this.reqMapId = reqTypeID;
		this.reqCoursePrefix = reqCoursePrefix;
		this.reqCourseNumber = reqCourseNumber;
	}

	public int getReqMapId() {
		return reqMapId;
	}

	public void setReqMapId(int reqMapId) {
		this.reqMapId = reqMapId;
	}

	public String getReqCoursePrefix() {
		return reqCoursePrefix;
	}

	public void setReqCoursePrefix(String reqCoursePrefix) {
		this.reqCoursePrefix = reqCoursePrefix;
	}

	public String getReqCourseNumber() {
		return reqCourseNumber;
	}

	public void setReqCourseNumber(String reqCourseNumber) {
		this.reqCourseNumber = reqCourseNumber;
	}
	
}
