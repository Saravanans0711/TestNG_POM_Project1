package utilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static String oFileName="./data/ExcelTestData.xlsx";
	public static FileInputStream oRead;
	public static FileOutputStream oWrite;
	public static String oSheet="Data1";
	
	public static void main(String[] args) throws Exception {
		readExcelData(oSheet);
	}
	public static void readExcelData(String oSheet) throws Exception {
		oRead=new FileInputStream(oFileName);
		XSSFWorkbook wb=new XSSFWorkbook(oRead);
		XSSFSheet xsheet = wb.getSheet(oSheet);
		XSSFRow xRow;
		XSSFCell xCel;
		int rowNum = xsheet.getLastRowNum();
	    for(int irow=0;irow<=rowNum;irow++) {
	    	xRow=xsheet.getRow(irow);
	    short cellNum = xRow.getLastCellNum();
	    for(int icell=0;icell<cellNum;icell++) {
	    	xCel=xRow.getCell(icell);
	    	CellType ocellType = xCel.getCellType();
	    	switch (ocellType) {
			case NUMERIC:
				System.out.println(xCel.getNumericCellValue());
				break;
			case STRING:
				System.out.println(xCel.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println(xCel.getBooleanCellValue());
			default:
				System.out.println("Invalid cell type");
				break;
			}
	    }}
	    wb.close();
	    oRead.close();
	}
	}