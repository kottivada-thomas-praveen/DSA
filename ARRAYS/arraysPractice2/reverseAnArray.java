package ARRAYS.arraysPractice2;

import java.util.Scanner;

/**
 * reverseAnArray
 */
public class reverseAnArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Reversed Array : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }

        input.close();
    }
}