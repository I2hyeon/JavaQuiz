package quiz20;

public class Data {
	
	private String name;
	private String age;
	private String email;
	private String direction;
	
	
	public Data() {
	}
	
	public Data(String name, String age, String email, String direction) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.direction = direction;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}


	@Override
	public String toString() {
		return "Data [이름:" + name + ", 나이:" + age + ", email:" + email + ", 지역: " + direction + "]";
	}

	
	
}
