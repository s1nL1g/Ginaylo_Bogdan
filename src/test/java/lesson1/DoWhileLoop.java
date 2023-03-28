package lesson1;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int mi;
        do{
            System.out.println("Пройдіть, будь ласка, капчу (напишіть у полі 545)");
            mi = scanner.nextInt();
        }while(mi != 545);
        System.out.println("Вітаю, ви пройшли капчу!");
    }
}
