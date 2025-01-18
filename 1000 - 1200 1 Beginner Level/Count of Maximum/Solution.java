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
		    
		    HashMap<Integer, Integer> map= new HashMap<>();
		    
		    for(int i=0; i<n; i++){
		        int ele=input.nextInt();
		        
		        map.put(ele, map.getOrDefault(ele,0)+1);
		    }
		    
		    ArrayList<Integer> arr = new ArrayList<>();
		    int maxi=Integer.MIN_VALUE;
		    
		    for(int key:map.keySet()){
		        maxi=Math.max(maxi, map.get(key));
		    }
		    
		    for(int key:map.keySet()){
		        if(map.get(key)==maxi){
		            arr.add(key);
		        }
		    }
		    
		    Collections.sort(arr);
		    
		    System.out.println(arr.get(0)+ " "+ maxi);
		}
	}
}
