package OOPSExamples;

import OOPSExamples.Student2;

import  java.util.Scanner;
public class UseStudent2 {
    public static void main(String[] args) {
      Scanner k;
      k=new Scanner(System.in);
      Student2 stu=new Student2();
        System.out.println("Enter roll ,name,percentage");

        int r=k.nextInt();
        String n=k.next();
        double p=k.nextDouble();
        stu.setStudent(r,n,p);
        stu.showStudent();


    }
}
