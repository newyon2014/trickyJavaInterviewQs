package TrickyQs;

public class NotanumberNAN {

    public static void main(String[] args) {
        //  System.out.println(2/0); --> Arithmetic exception
        System.out.println(2.0 / 0.0); // --> Infinity
        System.out.println(0.0 / 0.0); // --> NaN
        System.out.println(Math.sqrt(-1)); // --> NaN
        System.out.println(Float.NaN == Float.NaN); // --> False
        double nan = 2.1 % 0;
        System.out.println(nan); // --> NaN
        System.out.println(nan==nan); // --> False
    }
}
