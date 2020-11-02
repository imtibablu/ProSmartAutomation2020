import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCEL_SHEET_Writing {

	public static void main(String[] args) throws IOException {
		FileInputStream exo = new FileInputStream("C:\\Users\\Laptop Gallery\\Documents\\Testdata.xlsx");
		//Refer to the workbook 'wbo'
		XSSFWorkbook wbo = new XSSFWorkbook(exo);
		XSSFSheet wso=wbo.getSheet("sheet1");
		
		Row r;
		for (int i=0;i<=10;i++) {
			r=wso.createRow(i);
			r.createCell(1).setCellValue("Studying");
		}
		FileOutputStream data=new FileOutputStream("C:\\Users\\Laptop Gallery\\Documents\\Testdata.xlsx");
		wbo.write(data);
	}

}