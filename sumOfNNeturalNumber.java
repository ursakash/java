package output;
public class sumOfNNeturalNumber {
    public static int sumofNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int number=20;
        int result=sumofNumber(number);
        System.out.println(result);
    }
}
