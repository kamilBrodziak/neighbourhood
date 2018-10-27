package neighbourhood.parsers;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CSVParser {

    public String parse(String path) {
        String parsedCSV = "";

        try {
            Scanner CSVScanner = new Scanner(new File(path));
            if(CSVScanner.hasNextLine()) {
                CSVScanner.nextLine();
            }
            while(CSVScanner.hasNextLine()) {
                parsedCSV += CSVScanner.nextLine() + ";";
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
            return parsedCSV;
        }
}

