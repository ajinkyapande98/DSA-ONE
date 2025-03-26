package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayPractice {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int[] arr = { 1, 0, 21, 0, 94, 0, 81, 54, 87, 3 };
        int n = arr.length;
        secondLargestNumber(arr,n);
        // printArray(minAndMaxInArray, minAndMaxInArray.length);
    }

    public static void secondLargestNumber(int[] arr, int n) {
        if (n < 2) {
            System.out.println("alteast 2 element"); // base condition
            return;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (arr[i]>max) {
                secondMax = max;
                max = arr[i];
            }
            if(arr[i]<max && arr[i]>secondMax){
                secondMax =  arr[i];
            }
        }
        System.out.println(secondMax);
    }

    public static void isNumberMissingInArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if(arr[i] != (i+1)){
                System.out.print(i);
                break;
            }
        }
    }


    public static void rotateAnArrayByKNumber(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            int lastIndex = arr[n-1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j-1];
        }
        arr[0] = lastIndex;
        }
        printArray(arr, n);

    }

    public static boolean isArraySorted(int[] arr, int n) {
        if(n == 0 || n == 1){
            return true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void removeDuplicateFromArray(int[] arr, int n) {
        // HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void moveAllZeroToEnd(int[] arr, int n) {
        int index = 0; // Index to place the next non-zero element
    
        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
    
        // Fill the remaining positions with zeros
        while (index < n) {
            arr[index++] = 0;
        }
    
        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] findMinAndMaxFromArray(int[] arr, int n) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int[] minMaxArray = { min, max };
        return minMaxArray;
    }

    public static int[] bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr, int n) {
        int j;
        for (int i = 0; i < n; i++) {
            j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j = j - 1;
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }



    public static void reverseAnArray(int[] arr, int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        printArray(arr, n);
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
