package helper;

import java.math.BigDecimal;

/**
 * Class that represents a class/course object
 * @author Jeffrey Swindle
 */
public class classObj {
    
    //Variable Decs
    private int term;
    private int callNumber;
    private String coursePrefix;
    private String courseNumber;
    private String courseTitle;
    private String instructor;
    private String available;
    private BigDecimal creditHours;
    private String session;
    private String days;
    private String periodBegin;
    private String periodEnd;
    private int casTaken;
    private int casReq;
    private int dasTaken;
    private int dasReq;
    private int totTaken;
    private int totReq;
    private int totAllow;
    private String bldg;
    private String room;
    private BigDecimal schedule;
    private String currentProgram;
    
    /**
     * Constructor for a class object
     * @param term class term
     * @param callNumber class call number 
     * @param coursePrefix class course prefix
     * @param courseNumber class course number
     * @param courseTitle class course title
     * @param instructor class instructor
     * @param available class available status
     * @param creditHours class credit hours
     * @param session class session
     * @param days class days
     * @param periodBegin class period begin
     * @param periodEnd class period end
     * @param casTaken class CAS taken
     * @param casReq class CAS required
     * @param dasTaken class DAS taken
     * @param dasReq class DAS required
     * @param totTaken class TOT taken
     * @param totReq class TOT required
     * @param totAllow class TOT allowed
     * @param bldg class building
     * @param room class rooms
     * @param schedule class schedule
     * @param currentProgram class current program
     */
    classObj(int term, int callNumber, String coursePrefix, String courseNumber,
            String courseTitle, String instructor, String available, BigDecimal creditHours, 
            String session, String days, String periodBegin, String periodEnd, int casTaken,
            int casReq, int dasTaken, int dasReq, int totTaken, int totReq, int totAllow, 
            String bldg, String room, BigDecimal schedule, String currentProgram){
        
        this.setTerm(term);
        this.setCallNumber(callNumber);
        this.setCoursePrefix(coursePrefix);
        this.setCourseNumber(courseNumber);
        this.setCourseTitle(courseTitle);
        this.setInstructor(instructor);
        this.setAvailable(available);
        this.setCreditHours(creditHours);
        this.setSession(session);
        this.setDays(days);
        this.setPeriodBegin(periodBegin);
        this.setPeriodEnd(periodEnd);
        this.setCasTaken(casTaken);
        this.setCasReq(casReq);
        this.setDasTaken(dasTaken);
        this.setDasReq(dasReq);
        this.setTotTaken(totTaken);
        this.setTotReq(totReq);
        this.setTotAllow(totAllow);
        this.setBldg(bldg);
        this.setRoom(room);
        this.setSchedule(schedule);
        this.setCurrentProgram(currentProgram);
        
    }

    /**
     * Method that gets the class term
     * @return 
     */
    public int getTerm() {
        return term;
    }

    /**
     * Method that sets the class term
     * @param term 
     */
    private void setTerm(int term) {
        this.term = term;
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
     * Method that gets the class instructor
     * @return class instructor
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * Method that sets the class instructor
     * @param instructor class instructor
     */
    private void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    /**
     * Method that gets the class available status
     * @return class available status
     */
    public String getAvailable() {
        return available;
    }

    /**
     * Method that sets the class available status
     * @param available class available status
     */
    private void setAvailable(String available) {
        this.available = available;
    }

    /**
     * Method that gets the class credit hours
     * @return class credit hours
     */
    public BigDecimal getCreditHours() {
        return creditHours;
    }
    
    /**
     * Method that sets the class credit hours
     * @param creditHours class credit hours
     */
    private void setCreditHours(BigDecimal creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * Method that gets the class session
     * @return class session
     */
    public String getSession() {
        return session;
    }

    /**
     * Method that sets the class session
     * @param session class session
     */
    private void setSession(String session) {
        this.session = session;
    }

    /**
     * Method that gets the class days
     * @return class days
     */
    public String getDays() {
        return days;
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
     * Method that gets the class CAS taken
     * @return class CAS taken
     */
    public int getCasTaken() {
        return casTaken;
    }

    /**
     * Method that sets the class CAS taken
     * @param casTaken class CAS taken
     */
    private void setCasTaken(int casTaken) {
        this.casTaken = casTaken;
    }

    /**
     * Method that gets the class CAS required
     * @return class CAS required
     */
    public int getCasReq() {
        return casReq;
    }

    /**
     * Method that sets the class CAS required
     * @param casReq class CAS required
     */
    private void setCasReq(int casReq) {
        this.casReq = casReq;
    }

    /**
     * Method that gets the class DAS taken
     * @return class DAS taken
     */
    public int getDasTaken() {
        return dasTaken;
    }

    /**
     * Method that sets the class DAS taken
     * @param dasTaken class DAS taken
     */
    private void setDasTaken(int dasTaken) {
        this.dasTaken = dasTaken;
    }

    /**
     * Method that gets the class DAS required
     * @return class DAS required
     */
    public int getDasReq() {
        return dasReq;
    }

    /**
     * Method that sets the class DAS required
     * @param dasReq class DAS required
     */
    private void setDasReq(int dasReq) {
        this.dasReq = dasReq;
    }

    /**
     * Method that gets the class TOT taken
     * @return class TOT taken
     */
    public int getTotTaken() {
        return totTaken;
    }

    /**
     * Method that sets the class TOT taken
     * @param totTaken class TOT taken
     */
    private void setTotTaken(int totTaken) {
        this.totTaken = totTaken;
    }

    /**
     * Method that gets the class TOT required
     * @return class TOT required
     */
    public int getTotReq() {
        return totReq;
    }

    /**
     * Method that sets the class TOT required
     * @param totReq class TOT required
     */
    private void setTotReq(int totReq) {
        this.totReq = totReq;
    }
    
    /**
     * Method that gets the class TOT allowed
     * @return class TOT allowed
     */
    public int getTotAllow() {
        return totAllow;
    }

    /**
     * Method that sets the class TOT allowed
     * @param totAllow class TOT allowed
     */
    private void setTotAllow(int totAllow) {
        this.totAllow = totAllow;
    }

    /**
     * Method that gets the class building
     * @return class building
     */
    public String getBldg() {
        return bldg;
    }

    /**
     * Method that sets the class building
     * @param bldg class building
     */
    private void setBldg(String bldg) {
        this.bldg = bldg;
    }

    /**
     * Method that gets the class room
     * @return class room
     */
    public String getRoom() {
        return room;
    }

    /**
     * Method that sets the class room
     * @param room class toom
     */
    private void setRoom(String room) {
        this.room = room;
    }

    /**
     * Method that gets the class schedule
     * @return class schedule
     */
    public BigDecimal getSchedule() {
        return schedule;
    }

    /**
     * Method that sets the class schedule
     * @param schedule class schedule
     */
    private void setSchedule(BigDecimal schedule) {
        this.schedule = schedule;
    }

    /**
     * Method that gets the class current term
     * @return current term
     */
    public String getCurrentProgram() {
        return currentProgram;
    }

    /**
     * Method that sets the class current term
     * @param currentProgram class current term
     */
    private void setCurrentProgram(String currentProgram) {
        this.currentProgram = currentProgram;
    }
    
}
