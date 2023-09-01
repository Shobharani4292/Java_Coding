package constructor;

public class Getter_Setter {
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		Getter_Setter  ob = new Getter_Setter();
		ob.setId(56);;
		ob.setName("Sana");
		System.out.println(ob.getId());
	    

	}

}
