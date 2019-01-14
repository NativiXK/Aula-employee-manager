package application;

import java.util.Locale;
import java.util.Scanner;

import financial.Employee;

public class program {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee.toString());
		
		System.out.print("Wich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + employee.toString());
				
		sc.close();
	}

}
