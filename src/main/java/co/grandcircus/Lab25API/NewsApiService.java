package co.grandcircus.Lab25API;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.objects.DailyWeatherResponse;
import co.grandcircus.objects.NewsResponse;

@Service
public class NewsApiService {
	
	private RestTemplate rt = new RestTemplate();
	
	public NewsResponse pullNews () {
		String url = "http://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=561a66ddaee44215ac27649078a4e32b";
		NewsResponse res = rt.getForObject(url, NewsResponse.class);
		return res;
	}
}
