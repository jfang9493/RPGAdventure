package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HighScores {

    private static List<String> names = new ArrayList<String>();
    private static List<Integer> scores = new ArrayList<Integer>();

    public static void CSVUtilities(){
        String csvFile = "src/highscores.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] line1 = line.split(cvsSplitBy);
                names.add(line1[0]) ;
                scores.add(Integer.parseInt(line1[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names);
        System.out.println(scores);

    }

    public void printHighScoreList(){
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i) + "   " + scores.get(i) + "\n");
        }
    }


}
