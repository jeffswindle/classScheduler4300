package helper;

public class ClassMeeting {

	private String day;
	private int periodBegin;
	private int periodEnd;
	
	public ClassMeeting(String day, int periodBegin, int periodEnd) {
		this.day = day;
		this.periodBegin = periodBegin;
		this.periodEnd = periodEnd;
	}

	public String getDays() {
		return day;
	}

	public void setDays(String days) {
		this.day = days;
	}

	public int getPeriodBegin() {
		return periodBegin;
	}

	public void setPeriodBegin(int periodBegin) {
		this.periodBegin = periodBegin;
	}

	public int getPeriodEnd() {
		return periodEnd;
	}

	public void setPeriodEnd(int periodEnd) {
		this.periodEnd = periodEnd;
	}
	
	public int getDuration(){
		return 1; //TODO
	}

}
