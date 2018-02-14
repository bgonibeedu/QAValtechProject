package test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavListPage {
	
	@FindBy(css = ".navigation__menu__item:nth-child(1) > a > span")
	private WebElement aboutLink;
	
	@FindBy(css = ".navigation__menu__item:nth-child(2) > a > span")
	private WebElement workLink;

	@FindBy(css = ".navigation__menu__item:nth-child(3) > a > span")
	private WebElement servLink;

	public WebElement getAboutLink() {
		return aboutLink;
	}

	public void setAboutLink(WebElement aboutLink) {
		this.aboutLink = aboutLink;
	}

	public WebElement getWorkLink() {
		return workLink;
	}

	public void setWorkLink(WebElement workLink) {
		this.workLink = workLink;
	}

	public WebElement getServLink() {
		return servLink;
	}

	public void setServLink(WebElement servLink) {
		this.servLink = servLink;
	}

	
}


