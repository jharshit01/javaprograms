package staticExamples;

import static staticExamples.Data.b;

public class UseData {
    public static void main(String[] args) {
        Data d1,d2,d3;
        d1=new Data();
        d2=new Data();
        d3=new Data();
        d1.a=10;
        d2.a=20;
        d3.a=30;
        System.out.println("d1.a ="+d1.a);
        System.out.println("d2.a ="+d2.a);
        System.out.println("d3.a ="+d3.a);
        d1.b=10;//Data.b=10; right way
        d2.b=20;
        d3.b=30;
        System.out.println("d1.b ="+ b);
        System.out.println("d2.b ="+ b);
        System.out.println("d3.b ="+ b);
        System.out.println("Data.b="+ b);


    }
}
