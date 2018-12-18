package ch61;
import java.io.*;
public class SumOfEvenOddAll 
{
	public static void main ( String[] args ) 
	  {
	    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
	    
	    // declare and initialize three sums
	    int evenSum=0;
	    int oddSum=0;
	    int totalSum=0;
	    
	    
	    // compute the sums
	    for ( int index=0; index < data.length; index++)
	    {
	    	totalSum+=data[index];
	    	if (data[index]%2==0)
	    	{
	    		evenSum+=data[index];
	    	}
	    	if (data[index]%2==1)
	    	{
	    		oddSum+=data[index];
	    	}
	    }
	      
	    // write out the three sums
	    System.out.println("total sum: "+totalSum+ " even sum: "+evenSum+" oddSum: "+
	    oddSum);

	  }
}
