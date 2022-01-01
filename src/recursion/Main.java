package recursion;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(findFactorialIterative(5));
		//System.out.println(findFactorialRecursive(5));
		
		//System.out.println(fibonnaciIterative(8));
		System.out.println(reverseAStringRecursive("hello"));
	}
	
	//5*4*3*2*1
	static int findFactorialIterative(int number) {
		if(number == 0)
			return 1;
		
		int answer = 1;
		
		while(number > 0) {
			answer *= number;
			
			number--;
		}
		
		return answer;
	}
	
	static int findFactorialRecursive(int number) {
		if(number == 0)
			return 1;
		
		return number * findFactorialRecursive(number - 1);
	}
	
	//0,1,1,2,3,5,8,13,21
	static int fibonnaciIterative(int n) {
		int[] answer = new int[n+1];
		answer[0] = 0;
		answer[1] = 1;
		for(int i = 2; i < n+1; i++) {
			answer[i] = (i-1) + (i-2);
			System.out.println(answer[i]);
		}
		return answer[n];
	}
	
	static int fibonnaciRecursive(int n) {
		if(n < 2)
			return n;
		return fibonnaciRecursive(n-1) + fibonnaciRecursive(n-2);
	}
	
	static String reverseAStringRecursive(String input) {
		if(input.equals("")) {
			return "";
		}
		//System.out.println(input.substring(1)+input.charAt(0)) ;
		return reverseAStringRecursive(input.substring(1)) + input.charAt(0);
	}
}
