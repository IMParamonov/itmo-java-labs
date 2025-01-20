package lab2.task2;

public class Mobile {
    private String model;
    private Integer countNumber;
    private long price;
    private Color color;

    public Mobile(){
    }

    public Mobile(String model, Integer countNumber, long price, Color color) {
        this.model = model;
        this.countNumber = countNumber;
        this.price = price;
        this.color = color;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public Integer getCountNumber(){
        return countNumber;
    }
    public void setCountNumber(Integer countNumber){
        this.countNumber = countNumber;
    }

    public long getPrice(){
        return price;
    }
    public void setPrice(long price){
        this.price = price;
    }

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }

    public String toString(){
        return "Model: " + model + "\n" + "CountNumber: " + countNumber + "\n" + "Price: " + price + "\n" + "Color: " + color;
    }
}