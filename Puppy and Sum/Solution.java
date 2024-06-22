/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		
		int test = input.nextInt();
		
		for(int t=0; t<test; t++) {
		    
		    int d = input.nextInt();
		    int n = input.nextInt();
		    
		    int sum=0;
		    
		    // repeat sum D no of times
		    for(int i=0; i<d; i++){
				// calculate sum form start
		        sum=0;

			   // calculate sum
		        for(int j=1; j<=n; j++){
		            sum+=j;
		        }
			   // assign sum to n for next loop
		        n=sum;
		    }
		    
		    // prinl last sum as answer
            System.out.println(sum);
		}
	}
}
