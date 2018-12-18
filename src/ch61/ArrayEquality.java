package ch61;

import java.util.Arrays;

public class ArrayEquality 
{
	public static boolean myEquals( int[] a, int[] b )
	  {
		if ( Arrays.equals(a, b))
		{
			return true;
		}
		else
		{
			return false;
		}
	  }
	  
	  public static void main ( String[] args )
	  {
	    int[] arrayA = { 1, 2, 3, 4 };
	    int[] arrayB = { 1, 2, 3, 4 };

	    System.out.print("Arrays says: ");
	    
	    if (Arrays.equals(arrayA, arrayB))
	    {
	      System.out.println( "Equal" );
	    }
	    else
	    {
	      System.out.println( "NOT Equal" );    
	    }

	    System.out.print("myEquals says: ");
	    
	    if ( ArrayEquality.myEquals( arrayA, arrayB ) )
	    {
	      System.out.println( "Equal" );
	    }
	    else
	    {
	      System.out.println( "NOT Equal" ); 
	    }
	  }
}
