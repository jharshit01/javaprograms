package JavaPracticalParamjeetSir;

import java.util.Scanner;

public class SeriesPrime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter the number");
        int n = kb.nextInt();
        int i,j;
        for(j=2;j<=n;j++){
            for (i = 2; i < j; i++) {
                if (j% i == 0)
                    break;
            }
            if (j== i)
                System.out.print(j+" ");



        }
    }
        }




