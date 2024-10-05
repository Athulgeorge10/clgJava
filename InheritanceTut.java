import java.util.Scanner;

class Student{
	String name;
	int age;
	int ID;

	Student(String name,int age,int ID){
		this.name=name;
		this.age=age;
		this.ID=ID;
	}

	void display(){
		System.out.println("Student name: "+name);
		System.out.println("Age: "+age);
		System.out.println("ID: "+ID);
	}
}

class Hostler extends Student{
	String hostel;

	Hostler(String name,int age,int ID,String hostel){
		super(name,age,ID);
		this.hostel=hostel;
	}

	void display(){
		super.display();
		System.out.println("Hostel name: "+hostel);
	}
}

class DayScholar extends Student{
	String bus;

	DayScholar(String name,int age,int ID,String bus){
		super(name,age,ID);
		this.bus=bus;
	}

	void display(){
		super.display();
		System.out.println("Bus Route: "+bus);
	}
}

public class InheritanceTut {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student name: ");
		String name=sc.nextLine();
		System.out.print("Enter the age: ");
		int age=sc.nextInt();
		System.out.print("Enter the student ID: ");
		int ID=sc.nextInt();
		sc.nextLine();
		System.out.println("Are you a 'Hosteler' or a 'Day Scholar?'");
		String ch=sc.nextLine().toLowerCase();

		if(ch.equals("hosteler")){
			System.out.print("Enter the hostel name: ");
			String hostel=sc.nextLine();
			Hostler h=new Hostler(name,age,ID,hostel);
			System.out.println("\nSTUDENT DETAILS:");
			h.display();
		}

		else if(ch.equals("day scholar")){
			System.out.print("Enter the bus route: ");
			String bus=sc.nextLine();
			DayScholar d=new DayScholar(name,age,ID,bus);
			System.out.println("\nSTUDENT DETAILS:");
			d.display();
		}

		else{
			System.out.println("Invalid!");
		}	
	}
}