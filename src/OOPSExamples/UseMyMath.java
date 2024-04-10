package OOPSExamples;

import java.util.Scanner;

public class UseMyMath {
    public static void main(String []args){
        Scanner kb=new Scanner(System.in);
        int []arr=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("enter no.");
             arr[i]=kb.nextInt();
        }
        int ans;
        MyMath obj=new MyMath();
        ans=obj.calculate(arr);
        System.out.println("sum of array values is "+ans);
        

    }
}
