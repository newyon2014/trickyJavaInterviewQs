package TrickyQs.Pattern;

public class RightJustfiedPatten {
    /*
                  *
                * *
              * * *
            * * * *
     */

    public static void main(String[] args) {

        for(int i=1 ; i<=4;i++){
            for (int j = 3; j >= i; j--) { // --> J to track the spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // --> k to track the stars
                System.out.print("*");
        }
            System.out.println();
        }
    }
}
