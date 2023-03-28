package lesson1;

import javax.swing.text.Style;
import java.util.Scanner;

public class switch_op {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи свій вік для здачі тесту на водійське посвідчення");
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("Починай реєструватись!");
                break;
            case 17:
                System.out.println("Сходи спочатку в школу");
                break;
            case 6:
                System.out.println("Повернись до садочку");
                break;
            default :
                System.out.println("Лох введи або 6, або 17, або 18");
        }
    }
}
