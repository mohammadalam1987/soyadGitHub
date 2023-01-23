package pages;

import org.openqa.selenium.By;

import base.Base;

public class Page_Employee_Login extends Base {

	By login_menu = By.xpath("//li[4]/a");
	By emp_login_page = By.xpath("//div[2]/h1");
	By emp_user_id = By.name("mailuid");
	By emp_password = By.name("pwd");
	By click_login = By.name("login-submit");
	By emp_home_page = By.xpath("//div/h2[2]");
	By logout = By.xpath("//li[7]/a");
	
	public void emp_Login_menu() {
		click(login_menu);
	}
	
	public String verify_emp_login_page() {
		String s = getText(emp_login_page);
		return s;
	}	
	public void enter_emp_user_id(String emailId) {
		sendKeys(emp_user_id, emailId);
	}
	public void enter_emp_password(String password) {
		sendKeys(emp_password, password);
	}
	public void click_login_button() {
		click(click_login);
	}
	public String verify_emp_home_page() {
		String s = getText(emp_home_page);
		return s;
	}
	public void verify_logout_button() {
		click(logout);
	}
	
	
	
}
