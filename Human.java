
public class Human {
	private String name;
	private double age;

	public Human() {
		this.setName("Cruella DeVille");
		this.setAge(Double.POSITIVE_INFINITY);
	}
	
	public Human(String name, double age) {
		this.setName(name);
		this.setAge(age);
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
