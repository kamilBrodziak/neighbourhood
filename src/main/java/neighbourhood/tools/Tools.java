package neighbourhood.tools;

import com.sun.deploy.util.StringUtils;

import java.util.*;

public class Tools {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static List<String> transformMapIntoStringList(Map<String, Integer> map) {
        List<String> strings = new ArrayList<String>();
        for(String key: map.keySet()) {
            strings.add(key);
            strings.add(map.get(key) + "");
        }
        return strings;
    }

    public static List<String> concateneteLists(List<String> listA, List<String> listB) {
        for(String s: listB) {
            listA.add(s);
        }
        return listA;
    }

    public static int getLongestStringSizeFromSet(Set<String> set) {
        int longestSize = 0;
        for(String s: set) {
            int sLen = s.length();
            if(sLen > longestSize) {
                longestSize = sLen;
            }
        }
        return longestSize;
    }

    public static int getLongestStringSizeFromIntCollection(Collection<Integer> collection) {
        int longestSize = 0;
        for(int i: collection) {
            int sLen = (i + "").length();
            if(sLen > longestSize) {
                longestSize = sLen;
            }
        }
        return longestSize;
    }

    public static List<Integer> getColumnsLength(List<ArrayList<String>> list) {
        List<Integer> columnsLen = new ArrayList<Integer>();

        for(int i = 0; i < list.get(0).size(); ++i) { columnsLen.add(0); }

        for(List<String> innerList: list) {
            for(int i = 0; i < innerList.size(); ++i) {
                int currStatLen = innerList.get(i).length();
                if(currStatLen > columnsLen.get(i)) {
                    columnsLen.set(i, currStatLen);
                }
            }
        }

        return columnsLen;
    }

    public static String centerString(String string, int length) {
        length -= string.length();
        while(length > 0) {
            string = " " + string;
            --length;
            if(length > 0) {
                string += " ";
                --length;
            }
        }
        return string;
    }

    public static String leftAllignString(String string, int length) {
        length -= string.length();
        while(length > 0) {
            string += " ";
            --length;
        }
        return string;
    }

    public static String rightAllignString(String string, int length) {
        length -= string.length();
        while(length > 0) {
            string = " " + string;
            --length;
        }
        return string;
    }

    public static String multiplyString(String string, int count) {
        count -= string.length();
        String outString = string;
        while(count > 0) {
            outString += string;
            count = count - 1;
        }
        return outString;
    }
}
