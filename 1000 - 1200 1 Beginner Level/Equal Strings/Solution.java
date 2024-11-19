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
		    
		    String a = input.next();
		    String b = input.next();
		    
		    int count=0;
		    int len=a.length();
		    
		    HashMap<Character, Integer> map = new HashMap<>();
		    
		    for(int i=0; i<len; i++){
		        if(a.charAt(i)!=b.charAt(i)){
		            map.put(b.charAt(i), map.getOrDefault(b.charAt(i),0)+1);
		        }
		    }
		    
		    System.out.println(map.size());
		}
	}
}
