package pages;

import org.openqa.selenium.By;

import base.Base;

public class Page_Landing extends Base {

	By welcome_text = By.xpath("//div[3]/h1");
	By logo = By.xpath("//nav/h1");
	By aboutUs_Menu = By.xpath("//li[2]/a");
	
	
	public boolean verify_welcome_text() {
		boolean b = isDisplayed(welcome_text);
		return b;		
	}
	
	public String verify_LandingPage_logo() {
		String s = getText(logo);
		return s;
	}
	
	public boolean verify_aboutUs_menu_is_visible() {
		boolean b = isDisplayed(aboutUs_Menu);
		return b;
		
	}
}
