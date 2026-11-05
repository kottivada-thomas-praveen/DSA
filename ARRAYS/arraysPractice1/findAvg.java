package ARRAYS.arraysPractice1;

import java.util.Scanner;

/**
 * findAvg
 */
public class findAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int avg;
        System.out.println("Enter SIZE :");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        
        for (int i=0; i<size; i++) {
            sum += arr[i];
        }

        avg = sum/size;

        // while (i<size) {
            
        // }
        System.out.println("Average : "+avg);
        input.close();
    }
}