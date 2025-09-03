package StringClass2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopPaidEmployees {

	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee(1, "Alice", "IT", 75000, 30),
	            new Employee(2, "Bob", "HR", 50000, 28),
	            new Employee(3, "Charlie", "Finance", 90000, 35),
	            new Employee(4, "David", "IT", 120000, 40),
	            new Employee(5, "Eve", "Finance", 110000, 32)
	        );

	        //Find the top 3 highest-paid employees.
	        List<Employee> top3 = employees.stream()
	                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())) // descending
	                .limit(3)
	                .toList();

	        System.out.println("Top 3 highest-paid employees:");
	        top3.forEach(System.out::println);
	        
	        
	        
	        
	        
	        
	        
	       
	        //last 2 young employee
	        Employee youngest = employees.stream()
	                .reduce((e1, e2) -> e1.age < e2.age ? e1 : e2)
	                .orElse(null);
	        
	        // Find second youngest (exclude first)
	        Employee secondYoungest = employees.stream()
	                .filter(e -> e != youngest)
	                .reduce((e1, e2) -> e1.age < e2.age ? e1 : e2)
	                .orElse(null);

	        System.out.println("Bottom 2 youngest employees:");
	        System.out.println(youngest);
	        System.out.println(secondYoungest);
	        
	        
	        
	        
	        
	        
	        
	        //Find the department with maximum employees
	        String maxDept = employees.stream()
	                .collect(Collectors.groupingBy(e -> e.department, Collectors.counting()))
	                .entrySet().stream()
	                .max((a, b) -> Long.compare(a.getValue(), b.getValue())) // simple comparator
	                .get().getKey();

	        System.out.println("Max employees in department: " + maxDept);
	        
	        
	        
	        //Find the department with the highest total salary
	        
	        String maxSalaryDept = employees.stream()
	                .collect(Collectors.groupingBy(e -> e.department, Collectors.summingDouble(e -> e.salary)))
	                .entrySet().stream()
	                .max((a, b) -> Double.compare(a.getValue(), b.getValue()))
	                .get().getKey();

	        System.out.println("Department with highest total salary: " + maxSalaryDept);
	        
	        
	        
	        
	        
	        
	        //Group employees by salary range (<50K, 50K–100K, >100K).
	        
	        Map<String, List<Employee>> salaryGroups = employees.stream()
	                .collect(Collectors.groupingBy(e -> {
	                    if (e.salary < 50000) return "<50K";
	                    else if (e.salary <= 100000) return "50K-100K";
	                    else return ">100K";
	                }));

	        salaryGroups.forEach((range, list) -> {
	            System.out.println(range + ": " + list);
	        });
	        
	        
	        
	        
	        
	        
	        //Create a map of department -> average salary.

	        Map<String, Double> avgSalaryByDept = employees.stream()
	                .collect(Collectors.groupingBy(
	                        e -> e.department,
	                        Collectors.averagingDouble(e -> e.salary)
	                ));

	        avgSalaryByDept.forEach((dept, avg) -> 
	                System.out.println(dept + ": " + avg));
	        
	        
	        
	        
	        
	        //Create a map of department -> list of employee ages
	        Map<String, List<Integer>> deptAges = employees.stream()
	                .collect(Collectors.groupingBy(
	                        e -> e.department,
	                        Collectors.mapping(e -> e.age, Collectors.toList())
	                ));

	        deptAges.forEach((dept, ages) -> System.out.println(dept + ": " + ages));
	        
	        
	        //Get employees who earn more than the average salary.
	        
	        
	        
	     // Step 1: Calculate average salary
	        double avgSalary = employees.stream()
	                                    .mapToDouble(e -> e.salary)
	                                    .average()
	                                    .orElse(0.0);

	        // Step 2: Filter employees above average
	        List<Employee> aboveAvg = employees.stream()
	                                           .filter(e -> e.salary > avgSalary)
	                                           .collect(Collectors.toList());

	        System.out.println("Employees earning above average salary (" + avgSalary + "):");
	        aboveAvg.forEach(System.out::println);
	        
	        
	        
	        
	        
	        //Find employees who joined earliest (if joinDate is available).
	        
//	        // Step 1: Find the earliest join date
//	        LocalDate earliestDate = employees.stream()
//	                .map(e -> e.joinDate)
//	                .min(LocalDate::compareTo)
//	                .orElse(null);
//
//	        // Step 2: Filter employees with that join date
//	        List<Employee> earliestJoiners = employees.stream()
//	                .filter(e -> e.joinDate.equals(earliestDate))
//	                .collect(Collectors.toList());
//	        
//
//	        System.out.println("Employees who joined earliest (" + earliestDate + "):");
//	        earliestJoiners.forEach(System.out::println);
	        
	        
	        
	        //Sort employees by salary descending, then by age ascending
	        
	        List<Employee> sorted = employees.stream()
	                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
	                        .thenComparingInt(e -> e.age))
	                .collect(Collectors.toList());

	        sorted.forEach(System.out::println);
	        
	        
	        
	        
	        //Get all distinct skills from employees
	        
//	        List<String> distinctSkills = employees.stream()
//	                .flatMap(e -> e.skills.stream()) // flatten all skill lists
//	                .distinct()                     // remove duplicates
//	                .collect(Collectors.toList());
//
//	        System.out.println("All distinct skills: " + distinctSkills);
	        
	        
	        
	        
	        
	        
	        
	        //Find the second-highest and third-highest salary using streams.
	        List<Double> topSalaries = employees.stream()
	                .map(e -> e.salary)
	                .distinct()
	                .sorted(Comparator.reverseOrder())
	                .collect(Collectors.toList());

	        if (topSalaries.size() >= 3) {
	            System.out.println("Second-highest salary: " + topSalaries.get(1));
	            System.out.println("Third-highest salary: " + topSalaries.get(2));
	        } else {
	            System.out.println("Not enough distinct salaries to find second and third highest.");
	        }
	        
	        
	        
	        
	        
	        //Find employees who have the same salary but belong to different departments
	        
//	        Map<Double, List<Employee>> salaryGroups = employees.stream()
//	                .collect(Collectors.groupingBy(e -> e.salary));
//
//	        // Step 2: Filter groups with employees from different departments
//	        List<Employee> result = salaryGroups.values().stream()
//	                .filter(list -> list.stream().map(e -> e.department).distinct().count() > 1)
//	                .flatMap(List::stream)
//	                .collect(Collectors.toList());
//
//	        System.out.println("Employees with same salary but different departments:");
//	        result.forEach(System.out::println);
	        
	        
	    }
	
	    }
	    
	

