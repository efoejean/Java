package efoe.g;

public class MethodIsLessThan {
	
	public static <T extends Comparable<T>> T isLessThan(T x, T y){
		 T min = x; // assume x is initially the largest
		
		 if (y.compareTo(min) < 0) {
			 min = y; // y is the less so far
		 }
			
		 return min; // returns the less object
	 }
	
	public static <T extends Comparable<T>> boolean isLessThan(Object first, Object second) // use object to be able use all variable(integer. string, double)
	{
	if(((String) first).compareTo((String) second) >   0)
	{
	      return true;
	 }
	 else
	      return false;
	}
}


