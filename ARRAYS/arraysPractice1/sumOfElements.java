package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * sumOfElements
 */
public class sumOfElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter SIZE :");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        
        for (int i=0; i<size; i++) {
            sum += arr[i];
        }

        // while (i<size) {
            
        // }
        System.out.println("SUM : "+sum);
        input.close();
    }
}