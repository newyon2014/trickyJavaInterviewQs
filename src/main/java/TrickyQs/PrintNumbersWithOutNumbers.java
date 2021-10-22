package TrickyQs;

public class PrintNumbersWithOutNumbers {

    /*
       Output number from 1...100 without using numbers in loop
     */

    public static void main(String[] args) {

        //Scenario 1 -
        int one = 'A'/'A'; // 1
        String s1 = ".........."; // length of ten

        for (int i = 1; i <= s1.length()* s1.length(); i++) {
            System.out.println(i);
        }

        //Scenario 2 -
        // ASCII - a - 98; b- 99 etc
        for (int i=one; i < 'd'; one++) {
            System.out.println(i);
        }


    }
}
