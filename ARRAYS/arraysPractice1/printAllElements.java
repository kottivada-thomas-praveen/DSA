package ARRAYS.arraysPractice1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * printAllElements
 */
public class printAllElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println();

        // WAY-1

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        
        // WAY-2

        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        // WAY-3
        System.out.print(Arrays.toString(arr));


        input.close();
    }
}