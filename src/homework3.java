import java.util.Arrays;

public class homework3 {

    // 2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void main(String[] args) {
        int[] arr;
        arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (i + 1);
        }
        System.out.println(arr);

    }
    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void FromZeroToOneAndBack() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[1] = 0;
            } else {
                array[i] = 1;
            }
            System.out.println(array);
        }
    }
    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void NumbersLessThanSix(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
            System.out.println(inputArray);
        }
    }    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void ToBuildSquare(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            }
    }


        // 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] NewArray(int InitialValue, int length)
        {
            int[] result = new int[length];
            for (int i = 0; i < result.length; i++) {
                result[i] = InitialValue;
            }
            return result;
        }
    }
