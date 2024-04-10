package staticExamples;

public class Demo1 {
    public static double pi=3.14;
    public Demo1(){
        System.out.println("Constructor Called....");
    }
    static {
        System.out.println("static block caleed....");
    }
}
