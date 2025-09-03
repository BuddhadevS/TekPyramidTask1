package StringClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private String name;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	private String department;
	private double salary;

	// Constructor
	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Abir", "IT", 50000), new Employee("Buddha", "HR", 40000),
				new Employee("Sahu", "IT", 55000), new Employee("Rita", "Finance", 80000),
				new Employee("Kushal", "IT", 50000),

				new Employee("Ashis", "HR", 40000), new Employee("Nimy", "IT", 55000),
				new Employee("Arabinda", "Finance", 60000), new Employee("Pagla", "IT", 50000),
				new Employee("Kalu", "Developer", 40000), new Employee("Bittu", "Student", 55000),
				new Employee("Buddha", "Engineer", 60000));

		// Get names of all employees in IT department
		List<String> itEmployees = employees.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("IT"))
				.map(Employee::getName).collect(Collectors.toList());

		// System.out.println("Employees in IT: " + itEmployees);

		List<String> upperNames = employees.stream().map(emp -> emp.getName().toUpperCase())
				.collect(Collectors.toList());

		// System.out.println("Employee names in uppercase: " + upperNames);

		double avgSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		// System.out.println(avgSalary);

		List<String> highSalaryName = employees.stream().filter(e -> e.getSalary() > 50000).map(Employee::getName)
				.toList();
		// System.out.println(highSalaryName);

		// 26. Sort employees by salary in descending order

		List<Employee> sortedBySalary = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());

		// sortedBySalary.forEach(e -> System.out.println(e.getName() + " - " +
		// e.getSalary()));

		// 27. Count employees in each department.

		Map<String, Long> empDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		// System.out.println("Emp in each dept is : " + empDept);

		// 28. Group employees by department

		Map<String, List<Employee>> groupDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		// System.out.println("Employees grouped by dept " + groupDept.keySet());

		// 29. Get the employee with the highest salary.

		Employee maxSalEmp = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		//System.out.println("Max sal emp " + maxSalEmp.getName()+" "+ maxSalEmp.getSalary());
		
		
//30.	Get a list of departments without duplicates.
		 List<String> uniDept = employees.stream().map(Employee::getDepartment).distinct().toList();
	        //System.out.println("Unique depatment is : " + uniDept);
	        
	        
	        
	        //31.	Get a map of employee ID to name
	        
//	        Map<Integer, String> idToName = employees.stream()
//	                .collect(Collectors.toMap(Employee::getId,Employee::getName));
//	        System.out.println("Id to name map: " +idToName);
//	        
	        
		
	        //32.	Get names of employees older than 30, joined as a comma-separated string
	        
	        String old = employees.stream().filter(n->n.getSalary()>30)
	                .map(Employee::getName).collect(Collectors.joining(", "));
	        //System.out.println("Employees older than 30 : " + old);
	        
	        
	        //33.	Get list of employees whose name starts with "A".

	        List<Employee> startWithA = employees.stream()
	                .filter(e->e.getName().startsWith("A")).collect(Collectors.toList());
	        //System.out.println("Employees whose name start with is : " + startWithA);

		
		
	        //34.	Get total salary of all employees in "HR" department.
	        
	        double totSalHr = employees.stream().filter(e->e.getDepartment().equals("HR"))
	                .mapToDouble(Employee::getSalary).sum();
	        //System.out.println("Total salary of each employee in Hr : " + totSalHr);
	        
	        
	        //35.	Get all employee names with length greater than 5 characters.
	        List<String> lengthGreater5 = employees.stream().map(Employee::getName).filter(n->n.length()>5).toList();
	        System.out.println("Name length > 5 :  "  + lengthGreater5);
	        
	        
	        
	        //36.	Find any employee in "Finance" department.

	        Optional<Employee> find = employees.stream().filter(n->n.getDepartment().equals("Finance")).findAny();
	        //System.out.println("Any finance employee : " + find);
	        
	        
	        //37.	Get a list of all employee IDs sorted in ascending order
	        
//	        List<Integer> sortedId = employees.stream().map(Employee::getId).sorted().toList();
//	        System.out.println(sortedId);
	        
	        
	        //38.	Partition employees by age greater than or less than 40.
	        
	        Map<Boolean, List<Employee>> ageGreaterFortyPartition = employees.stream()
	                .collect(Collectors.partitioningBy(e->e.getSalary()>40000));
	        
	        System.out.println("employee age greater than 40 : " + ageGreaterFortyPartition );
	        
	        
	        //39.	Find employee names having the second-highest salary
	        
	        int n = 3; // nth maximum salary

	        double nthMaxSalary = employees.stream()
	                                       .map(Employee::getSalary)
	                                       .distinct()
	                                       .sorted(Comparator.reverseOrder())
	                                       .skip(n - 1)          // skip first (n-1) max salaries
	                                       .findFirst()          // get nth max
	                                       .orElse(0.0);

	        List<String> names = employees.stream()
	                                      .filter(e -> e.getSalary() == nthMaxSalary)
	                                      .map(Employee::getName)
	                                      .collect(Collectors.toList());

	        System.out.println(n + "th maximum salary: " + nthMaxSalary);
	        System.out.println("Employees with " + n + "th maximum salary: " + names);

	        
	        
	        //40.	Get list of employee names whose salary is between 50,000 and 1,00,000.
	        
	        List<String> salaryBetween = employees.stream()
	                .filter(e->e.getSalary() >= 50000 && e.getSalary() <= 100000)
	                .map(Employee::getName)
	                .toList();
	        System.out.println("Employee with salary in between 50000-100000 : " + salaryBetween);
	        
	        
	        
	        //Create a map of department to list of employee names
	        
	        Map<String, List<String>> deptToNames = employees.stream()
	                .collect(Collectors.groupingBy(Employee::getDepartment,
	                        Collectors.mapping(Employee::getName, Collectors.toList())));
	        System.out.println("Department to names: " + deptToNames);
	        
	        

	        
	}

}
