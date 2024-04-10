package JavaPracticalParamjeetSir;

import java.util.Scanner;

// Wap to sort the element in a given array
public class Array2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number");
        int []arr=new int[10];
        for(int i=0;i< arr.length;i++){
            arr[i]=kb.nextInt();
        }

        for(int i=0;i<(arr.length-1);i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("Second Largest number is "+arr[arr.length-2]);
    }
}
