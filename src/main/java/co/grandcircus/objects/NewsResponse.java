package co.grandcircus.objects;

import java.util.List;

public class NewsResponse {

	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public NewsResponse(List<Article> articles) {
		super();
		this.articles = articles;
	}

	public NewsResponse() {
		super();
	}

}
