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
		    int ans=0;
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    int max1=0;
		    int count=0;
		    
		    for(int i=0; i<n; i++){
		        int temp = input.nextInt();
		        map.put(temp, map.getOrDefault(temp, 0)+1);
		        
		        max1=Math.max(max1, map.getOrDefault(temp, 0));
		    }
		    
		    for(int key : map.keySet()){
		        int value=map.get(key);
		        if(value==max1){
		            ans=key;
		            count++;
		        }
		    }
		    
		    if(count==1) {
		        System.out.println(ans);
		    }
		    else {
		        System.out.println("CONFUSED");
		    }
		}
	}
}
