package test;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
//	@Override
//	public int hashCode() {
//		return id;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		
//		Employee e = (Employee) obj;
//		
//		return ( (e.id==this.id) && (e.getName().equals(this.name)) );
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
