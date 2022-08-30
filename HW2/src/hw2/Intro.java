package hw2;

import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {
		
		Scanner userInputString = new Scanner(System.in); //Non-Primitive
		Scanner userInputInt = new Scanner(System.in); //Primitive
		Scanner userInputDouble = new Scanner(System.in); // Primitive
		                                        
		
		System.out.println("What is you name?");
		String name = userInputString.nextLine();
		System.out.println(name);
		
		System.out.println("How old are you?");
		int age = userInputInt.nextInt();
		
		System.out.println("What is your gender?");
		String gender = userInputString.nextLine();
		
		System.out.println("Where are you from?");
		String from = userInputString.nextLine();
		
		System.out.println("Where do you live now?");
		String now = userInputString.nextLine();
		
		System.out.println("Where do you work?");
		String work = userInputString.nextLine();
				
		System.out.println("What is you job role?");
		String role = userInputString.nextLine();
		
		System.out.println("What is your salary?");
		Double salary = userInputDouble.nextDouble();
		
		System.out.println("How much raise are you getting next year?"); 
		double raise = userInputDouble.nextDouble();  
		double totalSalary = raise + salary;
		     
		System.out.println("My name is "+ name + ". I am " + age + "years old," + gender +".  I work at "  + work +  " as a "  + role + ".  I currently live in " + now + ".  I am originally from " + from + ".  I make " + salary + " dollars" + ". I will get " + raise + " annual raise so my total salary would be " + totalSalary + " dollars next year.");
		

	}

}
