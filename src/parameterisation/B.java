package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.reporters.jq.Main;

public class B {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Documents\\sheet1.xlsx");
		//fetch data from excel
		double num = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(num);
	}

}
