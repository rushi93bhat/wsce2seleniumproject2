package assertionTesting;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
	
	
  @Test
  public void validLogin() 
  
  {
	  
	  Reporter.log("launch the browser",true);
	  Reporter.log("launch the web app by using url",true);
	  SoftAssert sa=new SoftAssert();//Soft Assert
	  
	  sa.assertEquals(false, true);
	  Reporter.log("log in page will be display!!",true);
	  Reporter.log("perform the login operation!!",true);
	  
	  Assert.assertEquals(true, true);//Hard Assert
	  
	  Reporter.log("Home page will be display!!",true);
	  Reporter.log("log out",true);
  }
}
