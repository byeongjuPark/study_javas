package Algorithms.sort;

public class bubbleSort {
    public static void main(String[] args) {
        // 옆에 있는 값과 비교하여 더 작은 값을 반복적으로 앞으로 보내는 정렬
        // 구현은 가장 쉽지만 가장 비효율적인 알고리즘
        int array[] = {1,10,5,8,7,6,4,3,2,9};
        int temp = 0;
        int i,j;
        for(i = 0; i<array.length ; i++){
            for(j = 0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int a : array) {
            System.out.print(a+" ");
        }
    }
}

// 선택정렬과 동일한 시간복잡도 O(N^2) 이다.