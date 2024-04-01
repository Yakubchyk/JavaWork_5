import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MehrArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        int[][] arrNew = new int[2][2];
        arrNew[1][1] = 500;

        System.out.println(Arrays.deepToString(arrNew)); // выводит в виде строки

    }
}

class TestArr {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int row = scanner.nextInt();
//        int column = scanner.nextInt();
//        int[][] arr = new int[row][column];
//
//        for (int i = 0; i < (row); i++) {
//            arr[i] = scanner.nextInt();
//
//            for (int j = i; j < (column); i++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

    }
}

class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int x = 5;
        int y = 5;
        int[][] arr = new int[x][y];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println(max);
    }
}

//ЗУбчвтые массивы
class SubArr {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[5];
        arr[1] = new int[3];

        //или
        int[][] arr2 = {{1, 2, 3}, {1, 2, 3, 4, 5, 6, 7}, {1, 2}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

class Test_N_Arr {
    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3};
//        int[][] arr2 = {{1, 2, 3},{1, 2, 3}};
//        int[][][] arr3 = {{{1, 2, 3}, {2, 3}}, {4, 5}, }}}
        Scanner scanner = new Scanner(System.in);
        int[][][] arr = {{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}}, {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}}, {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}}, {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}}};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                count = count + arr[i][j].length;
            }
        }
        System.out.println(count);
    }
}

// Попробовать в другую сторону сделать
class SummArr {
    public static void main(String[] args) {
        int[][] arr = {
                {9, 2, 5},
                {4, 5, 6},
                {5, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Сумма элементов на главной диагонали: " + sum);
    }
}
