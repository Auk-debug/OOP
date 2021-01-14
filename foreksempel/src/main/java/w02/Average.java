package w02;

public class Average {
	int valueCount = 0;
	double sum = 0;

	public void acceptValue(double value) {
		sum += value; // samme som 'sum = sum + value'
		valueCount++; // samme som 'valueCount += 1' eller 'valueCount = valueCount + 1' 
	}
	
	public double getAverage() {
		return sum / valueCount;
	}

	public static void main(String[] args) {
		Average avg = new Average();
		avg.acceptValue(3);
		avg.acceptValue(4);		
		System.out.println(avg.getAverage());
	}
}
