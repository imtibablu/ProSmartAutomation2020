import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCEL_SHEET_Reading {

	public static void main(String[] args) throws IOException {
	FileInputStream exof = new FileInputStream("C:\\Users\\Laptop Gallery\\Documents\\Import_to_Selenium.xlsx");
	XSSFWorkbook wbos = new XSSFWorkbook(exof);
	XSSFSheet wsos = wbos.getSheet("sheet1");
	
	System.out.println(wsos.getRow(0).getCell(0).getStringCellValue());
	System.out.println(wsos.getRow(0).getCell(1).getStringCellValue());
	System.out.println(wsos.getRow(1).getCell(0).getStringCellValue());
	System.out.println(wsos.getRow(1).getCell(1).getStringCellValue());
	System.out.println(wsos.getRow(2).getCell(0).getStringCellValue());
	System.out.println(wsos.getRow(2).getCell(1).getStringCellValue());
	}

}
