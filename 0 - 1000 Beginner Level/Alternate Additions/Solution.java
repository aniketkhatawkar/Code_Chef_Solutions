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
		    
		    // optimal solution
		    
		    if((b-a)%3 == 0 || ((b-a)-1) %3 ==0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    
		    
		    
		    // unoptimal solution
		    
		  //  int i=1;
		    
		  //  while(a<b){
		  //      if(i++%2==0){
		  //          a+=2;
		  //      }
		  //      else {
		  //          ++a;
		  //      }
		  //  }
		    
		  //  if(a==b) {
		  //      System.out.println("YES");
		  //  }
		  //  else {
		  //      System.out.println("NO");
		  //  }
		}
	}
}
