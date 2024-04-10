package ArrayExamples;

public class AddNo {
    public static void main(String[] args) {
        int size= args.length;
        System.out.println("Arguments passed is"+size);
        if(size<2){
            System.out.println("please pass atleast two int ");
            System.exit(0);
        }
        int sum=0;
        for (int i=0;i<size;i++){
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("sum is "+sum);
    }
}
