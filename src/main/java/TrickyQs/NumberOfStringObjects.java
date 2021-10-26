package TrickyQs;

public class NumberOfStringObjects {
    public static void main(String[] args) {

        // How many object the following statment create ?
        // -->  two objects will be created.
        // One in the heap memory and other one in the string constant memory pool (SCP)
        String n1 = new String("New World");

        // --> Only one object in the heap memory created
        // --> The other one already exist in the SCP
        String n2 = new String("New World");

        // the object s1 will point to the value in the SCP - string literal
        // No object created in heap
        String s1 = "Hello World";

        // the object s2 will point to the value in the SCP - string literal
        // No object created in heap
        String s2 = " Hello World";

        // Look at below list of code and give the number of object created - 3

        String string1 = "Hello World";
        String string2 = "Hello World";
        String string3 = string1;

        System.out.println(string1 == string2); // --> True
        System.out.println(string2 == string3); // --> True
        System.out.println(string1 == string3); // --> True

        String string4 = new String("Hello World");
        String string5 = new String("Hello World");

        System.out.println(string4 == string5); // --> False

        // Look at below list of code and give the number of object created - 2

        String string6 = "Hello World";
    }
}
