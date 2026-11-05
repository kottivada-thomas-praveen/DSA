import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int firstNum = input.nextInt();
        System.out.println("Enter the Second Number :");
        int secondNum = input.nextInt();
        System.out.println("Enter the Third Number :");
        int thirdNum = input.nextInt();

        if (firstNum>secondNum && firstNum>thirdNum) {
            System.out.println("Highest NUmber is :"+firstNum);
        }
        else if (secondNum>firstNum && secondNum>thirdNum) {
            System.out.println("Highest NUmber is :"+secondNum);
        }
        else if (thirdNum>firstNum && thirdNum>secondNum) {
            System.out.println("Highest NUmber is :"+thirdNum);
        }
        else System.out.println("Enter a valid number");
        input.close();
    }
}
