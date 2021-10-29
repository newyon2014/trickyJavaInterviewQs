package TrickyQs.Number;

public class DoubleMinValue {
    /*
      What is the value of the double MIN_VALUE?
      Which one is bigger --> Double MIN_VALUE or 0.0d?
      Which one is bigger --> Double MIN_VALUE or NEGATIVE_INFINITY?
     */

    public static void main(String[] args) {
        // Question I
        System.out.println(Double.MIN_VALUE); // --> 4.9E-324
        // Extra
        System.out.println(Long.MIN_VALUE); // --> -9223372036854775808
        System.out.println(Integer.MIN_VALUE); // --> -2147483648

        // Question II
        System.out.println(Double.MIN_VALUE > 0.0d); // --> True
        //Extra
        System.out.println(Long.MIN_VALUE > 0.0d); // --> False
        System.out.println(Math.min(Integer.MIN_VALUE,0.0d)); // -->  -9223372036854775808
        System.out.println(Float.MIN_VALUE > 0.0f); // True

        //Question III
        System.out.println(Double.MIN_VALUE > Double.NEGATIVE_INFINITY); // --> True
    }
}
