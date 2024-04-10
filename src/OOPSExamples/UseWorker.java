package OOPSExamples;

import java.util.Scanner;

public class UseWorker {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Worker w=new Worker();
        System.out.println("enter hours & Payrate");
        int hr=kb.nextInt();

        double rate=kb.nextDouble();
        w.setData(hr,rate);
        double payment=w.getSalary();
        System.out.println("Salary of worker is "+payment);



    }
}
