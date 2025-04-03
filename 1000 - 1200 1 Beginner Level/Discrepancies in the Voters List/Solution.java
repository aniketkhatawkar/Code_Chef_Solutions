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
		    
	    int n1 = input.nextInt();
	    int n2 = input.nextInt();
	    int n3 = input.nextInt();
	    
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
	    for(int i=0; i<n1; i++){
	        int temp = input.nextInt();
	        map.put(temp, map.getOrDefault(temp,0)+1);
	    }
	    
	    for(int i=0; i<n2; i++){
	        int temp = input.nextInt();
	        map.put(temp, map.getOrDefault(temp,0)+1);
	    }
	    
	    for(int i=0; i<n3; i++){
	        int temp = input.nextInt();
	        map.put(temp, map.getOrDefault(temp,0)+1);
	    }
	    
	    ArrayList<Integer> arr = new ArrayList<>();
	    
	    for(int key: map.keySet()){
	        if(map.get(key)>1){
	            arr.add(key);
	        }
	    }
	    
	    Collections.sort(arr);
	    
	    System.out.println(arr.size());
	    
	    for(int i: arr){
	        System.out.println(i);
	    }
	}
}
