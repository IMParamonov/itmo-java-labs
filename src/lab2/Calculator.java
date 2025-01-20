package lab2;

public class Calculator {
    public static void main(String[] args){
        summary(5.2,3.1);
        difference(5.2, 3.1);
        division(5.2, 3.1);
        multiplication(5.2, 3.1);

    }
    public static void summary(int a, int b){
        System.out.println(a + b);
    }
    public static void summary(double a, double b){
        System.out.println(a + b);
    }
    public static void summary(long a, long b) {
        System.out.println(a + b);
    }

    public static void difference(int a, int b){
        System.out.println(a - b);
    }
    public static void difference(double a, double b){
        System.out.println(a - b);
    }
    public static void difference(long a, long b) {
        System.out.println(a - b);
    }

    public static void division(int a, int b){
        System.out.println(a / b);
    }
    public static void division(double a, double b){
        System.out.println(a / b);
    }
    public static void division(long a, long b) {
        System.out.println(a / b);
    }

    public static void multiplication(int a, int b){
        System.out.println(a * b);
    }
    public static void multiplication(double a, double b){
        System.out.println(a * b);
    }
    public static void multiplication(long a, long b) {
        System.out.println(a * b);
    }
}
