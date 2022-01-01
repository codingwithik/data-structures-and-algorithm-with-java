package linkedList.doubly;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
//		Employee jane = new Employee("Jane", "Doe", 1001);
//		Employee john = new Employee("John", "Doe", 1002);
//		Employee mary = new Employee("Mary", "Jane", 1003);
//		Employee wilson = new Employee("Wilson", "Perry", 1004);
//		
//		EmployeeDoublyLinkedList linkedList = new EmployeeDoublyLinkedList();
//		
//		linkedList.addToFront(wilson);
//		linkedList.addToFront(mary);
//		linkedList.addToFront(jane);
//		linkedList.addBefore(john, mary);
//		
//		linkedList.printList();
		
		
		//System.out.println(checkifArrayAreEqual(arr1, arr2));
//        System.out.println("Answer = "+averageScore(scores));
        
//        System.out.println("Maximum sum of a subarray of size K: "
//                +findMaxSumSubArray2(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        
    
		
	}
	
	public static int findMaxSumSubArray(int k, int[] arr) {
	    // TODO: Write your code here
	    int maxSum = 0, windowSum;
	    for(int i = 0; i <= arr.length - k; i++){
	      windowSum = 0;
	      System.out.print("index i = "+i);
	      for(int j = i; j < i + k; j++){
	    	  System.out.println("index j = "+j);
	        windowSum += arr[j];
	      }
	      maxSum = Math.max(maxSum, windowSum);
	    }
	    return maxSum;
	  }
	
	public static int findMaxSumSubArray2(int k, int[] arr) {
	    int windowSum = 0, maxSum = 0;
	    int windowStart = 0;
	    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
	      windowSum += arr[windowEnd]; // add the next element
	      System.out.println("window End outside = "+windowEnd);
	      // slide the window, we don't need to slide if we've not hit the required window size of 'k'
	      if (windowEnd >= k - 1) {
	    	  //tSystem.out.println("window End inside = "+windowEnd);
	        maxSum = Math.max(maxSum, windowSum);
	        windowSum -= arr[windowStart]; // subtract the element going out
	        windowStart++; // slide the window ahead
	      }
	    }

	    return maxSum;
	  }
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int totalMultiplication = A[0];
        for(int i = 1; i < A.length; i++){
            totalMultiplication *= A[0];
        }
        
        
        int answer = 0;
        answer = totalMultiplication > 0 ? 1 : -1;

        if(totalMultiplication > 0)
           answer = 1;
        else if(totalMultiplication < 0)
           answer = -1;

        return answer;
    }
	public static boolean checkifArrayAreEqual(int[] arr1, int[] arr2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr1.length; i++) {
        	if(map.containsKey(arr1[i])) {
        		//System.out.println("contains "+arr1[i]+" ="+(map.get(arr1[i])+1));
        		map.put(arr1[i], map.get(arr1[i]) + 1);
        	}else {
        		map.put(arr1[i], 1);
        	}
        
        }
        
        for(int i = 0; i < arr2.length; i++) {
        	if(!map.containsKey(arr2[i])) {
        		return false;
        	}
        	
        	if(map.get(arr2[i]) == 0) {
        		System.out.println("check "+arr2[i]+" = "+map.get(arr2[i]));
        		return false;
        	}
        	
        	System.out.println("contains "+arr2[i]+" = "+(map.get(arr2[i])));
        	map.put(arr2[i], map.get(arr2[i]) - 1);
        		
        }
        
        return true;
    }
	


	  
	  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        
	        StringBuilder firstString = new StringBuilder();
	        StringBuilder secondString = new StringBuilder();
	        
	        for(int i = 0; i < word1.length; i++){
	            firstString.append(word1[i]);
	        }
	        
	        for(int i = 0; i < word2.length; i++){
	            secondString.append(word2[i]);
	        }
	        
	        return firstString.toString().equals(secondString.toString());
	  }
	  
	  
	  
	  
	  public class Products{
		
		  private String name;
		  private String color;
			
	  }
}


