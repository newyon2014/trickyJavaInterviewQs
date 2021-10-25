package TrickyQs.StaticBlock;

public class StaticBlockVsFinalVariable {

    // Final Variable will be called before the static method
    // Without the final keyword , the static block will be printed first

    public static void main(String[] args) {

        System.out.println(Main.x);


    }
}

class Main {
    public static final int x = 100;

    static {
        System.out.println("Main - Class static block");
    }

    {
        System.out.println("MInstance initialization block");
    }
}

