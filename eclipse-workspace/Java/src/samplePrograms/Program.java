package samplePrograms;

public class Program {
	
	static int i = 5;
	int a = 10;
	public void show(){
		
		System.out.println(i);
		System.out.println(a);
		
	}
	public static void display() {
		System.out.println(i);
//		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Program p = new Program();
		p.show();
//		p.i = 6;
		p.a = 18;
		i= 10;
		display();
		
	}
static {
	System.out.println("Static invoked");
}
}
