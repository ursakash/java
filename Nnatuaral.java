package output;
import java.util.Scanner;
public class Nnatuaral {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter N natural number");
        int number= scan.nextInt();
        for(int i=1;i<=number;i++)
        {
            System.out.println(i);
        }
    }
}
