package testingExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import keyWordDrivenFrameWork.BaseTest;

public class TestingClass1 extends BaseTest {
	
  @Test
  public void search1() {
	  
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
}
