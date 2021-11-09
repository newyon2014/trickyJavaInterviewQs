package TrickyQs.String;

public class SubStringWithMatches {

    public static boolean isSubstring1(String main, String sub) {
        return main.matches("(.*)" + sub + "(.*)");
    }

    public static boolean isSubstring2(String main, String sub) {
        return main.contains(sub);
    }
    public static boolean isSubstring3(String main, String sub) {
        return main.indexOf(sub)!=-1;
    }

    public static void main(String[] args) {

        System.out.println(isSubstring1("Testing Coding interview","Cod"));
        System.out.println(isSubstring2("Testing Coding interview","Cod"));
        System.out.println(isSubstring3("Testing Coding interview","Cod"));

    }
}
