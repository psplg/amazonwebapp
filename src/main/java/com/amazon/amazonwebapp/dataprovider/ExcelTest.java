package com.amazon.amazonwebapp.dataprovider;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelTest {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void tester()	
	{
	System.out.println("Started");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("testsheet");
		
		Map<String, Object[]> sheetData = new TreeMap<>();
		sheetData.put("1", new Object[] {"First Name", "Last Name", "Age"});
		sheetData.put("1", new Object[] {"Puneet", "Sapaliga", 26});
		sheetData.put("2", new Object[] {"Rakshit", "Sapaliga", 20});
		sheetData.put("2", new Object[] {"Pradeep", "Sapaliga", 29});
		
		Set<String> keySet = sheetData.keySet();
		int rowNum=0;
		
		for(String key:keySet)
		{
			Row sheetRow = sheet.createRow(rowNum++);
			Object[] objArr = sheetData.get(key);
			
			int colNum=0;
			
			for(Object obj: objArr)
			{
				Cell cell = sheetRow.createCell(colNum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		
		try
		{
			FileOutputStream fos = new FileOutputStream(new File("D:/IMP/xp/testwb.xlsx"));
			workbook.write(fos);
			fos.close();
			System.out.println("done");
		}
		catch(IOException ioe)
		{
			System.out.println("excp");
		}
		
		System.out.println("Ended");
	}

}
