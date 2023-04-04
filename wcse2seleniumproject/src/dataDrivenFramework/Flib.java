package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
		
		// TO store generic reusable method 
		
        FileInputStream fis=new FileInputStream(excelPath);
        Workbook wb=WorkbookFactory.create(fis);
        Sheet sheet=wb.getSheet(sheetName);
        Row row=sheet.getRow(rowCount);
        Cell cell=row.getCell(cellCount);
        String data=cell.getStringCellValue();
        return data;
	}
	
	//To get row count
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException

		{
		FileInputStream	fis=new FileInputStream(excelPath);
	    Workbook wb=WorkbookFactory.create(fis);
	    Sheet sheet=wb.getSheet(sheetName);
	    int rc=sheet.getLastRowNum();
	    return rc;
	    }
	//To write data in Excel sheet
	public void writeExcelData(String excelPath,String sheetName,int rowCount,String data, int cellCount) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fis=new FileInputStream(excelPath);
	    Workbook wb=WorkbookFactory.create(fis);
	    Sheet sheet=wb.getSheet(sheetName);
	    Row row=sheet.getRow(rowCount);
	    Cell cell=row.createCell(cellCount);
	    cell.setCellValue(data);
	}

	public Object readPropertyData(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
