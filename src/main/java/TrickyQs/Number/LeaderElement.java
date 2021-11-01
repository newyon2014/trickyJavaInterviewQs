package TrickyQs.Number;

public class LeaderElement {

    public static void findLeaders(int[] num) {
        int max = num[num.length - 1];
        System.out.print(max + " ");

        for (int i = num.length - 2; i >= 0; i--) {
            if (num[i] > max) {
                max = num[i];
                System.out.print(max + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num [] = {92,7,12,9,8,3};
       findLeaders(num);
        System.out.println();
        int num2 [] = {92,11,10,9,8,14,3,3};
        findLeaders(num2);

    }
}
