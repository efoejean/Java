package efoe.g;

public class RomanToNumber {


	 static String [] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	 static String [] romanNumeral = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
	 
	 // getNumber method
	 public static String getNumber(String roman) 
	 {
		 String result = " ";
		 // loop through array
		 for (int i = 0; i < romanNumeral.length; i++) 
		 {
			// check for a match 
			 if(roman.toUpperCase().equals(romanNumeral[i]))
				 return result = numbers[i];
		 }
		 return result;
	 }
	 
	 // Method to display
	 public static String toString(String result, String output) 
	 {
		 
		 return String.format("%s			%s%n",  result, output );
	 }
}
