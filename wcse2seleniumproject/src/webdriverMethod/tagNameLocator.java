package webdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(4000);
		driver.findElement(By.tagName("input")).sendKeys("admin");
        driver.navigate().to("https://groww.in/?gclid=EAIaIQobChMIgPn_-bX3_AIVUFtgCh2cjAByEAAYASAAEgKXzvD_BwE");
        driver.findElement(By.tagName("input")).sendKeys("admin");
        driver.navigate().to("https://www.zomato.com/india");
        driver.findElement(By.id("root")).sendKeys("admin");
	}

}
