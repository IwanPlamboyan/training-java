package excel;

import java.io.FileWriter;

public class CreateCsvFile {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Name").append(",").append("address").append(",").append("country").append("\n");
        stringBuilder.append("Iwan").append(",").append("Bandung").append(",").append("Indonesia").append("\n");
        stringBuilder.append("John").append(",").append("Garut").append(",").append("Indonesia").append("\n");

        try(FileWriter writer = new FileWriter("tmp/coba.csv")) {
            writer.write(stringBuilder.toString());
            System.out.println("CSV file created...");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
