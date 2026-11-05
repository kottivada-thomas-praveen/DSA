package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * searchForAnElement
 */
public class searchForAnElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter tha element for search : ");
        int element = input.nextInt();

        boolean found = false;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]==element) {
                found = true;
                break;
            }

        }

        if (found) {
            System.out.println("Element found");
        }
        else System.out.println("Element Not Found");
        input.close();
    }
}