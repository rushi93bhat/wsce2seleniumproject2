package testingExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import keyWordDrivenFrameWork.BaseTest;

public class TestingClass2 extends BaseTest {
  @Test
  public void search2() {
	  
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
}
