package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rtp {
 public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("which browser u want to open!!!");
		String browserValue=sc.next();
		if (browserValue.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if (browserValue.equals("firefox")) {
			System.setProperty("webdriver.gekco.driver","./drivers/gekcodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("enter valid browserValue!!!");
			
		}
	}
}
}

