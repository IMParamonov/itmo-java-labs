package lab6;

public class ChildTask4 extends ParentTask4 {

    public ChildTask4(int number) {
        super(number);
    }

    public void returnNumber () {
        System.out.println(number);
    }
}
