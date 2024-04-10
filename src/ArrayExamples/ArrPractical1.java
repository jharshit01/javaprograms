package ArrayExamples;

import java.util.Scanner;
//WAP to take input from user and find sum and average of odd and even number.
public class ArrPractical1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int evenSum=0,countEven=0;
        int oddSum=0,countOdd=0;
        int []arr=new int [10];
        System.out.println("enter number");
        for(int i=0;i<10;i++){
            arr[i]=kb.nextInt();
            if(arr[i]%2==0){
                evenSum=evenSum+arr[i];
                countEven++;
            }
            else{
                oddSum=oddSum+arr[i];
                countOdd++;
            }
        }
        System.out.println("Sum of even no. is "+evenSum);
        System.out.println("Sum of odd no. is "+oddSum);
        System.out.println("Average of even no. is "+(double)evenSum/countEven);
        System.out.println("Average of even no. is "+(double)oddSum/countOdd);

    }
}
