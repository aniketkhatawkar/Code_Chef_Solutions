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
		    int arr[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i]=input.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    Queue<Integer> que = new LinkedList<>();
		    
		    int s=0, e=n-1;
		    
		    for(int i=0; i<=(n/2)-1; i++){
		        que.add(arr[s++]);
		        que.add(arr[e--]);
		    }
		    
		    while(!que.isEmpty()){
		        System.out.print(que.remove() +" ");
		    }
		    
		    if(n%2!=0){
		        System.out.print(arr[n/2]);
		    }
		    
		    System.out.println("");
		}
	}
}
