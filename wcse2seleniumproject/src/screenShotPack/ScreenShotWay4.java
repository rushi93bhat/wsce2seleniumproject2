package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev");
		
		//way 4 create the object of EventFiringWebDriver (C)
		
        EventFiringWebDriver evf= new EventFiringWebDriver(driver);
		
		File src=evf.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/ssWay4.png");
		
		Files.copy(src, dest);
	}

}
