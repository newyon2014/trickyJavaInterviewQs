package TrickyQs;

public class DivideByZero {

    public static void main(String[] args) {

        System.out.println(9.0/0); // --> Infinity
        System.out.println(12.33f/0); // --> Infinity
        System.out.println(10/0.0); // --> Infinity
        System.out.println(10.99999d/0); // --> Infinity
      //  System.out.println(0/0); --> Arithmetic exception
        System.out.println(0.0/0); // --> NAN
        System.out.println(0.0/0.0); // --> NAN
        System.out.println(12.33/0.0); // --> Infinity
      //  System.out.println(9.0/0);
    }
}
