package TrickyQs.String;

import java.util.StringJoiner;

public class _StringJoiner {

    public static void main(String[] args) {
        // [Lisa,Tom,Kevin] --> Expected out put
        //String Joiner --> Constructor used with delimiter , prefix , suffix
        //  StringJoiner sj = new StringJoiner(",","[","]");
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("Tom")
                .add("Lisa");
        System.out.println(sj.toString());

    }
}
