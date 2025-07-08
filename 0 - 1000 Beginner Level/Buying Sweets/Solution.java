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
            int x = input.nextInt();
            int [] notes = new int[n];
            int sum=0;
            
            for(int j=0;j<n;j++){
                notes[j]= input.nextInt();;
                sum = sum + notes[j];
            }
            
            int a = sum/x;
            int count=0;
            
            for(int j=0;j<n;j++){
                if(sum-notes[j]>=(x*a)){
                    count++;
                    break;
                }
            }
            
            if(count>0){
                System.out.println(-1);
            }
            else{
                System.out.println(a);
            }
		}
	}
}
