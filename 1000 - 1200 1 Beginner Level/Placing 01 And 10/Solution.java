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
		    int x = input.nextInt();
		    int y = input.nextInt();
		    
		    if(x>y){
                System.out.println(2*x-1);
            }else if(y>x){
                System.out.println(2*y-1);
            }else{
                System.out.println(2*x);            
                
            }
		}
	}
}
