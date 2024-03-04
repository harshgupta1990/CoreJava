package collection;

import java.util.Objects;

public class Employee {

	private Integer id;
	private String name;
	
	public Employee()
	{
		id=1;
		name="Bhawani";
	}
	
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("id= " + id + " name= " + name );
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
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
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	

}
