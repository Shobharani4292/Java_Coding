package constructor;

public class Constructor_Demo 
{
	int age;
	String name;
	public Constructor_Demo(int age, String name) {
	super();
//		this keyword helps me to refer the class variable
	this.age = age;
	this.name = name; 
	}
	

	public Constructor_Demo() 
	{
		System.out.println("Constructor Invoked");
	}

	public static void main(String[] args) {
		Constructor_Demo ob=new Constructor_Demo();
		Constructor_Demo ob1=new Constructor_Demo(22,"Shobha");
	    System.out.println(ob1.age);
		System.out.println(ob1.name);
		System.out.println(ob1);
		}

}
