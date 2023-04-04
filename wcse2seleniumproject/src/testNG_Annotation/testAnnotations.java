package testNG_Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testAnnotations 
 {
  @Test
  public void f() {
	  
	  Reporter.log("method name is f",true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  Reporter.log("beforeMethod",true);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  Reporter.log("afterMethod",true);
  }

  @Test
  public void rushi() {
	  
	  Reporter.log("rushi",true);
  }

 
  @BeforeClass
  public void beforeClass() {
	  
	  Reporter.log("beforClass",true);
  }

  @AfterClass
  public void afterClass() {
	  
	  Reporter.log("afterClass",true);
  }
  
  @Test
  public void bhat() {
	  
	  Reporter.log("bhat",true);
  }

  @BeforeTest
  public void beforeTest() {
	  
	  Reporter.log("beforeTest",true);
  }

  @AfterTest
  public void afterTest() {
	  
	  Reporter.log("afterTest",true);
  }

  
  @Test
  public void wakad() {
	  
	  Reporter.log("wakad",true);
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  Reporter.log("beforeSuite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  
	  Reporter.log("afterSuite",true);
  }

  @Test
  public void g() {
	  
	  Reporter.log("method name is g",true);
  }
  
  @Test
  public void h() {
	  
	  Reporter.log("method name is h",true);
  }
  
  @Test
  public void i() {
	  
	  Reporter.log("method name is i",true);
  }
}
