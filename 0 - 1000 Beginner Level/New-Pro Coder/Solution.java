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
		    
        int n = input.nextInt();
        int m = input.nextInt();
        
        if(m>=(n+1)/2){
            System.out.println("NEWBIE");
        }
        else {
            System.out.println("PRO");
        }
		    
	}
}