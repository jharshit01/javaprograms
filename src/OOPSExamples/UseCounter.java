package OOPSExamples;

import java.util.Scanner;

public class UseCounter {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            System.out.println("enter no.");
            arr[i]=kb.nextInt();
        }
        Counter obj=new Counter();
        int c=obj.countEven(arr);
        System.out.println("the value of count is "+c);

    }
}
