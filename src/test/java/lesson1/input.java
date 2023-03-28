package lesson1;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть, будь ласка,Exhaustive ваш вік нижче:");
        int I = s.nextInt();
        if (I >= 18){
            System.out.println("Проходьте, будь ласка!");
        }else {
            System.out.println("Вибачте, але неповнолітнім вхід заборонено!");
        }
    }
}
