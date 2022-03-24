package by.rw.bird1974;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWinner {

    public static void main(String[] args) {

        List<String> competitors = new ArrayList<>();
        competitors.add("Ivan 5");
        competitors.add("Petr 3");
        competitors.add("Alex 10");
        competitors.add("Petr 8");
        competitors.add("Ivan 6");
        competitors.add("Alex 5");
        competitors.add("Ivan 1");
        competitors.add("Alex 1");
        competitors.add("Petr 5");

        showWinner(competitors);
    }

    public static void showWinner(List<String> competitors){
        Map<String, Integer> compMap = new HashMap<>();
        String winner = "";
        int maxScore = 0;
        for (String competitor: competitors) {
            String[] score = competitor.split(" ");
            String curName = score[0];
            Integer curScore = Integer.parseInt(score[1]);
            if (compMap.containsKey(curName)){
                compMap.put(curName, compMap.get(curName) + curScore);
            } else {
                compMap.put(curName, curScore);
            }
            if (compMap.get(curName) > maxScore) {
                winner = curName;
                maxScore = compMap.get(curName);
            }
        }
        System.out.println(winner);

    }


}
