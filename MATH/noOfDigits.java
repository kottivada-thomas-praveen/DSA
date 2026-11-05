import java.util.Scanner;
public class noOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("counting the digits of given number\n");
        System.out.println("Enter a number:");
        long n = input.nextInt();
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }

        System.out.println(count);
        input.close();
    }
}