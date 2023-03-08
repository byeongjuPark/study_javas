package Algorithms.sort;

public class selectionSort {
    public static void main(String[] args) {
        // 선택 정렬
        // 가장 작은 것을 선택해서 앞으로 보낸다.
        int i, j, min,  temp;
        int index = 0;
        int array[] = {1,10,5,8,7,6,4,3,2,9};
        System.out.print("Before sorting : ");
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();
        for(i = 0; i<array.length; i++){
            min = 9999; //모든 원소들보다 큰 숫자
            for(j = i; j<10; j++){
                if(min > array[j]){
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        System.out.print("After sorting : ");
        for (int k : array) {
            System.out.print(k + " ");
        }
    }
    
}

// 시간 복잡도
// 10 + 9 + 8 +... + 1 
// N*(N+1)/2
// O(N * N) = O(N^2)
// => 10,000개의 데이터라면... 대략 1억번의 계산을 한다!
// 구현이 간단하나 비효율적인 알고리즘 중 한개...