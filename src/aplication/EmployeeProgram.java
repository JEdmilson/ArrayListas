package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;


public class EmployeeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee aux;
		
		
		Scanner sc = new Scanner(System.in);
		List <Employee> list=new ArrayList<>();
		
				
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id=sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			aux=new Employee(id, name, salary);
			list.add(aux);		
			
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int idd = sc.nextInt();
		boolean controle=false;
		for(Employee x:list) {
			
			
			if (x.getId()==idd) {
				System.out.println("Enter the percentage: ");
				double perc = sc.nextDouble();
				x.aumento(perc);
				controle=true;
				
			}
			
			
		}
		
		if (!controle) {		
				System.out.println(" id não encontrado. ");
			
		}
		
		//imprimir lista completa:
		System.out.println();
		System.out.print("List of Employees: ");
		System.out.println();
		for(Employee x:list) {
			System.out.print(x);
			System.out.println();
		}
		
		
		
		
		
		

	}

}
