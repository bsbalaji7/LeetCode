package Sorting2;
import java.util.*;


public class RecursiveInsertionSort {
public int[]insertionSort(int[] num){
	sort(num,num.length);
	return num;
}

// Recursive sort
static void sort(int[] arr,int n) {
	if(n <= 1)return;
	
    // Sort first n-1 elements
	sort(arr,n -1);
	
    // Insert last element
	insert(arr,n-1);

}

static void insert(int[] arr, int i) {
	if(i == 0 || arr[i] >= arr[i-1])return;
	
	int temp = arr[i];
	arr[i] = arr[i-1];
	arr[i-1] = temp;
    // Move left recursively
insert(arr, i -1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {7, 4, 1, 5, 3};

	        RecursiveInsertionSort obj = new RecursiveInsertionSort();
	        int[] result = obj.insertionSort(arr);
	        
        for (int x : result) {
            System.out.print(x + " ");
        }
	}

}
