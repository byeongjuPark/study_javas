package Algorithms.sort;

public class quickSort {
    public static void main(String[] args) {
        // Quick Sort 
        // 하나의 큰 문제를 두 개의 작은 문제로 분할하는 식으로 빠르게 정렬
        // 특정한 값을 기준으로 큰 숫자와 작은 숫자를 서로 교환한 뒤에 배열을 반으로 나눈다.
        // 시간 복잡도 : O(N * logN)
        // 분할정복 알고리즘
        // 기준값 Pivot

        int data[] = {1,10,5,8,7,6,4,3,2,9};
        System.out.println();
        quickSort(data);
        System.out.println();
    }
    
    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
