package Z.Y.SeleniumExcel;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadAllDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
        // read a file from file system

        FileInputStream fs = new FileInputStream("D:\\Softwares\\TestData.xlsx");

        Workbook wb = WorkbookFactory.create(fs);
        Sheet sheet = wb.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();

        for(int i=0; i <rowCount ; i++){
            for( int j=0 ; j < sheet.getRow(i).getLastCellNum();j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "\t");
            }
            System.out.println();


        }


        fs.close();
        wb.close();

	}

}
