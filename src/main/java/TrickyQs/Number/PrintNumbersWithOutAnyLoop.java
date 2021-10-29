package TrickyQs.Number;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintNumbersWithOutAnyLoop {

    /*
          print 1 to 100 without using any loop
     */

    public static void main(String[] args) {

        //1. using recursive
        printNum(1);
        //2. Using Java Streams
        printNum2(1);
        //3. Using Array fill
        Object num [] = new Object[100];
     //   Arrays.fill(num,new Object()){
       //     int count = 0;
       //     @Override
      //      public String toString(){
      //            return Integer.toString(count++);
  //          }
        };


    //2. Using Java Streams
    private static void printNum2(int num) {
        IntStream.rangeClosed(num,100)
                .forEach(System.out::println);
    }
    //1. using recursive
    private static void printNum(int num) {
       if (num <= 100){
           System.out.println(num);
           num++;
           printNum(num);
       }
    }
}
