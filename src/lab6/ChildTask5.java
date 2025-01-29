package lab6;

public class ChildTask5 extends ParentTask5 {
    String name;

    @Override
    public int getAge() {
        System.out.println("Введите имя пользователя: ");
        name = scan.nextLine();
        System.out.println("Ваше имя: " + name);
        return userAge;
    }
}
