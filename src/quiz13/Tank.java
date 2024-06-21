package quiz13;

public class Tank extends Unit {
	
	public boolean modeFlag = false;
	int hp = 100;
	
	public Tank(int x, int y) {
		super(x, y, 200);
	}
		
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void changeMode() {
		modeFlag = modeFlag ? false : true;
		System.out.println("공격모드를 변경합니다");
	}

	public void location() {
		System.out.println("현재위치:" + x +"," + y);
	}

	

}
