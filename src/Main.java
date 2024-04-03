import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] array = new int[]{1, 2, 3};
        for (int i = 0; i < array.length; i++) {       //вывод значений массива
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        for (int i = array.length - 1; i >= 0; i--) {        //вывод значений в обратном порядке
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {                      //замена нечетных значений на четные
                array[i] = array[i] + 1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ", ");
        }
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ", ");
        }
        System.out.println();
        String[] arrayString = new String[5];
        for (int i = 0; i < arrayString.length; i++) {
            if (i == arrayString.length - 1) {
                System.out.println(arrayString[i]);
                break;
            }
            System.out.print(arrayString[i] + ", ");
        }
        for (int i = arrayString.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayString[i]);
                break;
            }
            System.out.print(arrayString[i] + ", ");
        }
        System.out.println();
        //Задача 4

    }
}