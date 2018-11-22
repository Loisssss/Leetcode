// 1. Write a multi-threading Java program to accelerate the below sum of 1 to 100 program.

public class Main {

    public static void main(String[] args) {

        int sum100 = 0;

        for (int i = 0; i < 100; i++) {
            sum100 += i;
        }

        System.out.println(sum100);
    }
}
