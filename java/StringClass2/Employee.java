package StringClass2;

public class Employee {
	    int id;
	    String name;
	    String department;
	    double salary;
	    int age;

	    public Employee(int id, String name, String department, double salary, int age) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	        this.age = age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public String getName() {
	        return name;
	    }

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
					+ ", age=" + age + "]";
		}

	    
	}

