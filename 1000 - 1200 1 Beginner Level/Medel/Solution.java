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
		    
		    ArrayList<Integer> al = new ArrayList<>();
		    
		    for(int i=0; i<n; i++){
		        int ele = input.nextInt();
		        al.add(ele);
		    }
		    
		    int mid=0;
		    
		    for(int i=0; i<n-2; i++){
		        mid=getmid(al);
		        removemid(al, mid);
		    }
		    
		    
		    int len=al.size();
		    
		    for(int i=0; i<len; i++){
		        System.out.print(al.get(i)+" ");
		    }
		    
		    System.out.println("");
		}
	}
	
	public static int getmid(ArrayList<Integer> al){
	    int sum=0;
	    
	    for(int i=0; i<3; i++){
	        sum+=al.get(i);
	    }
	    
	    return sum/3;
	}
	
	public static void removemid(ArrayList<Integer> al, int mid){
	    int first=Math.abs(al.get(0)-mid);
	    int second=Math.abs(al.get(1)-mid);
	    int third=Math.abs(al.get(2)-mid);
	    
	    if(first<second && first<third){
	        al.remove(0);
	    }
	    else if(second<first && second<third){
	        al.remove(1);
	    }
	    else {
	        al.remove(2);
	    }
	}
}
