package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import pages.Page_Landing;


public class LandingPage_AboutUs_Menu {
	Page_Landing landing_Page = new Page_Landing();

	@And("Verify About Us Menu is Visible")
	public void verify_About_Us_Menu_is_Visible() {
		boolean b = landing_Page.verify_aboutUs_menu_is_visible();
		assertEquals(true, b);
	}

}
