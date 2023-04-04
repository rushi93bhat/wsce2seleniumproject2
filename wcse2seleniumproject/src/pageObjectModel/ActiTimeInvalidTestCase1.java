package pageObjectModel;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeInvalidTestCase1 extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		LoginPage lp=new LoginPage(driver);
		Flib flib=new Flib();
		int rc=flib.rowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++) 
		{
		
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0), flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));

	    }
		
		bt.tearDown();
	}

}
