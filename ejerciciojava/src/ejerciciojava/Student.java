package ejerciciojava;
//attributes
public class Student {
	private String name;
	private int age;
	
	//constructor 
	
	public Student(String name, int age) {
			this.name=name;
			this.age=age;
			
	}
	//methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void displayInfo() {
		
		System.out.println("Nommre:"+name);
		System.out.println("edad:"+age);
	}

}
