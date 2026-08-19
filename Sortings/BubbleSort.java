package Sortings;

public class BubbleSort {

    // Function
    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {7, 8, 3, 1, 2};
        int[] arr2 = {10, 5, 4, 2};
        int[] arr3 = {9, 6, 3, 1};

        // Function call
        bubbleSort(arr1);
        bubbleSort(arr2);
        bubbleSort(arr3);

        // Print arr1
        for (int x : arr1) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Print arr2
        for (int x : arr2) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Print arr3
        for (int x : arr3) {
            System.out.print(x + " ");
        }
    }
}