package handlingPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//To handle use method of ChromeOptions
		options.addArguments("--disable-notifications");
		Thread.sleep(2000);
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        //we will Notification pop up
	}

}
