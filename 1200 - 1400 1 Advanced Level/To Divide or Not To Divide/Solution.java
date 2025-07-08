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
		    int alice_Likes = input.nextInt();
            int bob_Dislikes = input.nextInt();
            int constraint = input.nextInt();
            
            if (alice_Likes % bob_Dislikes == 0) {
                System.out.println("-1");
            } else {
                if (constraint % alice_Likes != 0){
                    constraint = ((constraint/alice_Likes) + 1) * alice_Likes;
                }
                while(constraint % bob_Dislikes == 0){
                    constraint += alice_Likes;
                }
                System.out.println(constraint);
            }
		}
	}
}
