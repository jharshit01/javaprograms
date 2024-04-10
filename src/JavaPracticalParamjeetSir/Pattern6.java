package JavaPracticalParamjeetSir;

public class Pattern6 {
    public static void main(String[] args) {
        String str="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=4;j++){
                if(j==1)
                System.out.print(str+"* ");
                else
                    System.out.print("* ");
            }
            System.out.println();
            str+=" ";

        }

    }
}
