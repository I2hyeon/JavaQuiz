package quiz02;

public class Person {
	
	String name;
	int age;
	int tall;
	
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	// 생성자를 프로그래머가 만들면, 기본생성자를 자동으로 만들지 않음
	Person() {
		
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: " + tall);
	}

}
