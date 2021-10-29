package TrickyQs.Number;

public class Integercaching {

    public static void main(String[] args) {
        /*
        Compare two integer numbers
         */

        // -127 to 128
        // Scenario 1 - Both are equal
        Integer num1 = 100;
        Integer num2 = 100;

        if(num1 == num2){
            System.out.println("Both are equal.");
        }else{
            System.out.println("Both are not equal.");
        }
        // Scenario 2 - Both are not equal
        Integer num3 = 128;
        Integer num4 = 128;

        if(num3 == num4){
            System.out.println("Both are equal.");
        }else{
            System.out.println("Both are not equal.");
        }
        // Scenario 3 - Both are  equal
        Integer num5 = -128;
        Integer num6 = -128;

        if(num5 == num6){
            System.out.println("Both are equal.");
        }else{
            System.out.println("Both are not equal.");
        }


    }
}
