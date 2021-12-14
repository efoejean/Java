package efoe.g;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EfoeProgram2Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		// variables
		int choice;
		String myString1;
		String myString2;
		displayMenu();
		choice = input.nextInt();
		input.nextLine();
		
		// arrays
		String[] products;
		String[] products1;
		
		//List
		List<String> list1 = new LinkedList<>();
		List<String> list2 = new LinkedList<>();
		
		while(choice != 5) 
		{
			switch(choice)
			{
			case 1:
				System.out.println();
				System.out.println("Please Enter a list of products: ");
				myString1 = input.nextLine();
				 products = myString1.split(" ");
				 
				 for(String product : products ) 
				 {
					 list1.add(product);
				 }
				 
				 printlist(list1); // print list1 elements
				 break;
				 
			case 2:
				System.out.println();
				System.out.println("Please Enter a list of product to the products: ");
				myString2 = input.nextLine();
				products1 = myString2.split(" ");
				
				 for(String product : products1 ) 
				 {
					 list2.add(product);
				 }
				 
				 list1.addAll(list2);  // concatenate lists
				 list2 = null; //release resources
				 convertToUppercaseStrings(list1);  // convert to upperCase string
				 printlist(list1); // print list1 elements
				
				break;
				
			case 3: 
				System.out.println();
				System.out.println("please enter the position of the products you want to delete (start to end)");
					System.out.println("Please enter the start position");
					int start = input.nextInt();
					System.out.println("Please enter the end position to delete");
					int end = input.nextInt();
					remevoItems(list1, start, end); // remove items from start to end  from list
				 printlist(list1);// print list1 elements
				 break;
				 
			case 4:
				System.out.println();
				printReversedList(list1); // print list in reverse order
				System.out.println();
				break;
				
			case 5:
				System.out.println("Good bye.");
				break;
				
			default:
				System.out.println("Incorrect entry");
				break;
			} //end of switch
			
			displayMenu();
			choice = input.nextInt();
			input.nextLine();	
				
		}//end of while
		input.close();
	}
	
	// print reversed list
	private static void printReversedList(List<String> list) {
		 ListIterator<String> iterator = list.listIterator(list.size());

	      System.out.printf("%nReversed List:%n");

	      // print list in reverse order
	      while (iterator.hasPrevious()) {
	         System.out.printf("%s ", iterator.previous()); 
	      }		
	}
	// obtain sublist and use clear method to delete sublist items
	   private static void remevoItems(List<String> list, int a, int b) 
	   {
		   list.subList(a,b).clear();// remove items
		
	   }

	// locate String objects and convert to uppercase
	private static void convertToUppercaseStrings(List<String> list) {
		      ListIterator<String> iterator = list.listIterator();

		      while (iterator.hasNext()) {
		         String items = iterator.next(); // get item                
		         iterator.set(items.toUpperCase()); // convert to upper case
		      } 
		   } 

	// output List contents
	private static void printlist(List<String> list1) {
		System.out.printf("%nproducts:%n");	
		
		for(String product: list1) {
			System.out.printf("%s%n ", product);
		}
		System.out.println();
	}

	public static void displayMenu() {
		System.out.println();
		System.out.println("Enter 1 to enter a list: ");
		System.out.println("Enter 2 to  add a list to the list: ");
		System.out.println("Enter 3 to delete items from the list: ");
		System.out.println("Enter 4 to reverse the list: ");
		System.out.println("Enter 5 to exit: ");
		System.out.println();		
	}

}
