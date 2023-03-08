package Algorithms.sort;

public class insertionSort {
    public static void main(String[] args) {
        // 각 숫자를 적절한 위치에 삽입
        // 시간복잡도 O(N^2)을 가진다는 점에서 비효율적인 알고리즘에 속함.
        // 필요할 때만 위치를 바꾸게 된다.
        // O(N^2)의 시간복잡도를 가지는 정렬 중에서는 가장 강력한 알고리즘
        int i, j, temp;
        int array[] = {1,10,5,8,7,6,4,3,2,9};
        for(i = 0; i < 9; i++){
            j=i;
            while(j>=0 && array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
                
            }
        }
        for (int a : array) {
            System.out.print(a+" ");
        }

    }
}
