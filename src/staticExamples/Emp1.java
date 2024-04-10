package staticExamples;

public class Emp1 {
    private int age;
    private  int id;
    private String name;
    private static int nextId=1;
    public Emp1(int a,String n){
        age=a;
        name=n;
        id=nextId++;
    }
     public void show(){
        System.out.println("id="+id+",age="+age+",name="+name);
    }
    public void showNextId(){
        System.out.println("Next Emp will have ID:"+nextId);
    }

    protected void finalize() {
        --nextId;
    }
}
