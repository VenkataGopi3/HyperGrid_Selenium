package SauceDemoAutomationTestingFramework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;


public class ReadDataFromExcelFile {
    @Test(dataProvider = "userCredentials")
    public void sauceLabDemoLogin(String userType,String username, String password){
        System.out.println(userType + " :: " + username + " :: " + password);
//        System.out.println("***********************************");

    }

    @DataProvider(name = "userCredentials")
    public Object[][] readDataFromExcelFile() throws Exception{
        File file = new File(System.getProperty("user.dir")+"/src/main/resources/UsersData.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workBookExcel = new XSSFWorkbook(fileInputStream);
        XSSFSheet credentails = workBookExcel.getSheet("Credentials");
        System.out.println(credentails);
        System.out.println("***********************************");
        int numberOfRows = credentails.getPhysicalNumberOfRows();
        int numberOfColumns = credentails.getRow(0).getPhysicalNumberOfCells();
        System.out.println(numberOfRows);
        System.out.println(numberOfColumns);
        System.out.println("***********************************");

        String[][] dataValues = new String[numberOfRows][numberOfColumns];
        for (int i=0; i<numberOfRows; i++){
            for (int j=0; j<numberOfColumns; j++){
                Cell cell = credentails.getRow(i).getCell(j);
                dataValues[i][j] = cell.getStringCellValue();
            }
        }

        for (String[] data: dataValues){
            System.out.println(Arrays.toString(data));
        }
        return dataValues;
    }

}
