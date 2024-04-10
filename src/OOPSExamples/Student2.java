package OOPSExamples;
import java.util.Scanner;
public class Student2 {
   private int roll;
   private String name;
   private  double per;
public void setStudent(int r,String n, double p )
{
    roll=r;
    name=n;
    per=p;

}
public void showStudent(){
    System.out.println("Roll num is"+roll);
    System.out.println("name is"+name);
    System.out.println("percentage is "+per);
}

}

