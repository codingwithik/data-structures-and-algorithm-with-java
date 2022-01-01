package practice;

public class Intervals {
	
	int startTime;
    int endTime;
    int price;

    Intervals(int startTime, int endTime, int price) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "(" + startTime + ", " + endTime + ", " + price + ")";
    }
}
