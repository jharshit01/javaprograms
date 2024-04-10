package OOPSExamples;

import java.util.Scanner;

public class Circle {

        private int rad;
        public void setRadius(int r){

            rad=r;
        }
        public void calculateArea(){
            double area=Math.PI*Math.pow(rad,2);
            System.out.println("Area is "+area);
        }
        public void calculateCircumferance(){
            double circ=2*Math.PI*rad;
            System.out.println("Circumferance is "+circ);
        }

    }





