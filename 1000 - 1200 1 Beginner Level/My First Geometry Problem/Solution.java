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
		    String str = input.next();
		    char ch[] = str.toCharArray();
            int x = 1, y = 1;
            
            if(ch[0] == '1'){
                x = x+10;
            }
            if(ch[1] == '1'){
                x = x+10;
            }
            if(ch[2] == '1'){
                y = y+10;
            }
            if(ch[3] == '1'){
                y = y+10;
            }
            
            System.out.println(x*y);
		}
	}
}
