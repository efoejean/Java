package efoe.g;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;


public class CustomerMain {

	public static void main(String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		
		
		
		int choice;
		displayMenu();
		choice = input.nextInt();
		input.nextLine();
		
		
		Customer[] customers = {
			new Customer("Robert", "Blue", "1213 West 15th Street", "508/222-5263", 356.99),
			new Customer("Sam", "Smith", "2255 Main Street", "508/223-8059", 136.52),
			new Customer("Pamela ", "Jones", "802 Westmorland Drive ", "508/632-2044 ", 193.25),
			new Customer("Elizabeth", "Simonee", "5822 Country Lane", "508/633-2743 ", 263.48),
			new Customer("Thomas ", "White ", "8915 Stratford Lane", "508/295-3322 ", 157.62),
			new Customer("Samantha", "Stone", "2566 Cardinal Drive", "227/503-9533 ", 223.55) 
			};
	
		List<Customer> list = Arrays.asList(customers);
		

		
	    // Functions for getting first and last names from an Customer
	    Function<Customer, String> byFirstName = Customer::getFirstName;
	    Function<Customer, String> byLastName = Customer::getLastName;
	    
	    // Comparator for comparing Customers by first name then last name
	    Comparator<Customer> lastThenFirst =                           
	       Comparator.comparing(byLastName).thenComparing(byFirstName);
		    
		    
		    while(choice!= 6) {
		    	switch(choice)
		    	{
		    		case 1:
		    			System.out.println();
						System.out.println("Please enter a minimun Value:");
						final double minValue= input.nextDouble();
						System.out.println();
						System.out.println("Please enter a maximun Value:");
						final double maxValue = input.nextDouble();
						
						getRange(list,  minValue, maxValue);
						break;
						
		    		case 2:
		    			
		    			sumPurchases(list)	 ;  
		    			break;
		    		case 3:
		    			avgPurchase(list);
		    			break;
		    		case 4:
		    			custInformation(list);
		    			break;
		    		case 5:
		    		custName(list,lastThenFirst);
		    			break;
		    		default:
						System.out.println("Incorrect entry");
						break;
		    		
		    		
		    	}//end of switch
		    	displayMenu();
				choice = input.nextInt();
				input.nextLine();
		    }
		  //end of while
			input.close();
			   
			
	}
	
	public static void  getRange(List<Customer> list, final double minValue, final double maxValue) 
	{
		Predicate<Customer> minToMax=                  
			       c -> (c.getLastPurchase() >= minValue && c.getLastPurchase() <= maxValue);
				    
				  	  System.out.printf(
				    	     "%nCustomer earning minValue and maxValue per month sorted by salary:%n");
				    	 	  list.stream()                                         
				    	 	        .filter(minToMax)                        
				    	 	        .sorted(Comparator.comparing(Customer::getLastPurchase))
				    	 	        .forEach(System.out::println); 
	}
	
	public static void sumPurchases(List<Customer> list) 
	{
	    // sum of Employee salaries with DoubleStream sum method
	    System.out.printf(
	       "%nSum of Customer' purchase (via sum method): %.2f%n",
	       list.stream()
	           .mapToDouble(Customer::getLastPurchase)
	           .sum());
	}
	
	public static void avgPurchase(List<Customer> list)
	{
	    // average of Employee salaries with DoubleStream average method
	    System.out.printf("Average of Customer' purchase: %.2f%n",
	       list.stream()
	           .mapToDouble(Customer::getLastPurchase)
	           .average()
	           .getAsDouble());
	}
	
	public static void  custInformation(List<Customer> list) {
		
		
	    // Functions for getting first and last names from an Customer
	    Function<Customer, String> byFirstName = Customer::getFirstName;
	    Function<Customer, String> byLastName = Customer::getLastName;
	    
	    // Comparator for comparing Customers by first name then last name
	    Comparator<Customer> lastThenFirst =                           
	       Comparator.comparing(byLastName).thenComparing(byFirstName);
	    
	    // sort Customers by last name, then first name 
	    System.out.printf(
	       "%nCustomer in ascending order by last name then first:%n");
	 
		list.stream()
	        .sorted(lastThenFirst)
	        .forEach(System.out::println);
		
	}
	
	public static void  custName(List<Customer> list, Comparator<Customer> lastThenFirst1) {
		
	    // Functions for getting first and last names from an Customer
	    Function<Customer, String> byFirstName = Customer::getFirstName;
	    Function<Customer, String> byLastName = Customer::getLastName;
	    
	    // Comparator for comparing Customers by first name then last name
	    Comparator<Customer> lastThenFirst =                           
	       Comparator.comparing(byLastName).thenComparing(byFirstName);
	    
	    // sort Customers by last name, then first name 
	    System.out.printf(
	       "%nCustomer in ascending order by last name then first:%n");
	 
	    list.stream()
        .sorted(lastThenFirst)
        .map(Customer::getName)
        .forEach(System.out::println);
	}

	public static void displayMenu() 
	{
		System.out.println();
		System.out.println("Enter 1 to display purchases within specified range:");
		System.out.println("Enter 2 to sum customer purchases:");
		System.out.println("Enter 3 to calculate average customer purchase:");
		System.out.println("Enter 4 to display list of customer information:");
		System.out.println("Enter 5 to display list of customer names:");
		System.out.println("Enter 6 to Exit:");
		
	}
		

	

}
