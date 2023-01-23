package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import pages.Page_Employee_Profile_Update;

public class Employee_Profile_Update_Verifycation extends Base {
	Page_Employee_Profile_Update page_Employee_Profile = new Page_Employee_Profile_Update();
	
	@Then("I click My Profile button")
	public void i_click_My_Profile_button() {
		page_Employee_Profile.click_my_profile_menu();
	}

	@Then("I will see My Info Page {string}")
	public void i_will_see_My_Info_Page(String expectedMsg) {
		String actualMsg =  page_Employee_Profile.verify_my_info_page();
		assertEquals(actualMsg, expectedMsg);
	}

	@Then("I will click update info button")
	public void i_will_click_update_info_button() {
		page_Employee_Profile.click_update_info_button();
	}

	@Then("I will see Employee Page {string}")
	public void i_will_see_Employee_Page(String expectedMsg) {
		String actualMsg =  page_Employee_Profile.verify_emp_info_page();
		assertEquals(actualMsg, expectedMsg);
	}

	@Then("I Will clear contact")
	public void i_Will_clear_contact() {
		page_Employee_Profile.clear_contact();
	}

	@Then("I Will enter new contact {string}")
	public void i_Will_enter_new_contact(String contactNum) {
		page_Employee_Profile.enter_new_contact(contactNum);		
	}

	@Then("I Will clear address")
	public void i_Will_clear_address() {
		page_Employee_Profile.clear_address();
	}

	@Then("I Will update address {string}")
	public void i_Will_update_address(String UpdateAddress) {
		page_Employee_Profile.update_address(UpdateAddress);
	}

	@Then("I Will click submit button")
	public void i_Will_click_submit_button() {
		page_Employee_Profile.click_submit_button();
	}

	@Then("I click refresh url")
	public void i_click_refresh_url() {
	   refresh();
	}

	@Then("I will see Employee updated contact {string}")
	public void i_will_see_Employee_updated_contact(String expectedMsg) {
		String actualMsg =  page_Employee_Profile.verify_update_contact();
		assertEquals(actualMsg, expectedMsg);
	}

	@Then("I will see Employee updated address {string}")
	public void i_will_see_Employee_updated_address(String expectedMsg) {
		String actualMsg =  page_Employee_Profile.verify_update_address();
		assertEquals(actualMsg, expectedMsg);
	}
	
}
