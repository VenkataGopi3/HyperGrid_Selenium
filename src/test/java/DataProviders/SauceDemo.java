package DataProviders;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class SauceDemo {

    @Test
    public void readDataFromExcel() throws Exception{

        File file = new File(System.getProperty("user.dir")+"/src/main/resources/UsersData.xlsx");
        System.out.println(file);
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println(fileInputStream);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Credentials");
        System.out.println(sheet);

        int rowNumber = 0, columnNumber = 0;
        for(Row row :sheet ){
            Cell cell = row.getCell(1);
            System.out.println(cell);
            if(cell.getStringCellValue().equals("performance_glitch_user")){
                rowNumber = row.getRowNum();
                System.out.println(rowNumber);
                break;
            }
        }
        for(Cell cell: sheet.getRow(rowNumber)){
            if (cell.getStringCellValue().equals("Performance_Glitch")){
                columnNumber = cell.getColumnIndex();
//                System.out.println(columnNumber);
                System.out.println("columnNumber :: "+ columnNumber);
            }
        }
        String userNameForSheet = sheet.getRow(rowNumber).getCell(columnNumber).toString();
        System.out.println(userNameForSheet);
    }
}
