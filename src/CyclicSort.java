import java.util.ArrayList;

public class CyclicSort {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(missingNum(arr, 5));
	}
	
	//This is the code for a normal cyclic sort
	//from range(1,n)
	static void cyclicSort(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			//correct index = value - 1
			int correctIndex = arr[i] - 1;
			if(arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}
	}
	
	//Missing number exercise
	//0 to n, index  = value
	static int missingNum(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			int correctIndex = arr[i];
			//We put arr[i] < arr.length because we can have an array, where an element has a non existent index
			if(arr[i] < arr.length && arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] != index) {
				return index;
			}
		}
		// We can have an array [0, 1, 2, 3] n = 4
		// according to the exercise the array should have n + 1 elements
		//In this case, just return n
		return arr.length;
	}
	
	//1 to n
	static ArrayList<Integer> findDisappearedNums(int[] arr) {
		//normal cyclic sort
		int i = 0;
		while(i < arr.length) {
			int correctIndex = arr[i] - 1;
			if(arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] != index + 1) {
				list.add(index+1);
			}
		}
		return list;
	}
	
	//
	
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
