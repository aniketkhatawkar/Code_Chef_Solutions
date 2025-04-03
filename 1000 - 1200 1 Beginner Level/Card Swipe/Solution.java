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
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    int ans=0;
		    int in=0;
		    
		    for(int i=0; i<n; i++){
		        int temp=input.nextInt();
		        
		        map.put(temp, map.getOrDefault(temp,0)+1);
		        
		        if(map.get(temp)%2==1){
		            in++;
		        }
		        else {
		            in--;
		        }
		        
		        ans=Math.max(ans, in);
		    }
		    
		    System.out.println(ans);
		}
	}
}
