package co.grandcircus.Lab25API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.grandcircus.objects.Article;

@Controller
public class APIController {
	
	@Autowired
	private WeatherApiService weatherApiService;
	
	@Autowired
	private NewsApiService newsApiService;
	
	@GetMapping("/")
	private String index(Model model) {
		List <String> days = weatherApiService.pullWeather().getTime().getStartPeriodName();
		model.addAttribute("days", days);
		List<String> tempLabels = weatherApiService.pullWeather().getTime().getTempLabel();
		model.addAttribute("templabels", tempLabels);
		List<String> temps = weatherApiService.pullWeather().getData().getTemperature();
		model.addAttribute("temps", temps);
		List<String> weathers = weatherApiService.pullWeather().getData().getWeather();
		model.addAttribute("weathers", weathers);
		model.addAttribute("dailyWeather", weatherApiService.pullWeather());
		return "index";
	}
	
	@GetMapping("/news")
	private String news (Model model) {
		List <Article> articles = newsApiService.pullNews().getArticles();
		model.addAttribute("articles", articles);
		return "news";
	}

}
