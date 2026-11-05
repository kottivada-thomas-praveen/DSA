import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Program for palindrome checking gor a given number");
        System.out.println("Enter a Number:");
        int number = input.nextInt();
        int original = number;
        int digits;

        while (number>0) {
            digits=number%10;
            reverse = reverse * 10 + digits;
            number/=10;
        }

        if (reverse == original) {
            System.out.println("The Number is Palindrome");
            System.out.println(reverse);
        }
        else{
            System.out.println("The Number is Not Palindrome");
        }
        input.close();
    }
}
