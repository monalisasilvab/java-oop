package introduction_to_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employeee;

public class Main7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Employeee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee " + i + ": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already obtained. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employeee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employeee empl = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (empl == null) {
			System.out.println("This id doesn't exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			empl.increase(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employeee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employeee> list, int id) {
		Employeee empl = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return empl != null;
	}

}
