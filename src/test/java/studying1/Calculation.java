package studying1;

public class Calculation {

    public  int sum(int a, int b) {
        return a+b;
    }

    public  int subtract (int a , int b) {
        return a-b;
    }


    public static void main(String[] args) {
        Person p1= new Person(20,"Vitya");
        Calculation cal = new Calculation();
        System.out.println( cal.sum(6, 8));
        p1.printInfo();
    }
}
