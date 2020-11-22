package co.grandcircus.objects;

public class CurrentObservation {

	private String name;
	private String date;
	private String temp;
	private String weather;
	private String weatherimage;
	private String state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWeatherimage() {
		return weatherimage;
	}
	public void setWeatherimage(String weatherimage) {
		this.weatherimage = weatherimage;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public CurrentObservation(String name, String date, String temp, String weather, String weatherimage,
			String state) {
		super();
		this.name = name;
		this.date = date;
		this.temp = temp;
		this.weather = weather;
		this.weatherimage = weatherimage;
		this.state = state;
	}
	
	public CurrentObservation() {
		
	}
	
}
