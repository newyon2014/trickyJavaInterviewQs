package TrickyQs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GetMaxWordCountInFile {
    static String path = "/desktop/demo.txt";
    static BufferedReader reader = null;

    public static void main(String[] args) {

        HashMap<String,Integer> wordCount = new HashMap<>();
        try {
            reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine();
            while(currentLine!=null){
                String word [] = currentLine.split(" ");
                for (String s:word) {
                    if (!s.isEmpty()) {
                        if (!wordCount.containsKey(s)) {
                            wordCount.put(s, 1);
                        } else {
                            wordCount.put(s, wordCount.get(s) + 1);
                        }
                    }
                }
                currentLine = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Putting the max word count in the max map
        HashMap<String,Integer> maxMap = new HashMap<>();

        wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() == Collections.max(wordCount.values()))
                .forEach(entry -> maxMap.put(entry.getKey(),entry.getValue()));


    }
}
