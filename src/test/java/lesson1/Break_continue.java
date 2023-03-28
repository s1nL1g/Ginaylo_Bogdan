package lesson1;

public class Break_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i%2 == 0){
                continue;
            }
            System.out.println(i + " - непарне число");
        }
    }}