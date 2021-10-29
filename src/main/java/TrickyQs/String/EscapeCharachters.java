package TrickyQs.String;

public class EscapeCharachters {

    /*
         Print the following strings
            /"Hello"/
            /'Hello'/
            '/'Hello'/'
            "Hello"
             I love "Java" and "Programming" and "Movies"
            'I love "Java" and "Programming" and "Movies"'
          */
    public static String getXPath(String name){
         //input[@id='interview'];
    String xPath =  "//input[@id='" + name + "']";
    return xPath;

    }
    public static void main(String[] args) {
        System.out.println(getXPath("interview"));

        System.out.println("/\"Hello\"/"); //--> /"Hello"/

        System.out.println("/'Hello'/"); // -->  /'Hello'/

        System.out.println("\'/'Hello'/\'"); //--> '/'Hello'/'

        System.out.println("\"Hello\""); // --> "Hello"

        System.out.println("I love \"Java\" and \"Programming\" and \"Movies\"");
                           // --> I love "Java" and "Programming" and "Movies"

        System.out.println("'I love \"Java\" and \"Programming\" and \"Movies\"'");
                           // --> 'I love "Java" and "Programming" and "Movies"'
    }
}
