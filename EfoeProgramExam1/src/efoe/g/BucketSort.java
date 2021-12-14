package efoe.g;

import java.util.ArrayList;

public class BucketSort
{
	
	
	private int[] data;
	private ArrayList<Integer> numList;
	
	public BucketSort(int size)
	{
		data = new int[size];
		for(int i = 0; i < size; i++)
			data[i] = numList.size();
	}
	public void sort(ArrayList<Integer> numList)
	{
		int totalDigits = numberOfDigits();
		int pail[][] = new int [10][data.length];
		for(int pass = 1; pass <= totalDigits; pass++)
		{
			distributeElements(pail, pass);
			collectElements(pail);
			if (pass != totalDigits)
				emptyBucket(pail);
		}
	}
	
	public int numberOfDigits()
	{
		int largest = data[0];
		for(int element : data)
			if(element > largest)
				largest = element;
		int digits = (int) (Math.log10(largest) + 1);
		return digits;
	}
	public void distributeElements(int pail[][], int digit)
	{
		int divisor = (int) (Math.pow(10, digit));
		
		for(int element : data)
		{	
			int bucketNumber = (element % divisor) / (divisor / 10);
			int elementNumber = ++pail[bucketNumber][0];
			pail[bucketNumber][elementNumber] = element;
		}
	}
	public void collectElements(int pail[][])
	{
		int subscript = 0;
		for (int i = 0; i < 10; i++)
		{
			for(int j = 1; j < pail[i][0]; j++)
				data[subscript++] = pail[i] [j];
			
		}
		
	}
	public void emptyBucket(int pail[][])
	{
		for (int i = 0; i < 10; i++)
			pail[i][0] = 0;
	}
	public String toString()
	{
		StringBuilder temporary = new StringBuilder();
		
		for (int element : data)
			temporary.append(element + " ");
		temporary.append("\n");
		return temporary.toString();
	}
}
