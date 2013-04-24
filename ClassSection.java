package helper;

import java.util.ArrayList;

/**
 * Class that represents a single section of a course
 * @author Jason Beck
 */
public class ClassSection {

	//Declaration of variables
	private int callNumber;
	private ArrayList<ClassMeeting> classMeetingsList;
	
	/**
	 * Constructor to instantiate a ClassMeeting object
	 * @param callNumber call number of the section
	 */
	public ClassSection(int callNumber) {
		this.callNumber = callNumber;
		classMeetingsList = new ArrayList<ClassMeeting>();
	}

	/**
	 * Get the call number
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
	 * Get the ArrayList of meetings that are in this section
	 * @return ArrayList of ClassMeeting objects
	 */
	public ArrayList<ClassMeeting> getClassMeetingsList() {
		return classMeetingsList;
	}
	
	/**
	 * Adds a ClassMeeting to the ArrayList of meetings for this section
	 * @param classMeeting meeting to add to this section
	 */
	public void addClassMeetingList(ClassMeeting classMeeting){
		for(int i=0; i < classMeetingsList.size(); i++){
			//checks to see if the meeting already exists in the list
			ClassMeeting tempMeeting = classMeetingsList.get(i);
			if(tempMeeting.getDay().equals(classMeeting.getDay()) &&
					tempMeeting.getBldg().equals(classMeeting.getBldg()) &&
					tempMeeting.getRoom().equals(classMeeting.getRoom()) &&
					tempMeeting.getPeriodBegin().equals(classMeeting.getPeriodBegin()) &&
					tempMeeting.getPeriodEnd().equals(classMeeting.getPeriodEnd())){
				return;
			}
		}
		classMeetingsList.add(classMeeting);
	}
	
}
