package co.grandcircus.objects;

public class DailyWeatherResponse {
	
	private String creationDate;
	private String credit;
	private Location location;
	private Time time;
	private Data data;
	private CurrentObservation currentObservation;
	
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}
	public DailyWeatherResponse(String creationDate, String credit, Location location, Time time, Data data,
			CurrentObservation currentObservation) {
		super();
		this.creationDate = creationDate;
		this.credit = credit;
		this.location = location;
		this.time = time;
		this.data = data;
		this.currentObservation = currentObservation;
	}
	
	public DailyWeatherResponse() {
	}
	@Override
	public String toString() {
		return "DailyWeatherResponse [creationDate=" + creationDate + ", credit=" + credit + ", location=" + location
				+ ", time=" + time + ", data=" + data + ", currentObservation=" + currentObservation + "]";
	}
	
	
}
