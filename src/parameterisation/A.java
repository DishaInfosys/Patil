package parameterisation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;


public class A {
public static void main(String[] args)throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\HP\\Documents\\sheet1.xlsx");
	//fetch data from excel
	String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	
	
//so we cant fetch different index values of excel in same program	
	/*double num = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(num);
	boolean bln = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(4).getBooleanCellValue();
	System.out.println(bln);*/
}
}
