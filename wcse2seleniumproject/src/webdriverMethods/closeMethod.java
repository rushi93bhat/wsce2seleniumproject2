package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	//Thread.sleep(2000);
	driver.close();
	driver.findElement(By.xpath("//a[.='Open a popup window']"));
	Thread.sleep(2000);
	driver.quit();
	}
}
