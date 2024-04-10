package ArrayExamples;

import java.util.Scanner;

public class ArrPractical2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int s;
        int []arr=new int [10];
        System.out.println("Enter values for Array");
        for(int i=0;i<6;i++){
            arr[i]=kb.nextInt();
        }
        System.out.println("enter no. you want to search");
        s= kb.nextInt();
        for(int i=0;i<6;i++){
            if(arr[i]==s){
                System.out.println("Position of Array is "+(i+1));
                break;
            }
            else{
                System.out.println("no. not found");}
                break;

        }
    }
}
