package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.exec.launcher.WinNTCommandLauncher;
import org.apache.poi.xssf.usermodel.*;

public class readDataFromExcel {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		String xLFilePath = ".\\datafiles\\Countries.xlsx"; // initoialize file path
		FileInputStream fip = new FileInputStream(xLFilePath);
		//Get WorkBook
		XSSFWorkbook workbook = new XSSFWorkbook(fip);
		
		//Get Sheet by name
		//XSSFSheet sheet = workbook.getSheet("Sheet1");
		//Get Sheet by Index
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		
		//Using For Loop
		for(int r = 0; r < rows; r++) {
			XSSFRow row = sheet.getRow(r);
			
			for(int c = 0; c < col;c++) {
				XSSFCell cell = row.getCell(c);
				
				 switch (cell.getCellTypeEnum()){
               case STRING: {
                  System.out.print(cell.getStringCellValue());
                   break;
              }
               case NUMERIC: {
                   System.out.print(cell.getNumericCellValue());
                   break;
               }
               case BOOLEAN: {
                   System.out.print(cell.getBooleanCellValue());
                   break;
               }

           }
           System.out.print("|");
      }
			System.out.println();
		}
		
	}

}
