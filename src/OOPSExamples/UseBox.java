package OOPSExamples;

public class UseBox {
    public static void main(String[] args) {
        Box b1,b2,b3,b4;
        b1=new Box();
        b2=new Box(5);
        b3=new Box(1,2,3);
        b4=new Box(b3);
        b1.show();
        b2.show();
        b3.show();
        b4.show();

    }
}
