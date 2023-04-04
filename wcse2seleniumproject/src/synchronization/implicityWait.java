package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicityWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/rbhat/login.do");
	String	loginPageActualTitle=driver.getTitle();
	Thread.sleep(2000);
	if(loginPageActualTitle.equals("actiTIME-Login"))
	{
       System.out.println("Test is passed login page verified!!");
       driver.findElement(By.name("username")).sendKeys("Rushikesh Bhat");
       driver.findElement(By.name("pwd")).sendKeys("Rushikesh Bhat");
       driver.findElement(By.id("loginButton")).click();
      
	}
	else
	{
		System.out.println("Test is failed login page not verified!!");
		
	   } 
             String	homePageActualTitle=driver.getTitle();
 if(homePageActualTitle.equals("actiTIME-Enter time-track"))
 {
	 System.out.println("Test is passed home page verified!!");
 }
 else
 {
     System.out.println("Test is failed Home page not verified");
    
	}
	   }

}
