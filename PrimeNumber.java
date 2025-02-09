package input;
import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrimeNumber(int number){
        if(number==2) return true;
        if(number%2==0) return false;
        for (int i=3;i<number;i=i+2){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        boolean result = isPrimeNumber(number);
        if(result){
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
}
