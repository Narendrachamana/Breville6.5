package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excellib_old	 {
	 
	
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	
	
public Excellib_old(String path) {
		
		this.path=path;
		try {
			
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}	
		// returns the row count in a sheet

		public int getRowCount(String sheetName){
			int index = workbook.getSheetIndex(sheetName);
			if(index==-1)
				return 0;
			else{
			sheet = workbook.getSheetAt(index);
			int number=sheet.getLastRowNum()+1;
			return number;
			}
			
		}
		
		
		public int getsheetcount()
		{
			int sheets=workbook.getNumberOfSheets();
			return sheets;
		}
		
		public String getsheetname(int indexvalue)
		{
			String sheetname=workbook.getSheetName(indexvalue);
			return sheetname;
		}
		
		public int  getRowCount1(int sheetindex)
		{
			
				sheet = workbook.getSheetAt(sheetindex);
				int number=sheet.getLastRowNum()+1;
				return number;
			
			
			
		}
		
		
		
		public String getCellData(String sheetName,String colName,int rowNum)
		{
			try
			{
				if(rowNum <=0)
					return "";
			
			int index = workbook.getSheetIndex(sheetName);
			int col_Num=-1;
			if(index==-1)
				return "";
			
			sheet = workbook.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				//System.out.println(row.getCell(i).getStringCellValue().trim());
				if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num=i;
			}
			if(col_Num==-1)
				return "";
			
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum-1);
			if(row==null)
				return "";
			cell = row.getCell(col_Num);
			
			if(cell==null)
				return "";
			//System.out.println(cell.getCellTypeEnum());
			
			if(cell.getCellTypeEnum()==CellType.STRING)
				return cell.getStringCellValue();
			else if(cell.getCellTypeEnum()==CellType.NUMERIC)
				return String.valueOf(cell.getNumericCellValue());
			else if(cell.getCellTypeEnum()==CellType.BOOLEAN)
				return String.valueOf(cell.getStringCellValue());
			
			else if(cell.getCellTypeEnum()==CellType.BLANK)
				return "";
			
			}
			catch(Exception e)
			{
				
				e.printStackTrace();
				return "row "+rowNum+" or column "+colName +" does not exist in xls";
			}
			return "";
		
		}
		
		
		public String getCellData1(int index,String colName,int rowNum)
		{
			try
			{
				if(rowNum <=0)
					return "";
			
			//int index = workbook.getSheetIndex(sheetName);
			int col_Num=-1;
			
			
			sheet = workbook.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				//System.out.println(row.getCell(i).getStringCellValue().trim());
				if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num=i;
			}
			if(col_Num==-1)
				return "";
			
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum-1);
			if(row==null)
				return "";
			cell = row.getCell(col_Num);
			
			if(cell==null)
				return "";
			//System.out.println(cell.getCellTypeEnum());
			
			if(cell.getCellTypeEnum()==CellType.STRING)
				return cell.getStringCellValue();
			else if(cell.getCellTypeEnum()==CellType.NUMERIC)
				return String.valueOf(cell.getNumericCellValue());
			else if(cell.getCellTypeEnum()==CellType.BOOLEAN)
				return String.valueOf(cell.getStringCellValue());
			
			else if(cell.getCellTypeEnum()==CellType.BLANK)
				return "";
			
			}
			catch(Exception e)
			{
				
				e.printStackTrace();
				return "row "+rowNum+" or column "+colName +" does not exist in xls";
			}
			return "";
		
		}
		

		

}
