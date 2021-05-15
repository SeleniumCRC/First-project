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

	public ReadExcelFile(String excelfilePath) {
		try {
			File s = new File(excelfilePath);
			FileInputStream stream = new FileInputStream(s);
			work_book = new XSSFWorkbook(stream);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetnumber, int row, int column) {
		sheet = work_book.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public int getRowCount(int sheetIndex) {
		int row = work_book.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
	
	public void setData(String sheetnumber, int row, int column, String value)
	{	
		System.out.println("inside");
		sheet = work_book.getSheet(sheetnumber);
		System.out.println("inside2");
		XSSFRow row2=sheet.createRow(row);
		XSSFCell cell = row2.createCell(column);
		cell.setCellValue(value);
	}

	public void writeFile(String excelfilePath) throws FileNotFoundException
	{
	FileOutputStream outputStream = new FileOutputStream("excelfilePath");
	try {
		work_book.write(outputStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}