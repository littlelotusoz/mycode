package TrainingPackage;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class MyArray {
	
	String FilePath = "path";
	FileInputStream fs = new FileInputStream(FilePath);
	Workbook wb = Workbook.getWorkbook(fs);
	Sheet sh = wb.getSheet(0);

	int rows = sh.getRows();
	int cols = sh.getColumns();
	int a = 0;
	for(int i=0; i <= cols; i++) {
		
		if(i == cols)
		{
			a++;
			for(int k=0; k<cols; k++ ) 
				
			{
				System.out.println(sh.getCell(k, a).getContents());	
			}
			
		}
		else 
			{ 	
			System.out.println(sh.getCell(i,a).getContents());
			}

}
