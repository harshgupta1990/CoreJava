package immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

class Address {
	
	private String city;
	private String zip;
	
	
	public Address(String city, String zip) {
		super();
		this.city = city;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zip=" + zip + "]";
	}
	
}

final class Employee {
	
	private final String name;
	private final List<String> mobile;
	private final Address address;
	private final Date dob;
	

	public Employee(String name, List<String> mobile, Address address, Date dob) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.dob = dob;
	}
	
	

	public String getName() {
		return name;
	}



	public List<String> getMobile() {
		return Collections.unmodifiableList(mobile);
	}



	public Address getAddress() {
		return new Address(address.getCity(),address.getZip() );
	}



	public Date getDob() {
		return (Date)dob.clone();
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobile=" + mobile + ", address=" + address + ", dob=" + dob + "]";
	}



	public static void main(String[] args) {
			
			Employee emp = new Employee("Harshit", Arrays.stream(new String[] {"34234","45345"}).collect(Collectors.toList()), new Address("pune","464") , new Date());
	
			System.out.println(emp);
			
			//emp.getMobile().add("3646");             // Collections$UnmodifiableCollection  
			
			emp.getDob().setDate(15);
			
			emp.getAddress().setCity("delhi");
			
			System.out.println(emp);     
			
	}

}
