package lesson1;

public class Multidimentional_arrays {
    public static void main(String[] args){
        int[] N= {1,2,3}; //одновимірний масив

        int[][] M= {{2,3,12},
                    {1223,123,111},
                    {455,23,1111}};
        for(int i=0;i<M.length;i++){
            for(int l=0;l<M[i].length;l++){
                System.out.print(M[i][l]+ " ");
            }
            System.out.println();


        }



    }
}
