package quiz05;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyAccount my = new MyAccount("홍길동", "1234", 999999);
 	
		my.withDraw(1000);
		
		System.out.println("잔액:" + my.getBalance());
	}

}
