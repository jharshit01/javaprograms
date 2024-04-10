package OOPSExamples;

public class UseOvld {
    public static void main(String[] args) {
        Ovld obj=new Ovld();
        obj.show(24);
        obj.show('A');
        obj.show(67.9);
        obj.show("hello");

        obj.show(67.9f);
        obj.show(67L);

    }
}
