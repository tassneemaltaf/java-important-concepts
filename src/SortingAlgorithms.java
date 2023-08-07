import java.util.Arrays;

public class SortingAlgorithms {
	public static void main(String[] args) {
		int[] arr = {5,3,5,2,6,7};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleSort(int[] arr) {
		//isSwapped will help us detect sorted arrays
		boolean isSwapped;
		for(int i = 0; i < arr.length; i++) {
			isSwapped = false;
			for(int j = 1; j < arr.length - i; j++) {
				//j is equal to 1 because it will be compared with its previous number always
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
					//isswapped will only be true if j < j - 1
					isSwapped = true;
				}
			}
			//if isSwapped continues to be false, it will break
			if(!isSwapped) {
				break;
			}
		}
	}
	
	static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			//get the last index for the max num
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
		
		
		
	}
	
	static void insertionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;
		for(int i = 0; i <= end; i++) {
			if(arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = first;
		first = second;
		second = temp;
	}
	
}
