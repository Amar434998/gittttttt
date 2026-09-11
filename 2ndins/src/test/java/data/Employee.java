package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\amar4\\eclipse-workspace\\2ndins\\excel\\empdata.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s1 = w.getSheet("sheet1");
		for(int i=0;i<s1.getPhysicalNumberOfRows();i++) {
		Row r = s1.getRow(i);
		for(int j=0;i<r.getPhysicalNumberOfCells();j++) {
			Cell c = r.getCell(j);
			
			if (c.getCellType() == CellType.STRING){
				String s = c.getStringCellValue();
				System.out.println(s);
			}else if(DateUtil.isCellDateFormatted(c));
			Date date = c.getDateCellValue();
			SimpleDateFormat d = new SimpleDateFormat("dd,MMM-YYYY");
			String save = d.format(date);
			System.out.println(save);
 {
				
				
			}
			
		}
		
		
		}
		
		
		
		
		
		
	}

	

}
