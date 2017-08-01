/**
 * Created by jingyixu on 7/3/17.
 */
public class Page129_3 {
    public static void main(String[] args){
        int[][] array = new int[10][2];

        for (int i = 0; i < 10; i ++){
            for (int j = 0; j < 2; j ++){
                array[i][j] = 1;
            }
        }

//        for (int i = 0; i < 10; i ++){
//            for (int j = 0; j < 2; j ++){
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

        int[][] array2 = array;
        int[][] array3 = array;

        for (int i = 0; i < 10; i ++){
            array2[i][0] = 1;
            array3[i][1] = 2;
        }

        for (int i = 0; i < 10; i ++){
            for (int j = 0; j < 2; j ++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
