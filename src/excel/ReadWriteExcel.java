package excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteExcel {
    public static void main(String[] args) {
        ReadWriteExcel obj = new ReadWriteExcel();
        //String un = obj.readExcel("User_Credential", 1, 0);
        //System.out.println("Username is : " + un);
        String pw = obj.readExcel("User_Credential", 1, 1);
        System.out.println("Password is : " + pw);
    }

    public void writeExcel(String sheetName, int rNum, int cNum, String DATA) {
        try {
            FileInputStream fis = new FileInputStream("C:/dev/TrainingCobaJava/myExcel.xlsx");
            Workbook wb =  WorkbookFactory.create(fis);
            Sheet s = wb.getSheet(sheetName);
            Row r = s.getRow(rNum);
            Cell c = r.createCell(cNum);
            c.setCellValue(DATA);
            FileOutputStream fos = new FileOutputStream("C:/dev/TrainingCobaJava/myExcel.xlsx");
            wb.write(fos);
        }catch (Exception e) {
            System.out.println("Read Excel catch block");
            e.printStackTrace();
        }
    }

    public String readExcel(String sheetName, int rNum, int cNum) {
        String data = "";

        try {
            FileInputStream fis = new FileInputStream("C:/dev/TrainingCobaJava/coba.xlsx");
            Workbook wb =  WorkbookFactory.create(fis);
            Sheet s = wb.getSheet(sheetName);
            Row r = s.getRow(rNum);
            Cell c = r.getCell(cNum);
            data = c.getStringCellValue();
        }catch (Exception e) {
            System.out.println("Read Excel catch block");
            e.printStackTrace();
        }
        return data;
    }
}
