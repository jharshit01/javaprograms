package staticExamples;

public class Emp {
    private int id;
    private String name;
    private int age;
    private static int nextId=1;
     public Emp(int a,String n){
         age=a;
         name=n;
         id=nextId++;
     }
     public void show(){
         System.out.println("id= "+id+",name="+name+",age="+age);
     }
     public void showNextId(){
         System.out.println("Next employee id will be "+nextId);
     }

}
