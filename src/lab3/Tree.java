package lab3;

class Tree {
    private Integer howOld;
    private Boolean isAlive;
    private String name;

    public Tree(Integer howOld, String name){
        this.howOld = howOld;
        this.name = name;
    }

    public Tree(Integer howOld, Boolean isAlive, String name){
        this.howOld = howOld;
        this.isAlive = isAlive;
        this.name = name;
    }
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Integer getHowOld() {
        return howOld;
    }
    public Boolean getAlive() {
        return isAlive;
    }
    public String getName() {
        return name;
    }

//    public String ifAlive(boolean isAlive){
//        if(isAlive){
//            return "tree is alive";
//        } else {
//            return "tree is dead";
//        }
//    }

    public static void main(String[] args){
        Tree tree1 = new Tree(12, "Berezka");
        System.out.println(tree1.getHowOld() + " year old " + tree1.getName());

        Tree tree2 = new Tree(50, true, "Sosna");
        System.out.println(tree2.getHowOld() + " year old " + tree2.getName() + " " + tree2.getAlive());

        Tree tree3 = new Tree(){
        };
    }
}
