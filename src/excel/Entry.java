package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Entry {
    public static void createExcel() throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("TAB");

        Object[][] book = {
            {"coba1", "coba2", 9},
            {"coba1", "coba2", 9},
            {"coba1", "coba2", 9},
            {"coba1", "coba2", 9},
        };

        int countrow = 0;

        for (Object[] libro: book) {
            Row row = sheet.createRow(++countrow);
            int col = 0;
            for (Object field: libro) {
                Cell cel = row.createCell(++col);
                if(field instanceof String) {
                    cel.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cel.setCellValue((Integer) field);
                }
            }
        }

        String myExcel = "C:/dev/TrainingCobaJava/myexcel.xls";
        FileOutputStream fo = new FileOutputStream(myExcel);
        wb.write(fo);
        wb.close();
        fo.close();
    }

    public static void main(String[] args) throws IOException {
        createExcel();
    }
}
