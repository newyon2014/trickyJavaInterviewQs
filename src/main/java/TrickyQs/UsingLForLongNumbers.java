package TrickyQs;

public class UsingLForLongNumbers {

    public static void main(String[] args) {
        long longNUmberWithOutL = 1000 * 60 * 60 * 24 * 365;
        // Compiler trim to the max allowable integer 2147483647 - 1471228928
        // Java will trim most significant bits to 32 from 36 bits without L
        System.out.println(longNUmberWithOutL);

        long longNUmberWithL = 1000 * 60 * 60 * 24 * 365L;
        System.out.println(longNUmberWithL); // --> 36 bits - 31536000000

    }
}
