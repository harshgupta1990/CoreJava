package java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8StreamsApplication 
{

	static ArrayList<Employee> empList= new ArrayList<Employee>();
	
	public static void method1(List<Employee> empList)
	{
		String nameOfHighestPaidEmployee=empList.stream()
												.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
												.get()
												.getName(); 
		System.out.println(nameOfHighestPaidEmployee);
	}
	
	public static void method2(List<Employee> empList)
	{
		List<Employee> listOfEmployeeJoiningAfter2014 = empList.stream()
															   .filter(e -> e.getYearOfJoining()>2014)
															   .collect(Collectors.toList());
		System.out.println(listOfEmployeeJoiningAfter2014);
	}
	
	public static void method3(List<Employee> empList)
	{
		Map<String, Long> noOfMaleAndFemaleEmployee=empList.stream()
						.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployee);
	}
	
	public static void method4(List<Employee> empList)
	{
		Double avgSal= empList.stream()
							  .collect(Collectors.averagingDouble(Employee::getSalary));
		
		System.out.println(avgSal);
	}
	
	public static void method5(List<Employee> empList)
	{
		List<String> nameOfAllDepartments= empList.stream()
												  .map(Employee::getDept)
												  .distinct()
												  .collect(Collectors.toList());
	
		System.out.println(nameOfAllDepartments);
	}
	
	public static void method6(List<Employee> empList)
	{
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployee= empList.stream()
												  .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getSalary)));
		System.out.println(avgSalaryOfMaleAndFemaleEmployee);
	}
	
	public static void method7(List<Employee> empList)
	{
		Optional<String> nameOfEmployeeWithMaxExp= empList.stream()
													  .sorted((a,b) ->a.getYearOfJoining()).map(Employee::getName) 
													  .findFirst();
		System.out.println(nameOfEmployeeWithMaxExp);
	}
	
	public static void method8(List<Employee> empList)
	{
		Optional<Employee> youngestFemaleEmployeeFromHRDepartment= empList.stream()
													  .filter(emp -> emp.getGender()=="Female" && emp.getDept()=="HR")
													  .max(Comparator.comparing(Employee::getAge));
		System.out.println(youngestFemaleEmployeeFromHRDepartment.get());
	}
	
	public static void method9(List<Employee> empList)
	{
		Double avgAgeOfEmployees=empList.stream().collect(Collectors.averagingInt(Employee::getAge));
		System.out.println(avgAgeOfEmployees);
	}
	
	public static void method10(List<Employee> empList)
	{
		Optional<String> nameOfEmployeeWith3rdHighestSalary=empList.stream()
													.sorted((a,b) -> b.getSalary()-a.getSalary()).map(Employee::getName)
													.skip(2)
													.findFirst();
		System.out.println(nameOfEmployeeWith3rdHighestSalary.get());
		
	}
	
	
	
	public static void main(String[] args) 
	{
		empList.add(new Employee(1111, "Piyush", 28, 20000, "IT", "M", 2013) );
		empList.add(new Employee(2222, "Ajay", 23, 25000, "HR", "M", 2011) );
		empList.add(new Employee(3333, "Vijay", 31, 60000, "Accounts", "M", 2013) );
		empList.add(new Employee(4444, "Karan", 22, 27000, "IT", "M", 2019) );
		empList.add(new Employee(5555, "Vikas", 65, 100000, "Accounts", "M", 2014) );
		empList.add(new Employee(6666, "Ankit", 43, 90000, "Hr", "M", 2017) );
		empList.add(new Employee(7777, "Mayank", 19, 19000, "IT", "M", 2015) );
		empList.add(new Employee(8888, "Shruti", 35, 75000, "Ops", "F", 2018) );
		empList.add(new Employee(9999, "Shraddha", 39, 85000, "IT", "F", 2020) );
		
		//https://www.youtube.com/watch?v=4qnT-ya9HGk
		
		System.out.println("1. Get name of highest paid employee");
		method1(empList);
		
		System.out.println("2. Get the list of employees joining after 2014");
		method2(empList);
		
		System.out.println("3. Get no of male and female employees");
		method3(empList);
		
		System.out.println("4. Get average salary of employee");
		method4(empList);
		
		System.out.println("5. Get name of all departments");
		method5(empList);
		
		System.out.println("6. Get average salary of male and female employees");
		method6(empList);
		
		System.out.println("7. Get name of employee with maximum experience");
		method7(empList);
		
		System.out.println("8. Find youngest female employee from HR department");
		method8(empList);
		
		System.out.println("9. Get average age of employee");
		method9(empList);
		
		System.out.println("10. Get name of employee with 3rd highest salary");
		method10(empList);
		
		
	}
}
