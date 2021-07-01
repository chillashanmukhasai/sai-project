package sai_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
public static void readExcel_all(String filePath,String fileName,String sheetName) throws IOException {
	//create an object of file class to open xlsx file
	File file=new File(filePath+"##"+fileName);
	//create an object of fileinputstream to read  excel file
	FileInputStream inputstream=new FileInputStream(file);
	Workbook narworkbook = null;
	//find the file extension by splitting filename in substring and getting only extension name
	String fileextensionname=fileName.substring(fileName.indexOf("."));
	
	//check condition if the file is .xlsx file or not
	if(fileextensionname.equals(".xlsx")) {
		//if it is xlsx file then create an object of XSSFworkbook class
		narworkbook=new XSSFWorkbook(inputstream);
	}
	else if(fileextensionname.equals(".xls")) {
		//if it is xls file then create an object of HSSF workbook class
		narworkbook=new HSSFWorkbook(inputstream);
	}
	//read sheet inside the workbook by its name
	Sheet narsheet=narworkbook.getSheet(sheetName);
	//find the number of rows in the excel file
	int rowCount=narsheet.getLastRowNum()-narsheet.getFirstRowNum();
	//create a loop over all the rows of excel file to read it
	for(int i=0;i<=rowCount;i++) {
		Row row=narsheet.getRow(i);
		//create a loop to print cell values in a row
		for(int j=0;j<row.getLastCellNum();j++) {
			//print excel data in console
			System.out.println(row.getCell(i).getStringCellValue()+"||");
					}
	}

}
}