import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reverse = 0;

        System.out.println("Program to reverse a given Number:");
        System.out.println("Enter a Number:");
        int num = input.nextInt();

        while (num>0) {
            int digits = num % 10;
            reverse = reverse*10+digits;
            num/=10;
        }

        System.out.println("Reversed Number:"+reverse);
        input.close();

    }
}
