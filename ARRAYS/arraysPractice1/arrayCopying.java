package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * arrayCopying
 */
public class arrayCopying {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int arr2[] = new int[size];
        arr2 = arr;
        System.out.println("First Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Second Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }
        input.close();
    }
}