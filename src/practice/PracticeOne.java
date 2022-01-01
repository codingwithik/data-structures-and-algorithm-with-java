package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import trees.TreeNode;


public class PracticeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//		 List<Intervals> list = new ArrayList<>();
//	    Intervals obj1 = new Intervals(1,5,20);
//	    Intervals obj2 = new Intervals(3,8,15);
//	    Intervals obj3 = new Intervals(8,10,8);
//	    list.add(obj1);
//	    list.add(obj2);
//	    list.add(obj3);
//	    list = getIntervals(list);
//        for(Intervals interval : list)
//            System.out.println(interval.toString());
        
//		int[] scores = {100, 50, 50, 25};
//		System.out.println("Cut off=== " + cutOffRank(3, 4, scores));
		
		int[] nums = {1721, 979, 366, 299, 675, 1456};
//		System.out.println(threeSum(2020, nums));
//		System.out.println(countDown(5));
		countDown(3);
	}
	

	public static int cutOffRank(int cutOffRank, int num, int[] scores) {
	    if(cutOffRank == 0) return 0;
	    int[] cache = new int[101];
	    for (int n : scores){
	        cache[n]++;
	    }
	    
	    System.out.println("num ="+  cache[25]);
	    for(int i = 0; i <= scores.length; i++) {
	    	
	    }
	    
	    
	    int  res = 0;
	    for (int i = 100; i > 0; i--){
	        if (cutOffRank <= 0) break;
	        cutOffRank -= cache[i];
	        //System.out.println("num "+i+" = " + cutOffRank +" -= "+  cache[i]);
	        res += cache[i];
	    }    
	    return res;
	}
	
	public int rank(int k, int n, int[] scores) {
		if(k <= 0) return 0;
		return 0;
	}
	
	public static int threeSum(int target, int[] nums) {
		
		Map<Integer, String> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				map.put(nums[i] + nums[j], nums[i]+" "+nums[j]);
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				String[] split = map.get(target-nums[i]).split(" ");
				int num1 = Integer.valueOf(split[0]);
				int num2 = Integer.valueOf(split[1]);
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(nums[i]);
				return nums[i] * num1 * num2;
			}
			
		}
		
		return 0;
	}
	
	private static int longestSubstring(String s) {
		
		if(s.length() == 0 || s == null) return 0;
		
		int left = 0;
		int right = 0;
		int max = 0;
		Set<Character> set = new HashSet<>();
		
		while(right < s.length()) {
			char c = s.charAt(right);
			if(!set.contains(c)) {
				set.add(c);
				max = Math.max(max, right-left+1);
				right++;
			}else {
				set.remove(s.charAt(left));
				left++;
				max = Math.max(max, right-left+1);
			}
		}
		return max;
	}
	
	 public static int myAtoi(String s) {
        if(s.length() == 0 || s == null) return 0;
        
//        if((s.charAt(0) >= 'a' || s.charAt(0) <= 'z') &&
//          (s.charAt(0) >= 'A' || s.charAt(0) <= 'Z')) return 0;
            
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
        	
            if(s.charAt(i) != ' '){
            	System.out.println("no space "+s.charAt(i));
                if(s.charAt(i) == '+' || s.charAt(i) == '-') result.append(s.charAt(i));
                else if((s.charAt(i) >= '0' && s.charAt(i) <= '9')) result.append(s.charAt(i));
                else break;
            }else {
            	System.out.println("space");
            }
            
        }
        
        return Integer.MIN_VALUE;//result.toString().length() == 0 ? 0 : Integer.parseInt(result.toString());
	 }

	 public static void countDown(int n) {
		 if(n == 0) {
			 System.out.println("boooooo");
			 return;
		 }
		 
		 for(int i = 0; i < n; i++) {
			 countDown(n-1);
		 }
	 }
	 
	 public String reverseWords(String s) {
	        
	        StringBuilder result = new StringBuilder();
	        String[] arr = s.split(" ");
	        for(int i = 0; i < arr.length; i++){
	            String word = arr[i];
	            char[] c = word.toCharArray();
	            int left = 0; int right = c.length - 1;
	            while(left <= right) {
	            	char temp = c[left];
	            	c[left++] = c[right];
	            	c[right--] = temp;
	            }
	            result.append(c.toString()).append(" ");
	        }
	        result.deleteCharAt(result.length());
	        
	        return result.toString();
	   }
	 
	 public boolean checkInclusion(String s1, String s2) {
	        
	        if(s1.length() == 0 || s2.length() == 0) return false;
	        if(s1.length() > s2.length()) return false;
	        
	        int l1 = 0, r1 = s1.length();
	        
	        StringBuilder firstString = new StringBuilder();
	        firstString.append(s1).reverse().toString();
	        
	        if(s1.length() == s2.length() && s1.equals(s2)) return true;
	            
	        while(r1 <= s2.length()){
	            
	            String secondString = s2.substring(l1, r1);
	            //secondString.append(s2.substring(l1, r1)).toString();
	            char[] sortedString = secondString.toCharArray();
	            Arrays.sort(sortedString);
	            System.out.println("firstString = "+firstString);
	            System.out.println("secondString = "+secondString);
	            if(s1.equals(sortedString.toString())){
	                return true;
	            }
	            l1++; r1++;
	        }
	            
	        return false;
	    }
	 
}
