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
		   int n=input.nextInt();
           int z=input.nextInt();
           int[] first=new int[n];
           int[] now=new int[n];
           
           for(int i=0;i<n;i++){
               first[i]=input.nextInt();
           }
           
           for(int i=0;i<n;i++){
               now[i]=input.nextInt();
           }
           
           Integer[] index=new Integer[n];
           
           for(int i=0;i<n;i++){
               index[i]=i;
           }
           
           Arrays.sort(index,(a,b)->Integer.compare(now[a],now[b]));
           
           int[] new1=new int[n];
           int[] new2=new int[n];
           
           for(int i=0;i<n;i++){
               new1[i]=first[index[i]];
               new2[i]=now[index[i]];
           }
           
           int count=0,max=Integer.MIN_VALUE,total=0;
           HashSet<Integer> set=new HashSet<>();
           
           for(int i=0;i<n;i++){
                if(!set.contains(new1[i])){
                    set.add(new1[i]);
                    total+=new2[i];
                    count++;
                }
                max=Math.max(max,(z*count)-total);
           }
           
           System.out.println(Math.max(0,max));
		}
	}
}
