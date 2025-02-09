package output;
import java.util.Scanner;
public class reverseordernetural {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number");
        int number=scanner.nextInt();
        for (int i=number;i>=1;i--) {
            System.out.print( i
            +", ");
        }
    }
}
