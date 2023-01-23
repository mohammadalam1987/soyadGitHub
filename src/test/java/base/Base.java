package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	
	public static void maxWindo() {

		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void click(By byObject) {
		driver.findElement(byObject).click();
	}

	public static void sendKeys(By byObject, String value) {
		driver.findElement(byObject).sendKeys(value);
	}

	public static String getText(By byObject) {
		String text = driver.findElement(byObject).getText();
		return text;
	}

	public static void clear(By byObject) {
		driver.findElement(byObject).clear();
	}

	public static String getAttribute(By byObject, String key) {
		return driver.findElement(byObject).getAttribute(key);

	}
	
	public static boolean isDisplayed(By byObject) {
		boolean b = driver.findElement(byObject).isDisplayed();
		return b;	
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void dropDownvalue(By byObject,String name) {
		Select select =new Select(driver.findElement(byObject));
		select.selectByVisibleText(name);
	}

	public static void hover(By byObject) {
		WebElement element = driver.findElement(byObject);
		// Creating object of an Actions class
		Actions action = new Actions(driver);
		// Performing the mouse hover action on the target element.
		action.moveToElement(element).perform();
	}

	public static void select(By byObject, String option) {
		WebElement element = driver.findElement(byObject);
		Select obj = new Select(element);
		obj.selectByVisibleText(option);
	}
}
