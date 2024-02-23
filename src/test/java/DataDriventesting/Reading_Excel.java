package DataDriventesting;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.testng.annotations.Test;

public class Reading_Excel {

	@Test
	void Reading() throws IOException{
	
		FileInputStream  file= new FileInputStream("C:\\Users\\siri\\eclipse-workspace\\mytesting1\\TestData\\read.xlsx");
		
		 XSSFworkbook workbook= new XSSFWorkbook(file);
		
		 XSSFSheet sheet= workbook.getsheet("Sheet1");
		
		int totalrow=sheet.getlastRowNum();
		int totalCells=sheet .getRow(1).getlastCellNum();//
		
		System.out.println(totalrow);
		System.out.println(totalCells);
		
		for(int r=0;r<totalrow;r++){
	
			XSSFRow Currentrow=sheet.getRow(r); 
			 
			for(int c=0;c<totalCells;c++){
			
			  String values=Currentrow.getCell(c).toString();
			System.out.println(values+"    ");
			
		
		}	
	        System.out.println();
			
			
	
		}
			
			
			
			
			
			
	
	
	
	
	
	
	
}
