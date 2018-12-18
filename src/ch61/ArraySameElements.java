package ch61;
import java.util.Arrays;

public class ArraySameElements 
{
	 public static boolean sameElts( int[] a, int[] b )
	  {
		 Arrays.sort(a);
		 Arrays.sort(b);
		 
		 if (Arrays.equals(a, b))
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
	    int[] arrayA = { 1, 2, 3, 4, 2 };
	    int[] arrayB = { 4, 2, 3, 2, 1 };

	    if ( sameElts( arrayA, arrayB ) )
	      System.out.println( "Same Elements" );
	    else
	      System.out.println( "DIFFERENT elements" );      
	 
	  }
}
