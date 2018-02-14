package test.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

	@FindAll(@FindBy(className = "contactcountry"))
	private List<WebElement> contactList;

	public List<WebElement> getContactList() {
		return contactList;
	}

}
