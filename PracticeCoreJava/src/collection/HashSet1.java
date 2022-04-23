package collection;


import java.util.HashSet;

import Employee;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet();
		
		
		
		Employee e1= new Employee(1,"Har");
		Employee e2= new Employee(1,"Har");
		Employee e3= new Employee(3,"Par");
		
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		System.out.println(hs);

	}

}
