package ExcelDataProvide;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SauceLabApplication {

    public static void main(String[] args) throws Exception {

        File file = new File(System.getProperty("user.dir")+"/src/main/resources/UsersData.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Credentials");

        int rowNumber = 0, columnNumber = 0;
        for(Row row:sheet){
            Cell cell = row.getCell(0);
            System.out.println(cell);
            if(cell.getStringCellValue().equals("Standard")){
                rowNumber  = row.getRowNum();
                System.out.println("rowNumber :: "+ rowNumber);
            }
        }
        for (Cell cell: sheet.getRow(0)){
            if (cell.getStringCellValue().equals("UserName")){
                columnNumber = cell.getColumnIndex();
                System.out.println("columnNumber :: "+columnNumber);
            }
        }
        String visualUser = sheet.getRow(rowNumber).getCell(columnNumber).toString();
        System.out.println(visualUser);

    }
}
