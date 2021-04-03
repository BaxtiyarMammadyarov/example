package az.mycompany.javalessons.javaexcel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WriteExcelFile {
    public static void main(String[] args) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[]{"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[]{1, "Amit", "Shukla"});
        data.put("3", new Object[]{2, "Lokesh", "Gupta"});
        data.put("4", new Object[]{3, "John", "Adwards"});
        data.put("5", new Object[]{4, "Brian", "Schultz"});

        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        rownum = sheet.getLastRowNum();
        Row row = sheet.createRow(rownum);
        Cell cell = row.createCell(1);
        cell.setCellValue(String.valueOf(data.get("1")));

        try {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("D:\\project\\example\\src\\main\\java\\az\\mycompany\\javalessons\\javaexcel\\test.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

