package TrickyQs.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GetLineWordCharCountInFile {
    static String path = "/desktop/demo.txt";
    static BufferedReader reader = null;


    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        HashMap<String,Integer> wordMap = new HashMap<>();
        try {
            reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine();
            while(currentLine!=null){
                //LineCount
                lineCount++;

                //Word Count
                String word [] = currentLine.split(" ");
                wordCount += word.length;

                //Char Count
                for (String w:word) {
                    charCount+=w.length();
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



    }
}
