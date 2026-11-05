import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 1;
        System.out.println("======FACTORIAL PROGRAM=======");
        System.out.println("Enter a number :");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            res*=i;
        }

        System.out.println("Factorial : "+res);
        input.close();
    }
}
