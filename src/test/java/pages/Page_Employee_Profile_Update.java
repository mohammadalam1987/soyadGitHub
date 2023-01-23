package pages;

import org.openqa.selenium.By;

import base.Base;

public class Page_Employee_Profile_Update extends Base{
	
	By my_profile_menu = By.xpath("//li[2]/a");
	By see_my_info = By.xpath("//div/h2");
	By update_info_button = By.xpath("//div/button");
	By see_emp_info = By.xpath("//div/h2");
	By contactBox = By.name("contact");
	By addressBox = By.name("address");
	By submit_button = By.name("update");
	
	public void click_my_profile_menu() {
		click(my_profile_menu);
	}
	public String verify_my_info_page() {
		String s = getText(see_my_info);
		return s;	
	}
	
	public void click_update_info_button() {
		click(update_info_button);
	}
	public String verify_emp_info_page() {
		String s = getText(see_emp_info);
		return s;	
	}
	public void clear_contact() {
		clear(contactBox);
	}
	public void enter_new_contact(String contactNum) {
		sendKeys(contactBox, contactNum);
	}
	public void clear_address() {
		clear(addressBox);
	}
	public void update_address(String address) {
		sendKeys(addressBox, address);
	}
	public void click_submit_button() {
		click(submit_button);
	}
	public String verify_update_contact() {
		String s = getAttribute(contactBox, "value");
		return s;	
	}
	public String verify_update_address() {
		String s = getAttribute(addressBox, "value");
		return s;	
	}
	
	
}
