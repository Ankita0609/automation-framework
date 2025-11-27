package uiTests;

import base.BaseTest;
import pages.LoginPage;
import pages.UserManagementPage;
import org.testng.annotations.Test;

public class UserManagementTest extends BaseTest {

	@Test
	public void createAndValidateUser() {

	    LoginPage login = new LoginPage(getDriver());
	    login.login("Admin", "admin123");

	    UserManagementPage userPage = new UserManagementPage(getDriver());
	    userPage.createUser("TestUser123", "Password@123");
	}

}
