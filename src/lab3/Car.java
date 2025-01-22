package lab3;

class Car {
    private String color;
    private String name;
    private Integer mass;

    // метод, выводящий объявленные переменные:
    public String toString() {
        return color + "\n" + name + "\n" + mass + "\n";
    }

    // сеттеры для инициализации:
    public void setColor(String color){
        this.color = color;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMass(Integer mass){
        this.mass = mass;
    }

    public static void main (String[] args){
        // два объекта со значениями:
        Car car1 = new Car();
        car1.setColor("Black");
        car1.setName("BMW");
        car1.setMass(1000);
        System.out.println(car1.toString());

        Car car2 = new Car();
        car2.setColor("White");
        car2.setName("Lada");
        car2.setMass(2000);
        System.out.println(car2.toString());

        // конструктор только с цветом:
        Car car3 = new Car();
        car3.setColor("White");
        System.out.println(car3.toString());

        // конструктор с цветом и весом:
        Car car4 = new Car();
        car4.setColor("White");
        car4.setMass(3000);
        System.out.println(car4.toString());

        // пустой конструктор:
        Car car = new Car();
        System.out.println(car.toString());
    }
}
