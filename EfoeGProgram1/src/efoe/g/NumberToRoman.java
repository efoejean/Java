package efoe.g;

public class NumberToRoman {
	
	static String [] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	 static String [] romanNumeral = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
	 
	 
	 // getRoman method
	 public static String getRoman(String number) 
	 {
		 String roman = " ";
		 
		 // loop through the array
		 for (int i = 0; i < numbers.length; i++) 
		 {
			 // check for a match 
			 if(number.equals(numbers[i]))
				 return roman = romanNumeral[i];
		 }
		 return  roman;
	 }
	 
	 // Method to display
	 public static String toString(String output, String result) 
	 {
		 return String.format("%s		%s%n", output, result );
	 }
}
