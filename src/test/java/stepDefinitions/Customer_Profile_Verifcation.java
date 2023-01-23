package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.Page_Customer_Profile_Verifcation;

public class Customer_Profile_Verifcation extends Base {
	Page_Customer_Profile_Verifcation page_Customer_Profile_Verifcation = new Page_Customer_Profile_Verifcation();
	
	@Then("I will click My Profile")
	public void i_will_click_My_Profile() {
		page_Customer_Profile_Verifcation.click_my_profile();
	}

	@Then("I will see Page {string}")
	public void i_will_see(String expectedMsg) {
		String actualMsg = page_Customer_Profile_Verifcation.verify_my_info_page();
		assertEquals(actualMsg, expectedMsg);
	}

	@Then("I will see My First {string}")
	public void i_will_see_My_First(String expectedMsg) {
		String actualMsg = page_Customer_Profile_Verifcation.verify_my_first_name();
		assertEquals(actualMsg, expectedMsg);
	}

	@Then("I will Last name {string}")
	public void i_will_Last_name(String expectedMsg) {
		String actualMsg = page_Customer_Profile_Verifcation.verify_my_last_name();
		assertEquals(actualMsg, expectedMsg);
	}

	@Then("I will see Email Address {string}")
	public void i_will_see_Email_Address(String expectedMsg) {
		String actualMsg = page_Customer_Profile_Verifcation.verify_email();
		assertEquals(actualMsg, expectedMsg);
	}

	@Then("I will see Date of Birth {string}")
	public void i_will_see_Date_of_Birth(String expectedDOB) {
		String actualDOB = page_Customer_Profile_Verifcation.verify_DOB();
		assertEquals(actualDOB, expectedDOB);
	}

	@Then("I will Gender {string}")
	public void i_will_Gender(String expectedGender) {
		String actualGender = page_Customer_Profile_Verifcation.verify_email();
		assertEquals(actualGender, expectedGender);
	}

	@Then("I will see contact number {string}")
	public void i_will_see_contact_number(String string) {
	    
	}

	@Then("I will see Address {string}")
	public void i_will_see_Address(String string) {
	    
	}
}
