package constructor;

public class Constructor_demo {
	int age;
	String name;
	

	public Constructor_demo(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public Constructor_demo() {
		super();
		System.out.println("Constructor Invoked");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Constructor_demo ob = new Constructor_demo();
		Constructor_demo ob2 = new Constructor_demo(22, "Shobharani");
		System.out.println(ob2.age);
		
	}
	
}