package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * findMax
 */
public class findMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter SIZE :");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("MAXIMUM : "+max);
        input.close();
    }
}