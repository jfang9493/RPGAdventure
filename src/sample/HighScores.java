package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HighScores {
    public static void CSVUtilities(){
        String csvFile = "src/highscores.csv";
        String line = "";
        String cvsSplitBy = ",";
        List<String> names = new ArrayList<String>();
        List<Integer> scores = new ArrayList<Integer>();

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


}
