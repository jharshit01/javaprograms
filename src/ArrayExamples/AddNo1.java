package ArrayExamples;

public class AddNo1 {
    public static void main(String[] args) {
        int size= args.length;
        System.out.println("Arguments passed is"+size);
        if(size<2){
            System.out.println("please pass atleast two int ");
            System.exit(0);
        }
        int sum=0;
        for (String i:args){
            sum=sum+Integer.parseInt(i);
        }
        System.out.println("sum is "+sum);
    }
}
