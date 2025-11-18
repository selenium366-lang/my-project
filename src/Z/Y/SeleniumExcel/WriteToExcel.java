package Z.Y.SeleniumExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	       Workbook wb = new XSSFWorkbook();
	        Sheet sheet = wb.createSheet("TestData");
	        Row row = sheet.createRow(0);
	        Cell cell =  row.createCell(0);
	        cell.setCellValue("XYZ");

	        //sheet.createRow(0).createCell(0).setCellValue("XYZ");

	        FileOutputStream fos = new FileOutputStream("D:\\\\Softwares\\\\TestData2.xlsx");
	        wb.write(fos);
	        fos.close();
	        wb.close();

	}

}
