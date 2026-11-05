import java.util.Scanner;

public class firstAndLastDigit {
    public static void main(String[] args) {
        int lastDigit = 0;
        int firstDigit = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        lastDigit = number % 10;

        if (number > 0) {
            while (number >= 10) {
                number /= 10;
                firstDigit = number;
            }

            System.out.println("last digit = " + lastDigit);
            System.out.println("First digit = " + firstDigit);
        } 
        if (number<0) {
            System.out.println("Enter any positive Number");
        }
        else {
            System.out.println("enter any number");
        }
        input.close();
    }
}
