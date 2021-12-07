package chapterThree;

public class Clock {
 	private int currentHour;
 	private int currentMinute;
 	private int currentSecond;

	public Clock(int hour, int minute, int second) {
		if (hour > 23) {
			this.currentHour = 0;
		}else{
			this.currentHour = hour;
		}
		if (minute > 59) {
			this.currentMinute = 0;
		}else{
			this.currentMinute = minute;
		}
		if (second > 59) {
			this.currentSecond = 0;
		}else{
			this.currentSecond = second;
		}



	}

	public int getCurrentHour() {
		return currentHour;
	}

	public void setCurrentHour(int currentHour) {
		if (currentHour > 23) {
			this.currentHour = 0;
		}
		this.currentHour = currentHour;
	}

	public int getCurrentMinute() {
		return currentMinute;
	}

	public void setCurrentMinute(int currentMinute) {
		if (currentMinute > 59) {
			this.currentMinute = 0;
		}
		this.currentMinute = currentMinute;
	}

	public int getCurrentSecond() {
		return currentSecond;
	}

	public void setCurrentSecond(int currentSecond) {
		if (currentSecond > 59) {
			this.currentSecond = 0;
		}
		this.currentSecond = currentSecond;
	}

	public String displayTime (){
		String time ="";
//		System.out.printf("the time is: %d:%d:%d", currentHour, currentMinute, currentSecond);
		return time = getCurrentHour()+ ":" + getCurrentMinute()+ ":" +getCurrentSecond();

	}
}
