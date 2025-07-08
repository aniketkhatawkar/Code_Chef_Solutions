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
		    
		    if (n == 1) {
                System.out.println("-1");
            } else if (n % 2 == 0) {
                for (int i = 0; i < n / 2; i++) {
                    System.out.print("2 -2 ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < (n - 3) / 2; i++) {
                    System.out.print("1 -1 ");
                }
                System.out.println("1 2 -3");
            }
		    
		}
	}
	
	public static int[] helper(int num){
	    if(num==1){
	        return new int[]{-1};
	    }
	    
	    if(num%2==0){
	        int arr[] = new int [num];
	        
	        for(int i=0; i<num/2; i+=2){
	            arr[i]=2;
	            arr[i+1]=-2;
	        }
	        
	        return arr;
	    }
	    
	    if(num%3==0){
	        int arr[] = new int [num];
	        
	        for(int i=0; i<num/3; i+=3){
	            arr[i]=1;
	            arr[i+1]=2;
	            arr[i+1]=-3;
	        }
	        
	        return arr;
	    }
	    
	    return new int[]{-1};
	}
}
