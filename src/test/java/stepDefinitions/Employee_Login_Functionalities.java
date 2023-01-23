package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page_Employee_Login;


public class Employee_Login_Functionalities extends Base {
	
	Page_Employee_Login page_Employee_Login = new Page_Employee_Login();
	
	@When("I Click on Login Menu")
	public void i_Click_on_Login_Menu() {
		page_Employee_Login.emp_Login_menu();
	}

	@When("I Will see Employee Login Page {string}")
	public void i_Will_see_Employee_Login_Page(String expectedMsg) {
	 String actualMsg = page_Employee_Login.verify_emp_login_page();
	 assertEquals(actualMsg,expectedMsg);
	}

	@Then("I Enter Employee user id {string}")
	public void i_Enter_Employee_user_id(String emailId) {
		page_Employee_Login.enter_emp_user_id(emailId);
	}

	@Then("I Enter Employee password {string}")
	public void i_Enter_Employee_password(String password) {
		page_Employee_Login.enter_emp_password(password);
	}

	@When("I click Employee login button")
	public void i_click_Employee_login_button() {
		page_Employee_Login.click_login_button();
	}

	@Then("I Will see Employee Home Page {string}")
	public void i_Will_see_Employee_Home_Page(String expectedMsg) {
		String actualMsg = page_Employee_Login.verify_emp_home_page();
		assertEquals(actualMsg, expectedMsg);
	}
}
