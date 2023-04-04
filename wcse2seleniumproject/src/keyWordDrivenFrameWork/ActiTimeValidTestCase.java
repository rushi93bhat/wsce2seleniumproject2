package keyWordDrivenFrameWork;

import org.openqa.selenium.By;

import dataDrivenFramework.Flib;

public class ActiTimeValidTestCase extends BaseTest {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		BaseTest bt = new BaseTest();
        bt.setUp();
		Flib flib=new Flib();
		driver.findElement(By.name("username")).sendKeys((CharSequence[]) flib.readPropertyData("./data/config.properties","username"));
	    driver.findElement(By.name("pwd")).sendKeys((CharSequence[]) flib.readPropertyData("./data/config.properties","password"));
	    driver.findElement(By.id("loginButton")).click();
	     Thread.sleep(2000);
	     bt.tearDown();
	
	}

}
