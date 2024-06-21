package quiz03;

public class DmbPhone extends Phone {
	
	int channel;
	
	DmbPhone(String pModel, String pColor, int pChannel) {
		
		model = pModel;
		color = pColor;
		channel = pChannel;
		
	}
	
	void turnOnDmb() {
		System.out.println("TV를 켭니다.");
	}
	
	void changeChannel(int channel) {
		System.out.println(channel + "번으로 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("TV를 끕니다.");
	}
	
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
		

}
