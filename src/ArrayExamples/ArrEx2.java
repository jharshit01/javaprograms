package ArrayExamples;
import java.util.Scanner;
public class ArrEx2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");
        n=kb.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("arr["+i+"]=");
            arr[i]=kb.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            System.out.println("arr["+i+"]="+arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("the value of sum is"+sum);
        System.out.println("the value of avg is"+(float)sum/n);
    }
}
