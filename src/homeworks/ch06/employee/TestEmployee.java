package homeworks.ch06.employee;

import java.time.LocalDate;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee(1, "Ali", "Ozgun", LocalDate.of(2001, 9, 11), 14_000.00f);
		e.work();

		// No reference t the object!
		new Employee(2, "Sami", "Telli", LocalDate.of(1994, 2, 3), 28_000.00f).work();
	}
	
}
