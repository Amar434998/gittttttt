package sampledata;
import 	org.apache.poi.ss.usermodel.Sheet;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriventask{
	public static void main(String[] args) throws IOException {
		
		 File f = new File("Excel\\datadriven.xlsx");
	        Workbook b = new XSSFWorkbook();
	        Sheet sh1 = b.createSheet("drivenn");

	        Row r1 = sh1.createRow(0);

	        Cell c0R1 = r1.createCell(0);
	        Cell cC1 = r1.createCell(1);
	        Cell c3R1 = r1.createCell(2);

	        c0R1.setCellValue("Email");
	        cC1.setCellValue("Password");
	        c3R1.setCellValue("PhoneNo");

	        FileOutputStream k = new FileOutputStream(f);
	        b.write(k);
	        k.close();
	        b.close();
	    }
	}

	   
	   
	   
	
		
		
		
		
		
		
		
		
		
		
	
	
