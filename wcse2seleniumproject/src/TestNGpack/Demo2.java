package TestNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void dm1()
	{
		Reporter.log("method name is dm2",true);
	}

	@Test
	public void dm2()
	{
		Reporter.log("method name is dm2",true);
	}
}
