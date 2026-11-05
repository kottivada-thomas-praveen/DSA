package ARRAYS.arraysPractice2;

import java.util.Scanner;

/**
 * secondLargestElement
 */
public class secondLargestElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SIZE :");
        int size = input.nextInt();
        int arr[] = new int[size];
        int high = arr[0];
        int secondHigh = Integer.MIN_VALUE;

        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if (arr[i]>high) {
                secondHigh = high;
                high = arr[i];
            }

            if (arr[i]<high && arr[i]>secondHigh) {
                secondHigh = arr[i];
            }
        }

        System.out.println("Largest element : "+high);
        System.out.println("Second largest element : "+secondHigh);

        input.close();

    }
}