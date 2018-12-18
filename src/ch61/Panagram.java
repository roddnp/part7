package ch61;

import java.util.Scanner;

public class Panagram 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the sentence");
		String sentence = scan.toString();
		
		int[] occuring = new int[25];
		
		for ( int i=0;i<=occuring.length;i++)
		{
			if (sentence.charAt(i)=='A' || sentence.charAt(i) == 'a')
			{
				occuring[0]+=1;
			}
			if (sentence.charAt(i)=='B' || sentence.charAt(i) == 'b')
			{
				occuring[1]+=1;
			}
			if (sentence.charAt(i)=='C' || sentence.charAt(i) == 'c')
			{
				occuring[2]+=1;
			}
			if (sentence.charAt(i)=='D' || sentence.charAt(i) == 'd')
			{
				occuring[3]+=1;
			}
			if (sentence.charAt(i)=='E' || sentence.charAt(i) == 'e')
			{
				occuring[4]+=1;
			}
			if (sentence.charAt(i)=='F' || sentence.charAt(i) == 'f')
			{
				occuring[5]+=1;
			}
			if (sentence.charAt(i)=='G' || sentence.charAt(i) == 'g')
			{
				occuring[6]+=1;
			}
			if (sentence.charAt(i)=='H' || sentence.charAt(i) == 'h')
			{
				occuring[7]+=1;
			}
			if (sentence.charAt(i)=='I' || sentence.charAt(i) == 'i')
			{
				occuring[8]+=1;
			}
			if (sentence.charAt(i)=='J' || sentence.charAt(i) == 'j')
			{
				occuring[9]+=1;
			}
			if (sentence.charAt(i)=='K' || sentence.charAt(i) == 'k')
			{
				occuring[10]+=1;
			}
			if (sentence.charAt(i)=='L' || sentence.charAt(i) == 'l')
			{
				occuring[11]+=1;
			}
			if (sentence.charAt(i)=='M' || sentence.charAt(i) == 'm')
			{
				occuring[12]+=1;
			}
			if (sentence.charAt(i)=='N' || sentence.charAt(i) == 'n')
			{
				occuring[13]+=1;
			}
			if (sentence.charAt(i)=='O' || sentence.charAt(i) == 'o')
			{
				occuring[14]+=1;
			}
			if (sentence.charAt(i)=='P' || sentence.charAt(i) == 'p')
			{
				occuring[15]+=1;
			}
			if (sentence.charAt(i)=='Q' || sentence.charAt(i) == 'q')
			{
				occuring[16]+=1;
			}
			if (sentence.charAt(i)=='R' || sentence.charAt(i) == 'r')
			{
				occuring[17]+=1;
			}
			if (sentence.charAt(i)=='S' || sentence.charAt(i) == 's')
			{
				occuring[18]+=1;
			}
			if (sentence.charAt(i)=='T' || sentence.charAt(i) == 't')
			{
				occuring[19]+=1;
			}
			if (sentence.charAt(i)=='U' || sentence.charAt(i) == 'v')
			{
				occuring[20]+=1;
			}
			if (sentence.charAt(i)=='W' || sentence.charAt(i) == 'w')
			{
				occuring[21]+=1;
			}
			if (sentence.charAt(i)=='X' || sentence.charAt(i) == 'x')
			{
				occuring[22]+=1;
			}
			if (sentence.charAt(i)=='Y' || sentence.charAt(i) == 'Y')
			{
				occuring[23]+=1;
			}
			if (sentence.charAt(i)=='Z' || sentence.charAt(i) == 'z')
			{
				occuring[24]+=1;
			}
			
		}
		
		System.out.println(occuring);
	}
	
}
