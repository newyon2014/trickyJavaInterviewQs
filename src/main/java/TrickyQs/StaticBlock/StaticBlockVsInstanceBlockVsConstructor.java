package TrickyQs.StaticBlock;

public class StaticBlockVsInstanceBlockVsConstructor {

    public StaticBlockVsInstanceBlockVsConstructor() {
        System.out.println("Constructor");
    }

    // Out put will be :
        // "static block"
        // "Main Method"
        // "Instance initialization block"
        // "Constructor"
        static {
            System.out.println("static block");
        }

        {
            System.out.println("Instance initialization block");
        }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
