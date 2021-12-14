package efoe.g;

import java.util.Scanner;

public class RomanNumeralMain {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		String roman;
		String number;
		int choice;
		displayMenu();
		choice = input.nextInt();
		input.nextLine();
		
		while(choice != 3) 
		{
			switch(choice) 
			{
			case 1:
				System.out.println();
				System.out.println("Please enter a number:");
				// assign the user input to  a string
				number = input.nextLine();
				
				// use the getRoman method from  NumberToRoman class.
				
				roman = NumberToRoman.getRoman(number);
				System.out.println();
				// display the result on the console.
				if (roman == " ") 
				{
					System.out.println("Number not found! Please enter a new number");
					System.out.println();
				}
				else {
					System.out.println("Number:\t\tRoman Numerals:");
					System.out.printf(  NumberToRoman.toString(number,roman));
					System.out.println();
				}
				
				
				break;
				
			case 2:
				System.out.println();
				System.out.println("Please enter a roman numeral:");
				// assign the user input to  a string
				roman = input.nextLine();
				
				// use the getNumber method from RomanToNumberclass.
				number = RomanToNumber.getNumber(roman);
				System.out.println();
				// Display the output on the console
				if(number== " ") 
				{
					System.out.println("Roman Numerals not found! Please enter a new Roman Numerals");
					System.out.println();
				}
				else
				{
					System.out.println("Roman Numerals:\t\tNumber:");
					System.out.printf(RomanToNumber.toString(roman,number));
					
				}

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
		System.out.println("Enter 1 to convert a number to a roman numeral:");
		System.out.println("Enter 2 to convert a roman numeral to a number:");
		System.out.println("Enter 3 to exit:");
		System.out.println();
	}

}


