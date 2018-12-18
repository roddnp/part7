package ch61;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ClosestToZero 
{
	public static void main ( String[] args )
	  {
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
	    
	    // declare and initialize variables
		 int smallestPos = 100;
		   int smallestNeg =-100; 
		   int finalNum = 0;
		    
		    // compute the two largest
		    for ( int index= 0; index < data.length; index++)
		    {
		    	if (data[index]>0)
		    	{
		    		if (data[index]<smallestPos)
		    		{
		    			smallestPos = data[index];
		    		}
		    	}
		    	if (data[index]<0)
		    	{
		    		if (data[index]>smallestNeg)
		    		{
		    			smallestNeg = data[index];
		    		}
		    	}
		    }
		    
		    int sumPos = smallestPos-0;
		    int sumNeg = smallestNeg*-1;
		    if (sumPos<sumNeg)
		    {
		    	finalNum=sumPos;
		    }
		    else
		    {
		    	finalNum = sumNeg;
		    }
	    // write out the element nearest to zero
	    System.out.println(finalNum);

	  
	  }
}
