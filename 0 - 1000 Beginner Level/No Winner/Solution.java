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
		    
		    int a = input.nextInt();
		    int b = input.nextInt();
		    int c = input.nextInt();
		    
		    int m = input.nextInt();
		    
		    boolean flag=true;
		    
		    if(a==b || b==c || a==c){
	            System.out.println("YES");
	            flag=false;
	            continue;
	        }
	        
	        for(int i=1;i<=m;i++){
                if((a+i)==b || (a+i)==c || (b+i)==a || (b+i)==c
                    || (c+i)==a || (c+i)==b) {
                    System.out.println("YES");
                    flag=false;
                    break;
                }
            }
            
            if(flag){
                System.out.println("NO");
            }
		}
	}
}
