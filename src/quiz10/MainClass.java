package quiz10;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyCart c = new MyCart(999999);
		
		c.buy( new Tv() );
		c.buy(new Radio());
		c.buy(new Computer());
		c.buy(new Computer());
		c.buy(new Computer());
		c.buy(new Computer());
		c.buy(new Computer());
		
		c.info();
	}

}
