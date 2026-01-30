package homeworks.ch06.employee;

import java.time.LocalDate;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private float salary;
    private String department = "No department yet!";
    private String phone = "";

	public Employee(int id, String firstName, String lastName, LocalDate birthDate, float salary, String department, String phone) {
		this(id, firstName, lastName, birthDate, salary);
		this.department = department;
		this.phone = phone;
	}
	
    public Employee(int newId, String newFirstName, String newLastName, LocalDate newBirthDate, float newSalary) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        birthDate = newBirthDate;
        salary = newSalary;
    }
    

	void work() {
		System.out.println("Employee " + firstName + " " + lastName + " is working.);");
	}

}
