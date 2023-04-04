package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {
  public static void main(String[] args)
  
  {
	System.setProperty("webdriver.chrome.driver","./drivers/chromdriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	String instaLpTitle=driver.getTitle();
   System.out.println(instaLpTitle);
	
    }
}
