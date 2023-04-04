package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
        Thread.sleep(4000);
        driver.findElement(By.name("username")).sendKeys("rushi");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Ra123@");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm']")).click();
        driver.quit();
	}

}
