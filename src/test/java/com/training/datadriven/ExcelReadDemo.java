package com.training.datadriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("Opening Excel file...");

        FileInputStream file = new FileInputStream("test-data/LoginData.xlsx");

        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Login");

        // Verify row and cell exist before reading data
        if (sheet.getRow(1) != null && sheet.getRow(1).getCell(0) != null) {

            String username = sheet.getRow(1).getCell(0).getStringCellValue();
            String password = sheet.getRow(1).getCell(1).getStringCellValue();

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } else {
            System.err.println("Row or cell is empty in Excel sheet");
        }

        workbook.close();
        file.close();
    }
}