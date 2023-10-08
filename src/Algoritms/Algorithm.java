package Algoritms;

public class Algorithm {
    public static void bubbleSort(int[] arr) {
        for (int first = 0; first < arr.length; first++) {
            for (int second = first + 1; second < arr.length; second++) {
                if (arr[first] > arr[second]) {
                    int temp = arr[first];
                    arr[first] = arr[second];
                    arr[second] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int elementToSearch) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int middle = last + (first - last) / 2;
            if (arr[middle] == elementToSearch) {
                return middle;
            } else if (arr[middle] < elementToSearch) {
                first = middle + 1;
            } else if (arr[middle] > elementToSearch) {
                first = middle - 1;
            }
        }
        return -1;
    }
}
