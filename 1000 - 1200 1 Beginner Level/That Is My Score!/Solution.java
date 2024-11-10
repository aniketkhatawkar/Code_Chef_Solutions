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
		    
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    int n = input.nextInt();
		    
		    for(int i=0; i<n; i++){
		        int qNo = input.nextInt();
		        int score = input.nextInt();
		        if(qNo<9){
		            map.put(qNo, Math.max(score, map.getOrDefault(qNo,0)));
		        }
		    }
		    
		    int finalScore=0;
		    
		    for(int score:map.values()){
		        finalScore+=score;
		    }
		    
		    System.out.println(finalScore);
		}
	}
}
