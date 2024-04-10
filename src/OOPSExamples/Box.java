package OOPSExamples;

public class Box {
    private int l,b,h;
    public Box(){

    }
    public Box(int s){
        l=b=h=s;
    }
    public Box(int a,int d,int c){
        l=a;
        b=d;
        h=c;

    }
    public Box(Box P) {
        l = P.l;
        b = P.b;
        h = P.h;
    }
    public void show(){
        System.out.println("length is "+l);
        System.out.println("breadth is "+b);
        System.out.println("height is "+h);
    }
}
