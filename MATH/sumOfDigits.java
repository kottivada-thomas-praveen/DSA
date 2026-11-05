import java.util.Scanner;;

public class sumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        int digits;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();

        while (num>0) {
            digits = num%10;
            sum+=digits;
            num/=10;
        }

        System.out.println("Sum = "+sum);
        input.close();
    }
}
