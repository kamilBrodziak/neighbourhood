package neighbourhood.parsers;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CSVParser {

    public String parse(File file) {
        String parsedCSV = "";

        try {
            Scanner CSVScanner = new Scanner(file);
            if(CSVScanner.hasNextLine()) {
                CSVScanner.nextLine();
            }
            while(CSVScanner.hasNextLine()) {
                parsedCSV += CSVScanner.nextLine() + "\n";
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
            return parsedCSV;
        }
}

