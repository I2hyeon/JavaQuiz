package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		Shape s1 = new Rect("사각형", 5);
		Shape s2 = new Circle("원", 3);
		
		System.out.println(s1.getArea());
		System.out.println(s1.getName());
		System.out.println(s2.getArea());	
		System.out.println(s2.getName());	
		
	}

}
