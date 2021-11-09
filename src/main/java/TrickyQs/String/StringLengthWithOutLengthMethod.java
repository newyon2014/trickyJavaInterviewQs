package TrickyQs.String;

public class StringLengthWithOutLengthMethod {

    public static void main(String[] args) {
        String str = "Interview";

        // Converting to char array
        System.out.println(str.toCharArray().length);

        //using lastindexOf method
        System.out.println(str.lastIndexOf(""));

        //using Split method
        System.out.println(str.split("").length);

        //using loop
        int count = 0;
        for (Character c:str.toCharArray()) {
            count++;
            System.out.println(count);
        }
    }
}
