package lab1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task6();
    }

    public static void task1 (){
        System.out.println("Я" + "\n" + "Хорошо" + "\n" + "Знаю" + "\n" + "Java" + "\n");
    }

    public static void task2 (){
        double number1 = (46 + 10) * ((double) 10 / 3);
        int number2 = 29 * 4 * (-15);
        System.out.println(number1 + "\n" + number2);
    }

    public static void task3 (){
        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);
    }

    public static void task4 (){
        double result = 3.6 * 4.1 * 5.9;
        System.out.println(result);
    }

    public static void task5 (){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n");
    }

    public static void task6 (){
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if(b % 2 != 0){
            System.out.println("Нечетное");
        } else if (b % 2 == 0 & b <= 100){
            System.out.println("Четное");
        } else if (b % 2 == 0 & b > 100){
            System.out.println("Выход за пределы диапазона");
        }
    }
}
