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
		    
		    int a = input.nextInt();
		    int b = input.nextInt();
		    
		    int i=1;
		    
		    boolean flag=a>0;
		    
		    while(flag){
		        if(i%2==0){
		            b-=i;
		            if(a<0){
		                System.out.println("Bob");
		                break;
		            }
		        }
		        else {
		            a-=i;
		            if(b<0){
		                System.out.println("Limak");
		                break;
		            }
		        }
		        i++;
		    }
		}
	}
}
