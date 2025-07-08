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
		    
		    int cakewalk=0, simple=0, easy=0, easymediumoronemedium=0, mediumhardonehard=0;
		    
		    
		    for(int i=0; i<n; i++){
		        String str=input.next();
		        
		        switch (str) {
		            case "cakewalk":
		                cakewalk++;
		                break;
		            case "simple":
		                simple++;
		                break;
		            case "easy" :
		                easy++;
		                break;
		            case "easy-medium":
		            case "medium":
		                easymediumoronemedium++;
		                break;
		            case "medium-hard":
		            case "hard":
		                mediumhardonehard++;
		                break;
		        }
		    }
		    
		    if(cakewalk>0 && simple>0 && easy>0 && easymediumoronemedium>0 && mediumhardonehard>0){
		        System.out.println("Yes");
		    }
		    else {
		        System.out.println("No");
		    }
		}
	}
}
