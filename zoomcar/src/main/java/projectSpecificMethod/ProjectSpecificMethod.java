package projectSpecificMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class ProjectSpecificMethod {

	public static ChromeDriver driver;
	
	@BeforeClass
	public void startApp() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@AfterSuite
	public void name() {
		driver.close();
	}
	
}
