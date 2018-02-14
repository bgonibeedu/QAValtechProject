package test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicePage {
	@FindBy(xpath = "html/body/div[1]/main/section/header/h1")
	private WebElement servHeader;

	public WebElement getServHeader() {
		return servHeader;
	}


}
