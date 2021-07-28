package practice;


public class PracticeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[] scores = {100, 50, 50, 25};
		System.out.println("Cut off=== " + cutOffRank(3, 4, scores));
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

}
