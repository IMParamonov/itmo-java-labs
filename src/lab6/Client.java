package lab6;

public class Client extends Person implements GetBankInfo {
    String nameOfBank;

    public Client(String name, String surname, String nameOfBank) {
        super(name, surname);
        this.nameOfBank = nameOfBank;
    }
    @Override
    public void getInfo() {
        System.out.println(getName() + " " + getSurname() + " " + "- Client of " + "'"+nameOfBank+"'");
    }

    @Override
    public void getBankInfo() {
        System.out.println("Country of bank: " + GetBankInfo.COUNTRY);
    }
}
