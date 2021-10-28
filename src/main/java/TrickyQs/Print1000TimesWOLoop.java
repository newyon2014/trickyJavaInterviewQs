package TrickyQs;

public class Print1000TimesWOLoop {

    public static void main(String[] args) {

        String name = "Interview";
        String s = "i";
        s = s.replaceAll("i","iiiiiiiiii"); // 10
        s = s.replaceAll("i","iiiiiiiiii"); // 10X10 = 100
        s = s.replaceAll("i","iiiiiiiiii"); // 100X10 = 1000

       s= s.replaceAll("i", name + "\n");

        System.out.println(s);



    }
}
