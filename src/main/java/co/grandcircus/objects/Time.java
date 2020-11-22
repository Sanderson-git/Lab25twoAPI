package co.grandcircus.objects;

import java.util.List;

public class Time {
	
	private List<String> startPeriodName;
	private List<String> startValidTime;
	private List<String> tempLabel;
	public List<String> getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	public List<String> getStartValidTime() {
		return startValidTime;
	}
	public void setStartValidTime(List<String> startValidTime) {
		this.startValidTime = startValidTime;
	}
	public List<String> getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(List<String> tempLabel) {
		this.tempLabel = tempLabel;
	}
	public Time(List<String> startPeriodName, List<String> startValidTime, List<String> tempLabel) {
		super();
		this.startPeriodName = startPeriodName;
		this.startValidTime = startValidTime;
		this.tempLabel = tempLabel;
	}
	
	public Time() {
		
	}
	@Override
	public String toString() {
		return "Time [startPeriodName=" + startPeriodName + ", startValidTime=" + startValidTime + ", tempLabel="
				+ tempLabel + "]";
	}
	
	
	
}
