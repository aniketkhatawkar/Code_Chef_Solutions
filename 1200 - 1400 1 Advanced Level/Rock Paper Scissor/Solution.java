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
		    
		    String arr1=input.next();
		    String arr2=input.next();
		    
		    int chef=0;
		    int chefina=0;
		    
		    for(int i=0; i<n; i++){
		        if(arr1.charAt(i)=='P'&& arr2.charAt(i)=='R' || arr1.charAt(i)=='S'&& arr2.charAt(i)=='P' || arr1.charAt(i)=='R'&& arr2.charAt(i)=='S'){
		            chef++;
		        }
		        else if(arr1.charAt(i)==arr2.charAt(i)){
		            continue;
		        }
		        else {
		            chefina++;
		        }
		    }
		    
		    if(chef>chefina){
		        System.out.println(0);
		    }
            else if(chef==chefina){
                System.out.println(1);
            }
            else {
                int av=(chef+chefina)/2;
                
                if((chef+chefina)%2==0){
                    System.out.println(chefina-av+1);
                }
                else{
                    System.out.println(chefina-av);
                }
            }
		}
	}
}
