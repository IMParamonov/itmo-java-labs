// написать программу - значит написать метод. Метод main исключительно для тестирования. Реализация разнесена в методы.
// в методах не должно быть объявленных массивов
// если в задаче "вернуть какой то результат", необходимо вернуть соответствующий тип
package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {

//        task1();
//        task2();

//        int[] numbers = scanner();
//        boolean isTrue = task3(numbers[0], numbers[1], numbers[2]);
//        System.out.println("Результат: " + isTrue);

//        int[] numbers = scanner();
//        boolean isTrue = task4(numbers[0], numbers[1], numbers[2]);
//        System.out.println("Результат: " + isTrue);


//        int[] ArrayTask5 = {1, 2, 3, 4, 5, 3};
//        boolean isTrue = task5(ArrayTask5);
//        System.out.println("array = " + Arrays.toString(ArrayTask5) + "\n" + isTrue);

//        int[] ArrayTask6 = {2, 2, 2, 2, 8, 3};
//        boolean isTrue = task6(ArrayTask6);
//
//        if (isTrue) System.out.println("Массив содержит число 1 или 3.");
//        else System.out.println("Массив не содержит чисел 1 или 3.");
    }

    public static int[] scanner () {
        int[] numbers = new int[3];
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        numbers[0] = num1;

        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        numbers[1] = num2;

        System.out.println("Введите третье число: ");
        int num3 = scan.nextInt();
        numbers[2] = num3;
        return numbers;
    }

    public static void task1() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2() {
        int length3 = 0, length5 = 0, lengthBoth = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i != 0) {
                length3++;
            }
            if (i % 5 == 0 && i != 0) {
                length5++;
            }
            if (i % 15 == 0 && i != 0) {
                lengthBoth++;
            }
        }
//        System.out.println("Длинна массива: " + length3);
//        System.out.println("Длинна массива: " + length5);
//        System.out.println("Длинна массива: " + lengthBoth);

        int[] div3 = new int[length3];
        int[] div5 = new int[length5];
        int[] divBoth = new int[lengthBoth];

        int mass1 = 0, mass2 = 0, mass3 = 0;

        for (int j = 0; j <= 100; j++) {
            if (j % 3 == 0 && j != 0) {
                div3[mass1++] = j;
            }
            if (j % 5 == 0 && j != 0) {
                div5[mass2++] = j;
            }
            if (j % 15 == 0 && j != 0) {
                divBoth[mass3++] = j;
            }
        }

        System.out.println("Делится на 3: " + Arrays.toString(div3));
        System.out.println("Делится на 5: " + Arrays.toString(div5));
        System.out.println("Делится на 3 и на 5: " + Arrays.toString(divBoth));
    }

    public static boolean task3(int num1, int num2, int num3) {
        boolean a = num1 + num2 == num3 ? true : false;
        return a;
    }

    public static boolean task4(int num1, int num2, int num3) {
        boolean a = num1 < num2 && num2 < num3 ? true : false;
        return a;
    }

    public static boolean task5(int[] myArray) {
        int[] ints = myArray;
        int lastInd = ints.length - 1;

        boolean b = ints[0] == 3 || ints[lastInd] == 3 ? true : false;
        return b;
    }

    public static boolean task6(int[] myArray) {
        int[] ints = myArray;
        boolean trueNum = false;

        for (int num : ints) {
            if (num == 3 || num == 1) {
                trueNum = true;
                break;
            }
        }
        return trueNum;
    }
}