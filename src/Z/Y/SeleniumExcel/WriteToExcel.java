package Z.Y.SeleniumExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        FileInputStream fis = new FileInputStream("TestData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("Sheet1");

        Row row = sheet.createRow(3);
        row.createCell(0).setCellValue("Abhijeet");
        row.createCell(1).setCellValue("Automation Tester");

        FileOutputStream fos = new FileOutputStream("TestData.xlsx");
        wb.write(fos);

        wb.close();

//        mohan
//        Workbook wb = new XSSFWorkbook();
//	        Sheet sheet = wb.createSheet("TestData");
//	        Row row = sheet.createRow(0);
//	        Cell cell =  row.createCell(0);
//	        cell.setCellValue("XYZ");
//
//	        //sheet.createRow(0).createCell(0).setCellValue("XYZ");
//
//	        FileOutputStream fos = new FileOutputStream("D:\\\\Softwares\\\\TestData2.xlsx");
//	        wb.write(fos);
//	        fos.close();
//	        wb.close();

	}

}
