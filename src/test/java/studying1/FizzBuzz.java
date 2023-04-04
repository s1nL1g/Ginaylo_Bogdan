package studying1;

public class FizzBuzz {
    int a;

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }
        }

    }
}
//            3 FIZZ
//            5 BUZZ
//            3&5 FIZZBUZZ
