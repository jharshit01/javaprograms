package JavaPracticalParamjeetSir;

import java.util.Scanner;
//Wap to accept 10 integers from user and find out the maximum element?

class Array1{
public static void main(String []args){
Scanner kb=new Scanner(System.in);
 int []arr=new int[10];
        System.out.println("enter values in Array");
        int max=0;
        for (int i=0;i< arr.length;i++){
            arr[i]=kb.nextInt();
            if(i==0)
                max=arr[0];
            else if(max<arr[i])
                max=arr[i];
        }
    System.out.println("Largest number is "+max);
}

}
/*public class Array1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int []arr=new int[10];
        System.out.println("enter values in Array");
        for (int i=0;i< arr.length;i++){
            arr[i]=kb.nextInt();
        }
        for(int i=0;i< (arr.length-1);i++){
            for(int j=1;j<arr.length;j++){
                int temp;
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Largest num is "+arr[0]);
    }
}*/






















