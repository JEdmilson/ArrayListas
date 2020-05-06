package entities;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public double getSalary() {
		return salary;
	}

	public void aumento (double porcentagem) {
		this.salary += salary*porcentagem/100;
	}
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f",salary);
		}
	
	

}
