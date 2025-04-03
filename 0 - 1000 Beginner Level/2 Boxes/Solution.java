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
		    
		    int x = input.nextInt();
		    int y = input.nextInt();
		    int k = input.nextInt();
		    
		    int dif=Math.abs(x-y);
		    int cnt=0;
		    
		    if(dif>=k){
                while(dif>=0){
		            if(dif==k) {
    		            System.out.println(cnt);
    		            break;
		            }
		            
    		        dif=dif-2;
    		        cnt++;
		        }  
		    }
		    else{
		        while(dif<=k){
		            if(dif==k) {
    		            System.out.println(cnt);
    		            break;
		            }
    		        dif=dif+2;
    		        cnt++;
		        }
		            
            }
            
		    if(dif<0||dif>k){
		        System.out.println("-1");
		    }
		}
	}
}
