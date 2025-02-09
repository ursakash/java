package output;
import java.util.Scanner;
public class NEvenNeturalNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        int i;
        i=2;
        while(i<=number)
        {
            if(i%2==0)
            {
                System.out.println(i);
                i=i+2;
            }
        }
    }
}
