package uiTests;

import base.BaseTest;
import pages.LoginPage;
import pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void validLoginTest() {
	    LoginPage login = new LoginPage(getDriver());
	    login.login("Admin", "admin123");

	    DashboardPage dashboard = new DashboardPage(getDriver());
	    Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard NOT visible!");
	}
}
