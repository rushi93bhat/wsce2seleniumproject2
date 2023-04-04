package webdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod1 {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[.='open a popup window']")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
