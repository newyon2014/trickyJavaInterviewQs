package TrickyQs.StaticBlock;

public class StaticBlockVsInstanceBlock {

        // Out put will be :
        // "static block"
        // "Instance initialization block"
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
