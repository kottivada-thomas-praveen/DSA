package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * countOddNumbers
 */
public class countOddNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                count++;
            }
        }

        System.out.println("Odd Numbers :"+count);
        input.close();
    }
}