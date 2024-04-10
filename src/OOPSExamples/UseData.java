package OOPSExamples;

public class UseData {
    public static void main(String[] args) {
        int i=10,j=20;
        System.out.println("Before incrementing");
        System.out.println("i is "+i+",j is "+j);
        Data obj=new Data();
        obj.increment(i,j);
        System.out.println("After  incrementing");
        System.out.println("i is "+i+",j is "+j);


    }
}
