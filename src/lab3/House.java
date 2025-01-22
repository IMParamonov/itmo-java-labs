package lab3;
import java.time.Year;

class House {
    private Integer floorsNumber;
    private Integer builtYear;
    private String name;

    public void setInfo (Integer floorsNumber, Integer builtYear, String name){
        this.floorsNumber = floorsNumber;
        this.builtYear = builtYear;
        this.name = name;
    }

    public String toString(){
        return "House{" + "\n" +
                "Floors: " + floorsNumber + "\n" +
                "Year: " + builtYear + "\n" +
                "Type: " + name + "}" + "\n";
    }


    public void howOld(){
        int currentYear = Year.now().getValue();
        int result = currentYear - builtYear;
        System.out.println("How old: " + result + "\n");
    }


    public static void main(String[] args){
        House house1 = new House();
        house1.setInfo(5, 1990, "Hrushevka");
        System.out.println(house1.toString());
        house1.howOld();

        House house2 = new House();
        house2.setInfo(15, 2024, "Cheloveinik");
        System.out.println(house2.toString());
        house2.howOld();
    }
}