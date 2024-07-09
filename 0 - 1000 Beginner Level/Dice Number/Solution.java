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
		    
		    int arrayalice[]= new int [3];
		    int arraybob[]= new int [3];
		    int alice=0, bob=0;
		    
		    for(int i=0; i<3; i++){
		        arrayalice[i]= input.nextInt();
		    }
		    
		    for(int i=0; i<3; i++){
		        arraybob[i]= input.nextInt();
		    }
		    
		    Arrays.sort(arrayalice);
		    Arrays.sort(arraybob);
		    
		    for(int i=2; i>-1; i--){
		        alice=(alice*10)+arrayalice[i];
		    }
		    
		    for(int i=2; i>-1; i--){
		        bob=(bob*10)+arraybob[i];
		    }
		    
		    if(alice>bob) {
		        System.out.println("Alice");
		    }
		    else if(alice<bob){
		        System.out.println("Bob");
		    }
		    else {
		        System.out.println("Tie");
		    }
		}
	}
}
