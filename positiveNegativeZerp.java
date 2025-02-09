package output;
import java.util.Scanner;
public class positiveNegativeZerp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        if(number>0) {
            System.out.println("positive number");
        }
        else if(number<0){
            System.out.println("negative number");
        }
        else {
            System.out.println("Zero number");
        }
    }
}
