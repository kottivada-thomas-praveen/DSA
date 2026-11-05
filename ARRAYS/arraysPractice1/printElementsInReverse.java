package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * printElementsInReverse
 */
public class printElementsInReverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Reversed Array : ");

        for (int i = arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+ " ");
            
        }

        input.close();

        // while (i=size-1) {
        //     System.out.println(arr[i]+ " ");
        // }i--;
    }
}