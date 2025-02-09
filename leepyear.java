package output;

import java.util.Scanner;

public class leepyear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        int number = scan.nextInt();
        if (number % 4 == 0) {
            System.out.println("leep year");
        } else {
            System.out.println("not leep year");
        }
    }


}
