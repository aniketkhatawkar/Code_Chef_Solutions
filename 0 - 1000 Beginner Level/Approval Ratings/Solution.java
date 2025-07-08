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
		    
		    int a[]=new int[5];
		    int sum=0;
		    for(int i=0;i<5;i++){
		        a[i]=input.nextInt();
		        sum+=a[i];
		    }
		   
		    int avg=sum/5;
		    if(avg>=7){
		        System.out.println(0);
		        continue;
		    }
		    int gold=0;
		    
		    Arrays.sort(a);
		    for(int i=0;i<5;i++){
		        gold+=100;
		        sum=sum-a[i]+10;
		        avg=sum/5;
		        if(avg>=7){
		            System.out.println(gold);
		            break;
		        }
		        
		    }
		}
	}
}
