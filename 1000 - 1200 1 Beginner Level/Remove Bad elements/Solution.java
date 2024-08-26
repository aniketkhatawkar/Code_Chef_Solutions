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
		    int max=0;
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    
		    for(int i=0; i<n; i++){
		        int temp=input.nextInt();
		        
		        map.put(temp, map.getOrDefault(temp, 0) + 1);
		        if(map.get(temp)>max){
		            max=map.get(temp);
		        }
		    }
		    
		    System.out.println(n-max);
		        
		}
	}
}
