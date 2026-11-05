import java.util.Scanner;

public class allDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();

        int arr[];

        for(int i = 1; i*i <= number; i++){
            if (number%i==0 || number/i!=0) {
               
            }
        }
        input.close();
    }
}