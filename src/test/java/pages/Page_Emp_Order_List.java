package pages;

import org.openqa.selenium.By;

import base.Base;

public class Page_Emp_Order_List extends Base {
	
	By order_list_menu = By.xpath("//li[5]/a");
	By order_list_page = By.xpath("//h2");
	By order_product_menu = By.xpath("//li[2]/a");
	By product_order_page = By.xpath("//div[2]/div/div[1]/div[2]/h2");
	By select_product = By.name("prodId");
	By enter_order_date = By.name("ordDate");
	By order_product_button = By.xpath("//div/button");
	By confirm_button = By.xpath("//tr[last()]/td[last()]");
	By confirmed_Status = By.xpath("//tr[last()]/td[last()-1]");
	
	
	public void click_order_list_menu() {
		click(order_list_menu);
	}
	
	public String verify_order_list_page() {
		String s = getText(order_list_page);
		return s;
	}
	public void click_order_product() {
		click(order_product_menu);
	}
	public String verify_product_order_page() {
		String s = getText(order_list_page);
		return s;
	}
	public void select_product_name() {
		select(select_product, "Laptop");
	}
	public void enter_order_date(String ordDate) {
		sendKeys(enter_order_date, ordDate);
	}
	public void click_order_product_button() {
		click(order_product_button);
	}
	public void click_confirm_button() {
		click(confirm_button);
	}
	public String verify_order_status() {
		String s = getText(confirmed_Status);
		return s;
	}
	
}
