 package com.dinesh.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeManagement {
	
	static List<Employee> employelist=new ArrayList<>();

	public static void main(String[] args) {
		
		EmployeeFactory factory=new EmployeeFactory();
		employelist=factory.getAllEmployee();
		
		/* List all distinct project in non-ascending order. */
		List<Project> result=employelist.stream().flatMap(employelist->employelist.getProjects().stream())
				.distinct().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		System.out.println();
		
		/* Print full name of any employee whose firstName starts with ‘A’. */
		employelist.stream().filter(employelist->employelist.getFirstName().startsWith("B"))
				.map(employelist->employelist.getFirstName()).forEach(System.out::println);
		System.out.println();
		/*
		 * List of all employee who joined in year 2023 (year to be extracted from
		 * employee id i.e., 1st 4 characters)
		 */
		
//		employelist.stream().filter(employelist-> employelist.getId().substring(0,3)).forEach(employelist-> System.out.println(employelist));
//				.equals("2023")).forEach(employelist-> System.out.println(employelist));
		
		employelist.stream().filter(employelist-> employelist.getId().startsWith("2023")).forEach(System.out::println);
		
		System.out.println();
		
		/* Sort employees based on firstName, for same firstName sort by salary */
		
//		List<Employee> sortedemp=employelist.stream().sorted((p1,p2)->p1.getFirstName().compareTo(p2.getFirstName())).collect(Collectors.toList());
		
		employelist.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparingInt(Employee::getSalary))
		.forEach(System.out::println);
		
		/*
		 * Print names of all employee with 3rd highest salary. (generalise it for nth
		 * highest salary).
		 */
	
		System.out.println();
		
		employelist.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().ifPresent(emp->System.out.println(emp.getSalary()));
		
		System.out.println();
		
		/* Print min salary. */
		
		employelist.stream().min(Comparator.comparingInt(Employee::getSalary)).ifPresent(emp->System.out.println(emp.getSalary()));
		
		System.out.println();
		
		/* Print list of all employee with min salary. */
		
		employelist.stream().min(Comparator.comparingInt(Employee::getSalary)).ifPresent(min-> 
		employelist.stream().filter(employelist-> employelist.getSalary()==min.getSalary()).forEach(emp->System.out.println(emp)));
		
		System.out.println();
		
		/* List of people working on more than 2 projects. */
		
		employelist.stream().filter(employelist-> employelist.getProjects().size()>2).forEach(employelist-> System.out.println(employelist));
		
		System.out.println();
		
		/* Count of total laptops assigned to the employees. */
		
		int sum=employelist.stream().mapToInt(employelist -> employelist.getTotalLaptopsAssigned()).sum();
		System.out.println(sum);
			
		/* Count of all projects with Robert Downey Jr as PM. */
		
		long countproject=employelist.stream().flatMap(employelist -> employelist.getProjects().stream()).filter(project -> project.getProjectManager().equals("Robert Downey Jr")).count();
		
		System.out.println(countproject);
		
		/* List of all projects with Robert Downey Jr as PM. */
		
		employelist.stream().flatMap(employelist -> employelist.getProjects().stream()).filter(project ->project.getProjectManager().equals("Robert Downey Jr")).forEach(employelist -> System.out.println(employelist));
		
		System.out.println();
		
		/* List of all people working with Robert Downey Jr. */
		
		List<Employee> list=employelist.stream().filter(employelist -> employelist.getProjects().stream().anyMatch(project -> project.getProjectManager().equals("Robert Downey Jr"))).collect(Collectors.toList());
	
		list.stream().forEach(emp -> System.out.println(emp));
		
		/*
		 * Create a map based on this data, they key should be the year of joining, and
		 * value should be list of all the employees who joined the particular year.
		 */
		
		Map<String,List<Employee>> map=new HashMap<>();
		
		List<Employee> emplist=new ArrayList<>();
		
		map=employelist.stream().collect(Collectors.groupingBy(employee->employee.getId().substring(0, 4)));
		
		for (Entry<String, List<Employee>> maping : map.entrySet()) {
			
			System.out.println("Key "+maping.getKey()+" , "+"Values "+maping.getValue());
		}
		
		/*
		 * Create a map based on this data, the key should be year of joining and value
		 * should be the count of people joined in that particular year.
		 */

		Map<String,Long> maping1=employelist.stream().collect(Collectors.groupingBy(employee -> employee.getId().substring(0, 4),Collectors.counting()));
		
		System.out.println(maping1);
	}

}
