package TrickyQs.String;

public class PassNullWithMethdOverloading {

    public static void test(Object o) {
        System.out.println("Object Argument");
    }

    public static void test(String str) {
        System.out.println("String Argument");
    }

    //public static void test(StringBuffer str){ --> No direct relation between String / StringBuffer - throws ambiguous error
    // System.out.println("String Argument");
    // }


    public static void main(String[] args) {
        test(null); // --> this prints - "String Argument" - Compiler will check the most obvious data type
    }
}
