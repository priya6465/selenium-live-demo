package com.qa.tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static Object[][] readExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getLastRowNum();          // number of rows (excluding header)
        int colCount = sheet.getRow(0).getLastCellNum(); // number of columns

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 1; i <= rowCount; i++) {          // assuming first row is header
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            data[i-1][j] = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            data[i-1][j] = cell.getNumericCellValue();
                            break;
                        case BOOLEAN:
                            data[i-1][j] = cell.getBooleanCellValue();
                            break;
                        default:
                            data[i-1][j] = cell.toString();
                    }
                } else {
                    data[i-1][j] = "";
                }
            }
        }

        workbook.close();
        fis.close();
        return data;
    }

    public static void main(String[] args) throws IOException {
        Object[][] excelData = readExcelData("C:\\Users\\FCI\\Desktop\\Book1.xlsx", "Sheet1");
        for (Object[] row : excelData) {
            for (Object cellValue : row) {
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }
    }
}
