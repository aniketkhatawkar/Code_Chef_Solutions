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
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int k = sc.nextInt();
            int [] a = new int[n];
            
            for(int j=0;j<a.length;j++){
                a[j]= sc.nextInt();
            }
            
            int leftover=0;
            int count=0;
        
            for(int j=0;j<a.length;j++){

                if(a[j]+leftover>=k){
                    count++;
                    leftover= Math.abs(k-(a[j]+leftover));
                }
                else{
                    int day=  j+1;
                    System.out.println("NO " + day);
                    break;
                }
            }
            if(count==a.length){
                System.out.println("YES");
            }
        }
		
		// optimize it
// 		Scanner input = new Scanner(System.in);
		
// 		int test = input.nextInt();
		
// 		for(int t=0; t<test; t++) {
		    
// 		    int n = input.nextInt();
// 		    int k = input.nextInt();
		    
// 		    int extra=0;
// 		    int ans=0;
		    
// 		    for(int i=1; i<=n; i++){
// 		        int p = input.nextInt();
		        
// 		        if((p+extra)>=k){
// 		            extra=(p+extra)-k;
// 		        }
// 		        else {
// 		            ans= i;
// 		        }
// 		    }
		    
// 		    if(ans==0) {
// 		        System.out.println("YES");
// 		    }
// 		    else {
// 		        System.out.println("NO " + ans);
// 		    }
// 		}
	}
}
