package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * findMin
 */
public class findMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter SIZE :");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]<min) {
        //         min = arr[i];
        //     }
        // }

        for(int i : arr){
            if (arr[i]<min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element in array : "+min);
        input.close();
    }
}