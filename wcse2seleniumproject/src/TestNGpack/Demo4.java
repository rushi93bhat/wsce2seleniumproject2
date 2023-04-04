package TestNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Test
	public void dm5()
	{
		
		int a=6;
		int b=3;
		int res=a/b;
		Reporter.log("method name is dm5"+res,true);
	}

}
