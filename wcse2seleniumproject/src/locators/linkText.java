package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.className("_aa4b _add6 _ac4d")).sendKeys("ab123@");
		driver.get("https://www.instagram.com/");
		driver.findElement(By.linkText("https://static.cdninstagram.com/rsrc.php/v3/yb/r/lswP1OF1o6P.png")).click();
		Thread.sleep(5000);
	}

}
