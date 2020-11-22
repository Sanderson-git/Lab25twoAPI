package co.grandcircus.objects;

import java.util.List;

public class Data {
	
	private List<String> temperature;
	private List<String> weather;
	private List<String> text;
	public List<String> getTemperature() {
		return temperature;
	}
	public void setTemperature(List<String> temperature) {
		this.temperature = temperature;
	}
	public List<String> getWeather() {
		return weather;
	}
	public void setWeather(List<String> weather) {
		this.weather = weather;
	}
	public List<String> getText() {
		return text;
	}
	public void setText(List<String> text) {
		this.text = text;
	}
	public Data(List<String> temperature, List<String> weather, List<String> text) {
		super();
		this.temperature = temperature;
		this.weather = weather;
		this.text = text;
	}
	
	public Data() {
		
	}
	@Override
	public String toString() {
		return "Data [temperature=" + temperature + ", weather=" + weather + ", text=" + text + "]";
	}
	
	

}
