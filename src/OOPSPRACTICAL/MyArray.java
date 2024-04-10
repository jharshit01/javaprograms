package OOPSPRACTICAL;

public class MyArray {
    private int []arr;
    public MyArray(int []arr){
        this.arr=new int[arr.length];
        initializeArray(arr);
    }
    private  void initializeArray(int []arr){
        for (int i=0;i< arr.length;i++){
            this.arr[i]=arr[i];
        }
    }
    public void reverseArray() {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
        public void displayReverse(){
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
            System.out.println();
    }

    }

