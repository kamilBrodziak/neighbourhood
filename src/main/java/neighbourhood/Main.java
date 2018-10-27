package neighbourhood;

import neighbourhood.dao.MalopolskaDAO;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        MalopolskaDAO dao = new MalopolskaDAO("/home/kamil/Java/neighbourhood/src/main/java/neighbourhood/resources/malopolska.csv");
        try {
            dao.extractInformation();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<String, String> kok = dao.getCounties();


        for(String k: kok.keySet()) {
            System.out.println(k + " " + kok.get(k));
        }
        System.out.println(kok.size());

    }
}
