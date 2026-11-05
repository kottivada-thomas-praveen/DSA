import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = input.nextInt();

        if (number<0) {
            System.out.println(-number);
        }
        else System.out.println(number);

        input.close();
    }
}
