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
		    int count=0;
		    Stack<Integer> st = new Stack<>();
		    
		    for(int i=0; i<n; i++){
		        int tem=input.nextInt();
		        st.push(tem);
		    }
		    
		    int ans=0;
		    
		    while(!st.isEmpty()){
		        int ele=st.pop();
		        if(ele>1){
		            ans++;
		            st.push((int)ele/2);
		            st.push((int)ele-st.peek());
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
	
	
}
