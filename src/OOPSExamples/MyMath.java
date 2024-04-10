package OOPSExamples;

public class MyMath {
   public int calculate(int []brr){
       int sum=0;
       for(int x:brr) {
           sum = sum + x;
           sum=sum+x;
       }
       return sum;
    }
}
