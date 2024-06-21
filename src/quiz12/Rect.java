package quiz12;

public class Rect extends Shape{
	
	private int side;
	
	//사각형은 생성될 때 도형이름과, 변의 길이를 받고 초기화합니다.
	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}
	
	//getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
	public double getArea() {
		return side*side;
	}
	
	
	//main에서 객체를 생성해서 확인하세요
	


}
