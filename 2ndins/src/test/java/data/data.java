package data;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import base1.*;

public class data extends base1 {

    public static String readData(int row, int col) throws Exception {
       // File f = new File("C:\\Users\\amar4\\eclipse-workspace\\2ndins\\excel\\2ndbook.xlsx");
    	 File f = new File("C:\\Users\\amar4\\eclipse-workspace\\2ndins\\excel\\DATA1.xlsx");
    	FileInputStream read = new FileInputStream(f);

        Workbook access = new XSSFWorkbook(read);
        Sheet s1 = access.getSheet("sheet1");
        Row r = s1.getRow(row);
        Cell c = r.getCell(col);
        DataFormatter df = new DataFormatter();
        String value = df.formatCellValue(c);

        access.close();
        return value;
    }
}
