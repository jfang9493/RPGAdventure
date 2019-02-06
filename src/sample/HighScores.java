package sample;

import java.io.BufferedReader;

public class HighScores {
    String csvFile = "/highscores.csv";
    String delimiter = ",";

    BufferedReader br;
     /** try {
        br = new BufferedReader(new FileReader(CsvFile));

        String line;
        while ((line = br.readLine()) != null) {
            String[] fields = line.split(FieldDelimiter, -1);

            Record record = new Record(fields[0], fields[1], fields[2],
                    fields[3], fields[4], fields[5]);
            dataList.add(record);

        }

    } catch (FileNotFoundException ex) {
        Logger.getLogger(JavaFXCSVTableView.class.getName())
                .log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(JavaFXCSVTableView.class.getName())
                .log(Level.SEVERE, null, ex);
    } **/
}
