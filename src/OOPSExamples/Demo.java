package OOPSExamples;

public class Demo {
    private int i,j;
    public void setDemo(int x,int y){
        i=x;
        j=y;
    }
    public void increment(Demo P){

        P.i++;
        P.j++;
    }
    public void show(){
        System.out.println("i="+i+",j="+j);
    }
}
