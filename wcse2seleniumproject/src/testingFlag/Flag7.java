package testingFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	
  @Test
  public void login() {
	  
	  Reporter.log("Login method",true);
  }
  
  @Test(dependsOnMethods = "login")
  public void createUser()
  {
	  
	  Reporter.log("Create User Method",true);
  }
  
  @Test
  public void logout()
  {
	  Reporter.log("Logout Method",true);
  }
}
