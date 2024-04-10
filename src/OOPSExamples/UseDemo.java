package OOPSExamples;

public class UseDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.setDemo(10,20);
        System.out.println("Before incermenting");

        d.show();
        Demo temp=new Demo();
        temp.increment(d);
        System.out.println("After incrementing");
        d.show();
    }
}
