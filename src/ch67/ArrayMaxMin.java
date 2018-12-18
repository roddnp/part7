package ch67;

import java.io.* ;

public class ArrayMaxMin
{

  public static void main ( String[] args )  
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    int max = 1;
    int min = -1;
    
    
    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[0].length; col++) 
      {
         if (data[row][col]>max)
         {
        	 max = data[row][col];
         }
         if (data[row][col]<min)
         {
        	 min = data[row][col];
         }
      }
    }
      
    // write out the results
    System.out.println( "max = " + max + "; min = " + min );

  }
}      
