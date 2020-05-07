package com.hackerone.lookermock.util;

import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvReader {

    private static final String COMMA_DELIMITER = ",";

    public static String readCsv() throws FileNotFoundException {
        List<List<String>> records = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(ResourceUtils.getFile("classpath:static/usernames.csv"))) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(getRecordFromLine(scanner.nextLine()));
            }
        }
        String csv = stringBuilder.toString();
        return csv.substring(0, csv.length() - 1);
    }

    private static String getRecordFromLine(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            while (rowScanner.hasNext()) {
                stringBuilder.append(rowScanner.next());
                stringBuilder.append(",");
            }
        }
        String row = stringBuilder.toString();
        return row.substring(0, row.length() - 1) + "\n";
    }
}
