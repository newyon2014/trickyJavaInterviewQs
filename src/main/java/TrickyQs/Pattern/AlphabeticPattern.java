package TrickyQs.Pattern;

public class AlphabeticPattern {
    /*
          A
          B B
          C C C
          D D D D

     */

    public static void main(String[] args) {
        int alpha = 65; // --> ASCII for Upper case A

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) alpha + " ");
            }
            alpha++;
            System.out.println();
           }

    }
}
