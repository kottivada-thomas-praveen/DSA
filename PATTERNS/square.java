package PATTERNS;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = input.nextInt();
        int rows = number;
        int columns = number;
        int arr[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns;j++){
                System.err.print("*");
            }
            System.out.println("");
        }

        input.close();
    }
}
