package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {
	@Before
	public static void setup() {
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
	
	}
	
	@After
	public static void tearDown() {
		driver.quit();
	}
}
