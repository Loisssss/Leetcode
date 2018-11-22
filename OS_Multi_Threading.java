// 1. Write a multi-threading Java program to accelerate the below sum of 1 to 100 program.
// 2. Write a two threads Java program that calculate sum of 1 to 100, one thread add even number, 
//    one thread add odd number, they must add alternately.


public class Main {

    public static void main(String[] args) {

        int sum100 = 0;

        for (int i = 0; i < 100; i++) {
            sum100 += i;
        }

        System.out.println(sum100);
    }
}
