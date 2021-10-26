package TrickyQs;

public class LongPluscharPlusintPluslong {
    public static void main(String[] args) {
        // Execution right to left

        int i = (byte) + (char) - (int) + (long) -1;
        System.out.println(i);

        int k = -(int) + (long) -1;
        System.out.println(k); // --> Output will be 1

        int j = (byte)1;
        System.out.println(j);
    }
}
