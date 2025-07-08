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
		    HashMap<Character, Integer> map = new HashMap<>();
		    
		    for(int i=0; i<n; i++){
		        String str=input.next();
		        int l=str.length();
		        
		        for(int j=0; j<l; j++){
		            char ch=str.charAt(j);
		            map.put(ch, map.getOrDefault(ch,0)+1);
		        }
		    }
		    
		    int c=map.containsKey('c')?map.get('c')/2:0;
		    int e=map.containsKey('e')?map.get('e')/2:0;
		    int o=map.containsKey('o')?map.get('o'):0;
		    int d=map.containsKey('d')?map.get('d'):0;
		    int h=map.containsKey('h')?map.get('h'):0;
		    int f=map.containsKey('f')?map.get('f'):0;
		    
		    
		    int ans=0;
		    
		    while(c>0 && e>0 && o>0 && d>0 && h>0 && f>0){
		        ans++;
		        c--;
		        e--;
		        o--;
		        d--;
		        h--;
		        f--;
		    }
		    
		    System.out.println(ans);
		}
	}
}
