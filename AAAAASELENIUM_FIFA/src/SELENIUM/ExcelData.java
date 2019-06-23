package SELENIUM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class ExcelData extends BaseClass {

	public static void main(String[] args) throws Exception {
		File fr= new File("H:\\New folder\\TESTDATA.xlsx");
		FileInputStream fis = new FileInputStream(fr);
		XSSFWorkbookFactory factory  = new XSSFWorkbookFactory( fis);
		factory.ge

	}

}
