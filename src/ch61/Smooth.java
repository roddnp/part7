package ch61;

public class Smooth 
{
	public static void main ( String[] args )  
	  {
	    int[] signal  = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
	    int[] smooth = new int[signal.length];
	    
	    // compute the smoothed value for each
	    //  cell of the array smooth
	    smooth[0]  =  (signal[1] + signal[0] )/ 2;
	    smooth[ signal.length-1 ] = (signal[signal.length-1] +signal[signal.length-2])/2; 
	    for (int i = 1; i<=signal.length-2;i++  )
	    {
	    	smooth[i]= (signal[i-1] + signal[i] + signal[i+1]) / 3;
	    }
	      
	    // write out the input
	    for ( int j=0; j < smooth.length; j++)
	    {
	    		System.out.print(signal[j]);
	    }
	    
	    // write out the result
	    for ( int j=0; j < smooth.length; j++)
	    {
	    	System.out.print(smooth[j]);
	    }

	  }

}
