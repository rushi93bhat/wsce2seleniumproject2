package testingExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import keyWordDrivenFrameWork.BaseTest;


public class TestingClass3 extends BaseTest {
  @Test
  public void search3() {
	  
	  driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
  }
}
