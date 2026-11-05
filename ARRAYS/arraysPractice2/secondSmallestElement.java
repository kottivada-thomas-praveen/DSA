package ARRAYS.arraysPractice2;

import java.util.Scanner;

/**
 * secondSmallestElement
 */
public class secondSmallestElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int low = arr[0];
        int secondLow = Integer.MAX_VALUE;
        
        // 7,4,9,2,5
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<low) {
                secondLow = low;
                low = arr[i];
            }
            else if (arr[0]>low && arr[0]<secondLow) {
                secondLow = arr[0];
            }
        }

        System.out.println("Smallest element : "+low);
        System.out.println("Second smallest element : "+secondLow);

        input.close();
    }
}