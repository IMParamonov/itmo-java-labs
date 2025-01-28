package lab6;

import java.util.Scanner;

public class ParentTask5 {
    Scanner scan;
    int userAge;

    public ParentTask5() {
        scan = new Scanner(System.in);
    }

    public int getAge () {
        System.out.println("Введите возраст пользователя: ");
        userAge = scan.nextInt();
        return userAge;
    }
}
