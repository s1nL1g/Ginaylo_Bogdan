package lesson1;

public class Arrays_of_string {
    public static void main(String[] args){
        int numbers[] = new int[5];
        numbers[0]=10;
        String[] strings= new String[3];
        strings[0]= "Привіт";
        strings[1]= "Hi. there";
        strings[2]= "hi nigga";

        for (int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
        System.out.println();

        for (String X:strings){
            System.out.println(X);
        }
        int[] n1= {2,4,7};
        int sum= 0;
        for (int x1:n1){
            sum=sum+x1;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(n1[2]);
        int i=0;
        String k= null;
        System.out.println(k);
    }
}
