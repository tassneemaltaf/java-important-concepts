package me.tassneemaltaf.dummies.project;

public class Ceil {
	public static void main(String[] args) {
		int [] arr = {0,1,3,4,6,7,8,9,14,16,18};
		int target = 15;
		System.out.println(ceil(arr, target));
		
		
	}
	static int ceil(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return start;
	}
}
