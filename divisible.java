package output;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();
        if(number%7==0)
        {
            System.out.println("divisible by 7");
        }
            else
            {
                System.out.println("not divisible by 7");
            }

    }
}