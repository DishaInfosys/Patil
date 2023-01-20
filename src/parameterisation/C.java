package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Documents\\sheet1.xlsx");
		//fetch data from excel
		boolean bln = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(4).getBooleanCellValue();
		System.out.println(bln);
	}

}
