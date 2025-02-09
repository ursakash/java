package output;
import java.util.Scanner;
public class greaterAmongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("sabse bada A hai");
        } else if (b>c&&b>a) {

            System.out.println("sabse bada B hai");
        }
        else {
            System.out.println("sabse bada c hai");
        }
    }
}
