package co.grandcircus.Lab25API;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import co.grandcircus.objects.DailyWeatherResponse;
import co.grandcircus.objects.Location;

@Service
public class WeatherApiService {
	
	private RestTemplate rt = new RestTemplate();
	
	public DailyWeatherResponse pullWeather () {
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.580276&lon=-83.030281&FcstType=json";
		DailyWeatherResponse res = rt.getForObject(url, DailyWeatherResponse.class);
		return res;
	}

}
