package valtech.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import test.pages.NavListPage;
import test.pages.NavPage;
import test.pages.ServicePage;
import test.pages.WorkPage;
import test.pages.AboutPage;
import test.pages.ValtechPage;
import test.pages.ContactPage;
import webutility.*;

public class ValtechTestPage extends BaseDriverPage{


	@Test
	public void verifyHappyScenarioforLatestNews() throws InterruptedException
	{
	
		WebDriver newdriver=BaseDriverPage.getInstance().sharedDriver();
		
// 		1. This assert will fail because "Latest News" appears as "LATEST NEWS" in the application , but the test is to insert assert for "Latest News" 
		
		ValtechPage valtechPage = PageFactory.initElements(newdriver, ValtechPage.class);
		assertEquals("Latest News", valtechPage.getLatestNews().getText());

		newdriver.close();
		}
	
	@Test
	public void verifyHappyScenarioforotherTests() throws InterruptedException
	{
	
		WebDriver newdriver=BaseDriverPage.getInstance().sharedDriver();
		
	
		
		// 2. Navigating to about ,work and services services and asserting for the h1 tag  
		Thread.sleep(5000);
		NavListPage navListPage = PageFactory.initElements(newdriver, NavListPage.class);
	
		navListPage.getAboutLink().click();


		Thread.sleep(5000);
		AboutPage aboutPage = PageFactory.initElements(newdriver, AboutPage.class);
		assertEquals("About", aboutPage.getPageHeader().getText());
		

		
		Thread.sleep(5000);
		navListPage.getWorkLink().click();
		
		Thread.sleep(5000);
		WorkPage workPage = PageFactory.initElements(newdriver, WorkPage.class);
		assertEquals("Work", workPage.getWorkHeader().getText());
		
 		Thread.sleep(5000);
		navListPage.getServLink().click();
		
		Thread.sleep(5000);
		ServicePage servPage = PageFactory.initElements(newdriver, ServicePage.class);
		assertEquals("Services", servPage.getServHeader().getText());
		
		// 3. Contact page and asserting for total offices
		Thread.sleep(5000);
		ContactPage contactPage = PageFactory.initElements(newdriver, ContactPage.class);
			
		System.out.println("Valtech has " + contactPage.getContactList().size()+ " offices");
		newdriver.close();
	}
	  }