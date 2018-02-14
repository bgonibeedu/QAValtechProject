package webutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseDriverPage {
	
	public static WebDriver driver;

	static BaseDriverPage baseClass;

	 
	public  BaseDriverPage() {}
	public static BaseDriverPage getInstance() {
		if (baseClass == null) {
			baseClass = new BaseDriverPage();
		}
		return baseClass;
	}
	
	public WebDriver sharedDriver() {
		if (driver == null) {
			try {
				
		 		String exePath = "C:\\Selenium\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				driver = new ChromeDriver();
				
/*				System.setProperty("webdriver.ie.driver", "iedriver/IEDriverServer.exe");
				InternetExplorerDriver driver = new InternetExplorerDriver();
*/			
				driver.get("https://www.valtech.com/");
				
				/*System.setProperty("webdriver.gecko.driver", "firefox/geckodriver");
				driver = new FirefoxDriver();*/
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		return driver;
	}

}