//Implement a class hierarchy for different types of vehicles.

import java.util.Scanner;
class Vehicle{
	String model;
	int year;
	void displayModel(){
		System.out.println("\nModel of the vehicle: "+model);
	}
	void displayYear(){
		System.out.println("Year: "+year);
	}
}

class Car extends Vehicle{
	int noOfDoors;
	void displayNoOfDoors(){
		System.out.println("No of doors: "+ noOfDoors);
	}
}

class ElectricCar extends Car{
	int battery;
	void displayBattery(){
		System.out.println("Battery Capacity: "+ battery +" kWh");
	}
}

public class MultilevelInheritance {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ElectricCar e=new ElectricCar();
		System.out.print("Enter the model of the vehicle: ");
		e.model=sc.nextLine();
		System.out.print("Enter the year: ");
		e.year=sc.nextInt();
		System.out.print("Enter the no of doors: ");
		e.noOfDoors=sc.nextInt();
		System.out.print("Enter the battery capacity: ");
		e.battery=sc.nextInt();
        sc.close();
		e.displayModel();
		e.displayYear();
		e.displayNoOfDoors();
		e.displayBattery();
	}
}