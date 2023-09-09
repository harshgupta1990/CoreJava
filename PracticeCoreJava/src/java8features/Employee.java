package java8features;

import java.util.Objects;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private int salary;
	private String dept;
	private String gender;
	private int yearOfJoining;
	public Employee(int id, String name, int age, int salary, String dept, String gender, int yearOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.gender = gender;
		this.yearOfJoining = yearOfJoining;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, dept, gender, id, name, salary, yearOfJoining);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(dept, other.dept) && Objects.equals(gender, other.gender)
				&& id == other.id && Objects.equals(name, other.name) && salary == other.salary
				&& yearOfJoining == other.yearOfJoining;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept
				+ ", gender=" + gender + ", yearOfJoining=" + yearOfJoining + "]";
	}
	
	
}
