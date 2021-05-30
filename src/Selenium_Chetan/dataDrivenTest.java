package Selenium_Chetan;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class dataDrivenTest extends ReadExcelFile
{
	public dataDrivenTest(String excelfilePath) {
		super(excelfilePath);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "E:\\Selenium\\Chetan Folder\\First-project\\webTableToExcel.xlsx";
		dataDrivenTest dt = new dataDrivenTest(path);
		int rowCount = dt.getRowCount(0);
		System.out.println("Total Row count\n"+rowCount);
		
		int colCount = dt.getColumnCount(0);
		System.out.println("Totol number of columns\n"+colCount);
		
		for(int i=1;i<rowCount;i++)
		{
			String name = dt.getData(0, i, 0);
			System.out.print(name+"|");
						
			String latName = dt.getData(0, i, 1);
			System.out.print(latName+"|");
			
			String mob = dt.getData(0, i, 2);
			System.out.println(mob+"|");
		}
		String name = dt.getData(0, 2, 1);
		System.out.println(name);
        dt.setData(0, 4, 0, "bh");
		Row row = dt.sheet.createRow(5);
		Cell cell = row.createCell(0);
		cell.setCellValue("Piyali");

		try {
			dt.writeFile(path);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
