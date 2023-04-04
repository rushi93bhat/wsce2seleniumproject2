package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//way 3 upcast the browser specific classes into RemoteWebdriver (class)
		
		RemoteWebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev");
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/ssWay3.jpg");
		
		Files.copy(src, dest);

	}

}
