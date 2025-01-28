package lab6;

public class BankEmployee extends Person {
    String nameOfBank;

    public BankEmployee(String name, String surname, String nameOfBank) {
        super(name, surname);
        this.nameOfBank = nameOfBank;
    }
    @Override
    public void getInfo() {
        System.out.println(getName() + " " + getSurname() + " " + "- Employee of " + "'"+nameOfBank+"'");
    }
}
