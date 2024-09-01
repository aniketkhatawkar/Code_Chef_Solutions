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
		    int count=0;
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    for(int i=0; i<n; i++){
		        int value = input.nextInt();
		        
		        map.put(value, map.getOrDefault(value, 0)+1);
		        if(map.get(value)>count){
		            count=map.get(value);
		        }
		        
		    }
		    
		    System.out.println(n-count);
		}
	}
}
