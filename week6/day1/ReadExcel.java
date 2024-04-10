package week6.day1;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static String[][] readData(String excelName) throws IOException
	{
				// Open the workbook
				XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelName+".xlsx");
				
				// Enter into the specific work sheet either by using the sheet index / sheet name
				XSSFSheet wSheet = wbook.getSheetAt(0);	
				
				// get the rowCount
				int rowCount = wSheet.getLastRowNum();
				System.out.println("Total no:of rows : " +rowCount);
				
				// get the columnCount
				int columnCount = wSheet.getRow(0).getLastCellNum();
				System.out.println("Total no:of columns : " +columnCount);
				
				String[][] data = new String[rowCount][columnCount];
				
				for (int i = 1; i <=rowCount; i++) {
					
					XSSFRow row = wSheet.getRow(i);
					
					  for (int j = 0; j < columnCount; j++) {
						  
						  data[i-1][j] = row.getCell(j).getStringCellValue();
					         
					         
					}
				}
				
			
				
				wbook.close();
				return data;
				

		
	}
}
