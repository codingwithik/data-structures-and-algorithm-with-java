package linkedList;

public class Main {
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(10);
		list.insert(18);
		list.insertAtStart(25);
		
		list.insertAt(2, 55);
		list.deleteAt(3);
		
		list.show();
		
	}
	
	public int titleToNumber(String s) {
        if(s == ""){
            return 0;
        }
        int sum = 0;
        for(int i =0; i < s.length(); i++){
            sum = sum + ((int)Math.pow(26, i) * ((int)s.charAt(s.length()-1-i) - 64));
        }
        return sum;
    }
	
	public int titleToNumber2(String s) {
        int result = 0;
        int power = s.length()-1;
        for (int i =0; i<s.length(); i++){
            double temp = (s.charAt(i) -64) * Math.pow(26, power);
            power--;
            result +=temp;
        }
    return Integer.valueOf(result);
    }
	
}
