package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayStructures{

	public static void main(String[] args) {
		 int[] array = {0,7,11,1};
		 int[] array2 = {0,4,6,7,30};
		 int[] arr = {2, 5, 5, 2, 3, 5, 1, 2, 4};
		 int[] arr2 = {};
		 
		 System.out.println(firstOccuringNumber(arr2));
	}
	
	//log all pair of an array
	  static void logPairs(int[] array){

	    for(int i = 0; i < array.length; i++){
	      for(int j = 0; j < array.length; j++){
	        System.out.println("Pair = "+ array[i]+" , "+ array[j]);
	      }
	    }
	  }

	  static boolean containsCommonItem(int[] arr1, int[] arr2){
	    Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
	    for(int i = 0; i < arr1.length; i++){
	      if(!map.containsKey(arr1[i])){
	        map.put(arr1[i], true);
	      }
	    }

	    for(int j = 0; j < arr2.length; j++){
	      if(map.containsKey(arr2[j])){
	        return true;
	      }
	    } 
	    return false;
	  }

	  static boolean hasPairWithSum(int[] arr, int sum){
	    
	    for(int i = 0; i < arr.length; i++){
	      for(int j = 1; j < arr.length; j++){
	          if(arr[i] + arr[j] == sum){
	            return true;
	          }
	      }
	    }
	    return false;
	  }

	  static boolean hasPairWithSum2(int[] arr, int sum){
	    
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i = 0; i < arr.length; i++){
	      if(map.containsKey(arr[i])){
	        return true;
	      }
	      map.put(sum - arr[i], arr[i]);
	    }
	    return false;
	  }

	  static String reverseAString(String input){
	    String reversedString = "";
	    for(int i = input.length()-1; i >= 0; i--){
	        reversedString += input.charAt(i);
	    }
	    return reversedString;
	  }
	  
	  static String reverseAStringTwo(String input){
		    
		 return new StringBuilder(input).reverse().toString();
	  }
	  
	  static int[] mergeSortedArrays(int arr1[], int arr2[]) {
		  int[] mergedArray = new int[arr1.length + arr2.length];
		  
		  int num = 0;
		  int i = 0;
		  int j = 0;
		  
		  while(i < arr1.length && j < arr2.length) {
			 
			 if(arr1[i] < arr2[j]) {
				 mergedArray[num] = arr1[i];
				 i++;
			 }else {
				 mergedArray[num] = arr2[j];
				 j++;
			 }
			 num++;
		  }
		  
		  while(i < arr1.length) {
			  mergedArray[num] = arr1[i];
			  i++;
			  num++;
		  }
		  
		  while(j < arr2.length) {
			  mergedArray[num] = arr1[j];
			  j++;
			  num++;
		  }
	        
	        for(int m = 0; m < mergedArray.length; m++) {
				  System.out.print(mergedArray[m]+" ");
			 }
	        
	      return mergedArray;
	  }
	  
	  static int[] twoSum(int[] nums, int target) {
	        
		  int[] total = new int[2];
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(map.containsKey(target - nums[i])){
	                total[0] = map.get(target - nums[i]);
	                total[1] = i;
	            }
	            map.put(nums[i], i);    
	            
	        }
	        
	        System.out.println(map.toString());
	        
	        return total;
	    }
	  
	  //{2,7,11,0}
	  
	  static int firstOccuringNumber(int[] arr) {
		  
		  int temp = 0;
		  
		  if(arr.length == 0 || arr.length == 1)
			  return 0;
		  
		  for(int i = 0; i < arr.length; i++) {
			  for(int j = i+1; j < arr.length; j++) {
				  if(temp == arr[j]) {
					  return temp;
				  }else if(arr[i] == arr[j]){
					  return arr[i];
				  }
				  temp = arr[j];
			  }
		  }
		  return 0;
	  }
}
