package pages;

import org.openqa.selenium.By;

import base.Base;

public class Page_Customer_Profile_Verifcation extends Base {
	By my_profile = By.xpath("//li[2]/a");
	By see_My_info = By.xpath("//div/h2");
	By first_name = By.name("firstName");
	By last_name = By.name("lastName");
	By emailId = By.name("email");
	By DOB = By.name("birthday");
	By see_gender = By.name("gender");
	By contact_number = By.name("contact");
	By see_address = By.name("address");
	
	
	public void click_my_profile() {
		click(my_profile);
	}
	public String verify_my_info_page() {
		String s = getAttribute(see_My_info, "value");
		return s;
	}
	public String verify_my_first_name() {
		String s = getAttribute(first_name,"value");
		return s;
	}
	public String verify_my_last_name() {
		String s = getAttribute(last_name,"value");
		return s;
	}
	public String verify_email() {
		String s = getAttribute(emailId,"value");
		return s;
	}
	public String verify_DOB() {
		String s = getAttribute(DOB,"value");
		return s;
	}
	public String verify_contact_number() {
		String s = getAttribute(contact_number,"value");
		return s;
	}
	public String verify_address() {
		String s = getAttribute(see_address,"value");
		return s;
	}
	
	
	
	
	
}
