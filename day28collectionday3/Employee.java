package day28collectionday3;

public class Employee {
	private String name;
    private String position;
    private double salary;
    private int age;
    public Employee() {}
	public Employee(String name, String position, double salary, int age) {
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + ", age=" + age + "]";
	}
    
    
}
