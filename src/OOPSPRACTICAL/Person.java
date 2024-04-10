package OOPSPRACTICAL;
//WAP
public class Person {

       private  int age;
       private String name;
       public Person(int age,String name){
             this.age=age;
              this.name=name;
       }
       public void show(){
              System.out.println("Age is "+age);
              System.out.println("Name is "+name);
       }
}
