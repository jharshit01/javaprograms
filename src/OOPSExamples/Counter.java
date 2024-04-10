package OOPSExamples;

public class Counter {
    public int countEven(int []brr){
        int count=0;
        for (int x:brr){
            if(x% 2==0)
                ++count;
        }
        return  count;
    }
}
