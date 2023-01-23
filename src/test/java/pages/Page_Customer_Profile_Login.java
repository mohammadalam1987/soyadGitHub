package pages;

import org.openqa.selenium.By;

import base.Base;

public class Page_Customer_Profile_Login extends Base {

	By customer_Login = By.xpath("//li[2]/a");
	By enter_custUserId = By.name("mailuid");
	By enter_custPassword = By.name("pwd");
	By custmer_login_button = By.name("login-submit");
	By welcome_text = By.xpath("//div[2]/div/h2[2]");
	
	public void click_customer_login(){
		click(customer_Login);
	}
	public void enter_customer_userID(String emailId) {
		sendKeys(enter_custUserId, emailId);
	}
	public void enter_custPassword(String password) {
		sendKeys(enter_custPassword, password);
	}
	public void click_Custoemr_Login() {
		click(custmer_login_button);
	}
	public String verify_customer_hoem_page() {
		String s = getText(welcome_text);
		return s;
	}
	
	
}
