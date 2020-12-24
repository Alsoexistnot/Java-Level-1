import java.util.Arrays;

public class HomeworkTwo {
    public static void main(String[] args) {

/*   1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

/*  2. Задать пустой целочисленный массив размером 8.
       С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/

        int[] arr2 = new int[8];
        int i2 = 0;
        int j2 = 0;
        while (i2 < 8) {
            arr2[i2] = j2;
            System.out.print(arr2[i2] + " ");
            j2 = j2 + 3;
            i2++;
        }

        System.out.println();
        System.out.println();

/*  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
       пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
        System.out.println();

/*  4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
       и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

        int[][] arr4 = new int[6][6];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
        }
        for (int i = 0, j = 5; i < arr4.length; i++, j--) {
            arr4[i][j] = 1;
        }

        int ni = 6;
        int nj = 6;

        for (int i = 0; i < ni; i++) {
            for (int j = 0; j < nj; j++) {
                System.out.print(arr4[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

/*  5. ** Задать одномерный массив и найти в нем минимальный
    и максимальный элементы (без помощи интернета);*/

        int[] array = {4, 8, 15, 25, 47, 42};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число: " + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        System.out.println("Минимально число: " + min);
        System.out.println();


/*  6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
       если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
       checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
       граница показана символами ||, эти символы в массив не входят.*/

        int[] arraySum = {1, 2, 3, 4, 6, 4};
        System.out.println(checkBalance(arraySum));
    }

    public static boolean checkBalance(int[] arr) {

        System.out.println(Arrays.toString(arr));
        int leftSum = 0, rightSum = 0;

        for (int i : arr) {
            rightSum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == rightSum) {
                System.out.println("Равенство есть");
                return true;
            }
            leftSum += arr[i];
            rightSum -= arr[i];
        }
        System.out.println("Равенства нет");
        return false;
    }
}
