package output;
import java.util.Scanner;
public class rightAngleTriangle {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter hypotenuse,perpendicular and basse");


        int hypotenuse= scan.nextInt();
        int penpendicular= scan.nextInt();
        int base= scan.nextInt();
        if(hypotenuse*hypotenuse==penpendicular*penpendicular+base*base)
        {
            System.out.println("its right angle triangle");
        }
        else
        {
            System.out.println("its not a right angle triangle");
        }
    }
}
