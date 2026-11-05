package ARRAYS.arraysPractice2;

/**
 * removeDuplicates
 */
public class removeDuplicates {

    public static void main(String[] args) {
        int[] arr = {10,20,10,30};
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]!=arr[j]) {
                    arr2[i] = arr[i];
                }
            }
        }

        for (int i : arr2) {
            System.out.println(arr2[i]);
        }
    }
}