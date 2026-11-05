import java.util.Scanner;

public class productOfDigits {
    public static void main(String[] args) {
        int product = 1;
        int digits;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = input.nextInt();

        while (number>0) {
            digits=number%10;
            product*=digits;
            number/=10;
        }

        System.out.println("Product = "+product);
        input.close();
    }
}
