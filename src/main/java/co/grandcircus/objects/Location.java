package co.grandcircus.objects;

public class Location {
	
	private String areaDescription;
	private String latitude;
	private String longitude;

	
	
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAreaDescription() {
		return areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}
	
	public Location(String areaDescription, String latitude, String longitude) {
		super();
		this.areaDescription = areaDescription;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Location() {
		
	}

	@Override
	public String toString() {
		return areaDescription;
	}
	
	
}
