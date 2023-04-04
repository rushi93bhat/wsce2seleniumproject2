package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("input[@name='username']")).sendKeys("Rushi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("input[@name='password']")).sendKeys("rushi23@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("button[@type='submit']")).click();
		Thread.sleep(3000);
	}

}
