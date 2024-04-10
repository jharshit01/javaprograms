package OOPSExamples;

import java.util.Scanner;
public class UseCircle {
    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("enter the radius");

        int r = kb.nextInt();
        c.setRadius(r);
        c.calculateArea();
        c.calculateCircumferance();

    }
}