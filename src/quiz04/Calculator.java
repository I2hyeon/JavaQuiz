package quiz04;

public class Calculator {
	
	int result;
	double pi = 3.14;
	
	void add(int a) {
		result += a;
	}
	
	double circle(int r) {
		return pi * r * r;
	}

}