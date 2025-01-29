package lab6;

public abstract class Person {
    private String name;
    private String surname;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public abstract void getInfo();
}
