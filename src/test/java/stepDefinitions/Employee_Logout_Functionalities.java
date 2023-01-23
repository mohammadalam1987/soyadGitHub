package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.Page_Employee_Login;

public class Employee_Logout_Functionalities {
	
	Page_Employee_Login page_Employee_Login = new Page_Employee_Login();
	
	@Then("I Click Employee Logout button")
	public void i_Click_Employee_Logout_button() {
		page_Employee_Login.verify_logout_button();
	}
}
