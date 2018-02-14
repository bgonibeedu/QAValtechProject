package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
	
	public WebElement getPageHeader() {
		return pageHeader;
	}

	@FindBy(css = ".page-header > h1")
	private WebElement pageHeader;

}
