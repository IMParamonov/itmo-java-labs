package lab2.task2;

public class Main {
    public static void main (String[] args){
        Mobile phone = new Mobile();

            phone.setModel("iPhone");
            phone.setCountNumber(10);
            phone.setPrice(500000000L);
            phone.setColor(Color.WHITE);

            System.out.println(phone);

        Mobile phone1 = new Mobile("Sumsung", 5, 200000000L, Color.BLACK);
            System.out.println(phone1);
    }
}
