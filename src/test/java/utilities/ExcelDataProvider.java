package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	
	
	public static XSSFWorkbook wrkBookObj;
	public static XSSFSheet wrkSheetObj;
	public static int rows;
	public static int cols;
	public static FileInputStream file;
	
	
	
	public static  XSSFSheet getSheetObject(String inputDataFilePath, String SheetName) throws Exception
	{
		 file = new FileInputStream(new File(inputDataFilePath));
		wrkBookObj = new XSSFWorkbook(file) ;
		wrkSheetObj= wrkBookObj.getSheet(SheetName);		
		return wrkSheetObj;
	}
	
	public static int rowcount()
	{
		rows=wrkSheetObj.getPhysicalNumberOfRows();
		
		return rows;
		
	}
	
	public static int get(int index)
	{
		cols=wrkSheetObj.getRow(index).getPhysicalNumberOfCells();
		
		return cols;
		
	}
	
	public static String getCellValue(String SheetName,  int row, int col) {
        String Stringvalue = "";
        try {
        	Stringvalue = wrkBookObj.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
        	if(Stringvalue.endsWith("NA"))
        	{
        		Stringvalue = "";
        	}
        	else
        	{
        		return Stringvalue;
        	}
        	
        } catch (Exception e) {
            // TODO Auto-generated catch block
        }
       
        return Stringvalue;
    }
	
	
	
	public static void closeworkbook() throws IOException
	{
		wrkBookObj.close();
		file.close();
	}
	
	
	public static Object[][] getData(String inputDataFilePath, String sheetName) throws Exception {

        Object rowcell[][] = null;

        try {
        	getSheetObject(inputDataFilePath,sheetName);
            int rowcount = rowcount();
            int cellcount = wrkSheetObj.getRow(0).getPhysicalNumberOfCells();
            rowcell = new Object[rowcount-1][cellcount];
            for (int i = 0; i < rowcount-1; i++) {
                for (int j = 0; j < cellcount; j++) {
                    rowcell[i][j] = getCellValue(sheetName, i+1, j);
                }
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowcell;

    }
	
}
	


