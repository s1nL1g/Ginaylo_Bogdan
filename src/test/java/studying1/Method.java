package studying1;

public class Method {
    public static void main(String[] args) {
        System.out.println(calculateCircleSquare(6.7));
    }
    public static final double PI = 3.14;
 public static double calculateCircleSquare(Double radius){
        return PI*radius*2;
 }
 public static double calculateCylinderSquare(double radius,double height){
     return calculateCircleSquare(radius)*height;
 }

    public static String concatenate (String string1, String string2) {
        System.out.println();
        String string3=string1+string2;
        return string3;
    }
}
