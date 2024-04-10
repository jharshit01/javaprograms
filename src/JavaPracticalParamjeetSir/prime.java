package JavaPracticalParamjeetSir;

import java.util.Scanner;

//wap to accept int from user and check them given number is prime or not
public class prime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enetr the number");
        int n = kb.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0)
                break;
            }
            if (n == i)
                System.out.println("number is prime");
            else
                System.out.println("not prime");


        }

    }