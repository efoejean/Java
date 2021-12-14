package efoe.g;

import java.util.Scanner;

public class Program4Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter first thing to compare: ");
		String userIn= input.nextLine();
		
		System.out.println("Enter the second thing to compare: ");
		String userOF = input.nextLine();
		
		int choice;
		displayMenu();
		choice = input.nextInt();
		input.nextLine();
		
		
		
		while(choice != 3) 
		{
			switch(choice) 
			{
			case 1:

				System.out.printf("Between %s and %s,  %s is great ", userIn, userOF, MethodIsGreaterThan.isGreaterThan(userIn,userOF));
				System.out.println();
				break;
				
			case 2:
				
				System.out.printf("Between %s and %s,  %s is less", userIn, userOF, MethodIsLessThan.isLessThan(userIn,userOF));
				System.out.println();

				break;
				
			case 3:
				System.out.println("Good bye.");
				break;
				
			default:
				System.out.println("Incorrect entry");
				break;
			
			
			}//end of switch
			
			displayMenu();
			choice = input.nextInt();
			input.nextLine();
			
		}//end of while
		input.close();
	}

	public static void displayMenu() 
	{
		System.out.println();
		System.out.println("Enter 1 to do the greatest comparision: ");
		System.out.println("Enter 2 to do the least comparision: ");
		System.out.println("Enter 3 to exit:");
		System.out.println();
	}
		
				
	
}
