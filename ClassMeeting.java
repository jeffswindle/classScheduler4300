package helper;

/**
 * This class will represent a single class meeting
 * @author Jason
 */
public class ClassMeeting {

	//Declaration of variables
	private String day;
	private String periodBegin;
	private String periodEnd;
	private String bldg;
	private String room;
	
	/**
	 * Constructor to instantiate a ClassMeeting object
	 * @param day day of meeting
	 * @param periodBegin period meeting begins
	 * @param periodEnd period meeting ends
	 * @param bldg building number
	 * @param room room number
	 */
	public ClassMeeting(String day, String periodBegin, String periodEnd, String bldg, String room) {
		this.day = day;
		this.periodBegin = periodBegin;
		this.periodEnd = periodEnd;
		this.bldg = bldg;
		this.room = room;
	}

	/**
	 * Get the day of the meeting
	 * @return day of the meeting
	 */
	public String getDay() {
		return day;
	}

	/**
	 * Set the day of the meeting
	 * @param day day of the meeting
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * Get the time when the meeting begins
	 * @return time the meeting begins
	 */
	public String getPeriodBegin() {
		if(periodBegin.charAt(0) == '0')
			return (periodBegin.substring(1,2) + ":" + periodBegin.substring(2,4) + " " + periodBegin.substring(4) + "M");
		else
			return (periodBegin.substring(0,2) + ":" + periodBegin.substring(2,4) + " " + periodBegin.substring(4) + "M");	
	}

	/**
	 * Set the start time of the meeting
	 * @param periodBegin desired start time of the meeting
	 */
	public void setPeriodBegin(String periodBegin) {
		this.periodBegin = periodBegin;
	}

	/**
	 * Get the time when the meeting ends
	 * @return time the meeting ends
	 */
	public String getPeriodEnd() {
		if(periodEnd.charAt(0) == '0')
			return (periodEnd.substring(1,2) + ":" + periodEnd.substring(2,4) + " " + periodEnd.substring(4) + "M");
		else
			return (periodEnd.substring(0,2) + ":" + periodEnd.substring(2,4) + " " + periodEnd.substring(4) + "M");	
	}

	/**
	 * Set the end time of the meeting
	 * @param periodEnd desired end time of the meeting
	 */
	public void setPeriodEnd(String periodEnd) {
		this.periodEnd = periodEnd;
	}
	
	/**
	 * Get the building number
	 * @return building number
	 */
	public String getBldg() {
		return bldg;
	}

	/**
	 * Set the building number
	 * @param bldg building number
	 */
	public void setBldg(String bldg) {
		this.bldg = bldg;
	}

	/**
	 * Get the room number
	 * @return room number
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * Set the room number
	 * @param room room number
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * Get the duration of the meeting in minutes
	 * @return duration in minutes
	 */
	public int getDuration(){
		int begin = convertTime(periodBegin);
		int end = convertTime(periodEnd);
		int minutes = end%100 - begin%100;
		int hours = end/100 - begin/100;	
		return hours*60 + minutes;
	}
	
	/**
	 * Get the hour of the start time
	 * @return hour of the start time
	 */
	public int getPeriodBeginHour(){
		return convertTime(periodBegin)/100;
	}
	
	/**
	 * Get the minutes of the start time
	 * @return minutes of the start time
	 */
	public int getPeriodBeginMin(){
		return convertTime(periodBegin)%100;
	}
	
	/**
	 * Get the start time as an int
	 * @return start time as an int
	 */
	public int getBeginInt(){
		return convertTime(periodBegin);
	}
	
	/**
	 * Get the end time as an int
	 * @return end time as an int
	 */
	public int getEndInt(){
		return convertTime(periodEnd);
	}
	
	/**
	 * Converts a time given as a String into an int
	 * @param time time as a String
	 * @return time as an int
	 */
	private int convertTime(String time){
		if(time.charAt(4) == 'A'){
			return Integer.parseInt(time.substring(0,4));
		}
		else if(time.charAt(4) == 'P'){
			int militaryTime = Integer.parseInt(time.substring(0,4));
			int hours = militaryTime/100;
			if(hours == 12)
				hours = 0;
			return militaryTime%100 + hours*100 + 1200;
		}
		else
			return 0;
	}
	
	/**
	 * To String method to print the meeting object
	 */
	@Override
	public String toString() {
		return "ClassMeeting [day=" + day + ", periodBegin=" + periodBegin
				+ ", periodEnd=" + periodEnd + ", bldg=" + bldg + ", room="
				+ room + "]";
	}

}
