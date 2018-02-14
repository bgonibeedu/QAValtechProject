package test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkPage {
	@FindBy(xpath = "html/body/div[1]/main/header/h1")
	private WebElement workHeader;

	public WebElement getWorkHeader() {
		return workHeader;
	}
}
