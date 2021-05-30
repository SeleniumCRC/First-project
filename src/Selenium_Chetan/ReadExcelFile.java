package Selenium_Chetan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	XSSFWorkbook work_book;
	XSSFSheet sheet;
	FileInputStream stream;
	public ReadExcelFile(String excelfilePath) {
		try {
			File s = new File(excelfilePath);
			stream = new FileInputStream(s);
			work_book = new XSSFWorkbook(stream);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetnumber, int row, int column) {
		sheet = work_book.getSheetAt(sheetnumber);
		//System.out.println(sheet.getRow(row).getCell(column).getStringCellValue());
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public int getRowCount(int sheetIndex) {
		int row = work_book.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
	
	public int getColumnCount(int sheetIndex) {
		int col = work_book.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
		return col;
	}
	
	public void setData(int  sheetnumber, int row, int column, String value) throws IOException
	{	
		System.out.println("inside");
		sheet = work_book.getSheetAt(sheetnumber);
		
		System.out.println(sheetnumber);
		XSSFRow row2=sheet.createRow(row);
		System.out.println(row2);
		XSSFCell cell = row2.createCell(column);
		System.out.println("inside4");
		cell.setCellValue(value);
		System.out.println(value);
		stream.close();
		
		
	}

	public void writeFile(String excelfilePath) throws IOException
	{
	FileOutputStream outputStream = new FileOutputStream(excelfilePath);
	try {
		work_book.write(outputStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	outputStream.close();
	}

}