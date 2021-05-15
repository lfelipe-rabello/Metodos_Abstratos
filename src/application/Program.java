package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Person> list = new ArrayList<>();
		
		
		System.out.print("Enter the numbers of tax payers:");
		int n = sc.nextInt();
		for (int i = 1; i<=n; i++) {
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				Person person = new PhysicalPerson(name, income, health);
				person.tax();
				list.add(person);
			}
			else {
				System.out.print("Number of employees: ");
				int emp = sc.nextInt();
				Person person = new LegalPerson(name, income, emp);
				person.tax();
				list.add(person);
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for (Person per : list ) {
			System.out.println(per.toString());
			sum += per.getAnnualIncome();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
	}

}
