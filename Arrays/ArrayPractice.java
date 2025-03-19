package Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int[] arr = { 1, 21, 94, 81, 54, 87, 3 };
        int n = arr.length;
        // int[] bubbleSortedArray = bubbleSort(arr,n);
        // int[] insertionSortedArray = insertionSort(arr,n);
        int[] selectionSortedArray = selectionSort(arr,n);
        printArray(selectionSortedArray, selectionSortedArray.length);

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
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j = j - 1;
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
        return arr;
    }


    // Selection Sort

// 1,21,94,81,54,87,3
// 1,21,94,81,54,87,3
// 1,3,94,81,54,87,21
// 1,3,21,81,54,87,94
// 1,3,21,54,81,87,94
// 1,3,21,54,81,87,94

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
