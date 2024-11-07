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
		    
		    int ones=0, twos=0, threes=0;
		    int sum=0;
		    
		    for(int i=0; i<n; i++){
		        int ele=input.nextInt();
		        if(ele<4){
		            if(ele==1){
		                ones++;
		            }
		            else if(ele==2){
		                twos++;
		            }
		            else {
		                threes++;
		            }
		        }
		        sum+=ele;
		    }
		    
		    while (k > 0) {
		        if (ones > 0) {
		            sum += 5;  // adding a value to maximize `sum`
		            ones--;
		        } else if (twos > 0) {
		            sum += 3;
		            twos--;
		        } else if (threes > 0) {
		            sum += 1;
		            threes--;
		        } else {
		            break;
		        }
		        k--;
		    }
		    
		    System.out.println(sum);
		}
	}
}
