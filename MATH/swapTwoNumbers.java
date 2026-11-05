import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a = input.nextInt();
        System.out.println("Enter Second Number:");
        int b = input.nextInt();
        // int temp;

        // with using temp variable
//
//        System.out.println("before Swapping\n");
//
//        System.out.println("first Number : "+a);
//        System.out.println("Second number : "+b+"\n");
//
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("After Swapping\n");
//
//        System.out.println("first Number : "+a);
//        System.out.println("Second number : "+b);

        // without using Temp variable

        System.out.println("before Swapping\n");

        System.out.println("first Number : "+a);
        System.out.println("Second number : "+b+"\n");

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping\n");

        System.out.println("first Number : "+a);
        System.out.println("Second number : "+b);
        input.close();
    }
}
