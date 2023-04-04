package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// To read single data from Excel sheet
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		//Provide the path of file
		Workbook wb=WorkbookFactory.create(fis);
		//make the file ready for read
		
		org.apache.poi.ss.usermodel.Sheet sheet=wb.getSheet("IPL"); //get into Sheet
		
		Row row=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(1); //get the desired row
		Cell cell=row.getCell(0); //get the desired cell
		String data=cell.getStringCellValue(); //read the data from cell
		System.out.println(data); //print the data
	}

}
