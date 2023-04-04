package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataDrivenFramework.Flib;

public class BaseTest implements IAutoConstant {
	
	protected static WebDriver driver;

	public void setUp() 
	
	{
	
		
		Flib flib=new Flib();
		String browserValue = (String) flib.readPropertyData(PROP_PATH, "browser");
		String url = (String) flib.readPropertyData(PROP_PATH,"url");
		
		if (browserValue.equalsIgnoreCase("chrome")) 
		
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			
		}
		else if(browserValue.equalsIgnoreCase("FireFox"))
		{
			
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			
		}
	
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			
	   }
		
		else
		{
			
		System.out.println("enter valid browserValue!!!");
		
		}
		
		 
		}
		
		public void tearDown()
		
		{
			driver.quit();
		}
		

}
