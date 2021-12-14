package efoe.g;

public class Customer
{
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private double lastPurchase;
	
	public Customer(String fName, String lName, String ad, String ph, double purchase)
	{
		
		firstName = fName;
		lastName = lName;
		address = ad;
		phone = ph;
		lastPurchase = purchase;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fName) {
		
		firstName = fName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lName) {
		lastName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String ad) {
		address = ad;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String ph) {
		phone = ph;
	}

	public double getLastPurchase() {
		return lastPurchase;
	}

	public void setLastPurchase(double purchase) {
		lastPurchase = purchase;
	}
	
	// return Employee's first and last name combined
	   public String getName() {
	      return String.format("%s %s", getFirstName(), getLastName());
	   }
	   
	   // return a String containing the Customer's information
			   @Override
			   public String toString() {
			      return String.format("%-10s %-11s %-15s %20s %10.2f", 
			         getFirstName(), getLastName(), getAddress() , getPhone(),getLastPurchase());
			   } 
	

}
