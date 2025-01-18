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
		    
	        int a=input.nextInt();
	        int b=input.nextInt();
	        int c=input.nextInt();
	        
	        boolean flag=true;
		        
		    if(a==b && a==c){
		        System.out.println("YES");
		        flag=false;
            }
            else if(a!=b && b!=c && a!=c) {
                System.out.println("NO");
                flag=false;
            }
            else {
                if(a==b && a!=c && c>a){
                    System.out.println("YES");
                    flag=false;
                }
                else if(a==c && a!=b && b>a){
                    System.out.println("YES");
                    flag=false;
                }
                else if(b==c && b!=a && a>b){
                    System.out.println("YES");
                    flag=false;
                }
            }
            
            if(flag){
                System.out.println("NO");
            }
		}
	}
}
