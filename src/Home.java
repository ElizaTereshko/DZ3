import java.util.Random;

public class Home {
    public static void main(String[] args) {
//Задача1
        int[][] array1 = new int[4][4];
        Random random1 = new Random();
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = random1.nextInt(50);
                if (i == j && array1[i][j] % 2 == 0) {
                    sum += array1[i][j];
                }
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
//Задача2
        int[][] array2 = new int[4][4];
        Random random2 = new Random();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = random2.nextInt(50);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (i >= j && array2[i][j] % 2 ==1 ) {
                    System.out.print(array2[i][j] + " ");
                }
            }
        }
        System.out.println();
//Задача 3
        int[][] array3 = new int[4][4];
        Random random3 = new Random();
        int prz1 = 1;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                array3[i][j] = random3.nextInt(50);
                if (i == j ) {
                    prz1 = prz1 *  array3[i][j];
                }
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        int prz2 = 1;
        for (int i = 0; i < array3.length; i++) {
            for (int j = array3.length - 1; j >= 0; j--) {
                prz2 = prz2 * array3[i][array3.length - 1 - i];
                break;
            }
        }
        if (prz1 > prz2) {
            System.out.println("Произведение элементов главной диагонали больше");
        }
        else {
            System.out.println("Произведение элементов побочной диагонали больше");
        }
//Задача 4
        int[][] array4 = new int[4][4];
        Random random4 = new Random();
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                array4[i][j] = random4.nextInt(50);
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
        int sum4 = 0;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length - 1 - i; j++) {
                sum4 = sum4 + array4[i][j];
                }
            }
        System.out.println(sum4);
//Задача 5
        int[][] array5 = new int[4][4];
        Random random5 = new Random();
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                array5[i][j] = random5.nextInt(50);
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int [][] transp = new int[array5.length][array5.length];
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                transp[i][j] = array5[j][i];
                System.out.print(transp[i][j] + " ");
            }
            System.out.println();
        }

        }
    }