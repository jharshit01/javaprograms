package OOPSPRACTICAL;

import java.util.Scanner;

public class UseMyArray {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter "+arr.length+" integers");
        for(int i=0;i<arr.length;i++){
            arr[i]=kb.nextInt();

        }
        MyArray myArray=new MyArray(arr);
        myArray.reverseArray();
        System.out.println("After reversed the array");
        myArray.displayReverse();
        System.out.println("original array");
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
