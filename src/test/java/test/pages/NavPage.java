package test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavPage {

	@FindBy(xpath = "html/body/div[1]/header/div/nav/div/div[1]/label[2]/span/span[1]/span/span[1]/i")
	private WebElement nav;
	
	@FindBy(xpath = "html/body/div[1]/header/div/nav/div/div[1]/label[1]/div/a/div/div/div[1]/i")
	private WebElement contactUs;
	
	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getNav() {
		return nav;
	}

}
