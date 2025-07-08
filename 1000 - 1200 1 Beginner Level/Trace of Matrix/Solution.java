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
		    
		    int n=input.nextInt();
		    int a[][]=new int[n][n];
		    int i,j;
		    for(i=0;i<=n-1;i++)
		    for(j=0;j<=n-1;j++)
		    a[i][j]=input.nextInt();
		    int index=n-1;
		    int lb=0;
		    int sum=0;
		    int trace=0;
		    while(lb<=n-1&&index>=0){
		        i=lb;
		        j=0;
		        while(j<=index){
		            sum+=a[i][j];
		            j++;
		            i++;
		        }
		        if(sum>trace)
		        trace=sum;
		        lb++;
		        index--;
		        sum=0;
		    }
		    index=1;
		    while(index<=n-1){
		        i=0;
		        j=index;
		        sum=0;
		        while(i<=n-1&&j<=n-1){
		            sum+=a[i][j];
		            i++;
		            j++;
		        }
		        if(sum>trace)
		        trace=sum;
		        index++;
		    }
		    System.out.println(trace);
		}
	}
}
