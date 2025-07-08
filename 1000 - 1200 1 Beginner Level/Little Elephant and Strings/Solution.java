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
		input.nextLine();
		
		String arr[] = new String[n];
		
		for(int i=0; i<n; i++){
		    arr[i]=input.nextLine();
		}
		
		for(int t=0; t<m; t++) {
		    String str = input.nextLine();
		    boolean flag=true;
		    
		    for(int i=0; i<n; i++){
		        if(str.contains(arr[i]) || str.length()>=47){
		            System.out.println("Good");
		            flag=false;
		            break;
		        }
		    }
		    
		    if(flag){
		        System.out.println("Bad");
		    }
		}
		    
	}
}
