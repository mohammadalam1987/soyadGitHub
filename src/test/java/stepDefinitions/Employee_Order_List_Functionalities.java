package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page_Emp_Order_List;

public class Employee_Order_List_Functionalities extends Base {
	
	Page_Emp_Order_List page_Emp_Order_List = new Page_Emp_Order_List();
	
	@Then("I will click Order List button")
	public void i_will_click_Order_List_button() {
		page_Emp_Order_List.click_order_list_menu();
	}

	@Then("I will see Order List Page {string}")
	public void i_will_see_Order_List_Page(String expectedMsg) {
		String actualMsg = page_Emp_Order_List.verify_order_list_page();
		assertEquals(actualMsg, expectedMsg);
	}

	@Then("I click Order Product Menu")
	public void i_click_Order_Product_Menu() {
		page_Emp_Order_List.click_order_product();
	}

	@Then("I will see Product Order page {string}")
	public void i_will_see_Product_Order_page(String string) {
		page_Emp_Order_List.verify_product_order_page();
	}

	@Then("I Select Product Name")
	public void i_Select_Product_Name() {
		page_Emp_Order_List.select_product_name();
	}

	@Then("I Enter Order Date {string}")
	public void i_Enter_Order_Date(String ordDate) {
		page_Emp_Order_List.enter_order_date(ordDate);
	}

	@When("I click Order Product button")
	public void i_click_Order_Product_button() {
		page_Emp_Order_List.click_order_product_button();
	}

	@Then("I click on Confirm button")
	public void i_click_on_Confirm_button() {
		page_Emp_Order_List.click_confirm_button();
	}

	@Then("I will refresh page")
	public void i_will_refresh_page() {
	    refresh();
	}

	@Then("I will see Status {string}")
	public void i_will_see_Status(String expectedMsg) {
		String actualMsg = page_Emp_Order_List.verify_order_status();
		assertEquals(actualMsg, expectedMsg);
	}
	
}
