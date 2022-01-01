package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DynamicProgramming {

	private static Map<Integer, int[]> map = new HashMap<>();
	private static Map<Integer, Integer> mapFib = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fibMemoization(45));
		int[] numbers = {5,3,4,7};
		Arrays.stream(bestSum(7, numbers)).forEach(System.out::println);
		//System.out.println(list);
	}
	
	private static int fibMemoization(int n) {
		if(mapFib.containsKey(n)) return mapFib.get(n);
		if(n <=2 ) return 1;
		int v = fibMemoization(n-1) + fibMemoization(n-2);
		mapFib.put(n, v);
		return v;
	}
	
	private static int fib(int n) {
		if(n <=2 ) return 1;
		return fib(n-1) + fib(n-2);
	}
	
	private static int[] howSum(int targetSum, int[] numbers){
		if(map.containsKey(targetSum)) return map.get(targetSum);
		if(targetSum == 0) return new int[0];
		if(targetSum < 0) return null;
		
		int[] arr = null;
		for(int i = 0; i < numbers.length; i++) {
			int remainder = targetSum - numbers[i];
			arr = howSum(remainder, numbers); 
			if(arr != null) {
				int[] tmp = new int[arr.length + 1];
				for(int j = 0; j < arr.length; j++) {
					tmp[j] = arr[j];
				}
				tmp[arr.length] = numbers[i];
				map.put(targetSum, tmp);
				return tmp;
			}
		}
		map.put(targetSum, null);
		return null;
	}
	
	private static int[] bestSum(int targetSum, int[] numbers){
		//if(map.containsKey(targetSum)) return map.get(targetSum);
		if(targetSum == 0) return new int[0];
		if(targetSum < 0) return null;
		
		int[] arr = null;
		for(int i = 0; i < numbers.length; i++) {
			int remainder = targetSum - numbers[i];
			arr = howSum(remainder, numbers); 
			if(arr != null) {
				int[] tmp = new int[arr.length + 1];
				for(int j = 0; j < arr.length; j++) {
					tmp[j] = arr[j];
				}
				tmp[arr.length] = numbers[i];
				//map.put(targetSum, tmp);
				arr = tmp;
			}
		}
		//map.put(targetSum, null);
		return arr;
	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(target == 0) return result;
        if(target < 0) return null;
        
        //List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < candidates.length; i++){
            int rem = target - candidates[i];
            if(combinationSum(candidates, rem) !=  null){
            	List<Integer> temp = new ArrayList<>();
            	for(int j = 0; j < candidates.length; j++) {
					temp.add(j);
				}
            	temp.add(candidates[i]);
            	
            	result.add(temp);
            }
        }
        
        return result;
                  
    }

}
