package lab4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
//        int[] arrayTask1 = {1, 23, 105, 244};
//        task1(arrayTask1);

//        task2();

//        int[] arrayTask3 = {5, 6, 7, 2};
//        task3(arrayTask3);

//        int[] arrayTask4 = {1, 2, 3, 1, 2, 4};
//        task4(arrayTask4);
    }

    public static void task1(int[] array) {
        int[] array1 = array;
        boolean isTrue = true;
//        System.out.println(Arrays.toString(array1));
        for (int j = 0; j < array1.length-1; j++) {
            if (array1[j] > array1[j + 1]) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Array length: ");
        int num = scan.nextInt();

        int[] array = new int[num];
        System.out.println("Numbers of array: ");

        for (int i = 0; i < num; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    public static void task3(int[] array) {
        int[] arr = array;
        System.out.println("Array1: " + Arrays.toString(arr));

        int[] arr2 = array;
        int firstNum = arr[0];

        arr2[0] = arr2[arr2.length - 1];
        arr2[arr2.length-1] = firstNum;

        System.out.println("Array2: " + Arrays.toString(arr2));
    }

    public static void task4(int[] arrayTask4) {
        int[] myArray = arrayTask4;
        for (int i = 0; i < myArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < myArray.length; j++) {
                if(myArray[i] == myArray[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(myArray[i] + " ");
        }
    }
}
