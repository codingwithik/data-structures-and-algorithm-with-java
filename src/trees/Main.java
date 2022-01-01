package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(25);
		tree.insert(20);
		tree.insert(15);
		tree.insert(27);
		tree.insert(30);
		tree.insert(29);
		tree.insert(26);
		tree.insert(22);
		tree.insert(32);
		
		tree.traverseInorder();
		System.out.println(tree.contains(29));
//		int nums[] = {4, 1, 2, 1, 2}; 
//        
//		int number = 0;
//        HashSet<Integer> map = 
//            new HashSet<>();
//        
//        for(int i = 0; i < nums.length; i++){
//            if(map.contains(nums[i])) {
//            	map.remove(nums[i]);
//            }else {
//            	map.add(nums[i]);
//            } 
//        }
//        
//        Iterator<Integer> iterator = map.iterator();
//        while(iterator.hasNext()) {
//        	number = iterator.next();
//        }
//        
//        System.out.println(number);

	}

}
