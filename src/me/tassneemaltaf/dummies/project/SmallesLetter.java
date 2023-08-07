package me.tassneemaltaf.dummies.project;

public class SmallesLetter {
	public static void main(String[] args) {
		char[] arr = {'a','b','c','f','j','k','l'};
		int target = 'j';
		System.out.println(smallest(arr, target));
	}
	
	static char smallest(char[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start) / 2;
			
			if(target>arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		if (start == arr.length) {
			return arr[start % arr.length];
		}

		return arr[start];
	
	}
}
