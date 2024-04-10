package staticExamples;

public class Box {
    private int len,breadth,height;

    public Box() {
        this(0);
    }

    public Box(int s) {

        this(s,s,s);
    }

    public Box(int x, int y, int z) {
        len = x;
        breadth = y;
        height = z;
    }
    public void show(){
        System.out.println(len+","+breadth+","+height);

    }
}
