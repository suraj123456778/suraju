package genericscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class genericxl1 {

	public static String getdata(String Sheet, int row, int cell) throws EncryptedDocumentException, IOException, InvalidFormatException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\manoj\\eclipse\\hybrid\\excel\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Cell cel = book.getSheet(Sheet).getRow(row).getCell(cell);
		String va = cel.getStringCellValue();
				
		return va;
	}
}