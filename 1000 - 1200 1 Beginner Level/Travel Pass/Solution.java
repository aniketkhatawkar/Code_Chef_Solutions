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
		    
		    int n = input.nextInt();
		    int a = input.nextInt();
		    int b = input.nextInt();
		    
		    String str = input.next();
		    
		    int inter_district=0;
		    int inter_state=0;
		    
		    for(int i=0; i<n; i++){
		        if(str.charAt(i)=='1'){
		            inter_district++;
		        }
		        else {
		            inter_state++;
		        }
		    }
		    
		    System.out.println(inter_state*a + inter_district*b);
		}
	}
}
