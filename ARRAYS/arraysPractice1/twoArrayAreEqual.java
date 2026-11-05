package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * twoArrayAreEqual
 */
public class twoArrayAreEqual {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the First Array Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int arr2[] = new int[size];
        System.out.println("First Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the Second Array Elements :");
        for (int i = 0; i < size; i++) {
            arr2[i] = input.nextInt();
        }

        System.out.println("Second Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }

        if (arr==arr2) {
            System.out.println("Two arrays are equal");
        }
        else System.out.println("Two arrays are Not equal");

        input.close();
    }
}