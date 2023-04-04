package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("a")).sendKeys("Laptops");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class=('L0Z3Pu')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny _3tCU7L']/following-sibiling::div[.='Core i5']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibiling::div[.='HP']")).click();
		driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
		driver.findElement(By.xpath("//div[.='Operating System' and (@class='_2gmUFU _3V8rao')]")).click();
		Thread.sleep(2000);
	}

}
