package test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValtechPage {
	
	@FindBy(css= "div.news-post__listing-header > header.block-header > .block-header__heading")
	private WebElement latestNews;

	public WebElement getLatestNews() {
		return latestNews;
	}

	public void setLatestNews(WebElement latestNews) {
		this.latestNews = latestNews;
	}
}
