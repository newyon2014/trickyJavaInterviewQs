package TrickyQs.StaticBlock;

public class StaticBlockQuestions {

    public static void main(String[] args) {
        //Q1. Explain static blocks in Java
            // Can have one to any number of blocks
            // will be executed before main method

        //Q2. How can we run a java program without creating an object?
            // using by name or by class name.
            // or insert execution code in the static block

        //Q3. Similarity between static block and static method
        // static block called automatically on the moment class loaded vs static method need to be called explicitly
        // U can call static method from another static method ( aka cover method)

        //Q4. How can we create objects if we make the constructor private?
        // You can initiatiate the object in the static block
        // Create a static method and put the intiatiate code in the method

        //Q5. Is it possible to compile and run a java program without the main method ?
        // Yes. We can use a static block
        // static { System.out.println("Main - Class static block");}
        //Q6. can we initialize member variable within a static block?
        // Yes - for non-static variables
        // String name;
        // static { classObject object = new classObject();
        //          object.name = "Interview";
        //             }
        //  For static member variable
        //  static int age;
        // static { age = 30}

    }
}
