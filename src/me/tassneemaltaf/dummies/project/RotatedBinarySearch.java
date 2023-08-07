package me.tassneemaltaf.dummies.project;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,10,12,2,3,5,6};
		System.out.println(searchPivot(arr));
	}
	
	static int search(int[] arr, int target) {
		int pivot = searchPivot(arr);
		//if pivot doesnt exist that means, its a normal array
		if(pivot==-1) {
			//if its a normal array then do a normal binary search
			return binarySearch(arr, target, 0, arr.length-1);
		}
		//else if pivot is found, we have 3 cases
		//target being equal to pivot
		if(arr[pivot] == target) {
			return pivot;
		}
		//target being greater than or equal to start
		if(target >= arr[0]) {
			return binarySearch(arr, target, 0, pivot-1);
		}
		//target being less than start
		return binarySearch(arr, target, pivot+1, arr.length-1);
	}
	//searching for pivot
	static int searchPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start) /2;
			
			//we have 4 cases in which we can find our pivot
			//1-if the mid element is greater than the next element
			if(arr[mid] > arr[mid+1]) {
				return mid;
			//2-if mid element is less than its previous element
			} else if (arr[mid] < arr[mid-1]) {
				return mid-1;
			//3- if 1 and 2 fails, we have to make the array short in any way to find new mids
			//if the start element is greater than or equal to the middle element, everything after mid can be discarded
			} else if (arr[start] >= arr[mid]) {
				end = mid - 1;
			//4- if start element < mid element, discard everything from the beginning to mid
			//if mid was the answer, it would've been caught in the first 2 if statements
			} else if (arr[start] < arr[mid]) {
				start = mid + 1;
			}
			
		}
		return -1;
	}
	
	//normal binary search code
	static int binarySearch(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end - start) / 2;
			
			if(target > arr[mid]) {
				start = mid + 1;
			} 
			else if(target < arr[mid]) {
				end = mid - 1;
			} 
			else {
				return mid;
			}
		}
		return -1;
	}

}
