package empMgmtSys;

import java.sql.SQLException;
import java.util.Scanner;

public class Empcondition {

	int i;

	Scanner scanner = new Scanner(System.in);

	public void conditon(int i) throws ClassNotFoundException, SQLException {

		if (i == 1) {
			System.out.println("Enter the name of a employee..");
			String name = scanner.next();
			System.out.println("Enter the age of the employee..");
			int age = scanner.nextInt();
			System.out.println("enter the address of the employee..");
			String address = scanner.next();
			System.out.println("enter the salary of the employee..");
			int salary = scanner.nextInt();
			
			employeeData empData=new employeeData();
			empData.setEmpname(name);
			empData.setAge(age);
			empData.setAddress(address);
			empData.setSalary(salary);
			
			Empservice empservice=new Empservice();
			empservice.addEmployee(empData);

		}
	}

}
