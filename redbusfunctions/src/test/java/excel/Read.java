package excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Read {
			public static String readExcel(int row, int column) throws IOException {
				String testData=null;
				try {
					//Object[][] testdata = null;
					//Getting the Relative path for excel from Source Excel folder
					String filePath = System.getProperty("user.dir")+"//Excel//TestData1.xlsx"; // excel sheet path is given here
					FileInputStream file = new FileInputStream(filePath); // it inputs the sheet (file input stream)
					XSSFWorkbook wb = new XSSFWorkbook(file);//it reads the input file from inputstream 
					XSSFSheet ws = wb.getSheetAt(0);
					testData = String.valueOf(ws.getRow(row).getCell(column));
					System.out.println(testData);
					wb.close();
				}catch(Exception e)
				{
					System.out.println("Excel Read");
				}
				return testData;
			}
}
