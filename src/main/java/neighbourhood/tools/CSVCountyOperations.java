package neighbourhood.tools;

import java.util.Iterator;

public class CSVCountyOperations {

    public static String deleteNonWordChars(String str) {
        String output = "";

        LineIterator lineIter = new CSVCountyOperations().new LineIterator(str);

        while(lineIter.hasNext()) {
            output += lineIter.next() + ";";
        }

        return output;
    }

    private class LineIterator implements Iterator {
        private int i = 0;
        private String str;

        public LineIterator(String str) {
            this.str = str;
        }

        public boolean hasNext() {
            return str.length() > i;
        }

        public String next() {
            avoidNonLetter();
            String nextLine = str.substring(i, str.indexOf(";", i));
            i += nextLine.length() + 2;
            return nextLine;
        }

        public void remove() {}

        private void avoidNonLetter() {
            while(!Character.isLetter(str.charAt(i))) {
                ++i;
            }
        }
    }
}
