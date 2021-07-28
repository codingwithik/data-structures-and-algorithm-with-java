package sorting;

public class SeletionSort {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0;
				lastUnsortedIndex--) {
			
			int largestIndex = 0;
			
			for(int i = 1; i <= lastUnsortedIndex; i++) {
				if(intArray[largestIndex] < intArray[i]) {
					largestIndex = i;
				}
					
			}
			swap(intArray, largestIndex, lastUnsortedIndex);
		}
		
		for(int i = 0; i < intArray.length; i++)
			System.out.print(" "+intArray[i]);
		

	}
	
	public static void swap(int[] arr, int i, int j) {
		if(i == j)
			return;
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
