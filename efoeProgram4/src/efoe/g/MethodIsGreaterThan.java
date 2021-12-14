package efoe.g;

public class MethodIsGreaterThan {

	
	public static <T extends Comparable<T>> T isGreaterThan(T x, T y){
		 T max = x; // assume x is initially the largest
		
		 if (y.compareTo(max) > 0) {
		 max = y; // y is the largest so far
		 }
		
	
		
		 return max; // returns the largest object
	 }
	
	public static <T extends Comparable<T>> boolean isGreaterThan(Object first, Object second) // use object to be able use all variable(integer. string, double)
	{
	if(((String) first).compareTo((String) second) <   0)
	{
	      return true;
	 }
	 else
	      return false;
	}
}
