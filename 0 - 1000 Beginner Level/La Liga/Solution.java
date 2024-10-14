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
		    
		    ArrayList<String> teams=new ArrayList<>();
		    ArrayList<Integer> scores=new ArrayList<>();
		    for(int j=0;j<4;j++){
		        String str=input.next();
		        int n=input.nextInt();
		        teams.add(str);
		        scores.add(n);
		    }
            int a = scores.get(teams.indexOf("Barcelona"));
            int b = scores.get(teams.indexOf("Eibar"));
            int c = scores.get(teams.indexOf("RealMadrid"));
            int d = scores.get(teams.indexOf("Malaga"));
		    
		    if(c<d && a>b){
		        System.out.println("Barcelona");
		    }
		    else{
		        System.out.println("RealMadrid");
		    }
		}
	}
}
