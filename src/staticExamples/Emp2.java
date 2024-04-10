package staticExamples;

public class Emp2 {
    private int age;
    private String name;
    private  double sal;
    public Emp2(int age,String name,double sal){
        this.age=age;
        this.name=name;
        this.sal=sal;
    }
    public void show(){
        System.out.println(age +","+ name +","+ sal);
    }
}
