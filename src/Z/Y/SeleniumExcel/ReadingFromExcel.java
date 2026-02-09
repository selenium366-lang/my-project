package Z.Y.SeleniumExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {

	public static void main(String[] args) throws IOException {

		//specific cell
        System.out.println("specific cell");
        FileInputStream fis = new FileInputStream("D:\\Softwares\\TestData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("Login");
        Row row =sheet.getRow(1);
        Cell cell = row.getCell(0);
        String username = cell.getStringCellValue();
        String password =sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println("username:"+username);
        System.out.println("password:"+password);

        //specific row
        System.out.println("specific row" );
        int rowNum = 2;
        Row row1 = sheet.getRow(rowNum);
        for (Cell cell1 : row1) {
            System.out.println(cell1.toString());
        }

        //read all sheet
        System.out.println("All data");
        for (Row row2 : sheet) {
            for (Cell cell2 : row2) {
                System.out.print(cell2.toString() + " | ");
            }
            System.out.println();
        }



	}

}
