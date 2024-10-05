//Write a Java program to implement Single Inheritance

import java.util.Scanner;
class Employee3{
	String name;
	int Id;
	void printname(){
		System.out.println("Name:"+name);
	}
	void printID(){
		System.out.println("ID:"+Id);
	}
}
class Manager1 extends Employee3{
	String dept;
	void printdept(){
		System.out.println("Department:"+ dept);
	}
}
public class SingleInheritance {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee3 e=new Employee3();
		Manager1 m=new Manager1();
		System.out.print("Enter the employee's name:");
		e.name=sc.nextLine();
		System.out.print("Enter the employee ID:");
		e.Id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the manager's name:");
		m.name=sc.nextLine();
		System.out.print("Enter the manager's ID:");
		m.Id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the department:");
		m.dept=sc.nextLine();
        sc.close();
		System.out.println("\nEMPLOYEE DETAILS");
		e.printname();
		e.printID();
		System.out.println("\nMANAGER DETAILS");
		m.printname();
		m.printID();
		m.printdept();
	}
}