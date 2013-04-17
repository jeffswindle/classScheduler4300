package helper;

/**
 * Class that represents a requirement
 * @author Jeffrey Swindle
 */
public class requirement {
    
    private int reqMapId;
    private String reqCoursePrefix;
    private String reqCourseNumber;
    
    /**
     * Constructor to initialize a new requirement
     * @param reqID requirement id
     * @param reqName requirement name
     * @param reqType requirement type
     */
    requirement( int reqID, String reqName, String reqType){
        this.setReqID(reqID);
        this.setReqName(reqName);
        this.setReqType(reqType);
    }

    /**
     * Get the requirement ID
     * @return requirement ID
     */
    public int getReqID() {
        return reqMapId;
    }

    /**
     * Set the requirement ID
     * @param reqID requirement ID
     */
    private void setReqID(int reqID) {
        this.reqMapId = reqID;
    }

    /**
     * Set the requirement name
     * @return requirement name
     */
    public String getReqName() {
        return reqCoursePrefix;
    }

    /**
     * Set the requirement name
     * @param reqName requirement name
     */
    private void setReqName(String reqName) {
        this.reqCoursePrefix = reqName;
    }

    /**
     * Get the requirement type
     * @return requirement type
     */
    public String getReqType() {
        return reqCourseNumber;
    }

    /**
     * Set the requirement type
     * @param reqType requirement type
     */
    private void setReqType(String reqType) {
        this.reqCourseNumber = reqType;
    }
    
    
}
