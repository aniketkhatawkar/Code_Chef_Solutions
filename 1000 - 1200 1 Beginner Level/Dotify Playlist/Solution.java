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
		    int k = input.nextInt();
		    int l = input.nextInt();
		    
		    int minarr[] = new int[n];
		    int lanarr[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        minarr[i]= input.nextInt();
		        lanarr[i]= input.nextInt();
		    }
		    
		    ArrayList<Integer> arr = new ArrayList<>();
		    
		    for(int i=0; i<n; i++){
		        if(lanarr[i]==l){
		            arr.add(minarr[i]);
		        }
		    }
		    
		    Collections.sort(arr, Collections.reverseOrder());
		    int s=arr.size();
		    
		    int ans=0;
		    
		    if(s>=k){
    		    for(int i=0; i<k; i++){
    		        ans+=arr.get(i);
    		    } 
		    }
		    
		    if (ans == 0) {
                ans = -1;
            }
		    
		    System.out.println(ans);
		    
		}
	}
}
