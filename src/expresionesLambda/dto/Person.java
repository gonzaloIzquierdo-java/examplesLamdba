package expresionesLambda.dto;

public class Person {
	private String name;
	private String mote;
	private int age;
	
	
	
	public Person(String name, String mote, int age) {
		super();
		this.name = name;
		this.mote = mote;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMote() {
		return mote;
	}
	public void setMote(String mote) {
		this.mote = mote;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", mote=" + mote + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
