package studying1;

public class ExerciseArray {
    public static void main(String[] args) {
//        Создать одномерный массив из 10 элементов типа int и заполнить его случайными числами от 1 до 100.
//        Вывести массив на экран.
//        Найти и вывести на экран минимальное и максимальное значения в массиве

        int[] array = new int[10];
        array[0]= 4;
        array[1]= 76;
        array[2]= 85;
        array[3]= 25;
        array[4]= 35;
        array[5]= 54;
        array[6]= 82;
        array[7]= 33;
        array[8]= 49;
        array[9]= 50;

        int min = array[0];
        int max = array[0];

        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);

            if (array[i] < min){
                min=array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }

        System.out.println("Мінімальне значення циклу "+min);
        System.out.println("Максимальне значення циклу "+max);
    }
}
