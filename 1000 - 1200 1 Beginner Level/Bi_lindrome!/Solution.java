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
		    String str = input.next();
		    
		    HashMap<Character, Integer> map = new HashMap<>(); 
		    
		    for(int i=0; i<n; i++){
		        map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
		    }
		    
		    int maxi=0;
		    
		    for(int value:map.values()){
		        maxi=Math.max(maxi, value);
		    }
		    
		    if(maxi>1){
		        System.out.println(n-2);
		    }
		    else {
		        System.out.println(-1);
		    }
		}
	}
}
