/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyClass {

    public static void main(String[] args) {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\arryg\\Documents\\Courses\\Spring\\hallo\\data.txt");

        String match, team1, team2, score1, score2;
        int leagueTotal = 0;
        int position = 0;
        TreeMap<String, Integer> scoreboard = new TreeMap<>();

        String[] sides, l1, l2;
        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
     //   Map<String, Integer> map = new TreeMap<>();

        while (sc.hasNextLine()) {

            leagueTotal = 0;
            match = sc.nextLine();
            sides = match.split(",");
            l1 = sides[0].split(" ");
            team1 = l1[0];
            score1 = l1[1];

            l2 = sides[1].split(" ");
            team2 = l2[0];
            score2 = l2[1];

            int teamScore1 = Integer.parseInt(score1);
            int teamScore2 = Integer.parseInt(score2);

            // update the scoreboard
//            if (teamScore1 > teamScore2) {
//
////                        leagueTotal +=3;
//                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 3);
////                        scoreboard.put(team1,leagueTotal);
//            } else if (teamScore1 < teamScore2) {
////                       leagueTotal +=3;
//                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 3);
//            } else {
////                            leagueTotal++;
//                scoreboard.put(team1, scoreboard.getOrDefault(team1, leagueTotal) + 1);
//                scoreboard.put(team2, scoreboard.getOrDefault(team2, leagueTotal) + 1);
//            }
//        }
//
//        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
//
//        scoreboard.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
////                .sorted(Map.Entry.comparingByKey())
//                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
//
//        System.out.println("Rankings: " + reverseSortedMap);
    }
}