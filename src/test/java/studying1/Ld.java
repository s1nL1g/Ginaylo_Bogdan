package studying1;

import java.util.Scanner;

public class Ld {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Введіть, будь ласка,будь яке число:");
        int i=s.nextInt();
        int rez=factorial(i);
        System.out.println("Факторіал числа "+i+" = "+rez);

    }
    public static int factorial(int i){
        if (i==0){
            return 1;
        }else{
            return i*factorial(i-1);
        }

    }
}
