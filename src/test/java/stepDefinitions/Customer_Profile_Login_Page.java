package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page_Customer_Profile_Login;

public class Customer_Profile_Login_Page extends Base {
	
	Page_Customer_Profile_Login page_Customer_Profile_Login = new Page_Customer_Profile_Login();
	
	@When("Click Customer Login")
	public void click_Customer_Login() {
		page_Customer_Profile_Login.click_customer_login();
	}

	@Then("I enter Customer User Id {string}")
	public void i_enter_Customer_User_Id(String emailId) {
		page_Customer_Profile_Login.enter_customer_userID(emailId);
	}

	@Then("I enter Customer Password {string}")
	public void i_enter_Customer_Password(String password) {
		page_Customer_Profile_Login.enter_custPassword(password);
	}

	@When("I click Customer Login button")
	public void i_click_Customer_Login_button() {
		page_Customer_Profile_Login.click_Custoemr_Login();
	}

	@Then("I will see Customer Home Page {string}")
	public void i_will_see_Customer_Home_Page(String expectedMsg) {
	   String actualMsg = page_Customer_Profile_Login.verify_customer_hoem_page();
	   assertEquals(actualMsg,expectedMsg);
	}
}
