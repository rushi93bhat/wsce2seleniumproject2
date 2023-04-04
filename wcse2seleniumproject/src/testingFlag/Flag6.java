package testingFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6

{

	@Test(enabled = true)
	public void login() {

		Reporter.log("Login method", true);
	}

	@Test(enabled = true)
	public void logout() {

		Reporter.log("Logout method", true);
	}
}
