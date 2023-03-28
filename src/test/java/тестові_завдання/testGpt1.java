package тестові_завдання;

import java.util.Scanner;

public class testGpt1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        float ch1= scanner.nextInt();
        System.out.println("Введіть друге число: ");
        float ch2= scanner.nextInt();
        float sum=ch1+ch2;
        float riz=ch1-ch2;
        float dob=ch1*ch2;
        float chastca=ch1/ch2;
        System.out.println("Сума даних чисел дорівнює "+sum);
        System.out.println("Різниця даних чисел дорінює "+riz);
        System.out.println("Добуток цих чисел дорівнює "+dob);
        if (ch2==0.0f){
            System.out.println("На нуль ділити не можна!");
        }else {
            System.out.println("Частка цих чисел дорівнює " + chastca);
        }

    }
}
