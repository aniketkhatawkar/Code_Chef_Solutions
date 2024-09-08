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
		    int x = input.nextInt();
		    
		    String str = input.next();
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    map.put(x,x);
		    
		    for(int i=0; i<n; i++){
		        if(str.charAt(i)=='L'){
		            x--;
		        }
		        else {
		            x++;
		        }
		        map.put(x,x);
		    }
		    
		    System.out.println(map.size());
		}
	}
}
