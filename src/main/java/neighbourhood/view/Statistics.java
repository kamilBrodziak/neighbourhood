package neighbourhood.view;

import neighbourhood.tools.Tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Statistics {
    private static final int OUTER_FRAMES_AMOUNT = 2;

    public static void showStatistics(List<ArrayList<String>> rows, ArrayList<String> tableHeaders) {
        Tools.clearScreen();
        if(rows.size() == 0) {
            System.out.println("No records found.");
            return;
        }

        int statisticsColAmount = rows.get(0).size();
        int headersColAmount = tableHeaders.size();
        List<ArrayList<String>> rowsToAnalyze = rows;
        if(rows.get(0).size() == tableHeaders.size()) {
            rowsToAnalyze.add(tableHeaders);
        }

        List<Integer> columnsLength = Tools.getColumnsLength(rowsToAnalyze);
        int tableWidth = OUTER_FRAMES_AMOUNT + columnsLength.size() - 1;
        for(int len: columnsLength) {
            tableWidth += len;
        }


        printHeaderPart(tableHeaders, columnsLength, tableWidth);
        printRowsPart(rows, columnsLength, tableWidth);

        Scanner backMenu = new Scanner(System.in);
        if(backMenu.hasNextLine()) {
            backMenu.nextLine();
        }

    }

    private static void printHeaderPart(List<String> tableHeaders, List<Integer> columnsLength, int tableWidth) {
        System.out.println(Tools.multiplyString("█", tableWidth));
        System.out.println("█" + Tools.multiplyString(" ", tableWidth - OUTER_FRAMES_AMOUNT) + "█");

        if (tableHeaders.size() == 1) {
            printHeader(tableHeaders.get(0), tableWidth - OUTER_FRAMES_AMOUNT);
        } else if(tableHeaders.size() == columnsLength.size()) {
            printHeaders(tableHeaders, columnsLength);
        }
        System.out.println("█");

        System.out.println("█" + Tools.multiplyString(" ", tableWidth - OUTER_FRAMES_AMOUNT) + "█");
        System.out.println(Tools.multiplyString("█", tableWidth));
    }

    private static void printHeader(String header, int length) {
        System.out.print("█" + Tools.centerString(header, length));
    }

    private static void printHeaders(List<String> tableHeaders, List<Integer> columnsLength) {
        for(int i = 0; i < tableHeaders.size(); ++i) {
            printHeader(tableHeaders.get(i), columnsLength.get(i));
        }
    }

    private static void printRowsPart(List<ArrayList<String>> rows, List<Integer> columnsLength, int tableWidth) {
        for(List<String> row: rows) {
            printDecor(columnsLength);
            printRow(row, columnsLength);
            printDecor(columnsLength);
            System.out.println(Tools.multiplyString("█", tableWidth));
        }
    }

    private static void printDecor(List<Integer> columnsLength) {
        for(int i = 0; i < columnsLength.size(); ++i) {
            System.out.print("█" + Tools.multiplyString(" ", columnsLength.get(i)));
        }
        System.out.println("█");
    }

    private static void printRow(List<String> row, List<Integer> columnsLength) {
        int rowSize = row.size();
        for(int i = 0; i < rowSize; ++i) {
            if(rowSize == 2 && i == 0)
                System.out.print("█" + Tools.rightAllignString(row.get(i), columnsLength.get(i)));
            else if(rowSize == 2 && i == 1) {
                System.out.print("█" + Tools.leftAllignString(row.get(i), columnsLength.get(i)));
            } else {
                System.out.print("█" + Tools.centerString(row.get(i), columnsLength.get(i)));
            }
        }
        System.out.println("█");
    }
}
